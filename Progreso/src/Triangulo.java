import javax.swing.*;
import java.awt.geom.*;
import java.awt.Image;
import java.awt.*;
public class Triangulo extends JFrame {

	
Triangulo(){
	
	setSize(400 , 400);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
	public void paint(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setPaint(Color.RED);
		g2d.setStroke(new BasicStroke(2.0f));
		Polygon poli = new Polygon();
		poli.addPoint(100, 100);
		poli.addPoint(300, 380);
		poli.addPoint(300, 100);
		g2d.draw(poli);	
	
	
	}
	
	public static void main(String[] args ){
		
		
		Triangulo tri = new Triangulo();
tri.setLocationRelativeTo(null);
		
	}
	
	
}
