package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {


    private static final long serialVersionUID = 175515514864161687L;
    private String cpf;
    private String nome;
    private int idpedido;

    private Pedido pedido;

    public Cliente () {

    }

    public Cliente(String cpf, String nome, int idpedido) {
        this.cpf = cpf;
        this.nome = nome;
        this.idpedido = idpedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, idpedido, nome, pedido);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(cpf, other.cpf) && idpedido == other.idpedido && Objects.equals(nome, other.nome)
                && Objects.equals(pedido, other.pedido);
    }

}
