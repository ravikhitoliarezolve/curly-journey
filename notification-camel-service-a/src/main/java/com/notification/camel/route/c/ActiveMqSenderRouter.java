package com.notification.camel.route.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:active-Mq-timer?period=1000")
		.transform().constant("message for active Mq")
		.log("${body}")
		.to("activemq:my-activemq-queue");
		
	}

}
