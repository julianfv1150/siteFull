package com.example.siteFull.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

// HTML : http://localhost:8080/swagger-ui/
// https://www.youtube.com/watch?v=qRGGp0MAE7w&list=PLkVpKYNT_U9fGwrf_rVl-t_yjnixdsK6E&index=17
// MIN 10:41 reveer si no funciona despues de habilitar JWT
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
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
