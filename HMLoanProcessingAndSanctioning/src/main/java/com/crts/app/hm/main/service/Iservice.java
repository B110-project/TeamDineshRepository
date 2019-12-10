package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.model.CustomerDetails;
import com.crts.app.hm.main.model.Enquiry;

public interface Iservice {
	//customer Deatails crud methods
	public List<CustomerDetails> getDetail();
	
	public CustomerDetails addDetails(CustomerDetails c);
	
	public  void deleteDetails(int customerId);
	
	public CustomerDetails editDetails(int customerId);
	
	public List<CustomerDetails> updateDetails(CustomerDetails c);
	
	//inquiry details crud methods 
	
	public Enquiry getEnquiryDetail(int id);
	
	public List<Enquiry> getAllEnquiryDetails();
	
	public Enquiry addEnquiryDetails(Enquiry e);
	
	public Enquiry EditEnquiryDetails(int id);
	
	public  void deleteEnquiryDetails(int Id);

	
	public List<Enquiry> updateEnquiryDetails(Enquiry e);
	
	
	
	
	
	
	
	
	
	
	
	
	

}
