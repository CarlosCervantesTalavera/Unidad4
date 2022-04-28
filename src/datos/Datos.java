package datos;

public class Datos {

    public static void main(String[] args) {
   //Instanciar objeto
        Informacion Info = new Informacion("Carlos","Cervantes",2);
        //Encapsular
        String NumCon = Info.getNombre()+""+Info.getCarrera()+Info.getNumSemestre();
        System.out.println("Datos del alumno: " + NumCon);
                
    }
    
}
