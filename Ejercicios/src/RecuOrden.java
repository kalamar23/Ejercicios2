import java.util.*;


public class RecuOrden {

	static int[] arre = new int[3];
	
// metodo print()
	
public static void print(Object ob){
	
	System.out.println(ob);
	
}
	
	/**
	 * Este metodo llena un array con enteros de forma aleatorea 	
	 * @param arr (el Array entregado a llenar)
	 * @param index
	 * @return -1 (indica que el array ha sido llenado)
	 */
		
		public static int fill(int[] arr, int index){
			Random ra = new Random();

			if(index == arr.length) return -1;
			else{
				arr[index] = ra.nextInt(98);
			return fill(arr , ++index);
			}
				
		}
		
	/**
	 * Este metodo ordena un array de enteros de forma creciente 
	 * @param w (Longitud del array o numeros de elementos)
	 * @param x 
	 * @param y
	 */
	public static void ordenar(int w, int x, int y) {

	if(x == w){
		return;
	}
	else{	
	if(arre[x] > arre[y]){
		
		int aux = arre[x];
		arre[x] = arre[y];
		arre[y] = aux;
	}
	if(y < w)
	ordenar(w,x,y + 1);
	else 
		ordenar(w, x + 1, x + 2);
	}

	}
		

		
public static void main(String[] args) {
	fill(arre, 0);

	for(int i : arre){
		System.out.println("Array : " + i);	
	}
	int a = arre.length - 1;
	int b = 0;
	ordenar(a,b, b + 1);

	for(int i : arre){
		System.out.println("ArrayOrdenado : " + i);	
	}

	}
}
