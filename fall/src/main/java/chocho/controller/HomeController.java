package chocho.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		String name = request.getParameter("username");
		System.out.println(name);
		return "welcome";
	}
	
	@RequestMapping(value= "/member/join", method = RequestMethod.GET)
	public String memberJoin() {
		return "memberJoin";
	}
	//¿äÃ» : /member/join
	// /WEB-INF/views/memberJoin.jsp
	
	
	@RequestMapping("/member/login")
	public String loginPage(@RequestParam("id") String userId, @RequestParam("pw") String pw) {
		// ? userId=¿Ü°­Çù&pw=1234
		// String pw
		System.out.println(userId);
		System.out.println(pw);
		return "login";
	}
	
	@GetMapping("/member/list")
	public String memberList() {
		return "member_list";
	}
}
