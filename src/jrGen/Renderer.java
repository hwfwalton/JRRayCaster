/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.lang.Math;
import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import edu.ucdavis.jr.JR;

public class Renderer extends java.lang.Object {
    { JRinit(); }
    private Map world;
    private Player dude;
    private int width;
    private int height;
    private double spin = 0.0;
    private double moveDist = 0.0;
    private double angle;
    private static int[][] gBuf;
    private static Op_ext.JRProxyOp JRget_op_KRAKEN_voidTovoid()
    {
        return op_KRAKEN_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_KRAKEN_voidTovoid;
    ;
    static    {
        try    {
            op_KRAKEN_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_KRAKEN_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid()
    {
        return op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid;
    }
    
    public static Op_ext.JRProxyOp op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid;
    ;
    static    {
        try    {
            op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid()
    {
        return op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid;
    }
    
    public static Op_ext.JRProxyOp op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid;
    ;
    static    {
        try    {
            op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_renderPregen_intTovoid()
    {
        return op_renderPregen_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_renderPregen_intTovoid;
    ;
    static    {
        try    {
            op_renderPregen_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_bufWriter_intXdoubleXintTovoid()
    {
        return op_bufWriter_intXdoubleXintTovoid;
    }
    
    public static Op_ext.JRProxyOp op_bufWriter_intXdoubleXintTovoid;
    ;
    static    {
        try    {
            op_bufWriter_intXdoubleXintTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private final int worker_pool = 3;
    JFrame frame;
    static SwingSucksAssWhatTheHell content;
    
    public Renderer(Map in_world, Player in_dude, int h_res, int v_res) {
        // Begin Expr2
        super();
        // Begin Expr2
        world = in_world;
        // Begin Expr2
        dude = in_dude;
        // Begin Expr2
        width = h_res;
        // Begin Expr2
        height = v_res;
        // Begin Expr2
        setupGfx();
        JRprocess();
    }
    
    public class SwingSucksAssWhatTheHell extends JPanel {
        { JRinit(); }
        
        public SwingSucksAssWhatTheHell() {
            // Begin Expr2
            super();
            JRprocess();
        }
        int start;
        int end;
        int color;
        
        @Override()
        public void paintComponent(Graphics g) {
            // Begin Expr2
            super.paintComponent(g);
            // Begin Expr2
            g.setColor(new Color(25, 150, 200));
            // Begin Expr2
            g.fillRect(0, 0, 600, 240);
            // Begin Expr2
            g.setColor(new Color(200, 40, 25));
            // Begin Expr2
            g.drawString("dir_vec\'s angle: " + dude.dir_vec.toString(), 50, 50);
            // Begin Expr2
            g.drawString("Plane\'s angle: " + dude.getAngle(), 50, 65);
            // Begin Expr2
            g.drawString("Dude\'s location: " + dude.x + ", " + dude.y, 50, 80);
            JRLoop3: for (int i = 0; i < width; i++) {
                // Begin Expr2
                start = gBuf[i][0];
                // Begin Expr2
                end = gBuf[i][1];
                // Begin Expr2
                g.setColor(new Color(200, (end * 2 - start) % 255, 25));
                // Begin Expr2
                g.drawLine(i, start, i, end);
            }
        }
        protected boolean JRcalled = false;
        protected JRSwingSucksAssWhatTheHell jrresref;
        public Object JRgetjrresref()
        { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
        protected void JRinit() {
        	if(this.JRcalled) return;
        	jrresref = new JRSwingSucksAssWhatTheHell();
        	this.JRcalled = true;
        }
        private boolean JRproc = false;
        private void JRprocess() {
        	if (JRproc) return;
        	JRproc = true;
        }
    }
    
    private void setupGfx() {
        // Begin Expr2
        gBuf = new int[width][height];
        // Begin Expr2
        frame = new JFrame("JR CASTER");
        // Begin Expr2
        content = new SwingSucksAssWhatTheHell();
        // Begin Expr2
        content.setPreferredSize(new Dimension(width, height));
        // Begin Expr2
        frame.setContentPane(content);
        // Begin Expr2
        frame.setResizable(false);
        // Begin Expr2
        frame.pack();
        // Begin Expr2
        frame.setVisible(true);
        // Begin Expr2
        frame.toFront();
        JRget_op_KRAKEN_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
    }
    
    public void renderFramevoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_renderFrame_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void renderFramevoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_KRAKEN_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                try {
                    // Begin Expr2
                    JR.registerQuiescenceAction(new Cap_ext_(JRget_op_pushToBuf_voidTovoid()));
                } catch (edu.ucdavis.jr.QuiescenceRegistrationException e) {
                    // Begin Expr2
                    e.printStackTrace();
                }
                JRLoop4: for (int col = 0; col < width; col++) {
                    JRget_op_renderPregen_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {col});
                }
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    public Op_ext.JRProxyOp JRget_op_renderFrame_voidTovoid()
    {
        return op_renderFrame_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_renderFrame_voidTovoid;
    class ProcOp_voidTovoid_implrenderFrame extends ProcOp_ext_impl
    {
        Renderer thisarg;
        public ProcOp_voidTovoid_implrenderFrame(Renderer thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.renderFramevoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.renderFramevoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    
    public void setSpin(double newSpin) {
        // Begin Expr2
        spin = newSpin;
    }
    
    public void setMove(double newDist) {
        // Begin Expr2
        moveDist = newDist;
    }
    
    private static void pushToBufvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_pushToBuf_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void pushToBufvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                // Begin Expr2
                content.repaint();
                JRget_op_KRAKEN_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    private static Op_ext.JRProxyOp JRget_op_pushToBuf_voidTovoid()
    {
        return op_pushToBuf_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_pushToBuf_voidTovoid;
    static class ProcOp_voidTovoid_implpushToBuf extends ProcOp_ext_impl
    {
        public ProcOp_voidTovoid_implpushToBuf(Renderer thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Renderer.pushToBufvoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    Renderer.pushToBufvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_pushToBuf_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implpushToBuf(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private Op_ext.JRProxyOp JRget_op_precalculator_intTovoid()
    {
        return op_precalculator_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_precalculator_intTovoid;
    class ProcOp_intTovoid_implprecalculator extends ProcOp_ext_impl
    {
        Renderer thisarg;
        public ProcOp_intTovoid_implprecalculator(Renderer thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.precalculatorintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.precalculatorintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    private void precalculatorintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_precalculator_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void precalculatorintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                // Begin Expr2
                System.out.println("Feeder " + i + " online.");
                int col = /*JR init for inni*/ 0;
                JRLoop5: while (true) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_renderPregen_intTovoid().recv();
                        col = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    double cameraX = ((double)2) * col / width - 1;
                    Point2D rayPos = new Point2D.Double(dude.x, dude.y);
                    Point2D rayDir = new Point2D.Double(dude.dir_vec.getX() + dude.proj_plane.getX() * cameraX, dude.dir_vec.getY() + dude.proj_plane.getY() * cameraX);
                    Point2D gridPos = new Point2D.Double(Math.floor(rayPos.getX()), Math.floor(rayPos.getY()));
                    double sideDistX = Math.sqrt(1 + (Math.pow(rayDir.getY(), 2) / Math.pow(rayDir.getX(), 2)));
                    double sideDistY = Math.sqrt(1 + (Math.pow(rayDir.getX(), 2) / Math.pow(rayDir.getY(), 2)));
                    int stepX = /*JR init for inni*/ 0;
                    int stepY = /*JR init for inni*/ 0;
                    double immDistX = /*JR init for inni*/ 0.0;
                    double immDistY = /*JR init for inni*/ 0.0;
                    if (rayDir.getX() < 0) {
                        // Begin Expr2
                        stepX = -1;
                        // Begin Expr2
                        immDistX = (rayPos.getX() - gridPos.getX()) * sideDistX;
                    } else {
                        // Begin Expr2
                        stepX = 1;
                        // Begin Expr2
                        immDistX = (gridPos.getX() - rayPos.getX() + 1.0) * sideDistX;
                    }
                    if (rayDir.getY() < 0) {
                        // Begin Expr2
                        stepY = -1;
                        // Begin Expr2
                        immDistY = (rayPos.getY() - gridPos.getY()) * sideDistY;
                    } else {
                        // Begin Expr2
                        stepY = 1;
                        // Begin Expr2
                        immDistY = (gridPos.getY() - rayPos.getY() + 1.0) * sideDistY;
                    }
                    JRget_op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {col, rayPos, rayDir, gridPos, sideDistX, sideDistY, stepX, stepY, immDistX, immDistY});
                }
            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    
    private Op_ext.JRProxyOp JRget_op_ddaWorker_intTovoid()
    {
        return op_ddaWorker_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_ddaWorker_intTovoid;
    class ProcOp_intTovoid_implddaWorker extends ProcOp_ext_impl
    {
        Renderer thisarg;
        public ProcOp_intTovoid_implddaWorker(Renderer thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.ddaWorkerintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.ddaWorkerintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    private void ddaWorkerintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_ddaWorker_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void ddaWorkerintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                // Begin Expr2
                System.out.println("DDA worker " + i + " online.");
                int col = /*JR init for inni*/ 0;
                int stepX = /*JR init for inni*/ 0;
                int stepY = /*JR init for inni*/ 0;
                int side = /*JR init for inni*/ 0;
                Point2D rayPos = /*JR init for inni*/ null;
                Point2D rayDir = /*JR init for inni*/ null;
                Point2D gridPos = /*JR init for inni*/ null;
                double sideDistX = /*JR init for inni*/ 0.0;
                double sideDistY = /*JR init for inni*/ 0.0;
                double immDistX = /*JR init for inni*/ 0.0;
                double immDistY = /*JR init for inni*/ 0.0;
                JRLoop7: while (true) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid = JRget_op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid().recv();
                        col = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[0];
                        rayPos = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[1];
                        rayDir = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[2];
                        gridPos = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[3];
                        sideDistX = (Double) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[4];
                        sideDistY = (Double) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[5];
                        stepX = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[6];
                        stepY = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[7];
                        immDistX = (Double) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[8];
                        immDistY = (Double) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.JRargs[9];
                        jrvm.ariseAndReceive();
                        if (recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.retOp != null)
                            recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    JRLoop6: while (true) {
                        if (immDistX < immDistY) {
                            // Begin Expr2
                            immDistX += sideDistX;
                            // Begin Expr2
                            gridPos.setLocation(gridPos.getX() + stepX, gridPos.getY());
                            // Begin Expr2
                            side = 0;
                        } else {
                            // Begin Expr2
                            immDistY += sideDistY;
                            // Begin Expr2
                            gridPos.setLocation(gridPos.getX(), gridPos.getY() + stepY);
                            // Begin Expr2
                            side = 1;
                        }
                        if (world.terrain[((int)gridPos.getY())][((int)gridPos.getX())] == 1) break JRLoop6;
                    }
                    JRget_op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {col, gridPos, rayPos, rayDir, stepX, stepY, side});
                }
            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    
    private Op_ext.JRProxyOp JRget_op_renderHelper_intTovoid()
    {
        return op_renderHelper_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_renderHelper_intTovoid;
    class ProcOp_intTovoid_implrenderHelper extends ProcOp_ext_impl
    {
        Renderer thisarg;
        public ProcOp_intTovoid_implrenderHelper(Renderer thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.renderHelperintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.renderHelperintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    private void renderHelperintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_renderHelper_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void renderHelperintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                // Begin Expr2
                System.out.println("Renderer " + i + " online.");
                int col = /*JR init for inni*/ 0;
                int stepX = /*JR init for inni*/ 0;
                int stepY = /*JR init for inni*/ 0;
                int side = /*JR init for inni*/ 0;
                double dist = /*JR init for inni*/ 0.0;
                Point2D gridPos = /*JR init for inni*/ null;
                Point2D rayPos = /*JR init for inni*/ null;
                Point2D rayDir = /*JR init for inni*/ null;
                JRLoop8: while (true) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid = JRget_op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid().recv();
                        col = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[0];
                        gridPos = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[1];
                        rayPos = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[2];
                        rayDir = (java.awt.geom.Point2D) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[3];
                        stepX = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[4];
                        stepY = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[5];
                        side = (Integer) recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.JRargs[6];
                        jrvm.ariseAndReceive();
                        if (recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.retOp != null)
                            recv_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    if (side == 0) // Begin Expr2
                    dist = Math.abs((gridPos.getX() - rayPos.getX() + (1 - stepX) / 2.0) / rayDir.getX()); else // Begin Expr2
                    dist = Math.abs((gridPos.getY() - rayPos.getY() + (1 - stepY) / 2.0) / rayDir.getY());
                    int wHeight = Math.abs(((int)Math.floor(height / dist)));
                    int start = -wHeight / 2 + height / 2;
                    int end = wHeight / 2 + height / 2;
                    if (start < 0) // Begin Expr2
                    start = 0;
                    if (end >= height) // Begin Expr2
                    end = height - 1;
                    // Begin Expr2
                    gBuf[col] = new int[]{start, end, 1};
                }
            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    
    protected boolean JRcalled = false;
    protected JRRenderer jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_renderHelper_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implrenderHelper(this));
    	op_ddaWorker_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implddaWorker(this));
    	op_precalculator_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implprecalculator(this));
    	op_renderFrame_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrenderFrame(this));
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRRenderer(op_renderHelper_intTovoid, op_ddaWorker_intTovoid, op_precalculator_intTovoid, op_pushToBuf_voidTovoid, op_renderFrame_voidTovoid, op_bufWriter_intXdoubleXintTovoid, op_renderPregen_intTovoid, op_renderHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXintXintXintTovoid, op_ddaHelper_intXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXjavadotawtdotgeomdotPoint2DXdoubleXdoubleXintXintXdoubleXdoubleTovoid, op_KRAKEN_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    	  for (int i = 0; i < worker_pool / 3; i++) 
    	  {
    		op_renderHelper_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
    	  }
    	  for (int i = 0; i < worker_pool / 3; i++) 
    	  {
    		op_ddaWorker_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
    	  }
    	  for (int i = 0; i < worker_pool / 3; i++) 
    	  {
    		op_precalculator_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
    	  }
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
