package Ejercicios;

import java.util.ArrayList;
/*
*Una tarea es una descripción, que además contiene una prioridad y un estado
* (Si está completa o incompleta). Además, una tarea puede tener una fecha límite.
 */
public class Tarea {

    private int id;
    private String description;
    private String estado;

    private String prioridad;
    private String fechalimite;



    public Tarea(String description, String estado, String prioridad, String fechalimite) {
        this.id++;
        this.description = description;
        this.estado = estado;

        this.prioridad=prioridad;
        this.fechalimite = fechalimite;


    }

    public void mostrarTarea(){
        if(this.estado.equals("completa")){
            System.out.println("(Vencida)..."+this.description);
        }
        else{
            System.out.println(this.description);

        }
    }



    public String getDescription() {
        return description;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechalimite() {
        return fechalimite;
    }

    public void setFechalimite(String fechalimite) {
        this.fechalimite = fechalimite;
    }
}
