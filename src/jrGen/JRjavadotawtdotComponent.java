/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

public class JRjavadotawtdotComponent
  extends JRjavadotlangdotObject
  implements Serializable, Cloneable,
    JRjavadotawtdotimagedotImageObserver,
    JRjavadotawtdotMenuContainer,
    JRjavadotiodotSerializable
{
    static final long serialVersionUID = 0;
    public JRjavadotawtdotComponent()
    {}
    boolean isNoop;
    public JRjavadotawtdotComponent(boolean isNoop)
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
	    return new JRjavadotawtdotComponent();
    }
}
