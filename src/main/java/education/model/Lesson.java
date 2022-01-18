package education.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lesson {
    private String name;
    private String duration;
    private String lecturerName;
    private int price;
}
