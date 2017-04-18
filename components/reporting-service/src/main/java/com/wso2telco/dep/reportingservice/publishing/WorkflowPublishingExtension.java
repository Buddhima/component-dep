package com.wso2telco.dep.reportingservice.publishing;

/**
 */
public interface WorkflowPublishingExtension {

    public void report(String appId, String apiId, String opName);
}
