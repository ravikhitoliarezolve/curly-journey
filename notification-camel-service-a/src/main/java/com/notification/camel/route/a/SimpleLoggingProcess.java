package com.notification.camel.route.a;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggingProcess implements Processor {
	private Logger logger = LoggerFactory.getLogger(LoggingProcessComponent.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("SimpleLoggingProcess {}",exchange.getMessage().getBody());
		
		
	}

}
