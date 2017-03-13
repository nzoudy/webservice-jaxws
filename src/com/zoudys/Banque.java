package com.zoudys;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueWS")
public class Banque {
	
	@WebMethod(operationName="test")
	public String test(){
		return "test";
	}
	
	@WebMethod(operationName="conversionEuroFcfa")
	public double conversion(@WebParam(name="montant") double mt){
		return mt*650;
	}

}
