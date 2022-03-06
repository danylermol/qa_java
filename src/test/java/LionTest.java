import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int kittensExpected = 1;
        assertEquals(kittensExpected, lion.getKittens());
    }

    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception{
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
