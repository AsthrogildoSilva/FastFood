package model.entities;
import java.io.Serializable;
import java.util.Objects;

public class Pedido implements Serializable{


    private static final long serialVersionUID = -8335638024266744387L;
    private int idpedido;
    private int idcombo;
    private int cpfcliente;

    private Entrega entrega;
    private Combo1 combo1;
    private Cliente cliente;

    public Pedido () {

    }

    public Pedido(int idpedido, int idcombo, int cpfcliente, Entrega entrega, Combo1 combo1, Cliente cliente) {
        super();
        this.idpedido = idpedido;
        this.idcombo = idcombo;
        this.cpfcliente = cpfcliente;
        this.entrega = entrega;
        this.combo1 = combo1;
        this.cliente = cliente;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(int idcombo) {
        this.idcombo = idcombo;
    }

    public int getCpfcliente() {
        return cpfcliente;
    }

    public void setCpfcliente(int cpfcliente) {
        this.cpfcliente = cpfcliente;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Combo1 getCombo1() {
        return combo1;
    }

    public void setCombo1(Combo1 combo1) {
        this.combo1 = combo1;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, combo1, cpfcliente, entrega, idcombo, idpedido);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        return Objects.equals(cliente, other.cliente) && Objects.equals(combo1, other.combo1)
                && cpfcliente == other.cpfcliente && Objects.equals(entrega, other.entrega) && idcombo == other.idcombo
                && idpedido == other.idpedido;
    }
}
