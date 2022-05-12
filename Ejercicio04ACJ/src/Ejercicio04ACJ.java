import java.util.Scanner;

public class Ejercicio04ACJ {
    public static void main(String[] args) throws Exception {
      //Datos de entrada
    String sexo1 = "hombre";
    String sexo2 = "mujer";
    Scanner lt=new Scanner(System.in);
    System.out.println("Escriba su edad: ");
    int edad=lt.nextInt();

    Scanner tex=new Scanner(System.in);
    System.out.println("Escriba el genero hombre o mujer: ");
    String sexo = tex.nextLine();
    //Proceso
    if(edad < 16){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo A: ");
    }else if(edad >=70){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo C: ");
    }else if(edad >= 16 && edad <=69 && sexo.equals(sexo2)){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo B: ");
      //Fin del algoritmo
    }else{
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo A: ");
    }
    }
}
