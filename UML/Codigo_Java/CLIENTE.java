/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class CLIENTE {

    List<PERSONA> personas = new ArrayList<PERSONA>();
    List<MASCOTAS> mascotas = new ArrayList<MASCOTAS>();
    
    VETERINARIO myVeterinario = new VETERINARIO();
    
    String CODIGO;

    String PRIMER_APELLIDO;

    int NUMERO_CUENTA;

    String DIRECCION;

    int TELEFONO;

    String DNI_MIEMBROS;

    String NOMBRE_MIEMBROS;

}
