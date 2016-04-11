package carbon.wso2.org.axiata.workflow.in;

import carbon.wso2.org.axiata.workflow.notify.AppApprovalStatusSPEmailNotificationRequestType;
import carbon.wso2.org.axiata.workflow.notify.HUBAdminAppApprovalEmailNotificationRequestType;
import carbon.wso2.org.axiata.workflow.notify.HUBAdminSubApprovalEmailNotificationRequestType;
import carbon.wso2.org.axiata.workflow.notify.PLUGINAdminAppApprovalEmailNotificationRequestType;
import carbon.wso2.org.axiata.workflow.notify.PLUGINAdminSubApprovalEmailNotificationRequestType;
import carbon.wso2.org.axiata.workflow.notify.SubApprovalStatusSPEmailNotificationRequestType;

public interface EmailNotification {

	void sendHUBAdminAppApprovalEmailNotification(HUBAdminAppApprovalEmailNotificationRequestType request);
	void sendHUBAdminSubrovalEmailNotification(HUBAdminSubApprovalEmailNotificationRequestType request);
	void sendPLUGINAdminAppApprovalEmailNotification(PLUGINAdminAppApprovalEmailNotificationRequestType request);
	void sendPLUGINAdminSubApprovalEmailNotification(PLUGINAdminSubApprovalEmailNotificationRequestType request);
	void sendAppApprovalStatusSPEmailNotification(AppApprovalStatusSPEmailNotificationRequestType request);
	void sendSubApprovalStatusSPEmailNotification(SubApprovalStatusSPEmailNotificationRequestType request);
	void sendEmail(String emailAddress, String subject, String content);
	
}