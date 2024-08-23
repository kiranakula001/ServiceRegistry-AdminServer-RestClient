package microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmsWelcomeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsWelcomeRestApiApplication.class, args);
	}

}
