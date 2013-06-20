import java.io.*;

public class Barra3 {

private OutputStream salida;


	public void EscribirUnsignedshort(int dato16bits) {
		//ejemplo grafico con numero 65000

		// representación en bits: 00000000000000001111110111101000	
	try{		
salida = new FileOutputStream("/home/kala/Escritorio/short.bin");		
		
	byte[] codeByte = new byte[2];
	codeByte[0] = (byte) (dato16bits & 0xFF);
	codeByte[1] = (byte) ((dato16bits & 0xFF00) >> 8);
	
	debug(Integer.toBinaryString(codeByte[0] & 0xFF)) ;
	debug(Integer.toBinaryString(codeByte[1] & 0xFF)  );

	salida.write(codeByte);
	}
	
	catch(IOException ex){
		ex.printStackTrace();
		
	}	
	}

	private InputStream entrada;

	public int readUnsignedShort() {
		int datoDe16bits = 0;
		try{
	entrada = new FileInputStream("/home/kala/Escritorio/short.bin");

		datoDe16bits = (entrada.read() & 0xFF);
	   debug("El valor int : " + Integer.toBinaryString(datoDe16bits));
		datoDe16bits += ((entrada.read() & 0xFF) << 8);
	   debug("El valor int completo : " + Integer.toBinaryString(datoDe16bits));
	
		
	    
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}

		catch(IOException ex){
			ex.printStackTrace();
			
		}
        return datoDe16bits;

	}
	
public static void debug(Object ob){
	
	System.out.println(ob);

}


	public static void main(String[] args) {
		
	Barra3 ba = new Barra3();
	ba.EscribirUnsignedshort(65000);
	debug(ba.readUnsignedShort());
	}
	
	
	
}
