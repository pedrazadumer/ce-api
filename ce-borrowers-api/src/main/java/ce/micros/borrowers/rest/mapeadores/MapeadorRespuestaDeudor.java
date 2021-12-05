package ce.micros.borrowers.rest.mapeadores;

import ce.micros.borrowers.nucleo.modelo.Deudor;
import ce.micros.borrowers.rest.dto.CampoDeudor;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapeadorRespuestaDeudor {

    public static List<CampoDeudor> convertirAListaDeCampos(Deudor deudor) {

        Method[] methods = Deudor.class.getMethods();

        return Stream.of(methods).filter(m -> m.getName().startsWith("get") && !m.getName().startsWith("getClass"))
                .map(m -> MapeadorRespuestaDeudor.convertirACampo(m, deudor))
                .collect(Collectors.toList());
    }

    public static CampoDeudor convertirACampo(Method m, Deudor deudor) {
        try {
            CampoDeudor campoDeudor = new CampoDeudor();
            campoDeudor.setLabel(m.getName().substring(3));
            campoDeudor.setValue(m.invoke(deudor));
            return campoDeudor;
        } catch (Exception e) {
            throw new RuntimeException("Mapping failure Deudor to List<CampoDeudor>.");
        }
    }

}
