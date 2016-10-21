package com.fintech.user

import com.fintech.domain.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class LoginLogoutController {

    def springSecurityService

    def index() { }
    @Secured('IS_AUTHENTICATED_FULLY')
    def loginSuccess(){
        println "success"
        User user = (User)springSecurityService.currentUser
        render (view: "user_login_success", model: [user : user])

    }

    def loginFailuer(){
        println "failuer"
        render view: "/"
    }

    def logoutReq(){

    }
}
