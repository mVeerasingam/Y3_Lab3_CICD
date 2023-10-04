package ie.atu.y3_lab3_cicd.Excersise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
