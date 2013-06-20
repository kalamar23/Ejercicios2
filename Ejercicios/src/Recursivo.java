import java.io.*;
import java.util.*;
public class Recursivo {

// Par e impar recursivo
	
	public boolean par(int n){
		
		if(n == 0) return true;
		else
			return impar(n - 1);
	}

	
	public boolean impar(int n){
		
		if(n == 0) return false;
		else
		return par(n - 1);
	}
	
//	30 y 5
	public int division (int a, int b)
    {
	if(b > a) return 0;
	else
	    return division(a-b, b) + 1;
    }	
	
public int suma(int num){
	
	int suma = 0;
	
	while(num > 0){
		
		suma += (num % 10);
	num /= 10;
	}	
	return suma;
	
}
	
public StringBuffer invertir(int num){
	Stack st = new Stack();
	StringBuffer sb = new StringBuffer();
	while(num > 0){
		st.push(String.valueOf((num % 10)));
		
		num /= 10;		
	sb.append(new String((String) st.pop()));
	
	}
	
	
	return sb;
}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		Recursivo re = new Recursivo();
		
// numero es impar 
	
	//	System.out.println(re.impar(5));
		
	//	System.out.println((re.impar(5)) ? "El numero es impar" : "El numero es par");
		
	//	System.out.println(re.division(30, 5));
		
	//	System.out.println(re.suma(123));
		
System.out.println(re.invertir(123));		
		
		
	}
	
	
}
