package com.example.serviceb;

// import org.springframework.cloud.client.ServiceInstance;
// import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ServiceBRestController {

	private final RestClient restClient;

	public ServiceBRestController(RestClient.Builder restClientBuilder) {
		restClient = restClientBuilder.build();
	}

	@GetMapping("helloEureka")
	public String helloWorld() {
		String serviceAResponse = restClient.get()
                .uri("http://localhost:8080/servicea/product/1")
				.retrieve()
				.body(String.class);
		return serviceAResponse;
	}
}