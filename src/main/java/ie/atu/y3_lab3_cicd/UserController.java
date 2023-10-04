package ie.atu.y3_lab3_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/registerHello/{name}/{email}")
    public String getUser(@PathVariable String name,
                          @PathVariable String email){

        // not correct return
        return email;
    }

}
