package br.fatecrl.mvcdemo.models;

public class Rua {
    private String logradouro;
    private int cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Rua(String logradouro, int cep) {
        this.logradouro = logradouro;
        this.cep = cep;
    }
}
