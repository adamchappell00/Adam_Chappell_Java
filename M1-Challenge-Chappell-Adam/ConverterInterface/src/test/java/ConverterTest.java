import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    ConverterIf conIf = new ConverterIf();
    ConverterSwitch conSwitch = new ConverterSwitch();

    @Test
    public void testConverterIfForDayOfWeek(){
        assertEquals("Sunday", conIf.convertDay(1));
        assertEquals("Wednesday", conIf.convertDay(4));
        assertEquals("Thursday", conIf.convertDay(5));
    }

    @Test
    public void testConverterIfForMonth(){
        assertEquals("January", conIf.convertMonth(1));
        assertEquals("March", conIf.convertMonth(3));
        assertEquals("November", conIf.convertMonth(11));
    }

    @Test
    public void testConverterSwitchForDayOfWeek(){
        assertEquals("Sunday", conSwitch.convertDay(1));
        assertEquals("Wednesday", conSwitch.convertDay(4));
        assertEquals("Saturday", conSwitch.convertDay(7));
    }

    @Test
    public void testConverterSwitchForMonth(){
        assertEquals("July", conSwitch.convertMonth(7));
        assertEquals("December", conSwitch.convertMonth(12));
        assertEquals("March", conSwitch.convertMonth(3));
    }
}