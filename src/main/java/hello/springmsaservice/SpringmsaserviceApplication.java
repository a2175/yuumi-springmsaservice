package hello.springmsaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringmsaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmsaserviceApplication.class, args);
	}

}
