package co.edu.utp.misiontic2022.c2.jbastidas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



/**
 * Hello world!4
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
       // var input = new BufferedReader(new InputStreamReader(System.in));
        
        //System.out.print("Por Favor ingrese un numero:");
        //var entrada = input.readLine ();
        //var numero = Integer.parseInt(entrada);
        //System.out.printf("El numero tiene %d cifras\n", numDigitos(numero));

        //input.close();

        System.out.println(numeroSuerte("12/02/1993"));
    }

    public static String saludo(String nombre){
        return "hola "+ nombre + "!";
    }


    public static int numDigitos(int numero){

        
        var contador = 0;

        while (numero != 0){
            numero /= 10;
            contador++;

        }
        return contador;
    }
    
    public static int numeroSuerte(String fechaNacimiento){ //dd/mm/yyy
        var indiceSeparador = fechaNacimiento.indexOf("/");
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));
        var indiceSeparadorMes = fechaNacimiento.indexOf('/', ++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));
        var ano = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));

        var suma = dia + mes + ano;
        var resultado = 0;
        while (suma != 0) {
            resultado += suma % 10;
            suma /= 10;
        }

        return resultado;
    }


}



