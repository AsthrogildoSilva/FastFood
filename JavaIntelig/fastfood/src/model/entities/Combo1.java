package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Combo1 implements Serializable {


    private static final long serialVersionUID = 5609636212117770884L;
    private int idcombo;
    private String combos;
    private String preco;

    private Entrega entrega;
    private Pedido pedido;

    public Combo1 () {

    }


    public Combo1(int idcombo, String combos, String preco) {
        super();
        this.idcombo = idcombo;
        this.combos = combos;
        this.preco = preco;
    }


    public int getIdcombo() {
        return idcombo;
    }


    public void setIdcombo(int idcombo) {
        this.idcombo = idcombo;
    }


    public String getCombos() {
        return combos;
    }


    public void setCombos(String combos) {
        this.combos = combos;
    }


    public String getPreco() {
        return preco;
    }


    public void setPreco(String preco) {
        this.preco = preco;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    @Override
    public int hashCode() {
        return Objects.hash(combos, idcombo, preco);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Combo1 other = (Combo1) obj;
        return Objects.equals(combos, other.combos) && idcombo == other.idcombo && Objects.equals(preco, other.preco);
    }


    public Entrega getEntrega() {
        return entrega;
    }


    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }


    public Pedido getPedido() {
        return pedido;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
