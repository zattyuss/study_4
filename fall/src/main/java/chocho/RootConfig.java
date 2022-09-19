package chocho;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jafa.CommonController;

@Configuration
public class RootConfig {
	
	//스프링빈 등록하는 방법
	@Bean
	public CommonController commonController() {
		return new CommonController();
		
	}
}
