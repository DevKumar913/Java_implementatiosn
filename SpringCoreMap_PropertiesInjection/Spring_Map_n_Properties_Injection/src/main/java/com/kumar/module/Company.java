package com.kumar.module;

import java.util.Map;
import java.util.Properties;

public class Company {
	
	private Map<String,Integer> deptCount;
	private Properties languageDetails;
	
	
	public Map<String, Integer> getDeptCount() {
		return deptCount;
	}
	public void setDeptCount(Map<String, Integer> deptCount) {
		this.deptCount = deptCount;
	}
	public Properties getLanguageDetails() {
		return languageDetails;
	}
	public void setLanguageDetails(Properties languageDetails) {
		this.languageDetails = languageDetails;
	}
	@Override
	public String toString() {
		return "Company [deptCount=" + deptCount + ", languageDetails=" + languageDetails + "]";
	}
	
	

}
