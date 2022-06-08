package br.com.foodpets.exeptions;

public class InvalidLoginExeption extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidLoginExeption(String msg) {
        super(msg);
    }
}
