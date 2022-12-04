package Barbara;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
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

        //1: Obtener la cantidad de cursos con una duración mayor a 5 horas.

       int canCur= cursos.stream().filter(n-> n.getDuracion() >5 ).mapToInt(n->n.getVideos()).sum();
       System.out.println("Cantidad de cursos mayor a 5 hr: "+canCur);


        //2: Obtener la cantidad de cursos con una duración menor a 2 horas.
        /*
        int canCur2= cursos.stream().filter(n-> n.getDuracion() <2 ).mapToInt(n->n.getVideos()).sum();
        System.out.println("Cantidad de cursos menor a 2 hr: "+canCur2);
        */

        //3: Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50
        /*
        cursos.stream().filter(n-> n.getVideos() >50 ).forEach(nomCur -> System.out.println(nomCur.getTitulo()));
         */

        //4: Mostrar en consola el título de los 3 cursos con mayor duración.
        /*
        cursos.stream().sorted(Comparator.comparing(Curso::getDuracion).reversed()).limit(3).forEach(nomCur -> System.out.println(nomCur.getTitulo()));
        */

        //5: Mostrar en consola la duración total de todos los cursos.
        /*
        Double sumaTot=cursos.stream().mapToDouble(n->n.getDuracion()).sum();
        System.out.println("La duración total de los cursos es: "+sumaTot);
         */

        //6: Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        /*
        DoubleSummaryStatistics promedio = cursos.stream().mapToDouble(x->x.getDuracion()).summaryStatistics();
        System.out.println("El promedio de duración es : "+promedio.getAverage());
        cursos.stream().filter(n-> n.getDuracion() > promedio.getAverage() ).forEach(nomCur -> System.out.println(nomCur.getTitulo()));
         */

        //7: Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.

        //cursos.stream().filter(n-> n.getAlumnos() <500 ).forEach(durac -> System.out.println(durac.getDuracion()));


        //8: Obtener el curso con mayor duración.
       //  cursos.stream().sorted(Comparator.comparing(Curso::getDuracion).reversed()).limit(1).forEach(nomCur -> System.out.println(nomCur.getTitulo()));


        //9: Crear una lista de Strings con todos los titulos de los cursos.
        //cursos.stream().forEach(nomCur -> System.out.println(nomCur.getTitulo()));

      //  List lista=cursos.stream().map(nombre->nombre.getTitulo()).collect(Collectors.toList());
        //System.out.println(lista);
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
