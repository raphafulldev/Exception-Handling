package model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 3303870181677866627L;

    public DomainException (String msg){
        super(msg);
    }
}
