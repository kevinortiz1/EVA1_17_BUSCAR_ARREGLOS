
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Ortiz 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiDatos = new int[5];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 10) + 1;
            System.out.print(aiDatos[i] + " ");
        }
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("¿Que valor buscas?");
        int iVal = scCaptu.nextInt();
        for (int i = 0; i < aiDatos.length; i++) {
            if (iVal == aiDatos[i]) { //lo encontramos
                System.out.println("El valor esta en la posición " + i);
                //SI QUEREMOS DETENERLO, USARÍAMOS UN break;
                break;
            }
        }

    }
}
