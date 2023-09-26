package excepciones;

import java.util.InputMismatchException;

public class numeroNegativoException extends InputMismatchException {

    @Override
    public String getMessage() {
        return "EL NUMERO NO PUEDE SER NEGATIVO";
    }

}
