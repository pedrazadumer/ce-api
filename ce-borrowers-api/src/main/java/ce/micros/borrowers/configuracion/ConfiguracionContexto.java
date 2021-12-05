package ce.micros.borrowers.configuracion;

import ce.micros.borrowers.nucleo.datos.FuenteDatosDeudores;
import ce.micros.borrowers.nucleo.servicios.ServicioDeudores;
import ce.micros.borrowers.nucleo.servicios.impl.ServicioDeudoresImpl;
import ce.micros.borrowers.persistencia.BDFuenteDatosDeudores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class ConfiguracionContexto {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean
    public ServicioDeudores servicioDeudores() {
        return new ServicioDeudoresImpl(bdFuenteDatosDeudores());
    }

    @Bean
    public FuenteDatosDeudores bdFuenteDatosDeudores() {
        return new BDFuenteDatosDeudores(jdbcTemplate);
    }
}
