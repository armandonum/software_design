package tasks.sortListObjets;

import tasks.sortListObjets.interfaces.IComparatorStrategy;

public class combinado implements IComparatorStrategy {


    @Override
    public int compare(estudiante s1, estudiante s2) {
        int resultado= s1.getNombre().compareTo(s2.getNombre());
        if(resultado != 0) return resultado;
        resultado = Integer.compare(s1.getEdad(), s2.getEdad());
        if(resultado != 0)return resultado;
        return Double.compare(s1.getGrado(), s2.getGrado());

//        if(s1.getEdad() == s2.getEdad()){
//            if(s1.getNombre().compareTo(s2.getNombre()) == 0){
//                return Double.compare(s1.getGrado(), s2.getGrado());
//            }else{
//                return s1.getNombre().compareTo(s2.getNombre());
//            }
//        }else{
//            return Integer.compare(s1.getEdad(), s2.getEdad());
//        }
    }
}
