package pers.zhc.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author bczhc
 */
public class HelloWorld {
    @Autowired
    private String msg = "a";

    public HelloWorld() {
        System.out.println("constructing...");
    }

    public HelloWorld(int a) {
        System.out.println("constructing with parameter...");
    }
    public void printHelloWorld() {
        System.out.println(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
