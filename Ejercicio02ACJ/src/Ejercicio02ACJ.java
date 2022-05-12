import java.util.Scanner;

public class Ejercicio02ACJ {
    public static void main(String[] args) throws Exception {
      //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Escribe el precio del producto: ");
        
    double precio=lt.nextDouble();
    double descuento1=(precio*10)/100;
    double descuento2=(precio*5)/100;
    double descuento3=(precio*2)/100;
    double igv3 =(precio-descuento3);
    double igv2 =(precio-descuento2);
    double igv1 =(precio-descuento1);
        
    double igv=1.18;
    //Proceso
    if(precio >= 500 && precio <=999){
      System.out.println("-------------------");
      System.out.println("El precio del producto tiene un 2% de dsct que es: S/."+descuento3);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento - S/."+ igv3);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento e IGV - S/."+ (igv3*igv));
      System.out.println("-------------------");
    }else if(precio >= 1000 && precio <=1999){
      System.out.println("-------------------");
      System.out.println("El precio del producto tiene un 5% de dsct que es: S/."+descuento2);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento - S/."+ igv2);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento e IGV neto a pagar - S/."+ (igv2*igv));
      System.out.println("-------------------");
    }else if(precio >= 2000){
      System.out.println("-------------------");
      System.out.println("El precio del producto tiene un 10% de dsct que es: S/."+descuento1);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento - S/."+ igv1);
      System.out.println("-------------------");
      System.out.println("Monto total con descuento e IGV neto a pagar - S/."+ (igv1*igv));
      System.out.println("-------------------");
    }else if(precio<=1 && precio>=499){
      System.out.println("-------------------");
      System.out.println("El monto no tiene descuento");
      System.out.println("-------------------");
      System.out.println("El monto total a pagar incluido IGV es: " + precio*igv);
      //Fin del algoritmo
    }else{
      System.out.println("Monto no valido");
    }


        
        
        
    }
}
