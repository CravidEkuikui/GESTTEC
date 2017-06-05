/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Tarefa;
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
public class TarefaDAO {
    
     public Iterable<Tarefa> read;
    
    public void criarTarefa(Tarefa task){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into tarefa(descricao,datainicial,datafinal,codcliente,estado,observacoes) values(?,?,?,?,?,?)");
            stmt.setString(1, task.getDescricao());
            stmt.setString(2, task.getDataInicial());
            stmt.setString(3, task.getDataFinal());
            stmt.setInt(4, task.getCliente());
            stmt.setString(5, task.getEstado());
            stmt.setString(6, task.getObservacoes());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Salvo Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
    
    
     public List<Tarefa> consultaTarefas(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> Tasks = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM gesttecbd.tarefa_view1");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Tarefa task = new Tarefa();
                task.setCodTarefa(rs.getInt("Codigo"));
                task.setDescricao(rs.getString("Descricao"));
                task.setDataInicial(rs.getString("Datainicial")); 
                task.setDataFinal(rs.getString("Datafinal"));
                task.setClientenome(rs.getString("Cliente"));
                task.setUsernome(rs.getString("Tecnico"));
                task.setEstado(rs.getString("Estado"));
                task.setObservacoes(rs.getString("Observacoes"));
                Tasks.add(task);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Tasks;
        
    }
    
     public List<Tarefa> consultaTarefas_for_desc(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> Tasks = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM gesttecbd.tarefa_view1 where descricao like ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Tarefa task = new Tarefa();
                task.setCodTarefa(rs.getInt("Codigo"));
                task.setDescricao(rs.getString("Descricao"));
                task.setDataInicial(rs.getString("Datainicial")); 
                task.setDataFinal(rs.getString("Datafinal"));
                task.setClientenome(rs.getString("Cliente"));
                task.setUsernome(rs.getString("Tecnico"));
                task.setEstado(rs.getString("Estado"));
                task.setObservacoes(rs.getString("Observacoes"));
                Tasks.add(task);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Tasks;
        
    }
    
     public List<Tarefa> consultaTarefas_Relatorios(String est){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> Tasks = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM gesttecbd.tarefa_view1 where estado = ? and datainicial >= ? and datafinal <= ?");
            stmt.setString(1, est);
           
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Tarefa task = new Tarefa();
                task.setCodTarefa(rs.getInt("Codigo"));
                task.setDescricao(rs.getString("Descricao"));
                task.setDataInicial(rs.getString("Datainicial")); 
                task.setDataFinal(rs.getString("Datafinal"));
                task.setClientenome(rs.getString("Cliente"));
                task.setUsernome(rs.getString("Tecnico"));
                task.setEstado(rs.getString("Estado"));
                task.setObservacoes(rs.getString("Observacoes"));
                Tasks.add(task);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Tasks;
        
    }
    
     public List<Tarefa> consultaTarefas_nao_atribuidas(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> Tasks = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM gesttecbd.tarefa_view1 where estado =\"Aberto\"");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Tarefa task = new Tarefa();
                task.setCodTarefa(rs.getInt("Codigo"));
                task.setDescricao(rs.getString("Descricao"));
                task.setDataInicial(rs.getString("Datainicial")); 
                task.setDataFinal(rs.getString("Datafinal"));
                task.setClientenome(rs.getString("Cliente"));
                task.setUsernome(rs.getString("Tecnico"));
                task.setEstado(rs.getString("Estado"));
                task.setObservacoes(rs.getString("Observacoes"));
                Tasks.add(task);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Tasks;
        
    }
    
     public List<Tarefa> consultaTarefas_por_concluir(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> Tasks = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM gesttecbd.tarefa_view1 where estado =\"Atribuido\";");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Tarefa task = new Tarefa();
                task.setCodTarefa(rs.getInt("Codigo"));
                task.setDescricao(rs.getString("Descricao"));
                task.setDataInicial(rs.getString("Datainicial")); 
                task.setDataFinal(rs.getString("Datafinal"));
                task.setClientenome(rs.getString("Cliente"));
                task.setUsernome(rs.getString("Tecnico"));
                task.setEstado(rs.getString("Estado"));
                task.setObservacoes(rs.getString("Observacoes"));
                Tasks.add(task);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Tasks;
        
    }
    
     
     public void EditarTarefa(Tarefa task){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update tarefa set descricao=?, datainicial=?, datafinal=?, codcliente=?,estado=?, observacoes=? where codtarefa=?");
            stmt.setString(1, task.getDescricao());
            stmt.setString(2, task.getDataInicial());
            stmt.setString(3, task.getDataFinal());
            stmt.setInt(4, task.getCliente());
            stmt.setString(5, task.getEstado());
            stmt.setString(6, task.getObservacoes());
            stmt.setInt(7, task.getCodTarefa());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
    
     public void AtribuirTarefa(Tarefa task){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update tarefa set datafinal=?, coduser=? where codtarefa=?");
            stmt.setString(1, task.getDataFinal());
            stmt.setInt(2, task.getUsuario());
            stmt.setInt(3, task.getCodTarefa());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Atribuido Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atribuir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
     public void ConcluirTarefa(Tarefa task){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update tarefa set estado=?, observacoes=? where codtarefa=?");
            stmt.setString(1, task.getEstado());
            stmt.setString(2, task.getObservacoes());
            stmt.setInt(3, task.getCodTarefa());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Concluido Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Concluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}
    
     public void ExcluirTarefa(Tarefa task){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from tarefa where codtarefa=?");
            stmt.setInt(1, task.getCodTarefa());
            
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
}

    
    
    
    
    
}
