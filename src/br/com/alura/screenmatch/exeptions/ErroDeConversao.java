package br.com.alura.screenmatch.exeptions;

public class ErroDeConversao extends RuntimeException {
    private String message;

    public ErroDeConversao(String message) {
        this.message =message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
