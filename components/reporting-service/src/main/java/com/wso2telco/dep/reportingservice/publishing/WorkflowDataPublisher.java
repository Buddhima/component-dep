package com.wso2telco.dep.reportingservice.publishing;

import java.util.ServiceLoader;

public class WorkflowDataPublisher {

    public static void publish(String appId, String apiId, String opName) {

        // Calls all the classes which implements WorkflowPublishingExtension interface
        ServiceLoader<WorkflowPublishingExtension> loader = ServiceLoader.load(WorkflowPublishingExtension.class);
        for (WorkflowPublishingExtension extn : loader) {
            extn.report(appId, apiId, opName);
        }
    }

}
