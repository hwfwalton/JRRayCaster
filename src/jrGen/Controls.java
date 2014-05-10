/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controls extends KeyAdapter {
    { JRinit(); }
    
    public Controls() {
        // Begin Expr2
        super();
        JRprocess();
    }
    char key;
    boolean r_turner = false;
    boolean l_turner = false;
    boolean f_mover = false;
    boolean b_mover = false;
    boolean l_mover = false;
    boolean r_mover = false;
    
    public void keyPressed(KeyEvent e) {
        // Begin Expr2
        key = e.getKeyChar();
        if (key == 'j') // Begin Expr2
        l_turner = true; else if (key == 'k') // Begin Expr2
        r_turner = true; else if (key == 'w') // Begin Expr2
        f_mover = true; else if (key == 's') // Begin Expr2
        b_mover = true; else if (key == 'a') // Begin Expr2
        l_mover = true; else if (key == 'd') // Begin Expr2
        r_mover = true; else if (key == 't') // Begin Expr2
        System.out.println("T PRESSED");
    }
    
    public void keyReleased(KeyEvent e) {
        // Begin Expr2
        key = e.getKeyChar();
        if (key == 'j') // Begin Expr2
        l_turner = false; else if (key == 'k') // Begin Expr2
        r_turner = false; else if (key == 'w') // Begin Expr2
        f_mover = false; else if (key == 's') // Begin Expr2
        b_mover = false; else if (key == 'a') // Begin Expr2
        l_mover = false; else if (key == 'd') // Begin Expr2
        r_mover = false;
    }
    
    public boolean getTurnL() {
        // Return
        return (l_turner);
        // End Return

    }
    
    public boolean getTurnR() {
        // Return
        return (r_turner);
        // End Return

    }
    
    public boolean getMoveF() {
        // Return
        return (f_mover);
        // End Return

    }
    
    public boolean getMoveB() {
        // Return
        return (b_mover);
        // End Return

    }
    
    public boolean getMoveL() {
        // Return
        return (l_mover);
        // End Return

    }
    
    public boolean getMoveR() {
        // Return
        return (r_mover);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRControls jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRControls();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
