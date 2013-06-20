import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Progreso {
final byte MAX = 100;
final JProgressBar pb = new JProgressBar();
final JFrame frame = new JFrame("Copiando archivos");
private int CurrentValue;
	public Progreso(){
	
		// crear barra 
	pb.setMinimum(0);
	pb.setMaximum(MAX);
	pb.setForeground(Color.RED);
	pb.setStringPainted(true);
		
frame.setLayout(new FlowLayout());
frame.getContentPane().add(pb);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 300);
frame.setVisible(true);
frame.setLocationRelativeTo(null);		
	}
	
public void run(){
	
	BufferedInputStream in = null;
	BufferedOutputStream out = null;

try {	
File inFile = new File("/home/kala/Escritorio/copia1/copy.zip");
	
in = new BufferedInputStream(new FileInputStream(inFile)); 
	
File OutFile = new File("/home/kala/Escritorio/copia2/copy.zip");
out = new BufferedOutputStream(new FileOutputStream(OutFile));

// variables
long TotalBytes = in.available();
long BytesRead = 0;

int r = 0;

byte[] b = new byte[10];

while((r = in.read(b, 0, b.length)) != -1 ){
	
	BytesRead += r;
	
out.write(b, 0, r);

CurrentValue = (int) (BytesRead * 100/TotalBytes);

pb.setValue(CurrentValue);
	
}




}catch(FileNotFoundException ex){
	ex.printStackTrace();
}
catch(IOException ex){
	ex.printStackTrace();
}
	

finally{
	
	try{

in.close();
out.close();
		
	}catch(IOException io){
		
		io.printStackTrace();
	}
	
	
	
}





	
}
	
	
public static void print(Object  ob){
	
	System.out.println(ob);
	
	
}
	
	
	public static void main(String[] args){

		Progreso pr = new Progreso();
	pr.run();	

	}

	
	
	
	
}
