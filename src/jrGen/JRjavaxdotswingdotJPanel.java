/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

public class JRjavaxdotswingdotJPanel
  extends JRjavaxdotswingdotJComponent
  implements Serializable, Cloneable,
    JRjavaxdotaccessibilitydotAccessible
{
    static final long serialVersionUID = 0;
    public JRjavaxdotswingdotJPanel()
    {}
    boolean isNoop;
    public JRjavaxdotswingdotJPanel(boolean isNoop)
    {this.isNoop = isNoop;}
    public String toString ()
    {return isNoop?"noop":super.toString();}
    public Object clone()
	throws CloneNotSupportedException
    {
	    return super.clone();
    }
    public static Object getNoop()
    {
	    return new JRjavaxdotswingdotJPanel();
    }
}
