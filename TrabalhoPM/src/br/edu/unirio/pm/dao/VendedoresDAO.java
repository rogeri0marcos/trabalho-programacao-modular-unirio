/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirio.pm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.unirio.pm.model.Vendedor;
import br.edu.unirio.pm.resource.FabricaConexao;
import br.edu.unirio.pm.util.Parser;
import br.edu.unirio.pm.util.ParserVendedor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rogerio.silva
 *
 */
public class VendedoresDAO extends AbstractArquivosDAO<Vendedor> {
	    //Agora referenciado na Classe FabricadeConexoes
    //private Connection conexao;
    //private PreparedStatement comando;
    private ResultSet resultado;
    private PreparedStatement comando;
    private final String INSERT = "insert into VENDEDOR (codigo, nome, categoria)"
            + "values (?, ?, ?)";
    private final String SELECT_VENDEDOR_ESPECIFICO = "select * from VENDEDOR where codigo = ?";
    private final String SELECT_TODOS = "select * from VENDEDOR";
    private final String UPDATE_NOME_CATEGORIA = "update VENDEDOR set nome=?, "
            + "categoria=? where codigo = ?";

    @Override
    public Parser<Vendedor> getParser() {
        return new ParserVendedor();
    }

    /**
     * Retorna true caso tenha inserido, e false caso tenha atualizado.
     *
     * @param vendedor
     * @return
     * @throws SQLException
     */
    public boolean inserirVendedor(Vendedor vendedor) throws SQLException {
        comando = null;
        try {
            if (vendedorEstaNoBanco(vendedor.getCodigo())) {
                atualizarNomeVendedor(vendedor);
                return false;
            } else {
                FabricaConexao.iniciarConexao();
                comando = FabricaConexao.criarComando(INSERT);
                comando.setLong(1, vendedor.getCodigo());
                comando.setString(2, vendedor.getNome());
                comando.setInt(3, vendedor.getCategoria());
                comando.execute();
                return true;
            }
        } finally {
            System.out.println(INSERT);
            FabricaConexao.fecharComando(comando);
            FabricaConexao.fecharConexao();
        }
    }

    public boolean vendedorEstaNoBanco(long codigoVendedor) throws SQLException {
        comando = null;

        try {
            FabricaConexao.iniciarConexao();
            comando = FabricaConexao.criarComando(SELECT_VENDEDOR_ESPECIFICO);
            comando.setLong(1, codigoVendedor);
            resultado = comando.executeQuery();
            if (resultado.next()) {
                return true;
            }
            return false;
        } finally {
            FabricaConexao.fecharComando(comando);
            FabricaConexao.fecharConexao();
        }

    }

    public void atualizarNomeVendedor(Vendedor vendedor) throws SQLException {
        comando = null;

        try {
            FabricaConexao.iniciarConexao();
            comando = FabricaConexao.criarComando(UPDATE_NOME_CATEGORIA);
            comando.setString(1, vendedor.getNome());
            comando.setInt(2, vendedor.getCategoria());
            comando.setLong(3, vendedor.getCodigo());
            comando.execute();

        } finally {
            FabricaConexao.fecharComando(comando);
            FabricaConexao.fecharConexao();
        }

    }

    public Vendedor buscarVendedorNoBanco(long codigoVendedor) throws SQLException {
        FabricaConexao.iniciarConexao();
        comando = FabricaConexao.criarComando(SELECT_VENDEDOR_ESPECIFICO);
        comando.setLong(1, codigoVendedor);
        resultado = comando.executeQuery();
        while (resultado.next()) {
            if (resultado.getLong("codigo") == codigoVendedor) {
                Vendedor vendedor = new Vendedor();
                vendedor.setCodigo(resultado.getLong("codigo"));
                vendedor.setNome(resultado.getString("nome"));
                vendedor.setCategoria(resultado.getInt("categoria"));
                return vendedor;
            }
        }
        return null;

    }
    
    public List<Vendedor> obterListaVendedores() throws SQLException {
        List<Vendedor> listaVendedores = new ArrayList<>();
        try {
            FabricaConexao.iniciarConexao();
            comando = FabricaConexao.criarComando(SELECT_TODOS);
            resultado = comando.executeQuery();
            while (resultado.next()) {
                Vendedor vendedor = new Vendedor();
                vendedor.setCategoria(resultado.getInt("CATEGORIA"));
                vendedor.setCodigo(resultado.getLong("CODIGO"));
                vendedor.setNome(resultado.getString("NOME"));
                listaVendedores.add(vendedor);
            }
            return listaVendedores;
        } finally {
            FabricaConexao.fecharComando(comando);
            FabricaConexao.fecharConexao();
        }

    }

}
