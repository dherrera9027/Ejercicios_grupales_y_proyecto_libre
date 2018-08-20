import java.util.Scanner;
public class EjercicioGrupal1
{
    public static void main (String[] args)
    {
        int datos [] = new int [4];  
        double suma;
        suma = 0;
        double media;
        media = 0;
        double variacion;
        variacion = 0;
        double desviacionEstandar;
        desviacionEstandar = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite los datos a los cuales desea calcularle la media");
          for (int i = 0; i < 4; i++ ){
           System.out.print( (i + 1) + "=");
           datos[i] = entrada.nextInt();
           suma = suma + datos[i];
          }//fin for
          media = suma / 4;
          System.out.println("la media de los datos ingresados es de " +media);  
          for (int i = 0; i < 4; i++ ){ 
            double desviacion;
            desviacion = Math.pow(datos[i] - media, 2);
            variacion = variacion + desviacion / 4;
          }  //fin for
          desviacionEstandar = Math.sqrt(variacion);
          System.out.println("La desviación estándar es: " + desviacionEstandar);
    }//fin main
}// fin clase
