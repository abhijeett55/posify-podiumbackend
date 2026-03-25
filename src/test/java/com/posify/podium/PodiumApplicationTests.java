package com.posify.podium;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@ImportAutoConfiguration(exclude = { SecurityAutoConfiguration.class , OAuth2ClientAutoConfiguration.class })
class PodiumApplicationTests {
	
	@Test
	void contextLoads() {
	}

}
