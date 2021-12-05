package ce.micros.borrowers.nucleo.servicios.impl;

import ce.micros.borrowers.nucleo.datos.FuenteDatosDeudores;
import ce.micros.borrowers.nucleo.excepciones.EntidadNoExiste;
import ce.micros.borrowers.nucleo.modelo.Deudor;
import ce.micros.borrowers.nucleo.servicios.ServicioDeudores;

import java.util.Optional;

public class ServicioDeudoresImpl implements ServicioDeudores {

    private FuenteDatosDeudores fuenteDatosDeudores;

    public ServicioDeudoresImpl(FuenteDatosDeudores fuenteDatosDeudores) {
        this.fuenteDatosDeudores = fuenteDatosDeudores;
    }

    @Override
    public Deudor encontrarDeudor(int tipoId, int identificacion) {
        Optional<Deudor> deudor = Optional.ofNullable(this.fuenteDatosDeudores.encontrarDeudor(tipoId, identificacion));
        if (!deudor.isPresent()) throw new EntidadNoExiste(Deudor.class, String.valueOf(identificacion));
        return deudor.get();
    }
}
