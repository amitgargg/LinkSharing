package com.fintech.domain

import com.fintech.CommandObject.UserCO
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import java.sql.Date

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	String firstName
	String lastName
	String email
	boolean admin
	boolean active
	Date dateCreated
	Date lastUpdated
	byte[] avatar

	static hasMany = [topic:Topic,subscription:Subscription, resource : ShareResource]




	User(String username, String password) {
		this()
		this.username = username
		this.password = password
	}


    User(UserCO userCO) {
        this()
        this.username = userCO.username
        this.password = userCO.password
        this.email = userCO.email
        this.firstName = userCO.firstName
        this.lastName = userCO.lastName
        this.avatar = userCO.avatar
        this.admin = userCO.admin
        this.active = userCO.active
    }

    Set<Role> getAuthorities() {
		UserRole.findAllByUser(this)*.role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
        username nullable: false, blank: false, unique: true
        password nullable: false, blank: false
        email nullable: false, blank: false, email: true, unique: true
        firstName nullable: true, blank: true
        lastName nullable: true, blank: true
		avatar nullable: true, blank: true, maxSize:1073741824
	}

	static mapping = {
		password column: '`password`'
	}
}
