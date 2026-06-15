// src/main/java/com/example/sample/config/OpenApiConfig.java
package com.example.sample.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sample REST API")
                        .version("1.0.0")
                        .description("Spring Boot 3 + Springdoc OpenAPI 샘플 프로젝트")
                        .contact(new Contact()
                                .name("creatorjun")
                                .url("https://github.com/creatorjun")));
    }
}
