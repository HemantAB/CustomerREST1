/**
 * 
 */
package com.hemant_bhilwadikar.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Hemant
 *
 */
public class CustomerRESTServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRESTServiceInit() throws ClientProtocolException, IOException {
		  
		   // Given
		   //String name = RandomStringUtils.randomAlphabetic( 8 );
		   HttpUriRequest request = new HttpGet( "http://localhost:8080/CustomerREST/api/cust/verify"  );
		 
		   // When
		   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
		 
		   // Then
		   assertEquals(
		     httpResponse.getStatusLine().getStatusCode(),
		     HttpStatus.SC_OK);
		}
	
	@Test
	public void testRESTServiceGet() throws ClientProtocolException, IOException {
		  
		   // Given
		   //String name = RandomStringUtils.randomAlphabetic( 8 );
		   HttpUriRequest request = new HttpGet( "http://localhost:8080/CustomerREST/api/cust/get"  );
		 
		   // When
		   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
		 
		   // Then
		   assertEquals(
		     httpResponse.getStatusLine().getStatusCode(),
		     HttpStatus.SC_OK);
		}

	@Test
	public void testRESTServiceIns() throws ClientProtocolException, IOException {
		  
		   // Given
		   //String name = RandomStringUtils.randomAlphabetic( 8 );
		   HttpUriRequest request = new HttpGet( "http://localhost:8080/CustomerREST/api/cust/add/Joe/Bloggs"  );
		 
		   // When
		   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
		 
		   // Then
		   assertEquals(
		     httpResponse.getStatusLine().getStatusCode(),
		     HttpStatus.SC_OK);
		}

	@Test
	public void testRESTServiceDel() throws ClientProtocolException, IOException {
		  
		   // Given
		   //String name = RandomStringUtils.randomAlphabetic( 8 );
		   HttpUriRequest request = new HttpGet( "http://localhost:8080/CustomerREST/api/cust/del/1"  );
		 
		   // When
		   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
		 
		   // Then
		   assertEquals(
		     httpResponse.getStatusLine().getStatusCode(),
		     HttpStatus.SC_OK);
		}
	
	

}
