package com.kaysanshi.itoken.service.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author kay三石
 * @date:2019/8/25
 * RequestHandlerSelectors.basePackage("com.funtl.itoken.service.admin.controller")
 * 为 Controller 包路径，不然生成的文档扫描不到接口
 */
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kaysanshi.itoken.service.admin"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("itoken API 文档")
                .description("itoken API 网关接口，http://www.kaynethy.com")
                .version("1.0.0")
                .build();
    }

}
