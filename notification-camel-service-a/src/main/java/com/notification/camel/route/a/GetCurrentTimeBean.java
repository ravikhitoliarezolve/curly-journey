package com.notification.camel.route.a;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Current Time" + LocalDateTime.now();
	}

}
