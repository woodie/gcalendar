import javax.microedition.midlet.MIDlet;
import javax.microedition.io.*;

public class Gcalendar extends MIDlet {

  public void startApp () {
    try {
      boolean must_first_exit = platformRequest("https://calendar.google.com/calendar/m");
    } catch (ConnectionNotFoundException ex) {
      ex.printStackTrace();
    }
    destroyApp (false);
    notifyDestroyed ();
  }
  public void pauseApp () {}
  public void destroyApp (boolean unconditional) {}
}

