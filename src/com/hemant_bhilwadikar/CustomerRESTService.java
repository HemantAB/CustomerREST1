/**
 * 
 */
package com.hemant_bhilwadikar;

import java.io.InputStream;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Hemant Bhilwadikar
 *
 */
@Path("/cust")
public class CustomerRESTService {
	
	private CustomerDAO custDAO = new CustomerDAO();
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustListInJSON() {
		
		return custDAO.getCustomers();
		

	}	

	@GET
	@Path("/add/{param2}/{param3}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response addCust(
			@PathParam("param2") String firstName,
			@PathParam("param3") String surName) {
		
		String result = "";
		
		System.out.println("firstName="+firstName+" Surname="+surName);
		if (custDAO.addCustomer(firstName,surName)) {		
			result = "CustomerRESTService Customer Successfully added..";
		} else {
			result = "CustomerRESTService Customer not added..";
		}
		
		return Response.status(200).entity(result).build();

	}	
	
	@GET
	@Path("/del/{param1}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response delCust(@PathParam("param1") int id) {
		
		String result = "";
		if (custDAO.deleteCustomer(id)) {		
			result = "CustomerRESTService Customer Successfully deleted..";
		} else {
			result = "CustomerRESTService Customer not deleted..";
		}
		
		return Response.status(200).entity(result).build();

	}	
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verifyRESTService(InputStream incomingData) {
		custDAO.initialise();
		
		String result = "CustomerRESTService Successfully started..";
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}	

}
