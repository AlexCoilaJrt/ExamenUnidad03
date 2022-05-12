import java.util.Scanner;

public class Ejercicio03ACJ {
    public static void main(String[] args) throws Exception {
      //Datos de entrada
      String opsuma = "+";
      String opresta = "-";
      String opmulti = "*";
      String opdivision = "/";
      String opmod = "%";
  
      Scanner lt=new Scanner(System.in);
      System.out.println("Escribe el primer número: ");
      double num1=lt.nextDouble();
      
      System.out.println("Escriba la operación a realizar: ");
      Scanner tex=new Scanner(System.in);
      String oper=tex.nextLine();
      
      System.out.println("Escribe el segundo número: ");
      double num2=lt.nextDouble();
      
          
      double suma = num1 + num2;
      double rest = num1 - num2;
      double mult = num1 * num2;
      double div = num1 / num2;
      double modu = num1 % num2;
      //Proceso    
      if(oper.equals(opsuma)){
        System.out.println("-------------------");
        System.out.println("El resultado es: " + suma);
        }else if(oper.equals(opresta)){
        System.out.println("-------------------");
        System.out.println("El resultado es: " + rest);
        }else if(oper.equals(opmulti)){
        System.out.println("-------------------");
        System.out.println("El resultado es: " + mult);
        }else if(oper.equals(opdivision)){
        System.out.println("-------------------");
        System.out.println("El resultado es: " + div);
        }else if(oper.equals(opmod)){
        System.out.println("-------------------");
        System.out.println("El resultado es: " + modu);
        //Fin del algoritmo
        }else{
        System.out.println("Operador no valido");
        }
       
              
    }
}
