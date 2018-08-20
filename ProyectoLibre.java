import java.util.Scanner;
public class ProyectoLibre
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Revise sus finanzas");
        System.out.println("Cuanto es su salario mensual?");
        
        double salario;
        salario = entrada.nextDouble();
        
        System.out.println("Ahora indique cuanto es el valor de sus gastos mensuales en:");
        
            System.out.println("Mercado:");
                double mercado;
                mercado = entrada.nextDouble();
            System.out.println("Arriendo:");
                double arriendo;
                arriendo = entrada.nextDouble();
            System.out.println("Servicios:");
                double servicios;
                servicios = entrada.nextDouble();
            System.out.println("Transporte:");
                double transporte;
                transporte = entrada.nextDouble();
            System.out.println("Educación:");
                double educacion;
                educacion = entrada.nextDouble();
            System.out.println("Tiempo de ocio");
                double ocio;
                ocio = entrada.nextDouble();
                
        double totalGastos;
        totalGastos = mercado + arriendo + servicios + transporte + educacion + ocio;
        
        System.out.println("El total de sus gastos mensuales es: $" +totalGastos+ " pesos");
        
        double saldo;
        saldo = salario - totalGastos;
        
        System.out.println("Su saldo al mes es de S"+saldo+" pesos");
        
        if(saldo > 0){
            System.out.println("Sus finanzas estan bien, no es necesario  hacer ajustes");
        }else
        if (saldo <= 0){
            System.out.println("Sus finanzas no estan bien, ¿desea haces ajustes?");
            System.out.println("1) si");
            System.out.println("2) no");
            
            int opcion;
            opcion = entrada.nextInt();
            
             switch (opcion){
                 case 1:
                        System.out.println("Mercado:");
                        double mercado1;
                        mercado1 = entrada.nextDouble();
                        System.out.println("Arriendo:");
                        double arriendo1;
                        arriendo1 = entrada.nextDouble();
                        System.out.println("Servicios:");
                        double servicios1;
                        servicios1 = entrada.nextDouble();
                        System.out.println("Transporte:");
                        double transporte1;
                        transporte1 = entrada.nextDouble();
                        System.out.println("Educación:");
                        double educacion1;
                        educacion1 = entrada.nextDouble();
                        System.out.println("Tiempo de ocio");
                        double ocio1;
                        ocio1 = entrada.nextDouble();
                        
                        double nuevoGasto;
                        nuevoGasto = mercado1 + arriendo1 + servicios1 + transporte1 + educacion1 + ocio1;
                        System.out.println("Sus nuevos gastos suman $"+nuevoGasto+" pesos");
                        double nuevoSaldo;
                        nuevoSaldo = salario - nuevoGasto;
                        System.out.println("Su nuevo saldo es de $"+nuevoSaldo+" pesos");
                        System.out.println("Ahora sus finanzas estan sanas");
                 break;
                    
                 case 2:
                        System.out.println("Gracias por usar el servicio");
                 break;    
             }//fin switch
        }// fin if
    }// fin metodo main
}// fin clase
