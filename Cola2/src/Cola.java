import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cola {

public Cola(){
	
	
	
}
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void ingre() throws IOException {
		int index;
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Ingrese la cantidad : ");
	
		index = Integer.parseInt(br.readLine());
		
		for(int i = 0;i < index;i++){
			System.out.println((i == 0) ? "Ingrese un numero : " : "Ingrese otro numero :");

			list.add(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("Primer elemento: " + list.peekFirst());
		System.out.println("Primer elemento: " + list.peekLast());

		
		System.out.println("El resto de los elementos : ");
		byte index2 = 0;

		for(int va : list){
		if(index2 != 0 && index2 != list.size() - 1){
			System.out.println(list.get(index2) + "\t");
		
		}
			
		index2++;
		}
		
	System.out.println((list.isEmpty()) ? "La cola esta vacia":"La cola contiene: " + list.size());
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
Cola co = new Cola();
co.ingre();
	}

}
