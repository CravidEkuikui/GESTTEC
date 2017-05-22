/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Usuario;
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
public class UsuarioDAO {

    public Iterable<Usuario> read;
    
    public void criarUsuario(Usuario user){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into usuario(nomeuser,senhauser,emailuser,niveluser) values(?,?,?,?)");
            stmt.setString(1, user.getNomeUser());
            stmt.setString(2, user.getSenhaUser());
            stmt.setString(3, user.getEmailUser());
            stmt.setString(4, user.getNiveUser());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Salvo Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
    
    public List<Usuario> consultaUsuario(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> users = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select * from usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Usuario user = new Usuario();
                user.setCodUser(rs.getInt("coduser"));
                user.setNomeUser(rs.getString("nomeuser"));
                user.setEmailUser(rs.getString("emailuser"));
                user.setNiveUser(rs.getString("niveluser"));
                users.add(user);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return users;
        
    }
    public List<Usuario> consultaUsuario_por_descricao(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> users = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select * from usuario where nomeuser like ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Usuario user = new Usuario();
                user.setCodUser(rs.getInt("coduser"));
                user.setNomeUser(rs.getString("nomeuser"));
                user.setEmailUser(rs.getString("emailuser"));
                user.setNiveUser(rs.getString("niveluser"));
                users.add(user);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return users;
        
    }
    
    public void EditarUsuario(Usuario user){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update usuario set nomeuser = ? ,senhauser = ? ,emailuser = ?,niveluser = ? where coduser = ?");
            stmt.setString(1, user.getNomeUser());
            stmt.setString(2, user.getSenhaUser());
            stmt.setString(3, user.getEmailUser());
            stmt.setString(4, user.getNiveUser());
            stmt.setInt(5, user.getCodUser());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}

    
    public void Excluir(Usuario user){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from usuario where coduser = ?");
            stmt.setInt(1, user.getCodUser());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Excluido  Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}

    
   

}
