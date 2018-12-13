package com.relesi.fighterregistration.api.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.relesi.fighterregistration.api")).paths(regex("/ms.*"))
				.build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Fighter Rest API", "API Fighters", "1.0", "Term of Service",
				new Contact("Renato Lessa", "http://www.renato.relesi.com.br/", "renatolessa.2011@hotmail.com"),
				"Apache License Version 2.0", "http://www.apache.org/license.html", new ArrayList<VendorExtension>());

		return apiInfo;
	}

}
