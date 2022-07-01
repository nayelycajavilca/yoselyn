package pe.edu.upeu.jnc;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import  main.java.pe.edu.upeu.jnc.examen;
 public class App 
{
    public static void main( String[] args )
    {
       
            Scanner lt = new Scanner(System.in);
            int n;
            System.out.println("Ingrese el numero de algoritmo(2-5):");
            n = lt.nextInt();
            switch (n) {
                case 2:
                    new ResolucionExamen().Pregunta2jnc();
                    break;
                case 3:
                    new ResolucionExamen().Pregunta3jnc();
                    break;
                case 4:
                    new ResolucionExamen().Pregunta4jnc();
                    break;
                case 5:
                    new ResolucionExamen().Pregunta_5jnc(72);
                    break;
                default:
                    System.err.println("Esa opcion no existe");
                    break;
            }
        }
}