import javax.swing.*;

public class Recursivo3 extends JFrame{

	// suma de un array de forma recursiva 

public static int suma(int arr[], int index){
	
	if(index == -1) return 0;
	else
		return suma(arr , index - 1) + arr[index];
	
}



// Muestra el numero mayor de un array de enteros, de forma recursiva
static int mayor(int[] arr, int n){
	if(n == arr.length-1) return -1;			
	else{
	int	aux = mayor(arr , ++n);
	if(aux < 0) return arr[n];
if(arr[n] < aux) return aux;
		else
			return aux;
	}	
}

	public static void main(String[] args){

	int[] nota = new int [] {90,25, 17};	
	
	//	System.out.println(suma(nota , nota.length - 1));
	System.out.println(mayor(nota , 0));
		
	}
	
	
}
