package ie.atu.y3_lab3_cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService; // this is kinda like inheritance ig, idrk tbh
    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService; // loose coupling
    }
    public String registerUser(String name, String email) {
        // some user registration logic

        // send confirmation email
        return emailService.sendEmail(name, email);
    }
}
