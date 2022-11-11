package com.notification.camel.route.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileDataRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files:/input?noop=true")
		.log("${body}")
		.to("file:files/output");
		
		
	}

}
