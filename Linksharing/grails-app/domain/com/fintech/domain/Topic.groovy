package com.fintech.domain

import com.fintech.CommandObject.TopicCO

import java.sql.Date

class Topic {
    String name;
    String visibility
    Date dateCreated
    Date lastUpdated
    static belongsTo = [user :User]
    static hasMany = [subscription : Subscription, resources: ShareResource]
    static constraints = {
        visibility blank: false, inList: ['PUBLIC','PRIVATE']
    }

    public Topic(TopicCO topicCO, User user){
        this.name = topicCO.name;
        this.visibility = topicCO.visibility
        this.user = user
    }
}

