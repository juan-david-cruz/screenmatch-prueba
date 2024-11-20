import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hola mundo");

        String nombre = "Hunter x Hunter";
        int fechaDeLanzamiento = 2011;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String sinopsis = """
                Uno de los mejores animes de este siglo, con puntuación de 9.03 en My Anime List,
                y posicionada en el puesto número 9 global de la misma.
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Serie: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de serialización: " + fechaDeLanzamiento);
        System.out.println("Nota: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.7 + 3.5) / 3;
        System.out.println("Media de la evaluación de Hunter x Hunter: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Serie popular en el momento");
        } else {
            System.out.println("Serie retro que vale la pena ver");
        }

        /*
         * for (int i = 0; i < 3; i++) {
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Ingresa la nota que le darías a Hunter x Hunter: ");
         * double notaHunter = teclado.nextDouble();
         * mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaHunter;
         * }
         */

        int i = 0;
        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Hunter x Hunter: ");
            double notaHunter = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaHunter;
            i++;
        }

        System.out.println("La nota media de Hunter x Hunter" +
                "dada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}