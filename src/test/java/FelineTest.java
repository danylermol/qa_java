import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception{
        Feline feline = new Feline();
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturns1() throws Exception{
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void getKittensReturnsCorrectValue() throws Exception{
        Feline feline = new Feline();
        int expected = 12;
        assertEquals(expected, feline.getKittens(12));
    }

    @Test
    public void getFamilyReturnsCorrectValue() throws Exception{
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
    }


}
