package com.fintech.CommandObject

import grails.validation.Validateable

import java.sql.Date

/**
 * Created by amitgarg on 18/10/16.
 */
@Validateable
class UserCO {
    String username
    String password
    String firstName
    String lastName
    String email
    String confirmPassword
    boolean admin
    boolean active
    String roleName
    byte[] avatar

    static constraints = {
        username nullable: false, blank: false, unique: true
        password nullable: false, blank: false, minSize: 4, maxSize: 20
        confirmPassword nullable: false, blank: false, minSize: 4, maxSize: 20, validator: {val,obj->
            if(!val?.equals(obj.getPassword())){
                return  false
            }
        }
        email nullable: false, blank: false, email: true, unique: true
        firstName nullable: true, blank: true
        lastName nullable: true, blank: true
        avatar nullable: true, blank: true
        roleName nullable: true, blank: true
    }

}
