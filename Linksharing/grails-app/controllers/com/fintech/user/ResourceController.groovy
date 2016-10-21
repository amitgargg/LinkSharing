package com.fintech.user

import com.fintech.CommandObject.ShareDocumentResourceCO
import com.fintech.CommandObject.ShareLinkResourceCO
import com.fintech.CommandObject.TopicCO
import com.fintech.domain.ShareDocumentResource
import com.fintech.domain.Topic
import com.fintech.domain.User
import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.multipart.commons.CommonsMultipartFile

import java.util.concurrent.ExecutionException

@Secured(['IS_AUTHENTICATED_FULLY'])
class ResourceController {

    def resourceService
    def index() { }

    def getCreateTopicView(){
        render view: "create_topic_view"
    }

    def createTopic(TopicCO topicCO){
        try {
            resourceService.saveTopic(topicCO);
            render "TOPIC CREATED SUCCESSFULLLY"
        } catch (Exception e){
            e.printStackTrace()
            render "Some Internal Errors"
        }
    }

    def getShareLinkResourceView(){
        try {
            render view: "share_link_resource", model: [topic:  Topic.all]
        } catch (Exception e){
            e.printStackTrace()
            render "Some Internal Error Accrued"
        }
    }

    def saveLinkResource(ShareLinkResourceCO linkResourceCO){
        try {
            resourceService.saveLinkResource(linkResourceCO)
            render "LINK RESOURCE SUCCESSFULLY SAVED"
        } catch (Exception e){
            e.printStackTrace()
            render "Some Internal Error Accrued"
        }
    }

    def getShareDocumentResourceView(){
        try {
            render view: "share_document_resource", model: [topic:  Topic.all]
        } catch (Exception e){
            e.printStackTrace()
            render "Some Internal Error Accrued"
        }
    }

    def saveDocumentResource(ShareDocumentResourceCO documentResourceCO){
        try {
            CommonsMultipartFile file = request.getFile('file')
            String webRootDir = servletContext.getRealPath("/")
            String fileName = file.getOriginalFilename();
            fileName = fileName.subSequence(0,fileName.lastIndexOf('.'))+
                            Calendar.getInstance().getTimeInMillis()+
                            fileName.subSequence(fileName.lastIndexOf('.'),fileName.length())
            File fileDest = new File(webRootDir,"resource/${fileName}")
            file.transferTo(fileDest)
            documentResourceCO.setFileName(fileName)
            resourceService.saveDocumentResource(documentResourceCO)
            render "Document RESOURCE SUCCESSFULLY SAVED"
        } catch (Exception e){
            e.printStackTrace()
            render "Some Internal Error Accrued"
        }
    }
}
