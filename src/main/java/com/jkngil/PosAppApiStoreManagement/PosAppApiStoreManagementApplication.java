package com.jkngil.PosAppApiStoreManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PosAppApiStoreManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppApiStoreManagementApplication.class, args);
	}

}
