package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import db.*;
import model.entities.Cliente;

public class App {

    public static void main(String[] args) throws SQLException  {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        char opcao = 'w';

        System.out.println("Digite uma das opções abaixo: ");
        System.out.println(
                "0 - Para encerrar o menu: \n" +
                "1 - Para imprimir todos os clientes: \n" +
                "2 - Para buscar os dados pelo cpf: \n" +
                "3 - Inserir um cliente: \n " +
                "4 - Para atualizar os dados do cliente: \n" +
                "5 - Para excluir um cliente: \n"
        );
        opcao = leia.next().charAt(0);

        // digitar zero
        while (opcao != '0') {

            if (opcao == '2') {

                continue; // Aqui vão as opções do menu.
            }

            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("0 -para encerrar o menu: \n" +
                    "1 -para imprimir todos os clientes: \n" +
                    "2 -para buscar os dados pelo cpf: \n" +
                    "3 -inserir um cliente: \n " +
                    "4 - para atualizar os dados do cliente: \n" +
                    "5 - para excluir um cliente: \n"
            );
            opcao = leia.next().charAt(0);
        }
    }

    // DELETE
    public static void excluiDados(String Cpf) {

        String sql = "DELETE FROM clientes WHERE cpf = ?";
        Connection conn = db.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Cpf);
            stmt.execute();

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }

    }

    // INSERT
    private Connection connection;

    public Conexao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        String sql = "insert into CLIENTE (Nome,Cpf,idpedido) VALUES (?,?,?)";

        try {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getIdpedido());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {

        }
    }

    //SELECT
    public List<FastFood> getLista() {

        try {
            List<FastFood> FastFood = new ArrayList<FastFood>();
            PreparedStatement stmt = this.connection
                    .prepareStatement("select * from FastFood");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                FastFood FastFood = new FastFood();
                FastFood.setId(rs.getLong("id"));
                FastFood.setNome(rs.getString("nome"));
                FastFood.setCPF(rs.getString("email"))

                FastFood.add(FastFood);
            }
            rs.close();
            stmt.close();
            return FastFood;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // UPDATE na tabela cliente apenas.
    public void alteraCliente(Cliente cliente) {

        String sql = "update CLIENTE set Nome=? , Cpf=? where idpedido=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setLong(3, cliente.getIdpedido());

            stmt.execute();

            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
