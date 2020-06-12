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
	
	@GetMapping("/index6")
	public String homeIndex6(Model model) {
		return "index6";
	}
	
	@GetMapping("/index7")
	public String homeindex7(Model model) {
		return "index7";
	}
	@GetMapping("/index8")
	public String homeindex8(Model model) {
		return "index8";
	}
	
	@GetMapping("/index9")
	public String homeindex9(Model model) {
		return "index9";
	}
	
	@GetMapping("/index10")
	public String homeindex10(Model model) {
		return "index10";
	}
	
	@GetMapping("/index11")
	public String index11(Model model) {
		return "index11";
	}
	
	@GetMapping("/index12")
	public String index12(Model model) {
		return "index12";
	}
	
}
