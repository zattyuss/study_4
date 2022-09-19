package season.summer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import season.summer.controller.HomeController;

@Configuration
public class RootConfig {
	
	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
}
