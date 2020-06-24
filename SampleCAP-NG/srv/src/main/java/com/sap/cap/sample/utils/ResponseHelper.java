package com.sap.cap.sample.utils;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

import com.sap.cds.services.ErrorStatuses;
import com.sap.cds.services.ServiceException;

/*
 * CDS support two type of error handling
 * 
 *  exceptions: Roll-back the transaction and issue an error
 *  messages: issue an error but the transaction is not rolled back
 *  
 *  more info: https://cap.cloud.sap/docs/java/provisioning-api#indicating-errors
 *  
 */

@Component
public class ResponseHelper {

	public Supplier<ServiceException> conflict(String message, Object... args) {
		return () -> new ServiceException(ErrorStatuses.CONFLICT, message, args);
	}
	
	public Supplier<ServiceException> notFound(String message) {
		return () -> new ServiceException(ErrorStatuses.NOT_FOUND, message);
	}

	public Supplier<ServiceException> forbidden(String message) {
		return () -> new ServiceException(ErrorStatuses.FORBIDDEN, message);
	}

}
