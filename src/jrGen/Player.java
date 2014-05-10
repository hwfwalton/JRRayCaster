/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.awt.geom.Point2D;
import java.lang.Math;

public class Player extends java.lang.Object {
    { JRinit(); }
    public double x;
    public double y;
    public Point2D dir_vec;
    public Point2D proj_plane;
    private double nx;
    private double ny;
    private double dirx;
    private double diry;
    private double nplanex;
    private double nplaney;
    private double oldX;
    private double oldY;
    private double moveX;
    private double moveY;
    private double destX;
    private double destY;
    private double stepX;
    private double stepY;
    private int checkX;
    private int checkY;
    private int deltaX;
    private int deltaY;
    private int distCheckedX;
    private int distCheckedY;
    private boolean lTurn;
    private boolean rTurn;
    private boolean fMove;
    private boolean bMove;
    private boolean lMove;
    private boolean rMove;
    private static Map world;
    
    public Player(double x_pos, double y_pos, Point2D start_dir, Point2D start_plane, Map in_world) {
        // Begin Expr2
        super();
        // Begin Expr2
        x = x_pos;
        // Begin Expr2
        y = y_pos;
        // Begin Expr2
        dir_vec = start_dir;
        // Begin Expr2
        proj_plane = start_plane;
        // Begin Expr2
        world = in_world;
        JRprocess();
    }
    
    public double getAngle() {
        if (dir_vec.getY() >= 0) {
            // Return
            return (Math.toDegrees(Math.acos((dir_vec.getX()) / (Math.sqrt(Math.pow(dir_vec.getY(), 2) + Math.pow(dir_vec.getX(), 2))))));
            // End Return

        } else {
            // Return
            return (360 - Math.toDegrees(Math.acos((dir_vec.getX()) / (Math.sqrt(Math.pow(dir_vec.getY(), 2) + Math.pow(dir_vec.getX(), 2))))));
            // End Return

        }
    }
    
    public void roam(long timeStep, Controls controller) {
        // Begin Expr2
        lTurn = controller.getTurnL();
        // Begin Expr2
        rTurn = controller.getTurnR();
        // Begin Expr2
        fMove = controller.getMoveF();
        // Begin Expr2
        bMove = controller.getMoveB();
        // Begin Expr2
        lMove = controller.getMoveL();
        // Begin Expr2
        rMove = controller.getMoveR();
        if (lTurn ^ rTurn) // Begin Expr2
        turn((rTurn ? 1 : -1) * (((Math.PI / 24) / 100) * timeStep));
        if (fMove || bMove || lMove || rMove) {
            // Begin Expr2
            move(timeStep * (0.25 / 100), fMove, bMove, lMove, rMove);
        }
    }
    
    public void turn(double spin) {
        // Begin Expr2
        nplanex = (proj_plane.getX() * Math.cos(spin) - (proj_plane.getY() * Math.sin(spin)));
        // Begin Expr2
        nplaney = (proj_plane.getX() * Math.sin(spin) + (proj_plane.getY() * Math.cos(spin)));
        // Begin Expr2
        dirx = (dir_vec.getX() * Math.cos(spin) - (dir_vec.getY() * Math.sin(spin)));
        // Begin Expr2
        diry = (dir_vec.getX() * Math.sin(spin) + (dir_vec.getY() * Math.cos(spin)));
        // Begin Expr2
        dir_vec.setLocation(dirx, diry);
        // Begin Expr2
        proj_plane.setLocation(nplanex, nplaney);
    }
    
    public void move(double scale, boolean fMove, boolean bMove, boolean lMove, boolean rMove) {
        // Begin Expr2
        nx = 0;
        // Begin Expr2
        ny = 0;
        if ((fMove ^ bMove) && (lMove == rMove)) {
            // Begin Expr2
            nx = (fMove ? 1 : -1) * dir_vec.getX();
            // Begin Expr2
            ny = (fMove ? 1 : -1) * dir_vec.getY();
        } else if ((fMove == bMove) && (lMove ^ rMove)) {
            // Begin Expr2
            nx = (lMove ? 1 : -1) * dir_vec.getY();
            // Begin Expr2
            ny = (rMove ? 1 : -1) * dir_vec.getX();
        } else if ((fMove ^ bMove) && (lMove ^ rMove)) {
        }
        // Begin Expr2
        destX = x + (nx * scale);
        // Begin Expr2
        destY = y + (ny * scale);
        // Begin Expr2
        deltaX = (destX > x) ? 1 : -1;
        // Begin Expr2
        deltaY = (destY > y) ? 1 : -1;
        // Begin Expr2
        checkX = validX();
        // Begin Expr2
        checkY = validY();
        if (checkX == checkY && checkX == 0) {
            // Begin Expr2
            moveX = nx * scale;
            // Begin Expr2
            moveY = ny * scale;
        } else if ((checkX == 0) && (checkY != 0)) {
            // Begin Expr2
            moveY = Math.abs(y - checkY);
            // Begin Expr2
            moveX = (nx / ny) * moveY;
        } else if ((checkY == 0) && (checkX != 0)) {
            // Begin Expr2
            moveX = Math.abs(x - checkX);
            // Begin Expr2
            moveY = (ny / nx) * moveX;
        } else {
            // Begin Expr2
            moveX = Math.abs(x - checkX);
            // Begin Expr2
            moveY = (ny / nx) * moveX;
            if (Math.sqrt(Math.pow(Math.abs(y - checkY), 2) + Math.pow((nx / ny) * Math.abs(y - checkY), 2)) < Math.sqrt(Math.pow(moveX, 2) + Math.pow(moveY, 2))) {
                // Begin Expr2
                moveY = Math.abs(y - checkY);
                // Begin Expr2
                moveX = (nx / ny) * moveY;
            }
        }
        // Begin Expr2
        x = x + moveX;
        // Begin Expr2
        y = y + moveY;
    }
    
    public int validX() {
        int i = r(x);
        double j = y;
        // Begin Expr2
        stepY = ny / nx;
        // Begin Expr2
        distCheckedX = 0;
        JRLoop1: while (distCheckedX <= Math.abs(r(x) - r(destX))) {
            // Begin Expr2
            System.out.println("Xchecking (x, y): " + i + ", " + j);
            if ((world.terrain[r(j)][i]) == 1) {
                // Begin Expr2
                System.out.println("found 1 at (y,x): " + j + "," + i);
                // Return
                return (i);
                // End Return

            }
            // Begin Expr2
            distCheckedX++;
            if (deltaX == 1) // Begin Expr2
            i++; else // Begin Expr2
            i--;
            if (deltaY == 1) // Begin Expr2
            j += stepY; else // Begin Expr2
            j -= stepY;
        }
        // Return
        return (0);
        // End Return

    }
    
    public int validY() {
        double i = x;
        int j = r(y);
        // Begin Expr2
        stepX = nx / ny;
        // Begin Expr2
        distCheckedY = 0;
        JRLoop2: while (distCheckedX < Math.abs(r(x) - r(destX))) {
            // Begin Expr2
            System.out.println("Ychecking (x, y): " + i + ", " + j);
            if ((world.terrain[j][r(i)]) == 1) {
                // Begin Expr2
                System.out.println("found 1 at (y,x): " + j + "," + i);
                // Return
                return (j);
                // End Return

            }
            // Begin Expr2
            distCheckedX++;
            if (deltaX == 1) // Begin Expr2
            j++; else // Begin Expr2
            j--;
            if (deltaX == 1) // Begin Expr2
            i += stepX; else // Begin Expr2
            i -= stepX;
        }
        // Return
        return (0);
        // End Return

    }
    
    public int r(double in) {
        // Return
        return (((int)Math.floor(in)));
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRPlayer jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRPlayer();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
