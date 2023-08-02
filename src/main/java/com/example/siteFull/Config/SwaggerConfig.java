package com.example.siteFull.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

// HTML : http://localhost:8080/swagger-ui/
@Configuration

public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiDetails(){
        return new ApiInfo("JSB API REST",
                "API REST de usuarios",
                "1.0",
                "https://google.com",
                new Contact("Julián","https://google.com","julian.f.vega@gmail.com"),
                "MIT",
                "https://google.com",
                Collections.emptyList());
    }
}
