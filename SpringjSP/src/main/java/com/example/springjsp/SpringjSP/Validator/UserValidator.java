package com.example.springjsp.SpringjSP.Validator;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.util.StringUtils;

import com.example.springjsp.SpringjSP.DAO.Employee;

@Component
public class UserValidator implements Validator {
	final static Logger logger = Logger.getLogger(UserValidator.class);
	
	public boolean supports(Class<?> clazz) {
		logger.debug("supports called");
		if (clazz.equals(Employee.class)) {
			return true;
		}
		
		return false;
	}

	public void validate(Object object, Errors errors) {
		logger.debug("validate called");
		
		Employee user = (Employee) object;

		ValidationUtils.rejectIfEmpty(errors, "firstNAme", "user.firstname.empty.err");

		if (! isValidUserName(user.getFirstNAme())) {
			errors.reject("firstNAme", "FirstName.err");
		}		
		

	}



	private boolean isValidUserName(String firstNAme) {
		
		if (StringUtils.isEmpty(firstNAme)) {
			return false;
		}
		
		if(firstNAme.trim().length() < 5) {
			return false;
		}
		
		return firstNAme.matches("^[a-zA-Z0-9_]*$");
	}



}


