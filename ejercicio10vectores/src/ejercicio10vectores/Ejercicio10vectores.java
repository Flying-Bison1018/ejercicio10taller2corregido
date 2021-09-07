
package ejercicio10vectores;

import java.util.Scanner;


public class Ejercicio10vectores {

    public static void main(String[] args) {
       int n;
       double entero, decimal;
       double cuotaMin=2.00,topeDia=10.00,cargo=0,H,suma=0,diferencia;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de clientes:");
        n=entrada.nextInt();
        double[] hora = new double[n];
        int[] nombre = new int[n];
        double[] cE= new double[n];
        for(int i=0;i<n;i++){
            System.out.println("cliente:");
            nombre[i]=entrada.nextInt();
            System.out.println("Hora de estacionamiento[H,min]:");
            hora[i]=entrada.nextDouble();
        }
        //Calcular Cargos
        for(int i=0;i<n;i++){
            if((hora[i]>3)&&(hora[i]<24)){
                H=hora[i];
                decimal = H%1;
                entero = H-decimal;
                diferencia = entero-3;
                if(decimal!=0){
                    if(entero==3){
                        cargo=0.50+cuotaMin;
                    }else{
                        cargo = (((diferencia)*0.50)+0.50)+cuotaMin;
                    }
                }else{
                    cargo = (diferencia*0.50)+cuotaMin;
                }
                cE[i]=cargo;
            }else{
                if((hora[i]>0)&&(hora[i]<=3)){
                    cE[i]=cuotaMin;
                }else{
                    cE[i]=topeDia;
                }   
               }
         }
        for(int i=0;i<n;i++){
            suma=suma+cE[i];
        }
        System.out.println("Total Acumulado: "+suma);
    
    }
}