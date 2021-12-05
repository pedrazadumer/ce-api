package ce.micros.borrowers.rest.controladores;

import ce.micros.borrowers.nucleo.servicios.ServicioDeudores;
import ce.micros.borrowers.rest.dto.DetallesDeudor;
import ce.micros.borrowers.rest.mapeadores.MapeadorRespuestaDeudor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ControladorDeudores {

    @Autowired
    private ServicioDeudores servicioDeudores;

    @GetMapping("/borrowers")
    public DetallesDeudor obtenerDeudor(@RequestParam("tipoId") int tipoId, @RequestParam("identificacion") int identificacion) {
        DetallesDeudor detallesDeudor = new DetallesDeudor();
        detallesDeudor.setData(MapeadorRespuestaDeudor.convertirAListaDeCampos(servicioDeudores.encontrarDeudor(tipoId, identificacion)));
        return detallesDeudor;
    }
}