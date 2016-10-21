package com.fintech.user

import com.fintech.CommandObject.ShareDocumentResourceCO
import com.fintech.CommandObject.ShareLinkResourceCO
import com.fintech.CommandObject.TopicCO
import com.fintech.domain.ShareDocumentResource
import com.fintech.domain.ShareLinkResource
import com.fintech.domain.Subscription
import com.fintech.domain.Topic
import com.fintech.domain.User
import grails.transaction.Transactional
import org.springframework.web.multipart.commons.CommonsMultipartFile

@Transactional
class ResourceService {

    def springSecurityService
    def serviceMethod() {

    }

    void saveTopic(TopicCO topicCO){
        User user = (User)springSecurityService.currentUser
        Topic topic = new Topic(topicCO,user).save(failOnError: true)
        new Subscription(seriousness:'SERIOUS', topic: topic, user: user).save(failOnError: true);
    }

    void saveLinkResource(ShareLinkResourceCO linkResourceCO) {
        if (linkResourceCO.validate()) {
            ShareLinkResource linkResource = new ShareLinkResource(url: linkResourceCO.url, description: linkResourceCO.description, topic: Topic.get(linkResourceCO.topicId), createdBy: (User) springSecurityService.currentUser)
            linkResource.save()
        }
    }

    void saveDocumentResource(ShareDocumentResourceCO documentResourceCO) {
        if (documentResourceCO.validate()) {
            ShareDocumentResource documentResource = new ShareDocumentResource(fileName: documentResourceCO.fileName, description: documentResourceCO.description, topic: Topic.get(documentResourceCO.topicId), createdBy: (User) springSecurityService.currentUser)
            documentResource.save()
        }
    }

}
