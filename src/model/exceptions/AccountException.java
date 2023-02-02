package model.exceptions;

import java.io.Serial;

public class AccountException extends Exception {

    @Serial
    private static final long serialVersionUID = -7519798601404590316L;

    public AccountException (String msg){
        super(msg);
    }
}
