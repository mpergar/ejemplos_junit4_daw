package org.iesvdm.prueba_depurar;

/**
Programa:
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

*/
import java.util.concurrent.TimeUnit;
public class Ej4 {
  public static void main(String args[]) throws InterruptedException {
    int hora;
    int minuto;
    int segundo; 
    // horas
    for (hora=0; hora<=23; hora++) {
      // minutos
      for (minuto=0; minuto<=59; minuto++) {
        // segundos
        for (segundo=0; segundo<=59; segundo++) {
          // escribe hora:minutos:segundos (actualizandose a medida que va pasando cada segundo)
          System.out.printf("%02d:%02d:%02d",hora,minuto,segundo);
          TimeUnit.SECONDS.sleep(1);
          System.out.print("\r");
        }
      }
    }
  }
}