import java.util.*;
import java.util.Scanner;
public class EjercicioGrupal2
{
    public static void main (String[] args)
    {
            Scanner entrada = new Scanner(System.in);
        
            Set<Integer> lista_a = new HashSet<>(Arrays.asList());
            Set<Integer> lista_b = new HashSet<>(Arrays.asList());
            Set<Integer> lista_c = new HashSet<>();
            
          int a [] = new int [5];
            System.out.println("Ingrese los datos de la primera lista");
           for (int i = 0; i < a.length; i++ ){
           System.out.print( (i + 1) + "=");
           lista_a.add(entrada.nextInt());
          }//fin for  
          int b [] = new int [5];
            System.out.println("Ingrese los datos de la segunda lista");
           for (int i = 0; i < b.length; i++ ){
           System.out.print( (i + 1) + "=");
           lista_b.add(entrada.nextInt());
          }//fin for          
          for (Integer el: lista_a) {
              if (!lista_b.contains(el)) {
                  lista_c.add(el);
              }
          }
          for (Integer el: lista_b) {
              if (!lista_a.contains(el)) {
                  lista_c.add(el);
              }
          }
          System.out.println("Los elementos no comunes son : "+ lista_c);
    }//fin main
}//fin clase
