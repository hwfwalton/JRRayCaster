/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.awt.geom.Point2D;
import edu.ucdavis.jr.JR;

public class Main extends java.lang.Object {
    { JRinit(); }
    
    public Main() {
        // Begin Expr2
        super();
        JRprocess();
    }
    private static Player dude;
    private static Map world;
    private static Renderer screen;
    private static Controls controller;
    
    public static void main(String[] args) {
        // Begin Expr2
        System.out.println("We\'re up.");
        double x_start = 6;
        double y_start = 6;
        Point2D start_dir = new Point2D.Double(-1, 0);
        Point2D proj_plane = new Point2D.Double(0, -40.0 / 100);
        boolean gameOn = true;
        // Begin Expr2
        world = new Map();
        // Begin Expr2
        dude = new Player(x_start, y_start, start_dir, proj_plane, world);
        // Begin Expr2
        controller = new Controls();
        // Begin Expr2
        screen = new Renderer(world, dude, 600, 480);
        // Begin Expr2
        screen.frame.addKeyListener(controller);
        // Begin Expr2
        dude.turn(1.0E-6);
        int updateTick = 100;
        int renderTick = 1;
        long oldTime = /*JR init for inni*/ 0;
        long timeStep = /*JR init for inni*/ 0;
        long lastUpdate = 0;
        long currTime = System.currentTimeMillis();
        JRLoop0: while (gameOn) {
            // Begin Expr2
            oldTime = currTime;
            // Begin Expr2
            currTime = System.currentTimeMillis();
            // Begin Expr2
            timeStep = (currTime - oldTime);
            if (currTime > lastUpdate + updateTick) {
                // Begin Expr2
                update(currTime - lastUpdate);
                // Begin Expr2
                lastUpdate = currTime;
            }
            // Begin Expr2
            (new Cap_ext_(screen.JRget_op_renderFrame_voidTovoid(), "void")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
            // Begin Expr2
            JR.nap(renderTick);
        }
    }
    
    public static void update(long timeStep) {
        // Begin Expr2
        System.out.println("\n****GameTick****");
        // Begin Expr2
        dude.roam(timeStep, controller);
    }
    protected boolean JRcalled = false;
    protected JRMain jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRMain();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
