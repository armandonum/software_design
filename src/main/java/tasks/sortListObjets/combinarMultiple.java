package tasks.sortListObjets;


import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class combinarMultiple implements IComparatorStrategy{



    @Override
    public int compare(estudiante s1, estudiante s2) {
        int resultado= s1.getNombre().compareTo(s2.getNombre());
        if(resultado != 0) return resultado;
        resultado = Integer.compare(s1.getEdad(), s2.getEdad());
        if(resultado != 0)return resultado;
        return Double.compare(s1.getGrado(), s2.getGrado());

    }
}
