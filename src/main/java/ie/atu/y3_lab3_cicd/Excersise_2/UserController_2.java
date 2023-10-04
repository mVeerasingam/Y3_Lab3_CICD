package ie.atu.y3_lab3_cicd.Excersise_2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController_2 {
    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user){
        System.out.println("User ID: " + user.getName());
        System.out.println("User ID: " + user.getEmail());
        return user;
    }
}
