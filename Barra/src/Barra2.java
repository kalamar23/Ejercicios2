//gerando una barra de progreso que muestra el avance de copiado de un archivo

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Barra2 extends JFrame {

	
	final int MAX = 100;
	final JFrame frame = new JFrame("Copia archivos");
	// crear barra
	final JProgressBar pb = new JProgressBar();
	private int currentValue;

	
// Constructor	
	
public Barra2(){
	pb.setMinimum(0);
	pb.setMaximum(MAX);
	pb.setForeground(Color.RED);
	pb.setStringPainted(true);

	// agregar barra
	frame.setLayout(new FlowLayout());
	frame.getContentPane().add(pb);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 300);
	frame.setVisible(true);
}
	

public void run() {

  BufferedInputStream in = null;

  BufferedOutputStream out = null;

  try {

    // Create file input stream
    File inFile = new File("/home/kala/Escritorio/copia1/copy.zip");

    in = new BufferedInputStream(new FileInputStream(inFile));



    // Create file output stream
    File outFile = new File("/home/kala/Escritorio/copia2/copy.zip");

    out = new BufferedOutputStream(new FileOutputStream(outFile));



    // Get total bytes in the file
    long totalBytes = in.available();



    // Start progress meter bar
    pb.setValue(0);

    pb.setMaximum(100);



    int r;

    long bytesRead = 0;

    // You may increase buffer size to improve IO speed
    byte[] b = new byte[15];
    byte m = 0;
    while ((r = in.read(b, 0, b.length)) != -1) {
    //debug(r);
    debug(Integer.toBinaryString(b[m] & 0xFF));
    	
    	
out.write(b, 0, r);

      bytesRead += r;

      currentValue = (int)(bytesRead * 100 / totalBytes);

debug(bytesRead + " bytes");
      // Update the progress bar
    pb.setValue(currentValue);
if(m == (b.length - 1))
m = 0;
	else  
	m++;
    }

  }

  catch (FileNotFoundException ex) {

    ex.printStackTrace();

  }

  catch (IOException ex) {

    ex.printStackTrace();

  }

  finally {

    try {

      if (in != null) in.close();

      if (out != null) out.close();

    }

    catch (Exception ex) {}

  }

}
	
	

public static void debug(Object ob){
	
	
	System.err.println(ob);

}
	
	public static void main(String[] args) {
		
	
		Barra2 ba = new Barra2();
			ba.run();

}
}