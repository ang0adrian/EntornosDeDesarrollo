
package ejercicio14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class MASCOTAS {
   
    List<CLIENTE> misClientes = new ArrayList<CLIENTE>();
    
    
    CALENDARIO_VACUNAS miCALENDARIO_Vacunas = new CALENDARIO_VACUNAS();
    
    HISTORIAL_MEDICO miHistorial_Medico
            = new HISTORIAL_MEDICO();
    
    String CODIGO;

    String ALIAS;

    String ESPECIE;

    String RAZA;

    String COLOR_PELO;

    Date FECHA_NACIMIENTO;

    float PESO_MEDEIO_VISITAS;

    float PESO_ACTUAL;
}
