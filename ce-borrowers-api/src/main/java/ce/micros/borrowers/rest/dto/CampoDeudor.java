package ce.micros.borrowers.rest.dto;

import lombok.Data;

@Data
public class CampoDeudor<T> {

    private String label;
    private T value;

}
