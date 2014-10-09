package com.qikemi.packages.encrypt.test.encrypt;

import org.junit.Test;

import com.qikemi.packages.encrypt.base64encrypt.Base64Encrpt;
import com.qikemi.packages.encrypt.md5.MD5OrSSH1Encrypt;

/**
 * 
 * Create Date: 2014年10月8日 下午10:40:59
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class T {

	@Test
	public void t1(){
		
		System.out.println(MD5OrSSH1Encrypt.md5("abcdef"));
		// e80b5017098950fc58aad83c8c14978e
		// e80b5017098950fc58aad83c8c14978e
		
		System.out.println(MD5OrSSH1Encrypt.sha1("abcdef"));
		// 1f8ac10f23c5b5bc1167bda84b833e5c057a77d2
		// 1f8ac10f23c5b5bc1167bda84b833e5c057a77d2
		
		System.out.println(MD5OrSSH1Encrypt.sha1AndMd5("abcdef"));
		// 78cd8c52d92bc7c4e3808fbdb3434da4
		// 78cd8c52d92bc7c4e3808fbdb3434da4
		
		System.out.println(MD5OrSSH1Encrypt.md5AndSha1("abcdef"));
		// 3915da4d2d16dd5a69b6204cacb8a2a1d9e79f34
		// 3915da4d2d16dd5a69b6204cacb8a2a1d9e79f34
	}
	
	@Test
	public void t2(){
		Base64Encrpt base64Encrpt = new Base64Encrpt();
		System.out.println(base64Encrpt.encrptString("xiexianbin"));
		
		System.out.println(base64Encrpt.decryptString("6OVo9q6Vw/FqZTfCboNCXw=="));
	}
}
