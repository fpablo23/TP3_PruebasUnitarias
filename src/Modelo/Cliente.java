package Modelo;

public class Cliente {
    private String condicionTributaria;

    public Cliente() {
    }

    public Cliente(String condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    public String getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(String condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }
}
