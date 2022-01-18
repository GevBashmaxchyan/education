package education.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Set<Lesson> lessons;
}
