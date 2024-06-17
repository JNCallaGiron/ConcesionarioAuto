
package com.mycompany.concesionarioapp.logica;

import com.mycompany.concesionarioapp.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    //instancia de persistencia 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    //metodo creado desde la IGU del boton Agregar

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
   // creo un nuevo auto antes de guardarlo en la persistencia
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        //ahora creo el metodo a la persitencia
        controlPersis.agregarAutomovil(auto);//no olviudar completar con el objeto 
    }
    
    //metodo creado desde-igu-consultas automoviles-metodo traer tabla.
    public List<Automovil> traerAutos() {
       return  controlPersis.traerAutos();
    }
    
    //metodo creado desde consultas automovil
    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);

    }
    //metodo creado desde EditarDatos
    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }
    //metodo creado de EditarDatos
    public void modificarAuto(Automovil auto, String modelo, String marca, 
            String motor, String color, String patente, int cantPuertas) {
      //setear el auto /modificar los datos del auto por los nuevos cargado en la igu
      auto.setModelo(modelo);
      auto.setMarca(marca);
      auto.setMotor(motor);
      auto.setColor(color);
      auto.setPatente(patente);
      auto.setCantPuertas(cantPuertas);
     // le pido a la persistencia que modifique con  estos datos
     controlPersis.modificarAuto(auto);//el objeto completo auto
    }
   
}
