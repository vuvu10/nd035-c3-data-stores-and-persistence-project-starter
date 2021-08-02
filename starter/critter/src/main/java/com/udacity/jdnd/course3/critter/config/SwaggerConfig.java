package com.udacity.jdnd.course3.critter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentatiion.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Pet Care API",
                "This PI maintains a list of customer, employee, registration and schedule services for your Pet.",

                "1.0",
                "htpp://www.udacity.com/tos",
                new Contact("DC", "www.udacity.com", "dcsiona@gmail.com"),
                "License of API", "http://www.udacity.com/license", Collections.emptyList());
        )
    }
}