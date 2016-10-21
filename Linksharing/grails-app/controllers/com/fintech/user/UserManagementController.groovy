package com.fintech.user

import com.fintech.CommandObject.UserCO
import com.fintech.domain.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_FULLY'])
class UserManagementController {
    def springSecurityService
    UserManagementService userManagementService

    def index() { }

    def getUserProfile(){
        User user = (User)springSecurityService.currentUser
        render(view: "player_profile", model: [user: user])
    }

    def updateUserProfile(UserCO userCO){
        try {
            def userId = springSecurityService.principal.id;
            User user = User.get(userId);
            updateUserObject(user, userCO)
            userManagementService.createOrUpdateUser(user)
            render "profile Updated Successfully"
        } catch (Exception e){
            e.printStackTrace()
            render "Some Error accured"
        }


    }

    def updateUserObject(User user, UserCO userCo){
        user.firstName = userCo.firstName;
        user.lastName = userCo.lastName
        user.email = userCo.email
    }
}
