
package com.mycompany.concesionarioapp.persistencia;

import com.mycompany.concesionarioapp.logica.Automovil;
import com.mycompany.concesionarioapp.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    //creo la instancia de la controladora JPA de automovil
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    //metodo creado desde la controladora logica
    public void agregarAutomovil(Automovil auto) {
        //creo en la BD mediante la persistencia todo los datos correspondiente a auto
        autoJpa.create(auto);
    }
    //metodo creado desde logica traer autos
    //
    public List<Automovil> traerAutos() {
     return  autoJpa.findAutomovilEntities();
    }
    //metodo creado desde logica
    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //meotodo creado desde la logica
    public Automovil traerAuto(int idAuto) {
       return autoJpa.findAutomovil(idAuto);
    }
    //metodo creado desde la logica, aplicar metodo edit
    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

}
