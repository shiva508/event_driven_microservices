package com.pool.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EpoolGatewayConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder locatorBuilder) {

		return locatorBuilder.routes()
				.route(r -> r.path("/get")
						.filters(f -> f.addRequestHeader("408", "508").addRequestParameter("Param", "MyValue"))
						.uri("http://httpbin.org:80"))
				.route(r -> r.path("/v1/**").uri("lb://productservice")).build();

	}
}
