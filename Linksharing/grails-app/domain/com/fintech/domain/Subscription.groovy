package com.fintech.domain

class Subscription {

    String seriousness
    static belongsTo = [topic : Topic, user : User]



    static constraints = {
        seriousness blank: false, inList: ['SERIOUS','VERY SERIOUS, CASUAL']
    }


}
