package com.fintech.domain

import java.sql.Date

class ShareResource {

    String description
    Date dateCreated
    Date lastUpdated
    static belongsTo = [topic: Topic, createdBy : User]
    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
    }
}
