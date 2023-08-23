package TrabajoFinalLogica;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class EjercicioFinal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> nombresDinamicos = new ArrayList<String>();
        boolean flag = true;
        AgregarNombre:
        do{
            System.out.println("Ingrese el nombre que desea Agregar a la lista");
            String nombre= sc.nextLine();
            nombresDinamicos.add(nombre);
            System.out.println("Desea agregar un nuevo nombre. Responda 'Si'o 'No'");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("Si")){
                continue AgregarNombre;
            } else if (respuesta.equalsIgnoreCase("no")) {
                flag = false;
            }
        } while(flag==true);

        for(int i=0; i<nombresDinamicos.size(); i++){
            System.out.println("El nombre en la posicion " + ("Numero => " + i) + " es el de " + nombresDinamicos.get(i));
        }


    }
}
