package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex119_EscudosEjercitoRomano {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numLegionarios = 0, legionarios = in.nextInt(), formacionInterior, formacionExterior, formacion,
                contadorEscudos = 0, sumatorioEscudos = 0;

        numLegionarios = legionarios;
        // Usamos la variabla numLegionarios para que retenga la variable legionarios,
        // así cuando legionarios sea 0 no se acabe

        while (numLegionarios != 0) {

            formacion = (int) Math.sqrt(legionarios);
            // Saca la raiz cuadrada del total de legionarios para hacer un cuadrado

            legionarios = legionarios - (int) Math.pow(formacion, 2);
            /*
             * Recoge el num total de legionarios y lo resta a la formacion que cuadrada que
             * se ha hecho (ejemplo 35 - 5*5 = 25 numLegionarios) lo que nos da el resto de
             * legionarios antes de hacer la siguiente formación
             */

            switch (formacion) {

            case 1:
                contadorEscudos += 5;
                break;
            // Formación de 1 persona, requiere 5 escudos.
            case 2:
                contadorEscudos = (4 * 3);
                break;
            // Formación de 4 personas (2*2), 3 escudos por personas,
            // lo que es igual a 4*3 = 12 escudos
            default:
                formacionInterior = ((formacion - 2) * (formacion - 2));

                formacionExterior = (int) ((Math.pow(formacion, 2) - formacionInterior) * 2) + 4;

                contadorEscudos = formacionExterior + formacionInterior;
                break;
            /*
             * Resto de formaciones, se resta 2 a la formacionInterior para que solo cuenta
             * la parte interna, y ese sería el resultado ya que solo se lleva 1 escudo por
             * persona. En el caso de la formacionExterior se saca el total de personas que
             * hay en la formación y se le resta las personas de la formacionExterior,
             * después se multiplica x2 ya que en la parte exterior se lleva 2 escudos por
             * persona, y se le suma 4 porque en las esquinas se llevan 3 escudos.
             */
            }

            sumatorioEscudos += contadorEscudos;
            // sumatorioEscudos va recogiendo lo que recolecta contadorEscudos.
            contadorEscudos = 0;
            // Reseteo de contadorEscudos para que en la siguiente vuelta empiece
            // desde 0.
            if (legionarios == 0) {

                System.out.printf("%d%n", sumatorioEscudos);

                legionarios = in.nextInt();

                numLegionarios = legionarios;

                sumatorioEscudos = 0;

                // cuando haya acabado la vuelta, muestra en pantalla el total
                // de los escudos, y vuelve a preguntar por otro escuadron, reseteo.
            }
        }
    }
}
