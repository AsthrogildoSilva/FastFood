package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Entrega implements Serializable{


    private static final long serialVersionUID = 3021604642765296664L;
    private int identrega;
    private int npedido;
    private boolean done;

    private Entrega Entrega;

    public Entrega () {

    }

    public Entrega(int identrega, int npedido, boolean done, Entrega entrega) {
        super();
        this.identrega = identrega;
        this.npedido = npedido;
        this.done = done;
        Entrega = entrega;
    }

    public int getIdentrega() {
        return identrega;
    }

    public void setIdentrega(int identrega) {
        this.identrega = identrega;
    }

    public int getNpedido() {
        return npedido;
    }

    public void setNpedido(int npedido) {
        this.npedido = npedido;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Entrega getEntrega() {
        return Entrega;
    }

    public void setEntrega(Entrega entrega) {
        Entrega = entrega;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Entrega, done, identrega, npedido);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entrega other = (Entrega) obj;
        return Objects.equals(Entrega, other.Entrega) && done == other.done && identrega == other.identrega
                && npedido == other.npedido;
    }

}
