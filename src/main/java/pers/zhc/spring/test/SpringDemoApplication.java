package pers.zhc.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@SpringBootApplication
@RestController
public class SpringDemoApplication {
    public static void main(String[] args) {
        /*SpringApplication.run(SpringDemoApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
        HelloWorld b = (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld == b);*/

        SpringApplication.run(SpringDemoApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) throws IOException {
        return String.format("<h1>hello, %s</h1>", name);
    }
}
