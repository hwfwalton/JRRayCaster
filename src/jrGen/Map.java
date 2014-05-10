/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class Map extends java.lang.Object {
    { JRinit(); }
    
    public Map() {
        // Begin Expr2
        super();
        JRprocess();
    }
    final int height = 12;
    final int width = 12;
    final int scale = 1;
    int deltaX;
    int deltaY;
    public final int[][] terrain = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1}, {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    protected boolean JRcalled = false;
    protected JRMap jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRMap();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
