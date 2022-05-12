import java.util.Scanner;
public class Ejercicio05ACJ {
  //Datos, ejercicios de estructuras multiples
//------------------------------Ejercicio01--------------------------------------------
    public static void Ejercicio01ACJ() {
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
         if (promedio >= 17 && promedio <=20) {
            System.out.println("Su nota es: " + promedio + " Su nivel 4: ");
         }else if(promedio < 17 && promedio >= 14) {
            System.out.println("Su nota es: " + promedio + " Su nivel es 3: ");
         }else if(promedio < 14 && promedio >= 11) {
            System.out.println("Su nota es: " + promedio + " Su nivel es 2: ");
         }else if(promedio < 11) {
            System.out.println("Su nota es: " + promedio + " Su nivel es 1: ");
            System.out.println(	"No puede obtener una vacante: ");
         } else {
           System.out.println(	"Notas no validas coloque las notas en la escala vigesimal: ");      
         }
         }
//-------------------------------------------------Ejercicio02-------------------------------------------------         
         public static void Ejercicio02ACJ() {
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
        }else{
          System.out.println("Monto no valido");
        }
//------------------------------------------------Ejercicio03---------------------------------------       
            
        }
        public static void Ejercicio03ACJ() {
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
              }else{
              System.out.println("Operador no valido");
              }
             
                    
          }
      
//-------------------------------------------------Ejercicio04-----------------------------------------------
    public static void Ejercicio04ACJ() {
    String sexo1 = "hombre";
    String sexo2 = "mujer";
    Scanner lt=new Scanner(System.in);
    System.out.println("Escriba su edad: ");
    int edad=lt.nextInt();

    Scanner tex=new Scanner(System.in);
    System.out.println("Escriba el genero hombre o mujer: ");
    String sexo = tex.nextLine();

    if(edad < 16){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo A: ");
    }else if(edad >=70){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo C: ");
    }else if(edad >= 16 && edad <=69 && sexo.equals(sexo2)){
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo B: ");
    }else{
      System.out.println("----------------------------------------");
      System.out.println("Le corresponde la vacuna de tipo A: ");
    }   
    }
    
//---------------------------------------------Impresion----------------------------------------------
    public static void main(String[] args) {;
        Scanner l=new Scanner(System.in);

        System.out.println("(1) - Perfil de ingreso de un postulante");
        System.out.println("(2) - Calcular IGV de una venta y su descuento");
        System.out.println("(3) - Operación aritmetica entre dos valores");
        System.out.println("(4) - Determinar tipo de vacuna");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Ingrese una opción del 1 al 4 ");

        
      //Fin 
        int pregunta = l.nextInt();
        switch (pregunta) {
          case 1:
          Ejercicio01ACJ();
            break;
          case 2:
            Ejercicio02ACJ();
            break;
          case 3:
            Ejercicio03ACJ();
            break;
            case 4:
            Ejercicio04ACJ();
            break;
        }        
    }
}
