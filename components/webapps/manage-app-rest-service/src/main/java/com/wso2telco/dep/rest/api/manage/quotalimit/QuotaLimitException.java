package com.wso2telco.dep.rest.api.manage.quotalimit;

import com.wso2telco.core.dbutils.exception.BusinessException;
import com.wso2telco.core.dbutils.exception.ThrowableError;

public class QuotaLimitException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public QuotaLimitException(ThrowableError error) {
		super(error);
	}
}
