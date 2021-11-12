package bookcurd_01_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FeiJiang00
 * @date 2021/11/12 1:15
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getBuId(){
        System.out.println("springboot is running...");
        return "springboot is running";
    }
}
