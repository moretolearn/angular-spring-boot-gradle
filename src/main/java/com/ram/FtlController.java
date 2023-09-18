
package com.ram;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FtlController {
	
	@GetMapping("/")
	public String defaultPage2(ModelMap model) {
		return "index";
	}

	@GetMapping("/ftl")
	public String defaultPage(ModelMap model) {
		return "ftl-angular";
	}
	
	@GetMapping("/ftl-index")
	public String defaultPage3(ModelMap model) {
		return "index";
	}
	
	@GetMapping("/jsp")
	public String defaultPage1(ModelMap model) {
		return "jsp-angular";
	}

}
