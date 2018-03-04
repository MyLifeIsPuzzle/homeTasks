package homeTaskThirteen;

import lombok.AllArgsConstructor;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public enum TypeOfActivity {
    BREAK("Перерывы", Arrays.asList("Перерыв", "Обеденный перерыв")),
    SOLUTION("Решения", Arrays.asList("Решение с преподавателем", "Решение самостоятельное")),
    EXERCISE("Упражнения", Arrays.asList("Практическое упражнение", "Теоретическое упражнение")),
    LECTURE("Лекции", Arrays.asList("Скаляры", "Массивы"));

    String name;
    List<String> activitiesOfThisType;
}
