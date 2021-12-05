package ce.micros.borrowers.persistencia;

import ce.micros.borrowers.nucleo.datos.FuenteDatosDeudores;
import ce.micros.borrowers.nucleo.modelo.Deudor;
import ce.micros.borrowers.persistencia.mapeadores.MapeadorFilaDeudor;
import org.springframework.jdbc.core.JdbcTemplate;

public class BDFuenteDatosDeudores implements FuenteDatosDeudores {

    private static final String QUERY_ENCONTRAR_DEUDOR = "SELECT * FROM BORROWER WHERE TIPO_ID = ? AND IDENTIFICACION = ?";
    private JdbcTemplate jdbcTemplate;

    public BDFuenteDatosDeudores(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Deudor encontrarDeudor(int tipoId, int identificacion) {
        return this.jdbcTemplate.queryForObject(QUERY_ENCONTRAR_DEUDOR, new MapeadorFilaDeudor(), tipoId, identificacion);
    }
}
