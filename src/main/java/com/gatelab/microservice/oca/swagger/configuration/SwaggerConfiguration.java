package com.gatelab.microservice.oca.swagger.configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Profile(value = {"swagger"})
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("coreController")
				.protocols(Arrays.asList("http", "https").stream().collect(Collectors.toSet()))
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("com.gatelab.microservice.oca.controller"))
				.paths(PathSelectors.regex("/.*"))
				.build().apiInfo(apiEndPointsInfo());
	}
	
	private ApiInfo apiEndPointsInfo() {

		return new ApiInfoBuilder().title("coreController")
				.description("oca-core")
				.contact(new Contact("Stefano Netti", "", "snetti@lseg.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0.0")
				.build();
	}

}

