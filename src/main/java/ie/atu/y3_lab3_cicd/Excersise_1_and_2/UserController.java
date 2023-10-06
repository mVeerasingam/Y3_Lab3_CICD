package ie.atu.y3_lab3_cicd.Excersise_1_and_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService us;
    @Autowired
    public void SetUserService(UserService us){
        this.us = us;
    }
    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name,
                          @PathVariable String email){
        return us.registerUser(name,email);
    }
    @PostMapping("/registerUser/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user){
        System.out.println("User ID: " + user.getName());
        System.out.println("User ID: " + user.getEmail());
        return user;
    }
}
