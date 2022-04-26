package m03.uf1.pa1.alejandroalgarra;

import java.util.Scanner;

public class GeneradorTaulersSoloUnBucle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ancho, contadorAncho = 0, contadorAlto = 0, pintarTablero = 0,
                principioOFinal = 0;
        boolean secuenciaAltura = false, principioFinal = true;
        /*
        ancho = COMO DE GRANDE VA A SER EL TABLERO
        contadorAncho = PINTA CADA FRAGMENTO DE STRING LO GRANDE QUE DEBE SER
                        (POR EJ. SI contadorAncho = 3 -> ***)
        contadorAlto = VA REPITIENDO LA SECUENCIA DE pintarTablero HASTA QUE LLEGUE
                        A LA ALTURA REQUERIDA
        pintarTablero = HACE QUE PINTE 4 FRAGMENTO DE CADA HACIENDO QUE SEA UN
                        TABLERO DE 8 DE ANCHO
        secuenciaAltura = ES UN BOOLEANO QUE DECIDE SI SIGUE EL PRIMER PATRON O EL
                          SEGUNDO PATRON Y VA MARCADO POR EL contadorAlto
        
        principioOFinal = VA CONTANDO LAS LINEAS - QUE LLEVA EN EL PRINCIPIO O EL FINAL
                          PARA DELIMITAR POR LA PARTE SUPERIOR E INFERIOR HASTA QUE LLEGA A
                          principioOFinal = ancho * 8 + 1 QUE ES EL ANCHO DEL TABLERO
                          |-----|
        principioFinal = ES EL BOOLEANO QUE SE ENCARGA DE DISCERNIR SI ES EL LIMITE
                         DEL TABLERO O EL CONTENIDO DEL TABLERO
         */
        
        System.out.print("Introdueix un nombre natural major que zero: ");
        ancho = in.nextInt();
        
        for (int i = 0; i < 9; i++) {

            if (pintarTablero == 8) {
                // SI HA TERMINADO DE PINTAR UNA LINEA (pintarTablero = 8)
                pintarTablero = 0;
                System.out.println("|");
                contadorAlto++;
                
                if (contadorAlto == ancho) {
                    if (secuenciaAltura == true) {
                        secuenciaAltura = false;

                    } else if (secuenciaAltura == false) {
                        secuenciaAltura = true;
                    }
                    contadorAlto = 0;
                    i++;
                    if (i == 8) {
                        principioFinal = true;
                    }
                }
            }
            if (principioFinal) {
                if (principioOFinal == 0) {
                    System.out.print("|");
                    principioOFinal++;
                } else if (principioOFinal == ancho * 8 + 1 && i == 8) {
                    System.out.println("|");
                    principioFinal = false;
                    principioOFinal = 0;
                    i++;
                } else if (principioOFinal == ancho * 8 + 1) {
                    System.out.println("|");
                    principioFinal = false;
                    principioOFinal = 0;
                } else {
                    System.out.print("-");
                    principioOFinal++;
                }
                i--;
            }
            if (i != 8 && !principioFinal) {
                if (secuenciaAltura) {
                    // PRIMER PATRON DE SECUENCIA #-#-#-
                    if (pintarTablero % 2 == 0 && pintarTablero != 8) {

                        if (pintarTablero == 0 && contadorAncho == 0) {
                            System.out.print("|");
                        }
                        if (contadorAncho == ancho) {
                            contadorAncho = 0;
                            pintarTablero++;
                            i--;
                        } else {
                            System.out.print("#");
                            contadorAncho++;
                            i--;
                        }

                    } else if (pintarTablero % 2 != 0 && pintarTablero != 8) {
                        if (contadorAncho == ancho) {
                            contadorAncho = 0;
                            pintarTablero++;
                            i--;
                        } else {
                            System.out.print(" ");
                            contadorAncho++;
                            i--;
                        }

                    }

                } else if (!secuenciaAltura) {
                    // SEGUNDO PATRON DE SECUENCIA -#-#-#
                    if (pintarTablero % 2 != 0 && pintarTablero != 8) {

                        if (contadorAncho == ancho) {
                            contadorAncho = 0;
                            pintarTablero++;
                            i--;
                        } else {
                            System.out.print("#");
                            contadorAncho++;
                            i--;
                        }

                    } else if (pintarTablero % 2 == 0 && pintarTablero != 8) {

                        if (pintarTablero == 0 && contadorAncho == 0) {
                            System.out.print("|");
                        }

                        if (contadorAncho == ancho) {
                            contadorAncho = 0;
                            pintarTablero++;
                            i--;
                        } else {
                            System.out.print(" ");
                            contadorAncho++;
                            i--;
                        }

                    }

                }
            }

            //FINAL FOR@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        }
    }
}
