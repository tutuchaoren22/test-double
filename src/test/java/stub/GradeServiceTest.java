package stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @InjectMocks
    private GradeService gradeService;

    @Mock
    private GradeSystem mockGradeSystem;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        List<Double> list = Arrays.asList(90.0, 80.0, 100.0);
        when(mockGradeSystem.gradesFor(0)).thenReturn(list);
        double result = gradeService.calculateAverageGrades(0);
        Assertions.assertEquals(90.0, result);
    }
}
