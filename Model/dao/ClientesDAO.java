/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cravid Ekuikui
 */
public class ClientesDAO {
    
     public Iterable<Clientes> read;
    
    public void criarCliente(Clientes cli){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into cliente(nomecliente,nifcliente,telefone,casacliente,ruacliente,bairro,municipio) values(?,?,?,?,?,?,?)");
            stmt.setString(1, cli.getNomeCliente());
            stmt.setString(2, cli.getNifCliente());
            stmt.setInt(3, cli.getTelefone());
            stmt.setString(4, cli.getCasa());
            stmt.setString(5, cli.getRua());
            stmt.setString(6, cli.getBairro());
            stmt.setString(7, cli.getMunicipio());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Salvo Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
    
    public List<Clientes> consultaClientes(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Clientes> clis = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select * from cliente");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Clientes cli = new Clientes();
                cli.setCodCliente(rs.getInt("codcliente"));
                cli.setNomeCliente(rs.getString("nomecliente"));
                cli.setNifCliente(rs.getString("nifcliente")); 
                cli.setTelefone(rs.getInt("telefone"));
                cli.setCasa(rs.getString("casacliente"));
                cli.setRua(rs.getString("ruacliente"));
                cli.setBairro(rs.getString("bairro"));
                cli.setMunicipio(rs.getString("municipio"));
                clis.add(cli);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clis;
        
    }
    
    public List<Clientes> consultaClientes_por_descricao(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Clientes> clis = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select * from cliente where nomecliente like ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Clientes cli = new Clientes();
                cli.setCodCliente(rs.getInt("codcliente"));
                cli.setNomeCliente(rs.getString("nomecliente"));
                cli.setNifCliente(rs.getString("nifcliente")); 
                cli.setTelefone(rs.getInt("telefone"));
                cli.setCasa(rs.getString("casacliente"));
                cli.setRua(rs.getString("ruacliente"));
                cli.setBairro(rs.getString("bairro"));
                cli.setMunicipio(rs.getString("municipio"));
                clis.add(cli);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clis;
        
    }
    
    public void EditarCliente(Clientes cli){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
         try {
            stmt = con.prepareStatement("update cliente set nomecliente = ? ,nifcliente = ? ,telefone = ?,casacliente = ?,ruacliente = ?, bairro = ?, municipio = ? where codcliente = ?");
            stmt.setString(1, cli.getNomeCliente());
            stmt.setString(2, cli.getNifCliente());
            stmt.setInt(3, cli.getTelefone());
            stmt.setString(4, cli.getCasa());
            stmt.setString(5, cli.getRua());
            stmt.setString(6, cli.getBairro());
            stmt.setString(7, cli.getMunicipio());
            stmt.setInt(8, cli.getCodCliente());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void ExcluirCliente(Clientes cli){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
         try {
            stmt = con.prepareStatement("delete from cliente where codcliente = ?");
            stmt.setInt(1, cli.getCodCliente());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Excluido Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
