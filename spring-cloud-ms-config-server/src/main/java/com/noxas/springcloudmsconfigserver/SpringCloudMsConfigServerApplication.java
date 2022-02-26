package com.noxas.springcloudmsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudMsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMsConfigServerApplication.class, args);
	}

}
