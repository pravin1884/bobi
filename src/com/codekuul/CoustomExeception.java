package com.codekuul;

public class CoustomExeception extends RuntimeException {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static String mess = "do not do this";
	
	@Override
	public String getMessage() {
		return mess;
	}
	

}
