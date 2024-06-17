

package com.mycompany.concesionarioapp;

import com.mycompany.concesionarioapp.igu.Principal;

public class ConcesionarioApp {

    public static void main(String[] args) {
       //llamo y hago visible a la capa IGU
       Principal prin = new Principal ();
       prin.setVisible(true);
       prin.setLocationRelativeTo(null);
    }
}
