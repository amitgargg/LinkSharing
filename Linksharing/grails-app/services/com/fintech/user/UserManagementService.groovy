package com.fintech.user

import com.fintech.CommandObject.UserCO
import com.fintech.domain.Role
import com.fintech.domain.User
import com.fintech.domain.UserRole
import grails.transaction.Transactional

@Transactional
class UserManagementService {

    def serviceMethod() {

    }
    void registerUser(UserCO userCO) {
        new UserRole(createOrUpdateUser(new User(userCO)), Role.findByAuthority(userCO.getRoleName())?:createRole(userCO.getRoleName())).save(failOnError: true)
    }

    Role createRole(String roleName) {
        new Role(roleName).save(failOnError: true)
    }

    User createOrUpdateUser(User user){
        user.save(failOnError: true)
    }
}
