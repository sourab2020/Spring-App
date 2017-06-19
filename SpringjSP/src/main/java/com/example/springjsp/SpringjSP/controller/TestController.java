package com.example.springjsp.SpringjSP.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springjsp.SpringjSP.DAO.Employee;
import com.example.springjsp.SpringjSP.DAO.EmployeeDetails;
import com.example.springjsp.SpringjSP.Services.EmployeeService;
import com.example.springjsp.SpringjSP.Validator.UserValidator;

@Controller
public class TestController {

 
    String formName = "UserRegistration";
	@Autowired
	EmployeeService employeeService;
	int empID;
	
	@Autowired
	private UserValidator userValidator;
	

    @InitBinder("EmployeeDetails")
    protected void initBinder(WebDataBinder binder) {
     //   logger.debug("initBinder method called");
		binder.addValidators(userValidator);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
    @ModelAttribute
    public Employee addEmployee(ModelMap model) {
     //   logger.debug("@ModelAttribute addUser method called");
      //  model.addAttribute("countryCodes", geographicalService.getCountryCodes());
    	model.addAttribute("employee",new Employee());
        return new Employee();
    }
	
	@RequestMapping(value="/")
	public String getDetails(){
	
		return "UserRegistration";
	}
	
	
	@RequestMapping(value="/EmployeeInformation.do" ,method=RequestMethod.POST)
	public String getEmployee(HttpServletRequest request,Model model){
		 empID = Integer.parseInt(request.getParameter("employeeId"));
		 System.out.println(employeeService +""+ empID);
		 EmployeeDetails employee = employeeService.getEmployeeInformation(empID);
		 model.addAttribute("Employee", employee);
		 return "details";
		
	}
	
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) {
        //org.apache.log4j.Logger.debug("registerUser method called " + employee);

        ModelAndView modelAndView = new ModelAndView(formName);
     //   modelAndView.addObject("countryCodes", geographicalService.getCountryCodes());
        if (result.hasErrors()) {
            return modelAndView;
        } else {
        	employeeService.addEmployee(employee);
            modelAndView.addObject("employee", new Employee());
            modelAndView.addObject("message", "Successfully Registered");
            return modelAndView;
        }
    }
}
	

