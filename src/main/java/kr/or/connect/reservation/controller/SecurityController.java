package kr.or.connect.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
	@RequestMapping("/main")
	@ResponseBody
	public String main() {
		return "index";
	}

    @RequestMapping("/securepage")
    @ResponseBody
    public String securitypage(){
        return "secured";
    }
}

