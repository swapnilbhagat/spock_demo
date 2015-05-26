/**
 * 
 */
package com.spock.demo;

/**
 * Service to be tested by spock framework.
 * 
 * @author SwapnilB
 *
 */
public class ServiceToBeTested
{
	/**
	 * Checks whether given string param contains 'ABC' or not.
	 * 
	 * @param param
	 * @return
	 */
	public static boolean containsABC(String param)
	{
		return param.contains("ABC");
	}
}
