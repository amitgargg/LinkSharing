package com.fintech.user

import com.fintech.CommandObject.UserCO
import com.fintech.domain.User
import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.multipart.commons.CommonsMultipartFile

@Secured(['permitAll'])
class RegistrationController {

    UserManagementService userManagementService
    def springSecurityService

    def index() { }

    def userRegistration(UserCO userCO){
        try {
            CommonsMultipartFile uploadedFile =  request.getFile('file');
            if (userCO.validate()) {
                userCO.setActive(true);
                userCO.setAdmin(false);
                userCO.setRoleName("user")
                userCO.avatar = uploadedFile.getBytes()
                userManagementService.registerUser(userCO)
                render(view: 'user_registration_success')
            } else {
                println(userCO.hasErrors())
                println userCO.errors.allErrors.each { println it }
                render(view: '/pre_login', model: [userCo: userCO])
            }

        } catch (Exception e){
            e.printStackTrace()
        }
    }

    def adminRegistration(UserCO userCO){
        try {
            if (userCO.validate()) {
                userCO.setActive(true);
                userCO.setAdmin(true);
                userCO.setRoleName("admin")
                userManagementService.registerUser(userCO)
            }
        }catch (Exception e){
            e.printStackTrace()
        }
    }
}
