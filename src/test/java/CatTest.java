import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnsCorrectValue() throws Exception {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        assertEquals("Метод getSound вернул должен возвращать значение (Мяу)", expected, cat.getSound());
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals("Метод getFood вернул неккоректное значение", expected, actual);
    }
}