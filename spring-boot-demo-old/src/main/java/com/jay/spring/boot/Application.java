package com.jay.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bob.xiang
 * SpringApplication是Spring Boot框架中描述Spring应用的类，
 * 它的run()方法会创建一个Spring应用上下文（Application Context）。
 * 另一方面它会扫描当前应用类路径上的依赖，例如本例中发现spring-webmvc（由 spring-boot-starter-web传递引入）
 * 在类路径中，那么Spring Boot会判断这是一个Web应用，并启动一个内嵌的Servlet容器（默认是Tomcat）用于处理HTTP请求。

Spring WebMvc框架会将Servlet容器里收到的HTTP请求根据路径分
发给对应的@Controller类进行处理，@RestController是一类特殊的@Controller，
它的返回值直接作为HTTP Response的Body部分返回给浏览器。@RequestMapping注解表明该方法处理那些URL对应的HTTP请求，
也就是我们常说的URL路由（routing)，请求的分发工作是有Spring完成的。
例如上面的代码中http://localhost:8080/根路径就被路由至greeting()方法进行处理。如果访问http://localhost:8080/hello，则会出现404 Not Found错误，因为我们并没有编写任何方法来处理/hello请求。
 */
@SpringBootApplication
public class Application {
	private static 	Logger logger=LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//TODO mybatis没有加载好
		logger.info("程序启动----success");
	}

}
