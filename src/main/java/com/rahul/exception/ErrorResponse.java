package com.rahul.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Error response.
 *
 * @author Rahul Kumar
 */
@Data
@AllArgsConstructor
public class ErrorResponse {

	private Date timestamp;
	private String errorMessage;
	private String errorDetails;
	private String status;

}
