package ie.atu.y3_lab3_cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService; // loose coupling
    }

    public void registerUser(String username, String email) {
        // some user registration logic

        // send confirmation email
        emailService.sendEmail(email, "Welcome to our platform!");
    }
}
