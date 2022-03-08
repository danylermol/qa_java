import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Метод eatMeat вернул неккоректное значение", expected, actual);
    }

    @Test
    public void getKittensReturns1() throws Exception {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals("Метод getKittens должен был вернуть (1)", expected, feline.getKittens());
    }

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Feline feline = new Feline();
        int expected = 12;
        assertEquals("Метод getKittens должен был вернуть (12)", expected, feline.getKittens(12));
    }

    @Test
    public void getFamilyReturnsCorrectValue() throws Exception {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Метод getFamily вернул некорректное значение", expected, actual);
    }

}