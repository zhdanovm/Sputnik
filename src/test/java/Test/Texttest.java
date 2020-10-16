package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Filereader;

public class Texttest {
    @Test
    public void test1() {
        String text = Filereader.getTextFromFile("C:\\Users\\Михаил Александрович\\IdeaProjects\\09.10.Test\\src\\test\\resources\\Text");
        String word = "всем";
        Assert.assertTrue(text.contains(word), "Слово " + word + " не найдено");
    }

    @Test
    public void test2() {
        String text = Filereader.getTextFromFile("C:\\Users\\Михаил Александрович\\IdeaProjects\\09.10.Test\\src\\test\\resources\\Text");
        String word = "жопа";
        Assert.assertTrue(text.contains(word), "Слово " + word + " не найдено");
    }
}
