package radix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class RadixOctal {
	
public static ArrayList<Integer> ordenarRadixOctal(ArrayList<Integer> listaAux){
    	
    	ArrayList<Queue<Integer>> cubetas =new ArrayList<>();
        //inseratar 8 colas/cubetas a la lista 
        for (int i = 0; i < 8; i++) {
            cubetas.add(new LinkedList<>());
        }
        //encontrar el mayor
        int mayor = Collections.max(listaAux);
        int pasada = 0;
        while (mayor > 0) {
            mayor /= 8;
            pasada++;
        }
        
        System.out.println("mayor: "+mayor);
        System.out.println("numero de claves: " +pasada); 
        
        
        int num;
        int digit;
        int j=1;
        
        for (int i = 0; i < pasada; i++) {
            while(!listaAux.isEmpty()) {
            	//Distribuir Números en las Colas Según el Dígito Actual
                num = listaAux.remove(0);
                int n = num/j;
                digit = n%8;
                cubetas.get(digit).add(num);
            }
            j*=8;

            
            System.out.println(cubetas.toString());
            //vaciar las cubetas y llenar la lista
            for (Queue<Integer> cola: cubetas) {
                while(!cola.isEmpty())
                   listaAux.add((Integer)cola.poll());
            }
            System.out.println((i+1)+" Iteración");
            System.out.println(listaAux.toString());
       }
       return listaAux;

    }
	
	public static void main(String[] args) {
		ArrayList<Integer> listaAux =new ArrayList<>();
		listaAux.add(125);
		listaAux.add(374);
		listaAux.add(153);
		listaAux.add(221);
		listaAux.add(671);
		listaAux.add(437);
		listaAux.add(612);
		listaAux.add(321);
		listaAux.add(765);
		
        System.out.println("Lista Original");
        System.out.println(listaAux.toString());
        ordenarRadixOctal(listaAux);


	}

}
