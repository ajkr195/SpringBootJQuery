package com.spring.boot.rocks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String homeIndex(Model model) {
		return "index";
	}
	
	@GetMapping("/index2")
	public String homeIndex2(Model model) {
		return "index2";
	}
	
	@GetMapping("/index3")
	public String homeIndex3(Model model) {
		return "index3";
	}
	
	@GetMapping("/index4")
	public String homeIndex4(Model model) {
		return "index3";
	}
	
	@GetMapping("/index5")
	public String homeIndex5(Model model) {
		return "index5";
	}
	
	
}
