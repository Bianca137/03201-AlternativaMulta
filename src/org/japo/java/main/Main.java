/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final double IMPORTE_MULTA = 60.0;
        final int TIPO_DESCUENTO = 20;
        final int PLAZO_DESCUENTO = 30;
        final int DIAS_DESCUENTO = 10;
        double importeDescuento = 0.0;

        try {
            System.out.println("Alternativa de Multa");
            System.out.println("====================");
            System.out.print("Introduce días demora ..........: ");
            int diasDemora = SCN.nextInt();

            System.out.println("");

            System.out.printf(Locale.ENGLISH, "Importe inicial multa .........: %.2f €%n", IMPORTE_MULTA);

            System.out.println("");

            System.out.println("Plazo con descuento .........: " + PLAZO_DESCUENTO + " días");
            System.out.println("Tanto descuento .............: " + TIPO_DESCUENTO + " %");

            System.out.println("");

            boolean testOK = diasDemora <= DIAS_DESCUENTO;

            if (testOK) {

                importeDescuento = IMPORTE_MULTA * TIPO_DESCUENTO / 100;

            }

            System.out.printf(Locale.ENGLISH, "Importe descuento ...........: %.2f €%n", importeDescuento);

            double importeFinal = IMPORTE_MULTA - importeDescuento;
            System.out.printf(Locale.ENGLISH, "Importe final multa ..........: %.2f €%n", importeFinal);

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta.");
        } finally {
            SCN.nextInt();
        }

    }
}
