import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class GestorCitas extends ArrayList<IPersona> {
    private ArrayList<Persona> listaDeEspera;

    //Constructores

    public GestorCitas(int initialCapacity, ArrayList<Persona> listaDeEspera) {
        super(initialCapacity);
        this.listaDeEspera = listaDeEspera;
    }

    public GestorCitas(ArrayList<Persona> listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }

    public GestorCitas(Collection<? extends IPersona> c, ArrayList<Persona> listaDeEspera) {
        super(c);
        this.listaDeEspera = listaDeEspera;
    }

    public ArrayList<Persona> getListaDeEspera() {
        return listaDeEspera;
    }

    public void setListaDeEspera(ArrayList<Persona> listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }

    //Metodos propios
    public String comprobarFilaGeneral(){
        return "Quedan "+this.stream().count()+" personas en la lista.";
    }

    public String comprobarRenuentes(){ //No se quieren vacunar
       int iContadorRenuentes=0;


       for(IPersona posiblePaciente: this){
           if (posiblePaciente instanceof Afiliada){
               if(((Afiliada) posiblePaciente).getAceptacion()==false){
                   iContadorRenuentes++;
               }
           }
       }

       return "Hay "+iContadorRenuentes+" personas en la que no quieren vacunarse.";

    }

    public String comprobarInfantes(){ //Menores de 10
          int iContadorInfantes=0;
          Date fecha = new Date();

          for(IPersona posiblePaciente: this){
              if (posiblePaciente instanceof Afiliada){
                 fecha=posiblePaciente.getFechaNacimiento();
                 if(fecha.getYear()<10){
                     iContadorInfantes++;
                }
             }

             return "Hay "+iContadorInfantes+" personas en la que no quieren vacunarse.";
    }

    public String comprobarCV(){

    }
    public void vacunar(){
        //Acción de vacunar
        if((this.stream() instanceof Afiliada) && //Comprobamos que es afiliada
                (((Afiliada) this.stream()).getAceptacion()==true) && //Comprobamos que acepta vacunarse
                ((Afiliada) this.stream()).getDosis()<2))
        {
            //debería de hacer un listado
            ((Afiliada) this.stream()).setVacuna("La que toque");

        }


    }
    public void asignarCitas(){
        this.get(0).
    }
}
}