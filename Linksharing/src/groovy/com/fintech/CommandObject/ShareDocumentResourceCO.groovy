package com.fintech.CommandObject

import grails.validation.Validateable

/**
 * Created by amitgarg on 20/10/16.
 */
@Validateable
class ShareDocumentResourceCO {
    String description
    String fileName
    long topicId;
}
