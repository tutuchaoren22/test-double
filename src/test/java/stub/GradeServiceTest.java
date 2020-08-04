package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
       GradeService gradeService = new GradeService(new MockGradeSystem());
        double result = gradeService.calculateAverageGrades(0);
        Assertions.assertEquals(90.0, result);
    }
}
