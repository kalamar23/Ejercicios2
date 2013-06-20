/*La idea de esta clase es guardar dos numeros de 0 a 14 en un byte
 * Tratando con dos numeros de 4 bits y guardando en un solo byte
 * 
 */
import java.io.*;
public class BitsLevel {

	
	private OutputStream salida;
	
	public void WriteUnsignedByte(byte dato1 , byte dato2){
		try{
		salida = new FileOutputStream("/home/kala/Escritorio/bites.bin"); 
		byte numero = 10;
		byte[] codeByte = new byte[1]; 
	//	print("dato1 :" + Integer.toBinaryString(dato1));
	//	print("dato2 :" + Integer.toBinaryString(dato2 << 4));

		
		codeByte[0] = dato1;
		codeByte[0] += dato2 << 4;
	//	print(Integer.toBinaryString(codeByte[0] & 0xFF));

	//	print(Integer.toBinaryString(dato1));		
		
		salida.write(codeByte);
		
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
private InputStream entrada;	

public void readUnsigned(){
byte temp = 0;
byte al1 = 0;	
byte al2 = 0;

try{
entrada = new FileInputStream("/home/kala/Escritorio/bites.bin");	
temp = (byte) entrada.read();

al1 = (byte) (temp & 0xF);
	
al2 = (byte) ((temp & 0xF0) >> 4);
	print(Integer.toBinaryString(0xF0));	
		
	}catch(IOException ex){
		ex.printStackTrace();
	}
print(al1);
print(al2);	
	
}
	
public static void print(Object ob){
	System.out.println(ob);
}
	
	
	public static void main(String[] args){
		
		BitsLevel bi = new BitsLevel();
		
		bi.WriteUnsignedByte((byte) 10, (byte) 9);
		bi.readUnsigned();
	}
	
	
	
	
	
	
}
