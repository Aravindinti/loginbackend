package in.co.vwit.engineering.resourceManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ResourceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
	}
	


	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ResourceManagementApplication.class);
	}




	//CORS Configuration
	@Bean
	public WebMvcConfigurer get() {
		 WebMvcConfigurer c=new  WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
			
				registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
			 //todo need to improve this configuration 
			 
			 
			 }	 	 
		 };
		 return c;
		
	}


}
