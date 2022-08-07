package dao;

import model.entities.Pedido;

public interface PedidoDAO {
    void insertPedido(Pedido pedido01);
    void deletePedido(Integer idPedido);
    void updatePedido(Pedido pedido01);
}
