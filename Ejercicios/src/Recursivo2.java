import java.util.*;
public class Recursivo2 {

	// suma los digitos de un int de forma recursiva
	
public int suma(int num){
	
	
	if(num == 0) return num;// base 
	
	else
		return (num % 10) + suma(num / 10);
			
}

// 111

private static int _revint(int n, int r) {
if(n==0) return r;
else return _revint(n/10, r*10+n%10);

}

public static int revint(int n) {
Scanner sc = new Scanner(System.in); 
	
if((n % 10) == 0){
System.out.println("Ingrese un numero valido para invertir :");
	n = sc.nextInt();
}
	
	return _revint(n, 0);
	
}



	
	
	public static void main(String[] args){
		
		Recursivo2 re = new Recursivo2();
		
//	System.out.println(re.suma(123));
//	System.out.println(re.invertir(120));	
System.out.println(re.revint(10));
	
	}
	
	
	
	
}
