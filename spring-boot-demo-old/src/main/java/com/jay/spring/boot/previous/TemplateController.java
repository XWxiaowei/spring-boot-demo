package com.jay.spring.boot.previous;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Controller：1：spring的控制层。
//2：spring的注解之一放在类名之前3:spring配置文件中如果配置了扫描包路径，
//自动检测该注释的类并注入。4：spring控制层可以接收请求，并且返回响应。
@RequestMapping("/template")
public class TemplateController {
	
	@RequestMapping("/helloHtml")
	public String helloHtml(Model model){
		model.addAttribute("name", "项伟");
		return "helloHtml";
//		return "redirect:index";
	}
    @RequestMapping("/list")  
    public ModelAndView list() {  
//        Iterable<Message> messages = this.messageRepository.findAll();  
//        return new ModelAndView("messages/list", "messages", messages);  
    	  Map<String, Object> map=new HashMap<String, Object>();
    	  map.put("name", "项伟");
    	  return new ModelAndView("helloHtml", map);
    }  
	
}
