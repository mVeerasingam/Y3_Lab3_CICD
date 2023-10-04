package ie.atu.y3_lab3_cicd.Excersise_2;

// post mapping done here
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}