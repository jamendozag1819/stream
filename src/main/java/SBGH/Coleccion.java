package SBGH;

import java.util.ArrayList;
import java.util.List;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));
        Resuelto resolver = new Resuelto();
        //Obtener la cantidad de cursos con una duración mayor a 5 horas.
        System.out.println("Cantidad de cursos mayores a 5 horas: "
                + resolver.duracionMayor5(cursos));
        System.out.println("-----------------");
        //Obtener la cantidad de cursos con una duración menor a 2 horas.
        System.out.println("Cantidad de cursos menores a 2 horas: "
                + resolver.duracionMenor2(cursos));
        System.out.println("-----------------");
        //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
        //     * a 50.
        System.out.println("Cursos con mas de 50 videos");
        resolver.tituloCantidadCursosMayor50(cursos);
        System.out.println("-----------------");
        //Mostrar en consola el título de los 3 cursos con mayor duración.
        System.out.println("Top 3 titulos con mayor duracion");
        resolver.tituloMayorDuracion3(cursos);
        System.out.println("-----------------");
        //Mostrar en consola la duración total de todos los cursos.
        System.out.println("Duracion total de los cursos: "
                + resolver.duracionTotal(cursos) + " horas");
        System.out.println("-----------------");
        //Mostrar en consola todos aquellos libros que superen el promedio en
        //     * cuanto a duración se refiere.
        System.out.println("Cursos con duracion mayor al promedio");
        resolver.mostrarCursosMayorPromedio(cursos);
        System.out.println("-----------------");
        //Mostrar en consola la duración de todos aquellos cursos que tengan una
        //     * cantidad de alumnos inscritos menor a 500.
        System.out.println("Cursos con menos de 500 alumnos");
        resolver.cursosMenos500Alumnos(cursos);
        System.out.println("-----------------");
        //Obtener el curso con mayor duración.
        System.out.println("Curso con mayor duracion");
        System.out.println(resolver.cursoConMayorDuracion(cursos));
        System.out.println("-----------------");
        // Crear una lista de Strings con todos los titulos de los cursos.
        System.out.println("Lista de strings de los titulos");
        System.out.println(resolver.getListaDelCurso(cursos).toString());
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
