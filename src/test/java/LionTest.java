import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int kittensExpected = 1;
        assertEquals("Метод getKittens должен был вернуть значение (1)", kittensExpected, lion.getKittens());
    }

    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue("Метод doesHaveMane должен был вернуть значение (true)", lion.doesHaveMane());
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals("Метод getFood вернул некорректное значение", expected, actual);
    }
}