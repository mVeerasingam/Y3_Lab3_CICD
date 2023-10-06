package ie.atu.y3_lab3_cicd.Excersise_1_and_2;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String name, String email){

        // code to send email
        return "Welcome " + name + ". Email: " + email;
    }
}
