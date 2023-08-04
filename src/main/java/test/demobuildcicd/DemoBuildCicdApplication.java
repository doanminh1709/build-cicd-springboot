package test.demobuildcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBuildCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBuildCicdApplication.class, args);
    }

    @GetMapping("/test")
    public String welcome(){
        return "hello world";
    }
}
