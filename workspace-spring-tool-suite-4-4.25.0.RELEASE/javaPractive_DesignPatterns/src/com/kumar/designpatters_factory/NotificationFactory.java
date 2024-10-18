package com.kumar.designpatters_factory;

public class NotificationFactory {
	
	public Notification createNotification(String channel) {
		
		if(channel==null || channel.isEmpty()) {
			return null;
		}
		switch(channel) {
		case "SMS":
			
			return new SMSNotification();
		case "Mobile":
			
			return new MobileAppNotification();
		case "Email":
			return new EmailNotification();
	
		default:
			throw new IllegalArgumentException("Unknown channel " + channel);
		}
		
	}

}
