package com.Revision1.Revision1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
@Configuration
public class CustomizedSwagger {
	
	@Bean
	public OpenAPI customApi(@Value ("${application-description}") String desc , 
							 @Value ("${application-version}") String version)
	{
		return new OpenAPI().
				info(new Info()
						.title("Akshith Swagger ")
						.version(version)
						.description(desc)
						.termsOfService("http://swagger.io/terms/")
						.license(new License()
								.name("Apache 9.0")
								.url("http://springdoc.org")));
	}

}
