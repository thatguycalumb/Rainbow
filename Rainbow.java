// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  private Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

	int xCenter = width / 2;
	int yCenter = height * 3 / 4;
	
	int largeRadius = width / 4;
	int smallRadius = height / 4;
	int mediumRadius = (int)Math.sqrt(smallRadius*largeRadius);
	int miniRadius = largeRadius - 3 * mediumRadius + 3 * smallRadius;

    g.setColor(Color.RED);

    g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);
    g.setColor(Color.GREEN);
    g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius* 2, mediumRadius * 2, 0, 180);
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180);
    g.setColor(skyColor);
    g.fillArc(xCenter - miniRadius, yCenter - miniRadius + 1, miniRadius * 2, miniRadius * 2, 0, 180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
