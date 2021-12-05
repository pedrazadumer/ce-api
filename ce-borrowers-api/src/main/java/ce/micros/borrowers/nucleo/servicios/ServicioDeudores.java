package ce.micros.borrowers.nucleo.servicios;

import ce.micros.borrowers.nucleo.modelo.Deudor;

public interface ServicioDeudores {
    Deudor encontrarDeudor(int tipoId, int identificacion);
}
