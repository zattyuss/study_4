package season.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.Member;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String thisSummer() {
		return "thisSummer";
	}
	@GetMapping("/goto/beach")
	public String beach(@RequestParam(value="id", defaultValue = "�⺻��") String id) {
		System.out.println(id);
		return "beach";
	}
	@GetMapping("/goto/valley")
	public String valley() {
		return "valley";
	}
	@GetMapping("/goto/pool")
	public String pool() {
		return "pool";
	}
	
	@GetMapping("/goto/join")
	public String joinForm() {
		return "join";
	}
	
	@PostMapping("/goto/join")
	public String join(Member member) {
		System.out.println(member.getUsername());
		System.out.println(member.getEmail());
		System.out.println(member.getPw());
		return "redirect:/";
	}
}
