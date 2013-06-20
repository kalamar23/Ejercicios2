import javax.swing.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.awt.*;
import java.util.Objects;


public class Circulo extends JFrame {

	public Circulo(){
		
		setSize(400 , 400);
		setVisible(true);
	}

	public void paint(Graphics g){
	byte count = 1;
 	byte i = 0;
	// 7 colores
	Color[] colores = new Color[]{Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA,Color.ORANGE,Color.RED, Color.PINK};
	Graphics2D g2d = (Graphics2D) g;
 		g2d.setPaint(Color.RED);
		g2d.setStroke(new BasicStroke(4.0f));
		g2d.draw(new Ellipse2D.Double(45, 50, 300,300));
		while(count < 130){
		Graphics2D g2d2 = (Graphics2D) g;
 		g2d2.setPaint(colores[i]);
		g2d2.setStroke(new BasicStroke(4.0f));
		g2d2.draw(new Ellipse2D.Double(70, 75, 250,250));
i++;
if(i == colores.length)
	i = 0;
		count++;
		}
		
		
		
	
	}
	
	
	
	public static void main(String[] args) {

		Circulo ci = new Circulo();
		ci.setLocationRelativeTo(null);
		ci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
