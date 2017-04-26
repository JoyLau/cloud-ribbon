package cn.joylau.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRibbonApplication.class, args);
	}

	/**
	 * 注册了一个bean: restTemplate;通过@ LoadBalanced注册表明，这个restTemplate是负载均衡的
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
