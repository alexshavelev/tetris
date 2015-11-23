/**
 * Created by user on 19.11.15.
 */

import com.shavelev.alexander.messages.WelcomeMessageCreator;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;

import static junit.framework.Assert.*;

public class WelcomeMessageTest {
    private static final String RECIPIENT_EN = "World";
    private static final String RECIPIENT_RU = "Мир";
    private static final String RECIPIENT_UK = "Світ";
    private static final String END_SYMBOL = ":)";



    @Test
    public void testMorningMessage() throws Exception {
        WelcomeMessageCreator welcomeMessageCreator = new WelcomeMessageCreator();
        String result;
        String lang = Locale.getDefault().getLanguage();
        for (int i = 6; i < 9; i++) {
            result = welcomeMessageCreator.getMessage(i).getWelcomeMessage();
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good morning, " + RECIPIENT_EN + END_SYMBOL, result);
            } else if (lang.equals("ru")) {
                assertEquals("Доброе утро, " + RECIPIENT_RU + END_SYMBOL, result);
            } else {
                assertEquals("Доброго ранку, " + RECIPIENT_UK + END_SYMBOL, result);
            }
        }
    }

    @Test
    public void testDayMessage() throws Exception {
        WelcomeMessageCreator welcomeMessageCreator = new WelcomeMessageCreator();
        String result;
        String lang = Locale.getDefault().getLanguage();
        for (int i = 9; i < 19; i++) {
            result = welcomeMessageCreator.getMessage(i).getWelcomeMessage();
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good day, " + RECIPIENT_EN + END_SYMBOL, result);
            } else if (lang.equals("ru")) {
                assertEquals("Добрый день, " + RECIPIENT_RU + END_SYMBOL, result);
            } else {
                assertEquals("Добрий день, " + RECIPIENT_UK + END_SYMBOL, result);
            }
        }
    }

    @Test
    public void testEveningMessage() throws Exception {
        WelcomeMessageCreator welcomeMessageCreator = new WelcomeMessageCreator();
        String result;
        String lang = Locale.getDefault().getLanguage();
        for (int i = 19; i < 23; i++) {
            result = welcomeMessageCreator.getMessage(i).getWelcomeMessage();
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good evening, " + RECIPIENT_EN + END_SYMBOL, result);
            } else if (lang.equals("ru")) {
                assertEquals("Добрый вечер, " + RECIPIENT_RU + END_SYMBOL, result);
            } else {
                assertEquals("Доброго вечору, " + RECIPIENT_UK + END_SYMBOL, result);
            }
        }
    }

    @Test
    public void testNightMessage() throws Exception {
        WelcomeMessageCreator welcomeMessageCreator = new WelcomeMessageCreator();
        String result;
        String lang = Locale.getDefault().getLanguage();
        int[] hours = {23, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < hours.length; i++) {
            result = welcomeMessageCreator.getMessage(hours[i]).getWelcomeMessage();
            if (lang.equals("en")) {
                assertEquals("Good night, " + RECIPIENT_EN + END_SYMBOL, result);
            } else if (lang.equals("ru")) {
                assertEquals("Доброй ночи, " + RECIPIENT_RU + END_SYMBOL, result);
            } else {
                assertEquals("Доброї ночі, " + RECIPIENT_UK + END_SYMBOL, result);
            }
        }
    }

    @Test(expected = Exception.class)
    public void testCrashProgram() throws Exception {
        int invalidHour = 500;
        WelcomeMessageCreator welcomeMessageCreator = new WelcomeMessageCreator();
        welcomeMessageCreator.getMessage(invalidHour).getWelcomeMessage();
    }

}
