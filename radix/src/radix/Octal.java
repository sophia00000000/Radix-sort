package radix;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Octal {
	public static void main(String[] args) {
		ArrayList<Integer> lista =new ArrayList<>();
		lista.add(125);
		lista.add(374 );
		lista.add(053);
		lista.add(221 );
		lista.add(671 );
		lista.add(437 );
		lista.add(612 );
		lista.add(321 );
		lista.add(765 );
		
        System.out.println("Lista Original");
        System.out.println(lista.toString());
        ordenarLista(lista);


	}
	public static void ordenarLista(){		
		List<Queue<Integer>> arreglo =new ArrayList<>();
        //Creo 8 colas 
        for (int i = 0; i < 8; i++) {
        	arreglo.add(new LinkedList<>());
        }
	
	}
}
