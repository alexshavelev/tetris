/**
 * Created by user on 19.11.15.
 */

import com.shavelev.alexander.WelcomeMessage;
import org.junit.Test;

import java.util.Locale;

import static junit.framework.Assert.*;

public class WelcomeMessageTest {

    @Test(timeout = 200)
    public void testGetWelcomeMessage() throws Exception {
        for (int i = 6; i < 9; i++) {
            WelcomeMessage welcomeMessage = new WelcomeMessage(i);
            String result = WelcomeMessage.getWelcomeMessage(welcomeMessage);
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good morning, World!", result);
            } else {
                assertEquals("Доброе утро, мир!", result);}
        }

        for (int i = 9; i < 19; i++) {
            WelcomeMessage welcomeMessage = new WelcomeMessage(i);
            String result = WelcomeMessage.getWelcomeMessage(welcomeMessage);
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good day, World!", result);
            } else {
                assertEquals("Добрый день, мир!", result);}
        }

        for (int i = 19; i < 23; i++) {
            WelcomeMessage welcomeMessage = new WelcomeMessage(i);
            String result = WelcomeMessage.getWelcomeMessage(welcomeMessage);
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good evening, World!", result);
            } else {
                assertEquals("Добрый вечер, мир!", result);}
        }


        int[] hours = {23, 0, 1, 2, 3, 4, 5};
        for (int i = 0; i < hours.length; i++) {
            WelcomeMessage welcomeMessage = new WelcomeMessage(hours[i]);
            String result = WelcomeMessage.getWelcomeMessage(welcomeMessage);
            if (Locale.getDefault().getLanguage().equals("en")) {
                assertEquals("Good night, World!", result);
            } else {
                assertEquals("Доброй ночи, мир!", result);}
        }

        WelcomeMessage welcomeMessage = new WelcomeMessage(500);
        String result = WelcomeMessage.getWelcomeMessage(welcomeMessage);
        assertEquals("invalid time", result);
    }


}
