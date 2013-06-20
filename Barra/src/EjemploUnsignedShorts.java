import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class EjemploUnsignedShorts {

	private InputStream		entrada;
	private OutputStream 	salida;	
	private final int EOF = 65535;
	
	public void writeUnsignedShort(int datoDe16bits) throws IOException {
		byte[] codeBytes = new byte[2];
		codeBytes[0] = (byte)(datoDe16bits & 0xFF);
		codeBytes[1] = (byte)((datoDe16bits & 0xFF00)>>8);		
		salida.write(codeBytes);
	}
	
	public int readUnsignedShort() throws IOException {
		int datoDe16bits = (entrada.read() & 0xFF);
		datoDe16bits += (entrada.read() & 0xFF) << 8;
		return datoDe16bits;
	}
	
	public void saveShorts(Integer[] datos) {
		try {
			salida = new FileOutputStream("/home/kala/Escritorio/shortsFile.bin");
			for (int i = 0; i < datos.length; ++i) {
				writeUnsignedShort(datos[i]);
			}
			salida.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
	}
	
	public Integer[] readShorts() {
		try {
			entrada = new FileInputStream("/home/kala/Escritorio/shortsFile.bin");
			ArrayList<Integer> datos = new ArrayList<Integer>();
			int dato = readUnsignedShort();
			while (dato != EOF) {
				datos.add(dato);
				dato = readUnsignedShort();
			}
			entrada.close();
			
			// Preparo los datos para devolverlos en forma de array nativo
			Integer[] res = new Integer[datos.size()];
			return datos.toArray(res);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}
	
	public void execute() {
		
		// Cargo una lista de enteros entre 0 y 65534 = 2^16-2 (65535 lo voy a usar para el EOF)
		Integer[] datos = new Integer[16];
		for (int i = 0; i < 16; ++i) {			
			datos[i] = (int) (Math.pow(2, i + 1) - 2);
		}
		
		// Los guardo en el archivo
		saveShorts(datos);
		
		// Leo los datos en un nuevo array de int
		Integer[] datosRecuperados = readShorts();

		// Se muestran los datos recuperados en la consola
		for (int i = 0; i < datosRecuperados.length; ++i) {
			System.out.println("Short: " + datosRecuperados[i]);
		}
		
	}	
	
	public static void main(String[] args){
		
		EjemploUnsignedShorts us = new EjemploUnsignedShorts();
		
	us.execute();
		
	}
	
	
	
}