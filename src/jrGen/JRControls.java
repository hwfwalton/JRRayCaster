/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRControls
      extends JRjavadotawtdoteventdotKeyAdapter
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRControls(JRControls copy)
	{

	}
	public JRControls(Object ... opSig)
	{

	}
	public JRControls(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRControls(true);
	}
    }
