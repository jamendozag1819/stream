package YFA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        System.out.println("la cantidad de cursos con una duración mayor a 5 horas son: " +
                cursos.stream().filter(problema1 -> problema1.getDuracion() >=5.0).count()+ "\n");

        System.out.println("la cantidad de cursos con una duración menor a 2 horas son: " +
                cursos.stream().filter(problema2 -> problema2.getDuracion() <=2.0).count()+ "\n");

        List<String> problema3 =cursos.stream().filter(prob3 -> prob3.getVideos() >=50 )
                .map(prob3 -> prob3.getTitulo()).collect(Collectors.toList());
        System.out.println("Título de todos aquellos cursos con una cantidad de vídeos mayora 50: " + problema3 + "\n");

        System.out.println("El título de los 3 cursos con mayor duración son: ");
        cursos.stream().sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3).forEach(problema4 -> System.out.println(problema4.getTitulo()));
        System.out.println("\n");

        System.out.println("Duración total de todos los cursos: "+ cursos.stream()
                .mapToDouble(problema5 -> problema5.getDuracion()).sum() + "\n");

        double promedio = cursos.stream().mapToDouble(problema6 -> problema6.getDuracion()).sum()
                / cursos.stream().count();
        List<String> problema6 = cursos.stream().filter(problem6 -> problem6.getDuracion() > promedio)
                .map(proble6 -> proble6.getTitulo()).collect(Collectors.toList());
        System.out.println("Los cursos que superan el promedio en cuanto a duración se refiere son: " + problema6 + "\n");

        System.out.println("cursos que tengan una cantidad de alumnos inscritos menor a 500:");
        cursos.stream().filter(problema7 -> problema7.getAlumnos()<500)
                .forEach(curso -> System.out.println(curso.getTitulo() +": " + curso.getDuracion()));
        System.out.println("\n");

        double maxD = cursos.stream().mapToDouble(Curso::getDuracion).max().getAsDouble();
        cursos.stream().filter(curso -> curso.getDuracion() == maxD)
                .forEach(curso -> System.out.println("Este es el curso con mas duracion: " +
                        curso.getTitulo() + "\n"));

        System.out.println("Esta es la lista de todos los cursos: \n" +
                cursos.stream().map(problema9 -> problema9.getTitulo()).collect(Collectors.toList()));
    }
    /***
     * Resolver los siguientes problemas:
     * Obtener la cantidad de cursos con una duración mayor a 5 horas.
     * Obtener la cantidad de cursos con una duración menor a 2 horas.
     * Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
     * a 50.
     * Mostrar en consola el título de los 3 cursos con mayor duración.
     * Mostrar en consola la duración total de todos los cursos.
     * Mostrar en consola todos aquellos libros que superen el promedio en
     * cuanto a duración se refiere.
     * Mostrar en consola la duración de todos aquellos cursos que tengan una
     * cantidad de alumnos inscritos menor a 500.
     * Obtener el curso con mayor duración.
     * Crear una lista de Strings con todos los titulos de los cursos.
     *
     * Una vez terminado subirlo al repositorio
     */
}
