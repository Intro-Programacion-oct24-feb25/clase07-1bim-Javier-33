/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int contador;
    contador = 1;
    int limite;
    limite = 13;
    
    while (contador <= limite){
        System.out.printf("%d\n", contador);
        contador = contador + 1;
        
    }
        System.out.printf("%d\n", contador);//En este caso se contara hasta 14
    }
    
}
