package com.zoudys;

import javax.xml.ws.Endpoint;

public class ServeurWS {

	public static void main(String[] args) {

		String url="http://192.168.56.1:8585/";
		Endpoint.publish(url, new Banque());
		
		System.out.println("Server start at .... "+url+"\n" +"Status is UP");
	}

}
