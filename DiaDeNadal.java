import java.util.Scanner;

public class DiaDeNadal {
  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int dia;
    int mes;
    int numero;
    int i;

  System.out.println ("Cuantos intentos quieres realizar para encontrar el dia de navidad di un numero entre el 0 y el 10");
    numero=sc.nextInt();
    
if (numero>=0 && numero<10) {
   
  for (i=0 ; i < numero ; i++){
     
      System.out.println("Dime en numero, el dia y el mes, separados por un espacio");
   
        dia=sc.nextInt();
        mes=sc.nextInt();

      if (dia>0 && dia<32 && mes>0 && mes<13) {
        System.out.println( (dia==25 && mes==12)? "SI es Navidad" : "NO es Navidad");
      }
      else {
        System.out.println("No es numero valido");
        i--;
      }
  }
}
    sc.close();
  }
}
