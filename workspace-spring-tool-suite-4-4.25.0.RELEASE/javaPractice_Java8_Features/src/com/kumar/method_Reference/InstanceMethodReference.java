package com.kumar.method_Reference;

@FunctionalInterface
interface stringconcatenate_Interface{
	String concatenate(String str1, String str2);
	
}
public class InstanceMethodReference {

	public static void main(String[] args) {
		InstanceMethodReference instance = new InstanceMethodReference();
		stringconcatenate_Interface concatenator = instance::customConcatenate;
		
		String result=concatenator.concatenate("String1", "String2");
		System.out.println(result);
		

	}
	
	public String customConcatenate(String str1, String str2) {
		return str1+" custom "+str2;
	}

}
