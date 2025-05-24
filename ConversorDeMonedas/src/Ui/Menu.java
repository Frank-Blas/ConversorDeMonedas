package Ui;

import Modelo.Convertidor;
import Servicio.ConversorApp;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void ejecutar(){
        Scanner lectura = new Scanner(System.in);
        ConversorApp conversor = new ConversorApp();
        boolean salida = false;

        while (!salida) {
            System.out.println("""
                ****************************************************************
                Sea Bienvenido/a al conversor de moneda!!!
                
                Puedes convertir entre distintas monedas usando sus codigos.
                Por ejemplo:
                    USD - Dólar estadounidense
                    ARS - Peso argentino
                    BRL - Real brasileño
                    NIO - Córdoba nicaragüense
                    CLP - Peso chileno
                    COP - Peso colombiano
                    BOB - Boliviano
                
                Escribe "salir" en cualquier momento para finalizar.
                ****************************************************************
                """);
            System.out.println("Ingrese el código de la moneda base (ej. USD): ");
            String monedaBase = lectura.nextLine().toUpperCase();
            if (monedaBase.equalsIgnoreCase("SALIR")) break;

            System.out.println("Ingrese el código de la moneda destino (ej. ARS): ");
            String monedaDestino = lectura.nextLine().toUpperCase();
            if (monedaDestino.equalsIgnoreCase("SALIR")) break;

            System.out.println("Ingrese el valor a convertir: ");
            String entradaValor = lectura.nextLine();
            if (monedaDestino.equalsIgnoreCase("SALIR")) break;

            try{
                double valor = Double.parseDouble(entradaValor);

                Convertidor resultado = conversor.convertirMOneda(monedaBase, monedaDestino, valor);
                System.out.printf("> %.2f %s son %.2f %s%n%n", valor, monedaBase, resultado.conversion_result(), monedaDestino );
            }catch (NumberFormatException e){
                System.out.println("Error ingrese un numero valido!!");
            } catch (RuntimeException | IOException | InterruptedException e) {
                System.out.println("Error al realizar la conversion. Verifica los codigos de la moneda y intentalo nuevamente");
            }
        }
        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
    }
}


