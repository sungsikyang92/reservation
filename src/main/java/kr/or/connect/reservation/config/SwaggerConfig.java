package kr.or.connect.reservation.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final String API_NAME = "Reservation API";
	private static final String API_VERSION = "0.0.1";
	private static final String API_DESCRIPTION = "Rservation API 명세서";
	
	@Bean
	public Docket api() {
		Parameter parameterBuilder = new ParameterBuilder()
										.name(HttpHeaders.AUTHORIZATION)
										.description("Access Tocken")
										.modelRef(new ModelRef("string"))
										.parameterType("header")
										.required(false)
										.build();
		
		List<Parameter> globalParameters = new ArrayList<>();
		globalParameters.add(parameterBuilder);
		
		return new Docket(DocumentationType.SWAGGER_2)
				.globalOperationParameters(globalParameters)
				.apiInfo(apiInfo()).useDefaultResponseMessages(false)
				.select()
				.apis(RequestHandlerSelectors.basePackage("kr.or.connect.reservation"))
				.paths(PathSelectors.ant("/api/**"))
				.build();
	}
	
	public ApiInfo apiInfo() {
		Contact contact = new Contact("양성식", "sungsik", "sungsik.yang92@gmail.com");
		return new ApiInfoBuilder()
				.title(API_NAME)
				.version(API_VERSION)
				.description(API_DESCRIPTION)
				.contact(contact)
				.build();
	}
}
