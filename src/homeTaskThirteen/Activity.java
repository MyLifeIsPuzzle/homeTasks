package homeTaskThirteen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Activity {

    @Getter
    private String beginningTime;
    @Getter
    @Setter
    private String endingTime;
    @Getter
    private String name;
    @Getter
    private TypeOfActivity typeOfActivity;
}
