import java.util.Scanner;

public class Ejercicio01ACJ {
    public static void main(String[] args) throws Exception {
       //Datos de entrada
   Scanner lt = new Scanner(System.in);
    System.out.println("Ingrese las notas en la escala vigesimal de 0 a 20 ");
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese nota del examen: ");
    double notaEx=lt.nextDouble();
    System.out.println("Ingrese nota de la entrevista personal: ");
    double notaEn=lt.nextDouble();
    System.out.println("Ingrese nota del test psicologico: ");
    double notaT=lt.nextDouble();
    double PunEx = (notaEx * 40)/100;
    double PunEn = (notaEn * 35)/100;
    double PunTes = (notaT * 25)/100;
    double promedio = (PunEx + PunEn + PunTes);
    //Proceso
    if (promedio >= 17 && promedio <=20) {
       System.out.println("Su nota es: " + promedio + " Su nivel 4: ");
    }else if(promedio < 17 && promedio >= 14) {
       System.out.println("Su nota es: " + promedio + " Su nivel es 3: ");
    }else if(promedio < 14 && promedio >= 11) {
       System.out.println("Su nota es: " + promedio + " Su nivel es 2: ");
    }else if(promedio < 11) {
       System.out.println("Su nota es: " + promedio + " Su nivel es 1: ");
       System.out.println(	"No puede obtener una vacante: ");
       //Fin del algoritmo
    } else {
      System.out.println(	"Notas no validas coloque las notas en la escala vigesimal: ");      
    }
    }
}
