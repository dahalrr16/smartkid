package com.ewh.smart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.ewh.smart.model.Kid;

@SpringBootTest
public class SmartkidApplicationTests {

	@Test
	public void contextLoads() {
	}
	@SuppressWarnings("deprecation")
	@Test
	public void helloKid() {
		System.out.println("Hello Kid just for fun");
		Kid kid =new Kid();
	//	Assert.isNull(kid);
	}
}