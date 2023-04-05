package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class BasicController{

    @GetMapping("/sum")
    public int sum(){
        Random r = new Random();
        int n1 = r.nextInt();
        int n2 = r.nextInt();
        return  n1+n2;
    }
}