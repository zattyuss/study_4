package chocho;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jafa.CommonController;

@Configuration
public class RootConfig {
	
	//�������� ����ϴ� ���
	@Bean
	public CommonController commonController() {
		return new CommonController();
		
	}
}
