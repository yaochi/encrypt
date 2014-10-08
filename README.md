encrypt
=======

Create By xiexianbin, Using For Encrypting Important Information.

Demo
---
```
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
```
