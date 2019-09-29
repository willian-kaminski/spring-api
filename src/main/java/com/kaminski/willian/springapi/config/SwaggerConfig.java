package com.kaminski.willian.springapi.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Willian Kaminski
 * @since 29-09-19
 * @version 1.0
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket peopleAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kaminski.willian.springapi"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
                
    }
    
    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "People API REST",
                "API REST de cadastro de Pessoas",
                "1.0",
                "Term of Service",
                new Contact(
                        "Willian Kaminski dos Santos", 
                        "https://willian-kaminski.github.io/", 
                        "developer.williansantos@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licensen.html", new ArrayList<>()
        );
        
        return apiInfo;
    }
}
