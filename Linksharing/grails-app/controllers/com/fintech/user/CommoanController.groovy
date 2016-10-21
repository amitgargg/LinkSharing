package com.fintech.user

import com.fintech.domain.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_FULLY'])
class CommoanController {
    def index() { }
    def springSecurityService
    def avatar= {
        User user =(User)springSecurityService.currentUser
        response.outputStream << user.avatar
    }
}
