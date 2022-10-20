package com.yafirasyad.ecommerce.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.yafirasyad.ecommerce.controller"))
        .paths(PathSelectors.any())
        .build().apiInfo(apiInfo());

    }

    private ApiInfo apiInfo() {
       ApiInfo apiInfo = new ApiInfo(
        "Dokumentasi API Grinaldy Yafi'Rasyad",
        "Ini adalah dokumentasi API simple ecommerce backend dengan java spring boot",
        "API ToS", 
        "Terms of Service",
        new Contact("Grinaldy Yafi' Rasyad","https://github.com/grinaldyafi","yafirasyadd@gmail.com"), 
        "MIT License",
        "https://mit-license.org/",
        Collections.emptyList()
        );

       return apiInfo;
    }

}
