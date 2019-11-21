/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String NOMBRE_PERSONA = ("Jaimito");
        final String NOMBRE_ENCARGO = ("Patatas");
        final String NOMBRE_ANTOJO = ("Piruleta");
        final int CANTIDAD_ENCARGO = 3;
        final double PRECIO_PATATAS = 0.30;
        final double PRECIO_PIRULETA = 0.20;
        final double DINERO_INICIAL = 1.0;

        //Variables
        double vueltas = DINERO_INICIAL - PRECIO_PIRULETA;
        //casting para comprar kilos enteros, no agotar todo el dinero
        int numeroKilos = (int) (vueltas / PRECIO_PATATAS);
        double dineroDevuelto = vueltas - numeroKilos * PRECIO_PATATAS;
        //
        
        //Mensaje
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        System.out.println("Persona encargada ......" + NOMBRE_PERSONA);
        System.out.println("Artículo encargado ....." + NOMBRE_ENCARGO);
        System.out.println("Cantidad encargada ....." + CANTIDAD_ENCARGO + "Kg");
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/Kg%n", PRECIO_PATATAS);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f €%n", DINERO_INICIAL);
        System.out.println("---");
        System.out.printf("Articulo imprevisto ...: %s%n", NOMBRE_ANTOJO);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto ...: %.2f €%n", PRECIO_PIRULETA);
        System.out.println("---");
        System.out.printf("Cantidad comprada ....:%s Kg%n",  numeroKilos );
        System.out.printf(Locale.ENGLISH, "Dinero devuelto ....: %.2f €%n", dineroDevuelto);

    }

}
