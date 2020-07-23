package com.lams1989.encryption;

import junit.framework.TestCase;

public class EncryptionTest extends TestCase{

	
	public static void test1() {
		String s = "Luis Alejandro Munoz sierra";
		assertEquals("Lldne ueror ijozr saMsa Anui", Encryption.encryption(s));
	}
	
	public static void test2() {
		String s = "camina suve por lo alto";
		assertEquals("capa asol murt ivlo neo", Encryption.encryption(s));
	}
	
	public static void test3() {
		String s = "la vida es simple";
		assertEquals("ldsl aaie vem isp", Encryption.encryption(s));
	}
	
	public static void test4() {
		String s = "Luis Alejandro";
		assertEquals("LAao uln ied sjr", Encryption.encryption(s));
	}
	
	
	
}
