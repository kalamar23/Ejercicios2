import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Hilos {

	String[] nombres = {"Claudio Barraza", "Esteban Abdala", "Ivonne Yañez", "Franco Catrin"};

	public void colec(){
		
Stack st = new Stack();

int num = 123;

while(num > 0){
	
	System.out.print(num % 10);
	
	st.add(num % 10);
	
	num /= 10;
	
}

System.out.println("Valores devueltos por stack");
while(!st.empty()){
	
	
	System.out.print(st.pop());
	
}



	
	}
	
	public void listas(){
		
		
		Queue <String> cola = new LinkedList <String>();
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		
		Hilos hi = new Hilos();
		
//		hi.colec();
		
		
		
	}

}
