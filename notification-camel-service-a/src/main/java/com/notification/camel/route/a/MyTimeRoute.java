package com.notification.camel.route.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyTimeRoute extends RouteBuilder{
	@Autowired
	SimpleLoggingProcess simpleLoggingProcess;
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	@Autowired
	private
	LoggingProcessComponent loggingProcessComponent;

	@Override
	public void configure() throws Exception {
		from("timer:first_timer")
		.bean(getCurrentTimeBean)
		.log("${body}")
		.bean(loggingProcessComponent)
		.log("${body}")
		.process(new SimpleLoggingProcess())
		 
		.to("log:first_timer");
		
	}

}
