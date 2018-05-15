package cn.nullaher.test.msvc.swaggerUI;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TestSwaggerUIApp {
	public static void main(String[] args){
		SpringApplication.run(TestSwaggerUIApp.class , args);
	}
	
	@Value(value = "${spring.application.name}")
	public String appName;
	
	@Bean
	public Docket createRestApi(){
		// @formatter:off
		ParameterBuilder pb = new ParameterBuilder();
		List<Parameter> pars = new ArrayList<Parameter>();
		//每个接口上添加认证头参数
		pb.name("Authorization").defaultValue("Bearer ").description("jwt令牌")
			.modelRef(new ModelRef("string")).parameterType("header").required(true).build();
		pars.add(pb.build());
		// @formatter:on
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(PathSelectors.any())
		    .build().globalOperationParameters(pars);
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder().title("[" + appName + "] RESTful APIs").description("开发测试接口文档")
		    .termsOfServiceUrl("http://xxx.com/")
		    // .contact("系统管理员")
		    .version("1.0").build();
	}
}
