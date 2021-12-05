package ce.micros.borrowers.nucleo.datos;

import ce.micros.borrowers.nucleo.modelo.Deudor;

public interface FuenteDatosDeudores {

    Deudor encontrarDeudor(int tipoId, int identificacion);

}
