package ie.atu.y3_lab3_cicd.Excersise_2;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// Example Code to help understand @ResponseBody and @PostMapping, code method implemented in
// UserController
@RestController
@RequestMapping("/test")
public class UserController_2 {

    @GetMapping(value = {"/user","/java"})
    public User getUser(){
        User user = new User("Mark", "Mail@Mail.com");
        return user;
    }

    @PostMapping("/user/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user){
        System.out.println("User ID: " + user.getName());
        System.out.println("User ID: " + user.getEmail());
        return user;
    }
}
