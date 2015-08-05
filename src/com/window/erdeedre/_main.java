package com.window.erdeedre;

import com.window.erdeedre.customwindow.WindowRunnable;


/**
 * Main Entry into the Program
 * @author Samuel Schneider
 * 
 *
 */
public class _main {
	public static void main(String[] args) {
		//Create Window, Set Title, Set Shape
		WindowRunnable splashScreen = new WindowRunnable("Erde-Edre Übersetzer", "src/resources/images/windowlogo_shape.png");
		//Set Window Background
		splashScreen.getWindow().SetBackgroundImage("src/resources/images/windowlogo.png");
		//Show the Window
		splashScreen.run();    
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		splashScreen.getWindow().setEnabled(false);
		splashScreen.getWindow().setFocusable(false);
		splashScreen.getWindow().setVisible(false);
		
		//Create Window, Set Title, Set Shape
		WindowRunnable mainWindow = new WindowRunnable("Erde-Edre Übersetzer", "src/resources/images/player2_shape.png");
		//Init Main Window
		mainWindow.getWindow().initMainWindow();
		//Set Window Background
		mainWindow.getWindow().SetBackgroundImage("src/resources/images/player2.png");		
    	//Show the Window
		mainWindow.run();    	
    }
}

/*public class GradientTranslucentWindow extends JFrame {
public GradientTranslucentWindow() {
super("GradientTranslucentWindow");

setBackground(new Color(0,0,0,0));
setSize(new Dimension(300,200));
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel = new JPanel() {
    @Override
    protected void paintComponent(Graphics g) {
        if (g instanceof Graphics2D) {
            final int R = 240;
            final int G = 240;
            final int B = 240;

            Paint p =
                new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                    0.0f, getHeight(), new Color(R, G, B, 255), true);
            Graphics2D g2d = (Graphics2D)g;
            g2d.setPaint(p);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }
};
setContentPane(panel);
setLayout(new GridBagLayout());
add(new JButton("I am a Button"));
}

public static void main(String[] args) {
// Determine what the GraphicsDevice can support.
GraphicsEnvironment ge = 
    GraphicsEnvironment.getLocalGraphicsEnvironment();
GraphicsDevice gd = ge.getDefaultScreenDevice();
boolean isPerPixelTranslucencySupported = 
    gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);

//If translucent windows aren't supported, exit.
if (!isPerPixelTranslucencySupported) {
    System.out.println(
        "Per-pixel translucency is not supported");
        System.exit(0);
}

JFrame.setDefaultLookAndFeelDecorated(true);

// Create the GUI on the event-dispatching thread
SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        GradientTranslucentWindow gtw = new GradientTranslucentWindow();

        // Display the window.
        gtw.setVisible(true);
    }
});
}
}*/