package com.jafa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//��Ʈ�ѷ��� ����� �Ǹ� ��������(Bean)�� �ȴ�.
@Controller
public class CommonController {

	@GetMapping("/common/page1")
	public void common() {
		
	}
	//��û : /common/page1
	//views �̸� : /common/page1
	//WEB-INF/views/common/page1.jsp
	
	
}
