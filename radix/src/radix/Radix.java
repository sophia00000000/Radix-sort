package radix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Radix {
	
	
    public static ArrayList<Integer> ordenarRadix(ArrayList<Integer> listaAux){
    	
    	ArrayList<Queue<Integer>> cubetas =new ArrayList<>();
        //inseratar 10 colas/cubetas a la lista 
        for (int i = 0; i < 10; i++) {
            cubetas.add(new LinkedList<>());
        }
        //encontrar el mayor
        int mayor = Collections.max(listaAux);
        int pasada = (int) Math.floor(Math.log10(Math.abs(mayor)) + 1);

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
                digit = n%10;
                cubetas.get(digit).add(num);
            }
            j*=10;

            
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
    
    public static void main(String[] args){
        
    	ArrayList<Integer> listaAux =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaAux.add((int) (Math.random() * 9000) + 1000);
        }
        System.out.println("Lista original:");
        System.out.println(listaAux.toString());
        ordenarRadix(listaAux);
    }
    

}
