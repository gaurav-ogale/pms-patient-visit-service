package com.citius.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class HttpConfig {
	
	  @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	  
	  @Bean
	  public WebClient webClient() {
	      return WebClient.builder().baseUrl("http://localhost:8080").build();
	      
//	      final int size = 16 * 1024 * 1024;
//	      final ExchangeStrategies strategies = ExchangeStrategies.builder()
//	          .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
//	          .build();
//	      return WebClient.builder()
//	          .baseUrl("http://localhost:8080")
//	          .build();
	  }

}
