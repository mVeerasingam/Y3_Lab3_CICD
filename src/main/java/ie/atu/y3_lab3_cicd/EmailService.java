package ie.atu.y3_lab3_cicd;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String name, String email){

        // code to send email
        return "Welcome " + name + ". Email: " + email;
    }
}
