package tasks.sortListObjets;
import tasks.sortListObjets.interfaces.IComparatorFactory;
import tasks.sortListObjets.interfaces.IComparatorStrategy;
import java.util.List;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            entradas opcion=new entradas();
            List<estudiante> estudiantes = getEstudiantes();

            String opcionElegida=opcion.opciones();
            ordenar(opcionElegida, estudiantes);
            visualizar(estudiantes);
        }




    private static void visualizar(List<estudiante> estudiantes) {
        for(estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    private static List<estudiante> getEstudiantes() {
        List<estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new estudiante("Juan", 20, 3.5));
        estudiantes.add(new estudiante("Pedro", 21, 2.0));
        estudiantes.add(new estudiante("Maria", 19, 3.8));
        estudiantes.add(new estudiante("Ana", 30, 3.5));
        estudiantes.add(new estudiante("Luis", 18, 5.0));
        estudiantes.add(new estudiante("pedro",21, 1.0));
        return estudiantes;
    }

    private static void ordenar(String opcionElegida, List<estudiante> estudiantes) {
        IComparatorFactory Factory = comparadorFactory.getInstance();
        IComparatorStrategy comparador=Factory.crearComparador(opcionElegida);
        estudiantes.sort((s1, s2) -> comparador.compare(s1, s2));
    }


}
