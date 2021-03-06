/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Connection.ConnectionFactory;
import Model.bean.Tarefa;
import Model.dao.TarefaDAO;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cravid Ekuikui
 */
public class Tela_relatorios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tela_relatorios
     */
    public Tela_relatorios() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_tarefas.getModel();
        Tabela_tarefas.setRowSorter(new TableRowSorter(modelo));
        
        
        readJTable();
    }
    
     public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela_tarefas.getModel();
        modelo.setNumRows(0);
         TarefaDAO TaskDAO = new TarefaDAO();
         

        for (Tarefa task : TaskDAO.consultaTarefas()) {
            modelo.addRow(new Object[]{
                
                task.getCodTarefa(),
                task.getDescricao(),
                task.getDataInicial(),
                task.getDataFinal(),
                task.getClientenome(),
                task.getUsernome(),
                task.getEstado(),
                task.getObservacoes()
               
            });
        }

    }
     public void readJTable_relatorios(String est) {
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela_tarefas.getModel();
        modelo.setNumRows(0);
         TarefaDAO TaskDAO = new TarefaDAO();
         

        for (Tarefa task : TaskDAO.consultaTarefas_Relatorios(est)) {
            modelo.addRow(new Object[]{
                
                task.getCodTarefa(),
                task.getDescricao(),
                task.getDataInicial(),
                task.getDataFinal(),
                task.getClientenome(),
                task.getUsernome(),
                task.getEstado(),
                task.getObservacoes()
               
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Painel_relatorios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_tarefas = new javax.swing.JTable();
        Botao_imprimir = new javax.swing.JButton();
        datainicial = new javax.swing.JFormattedTextField();
        datafinal = new javax.swing.JFormattedTextField();
        estado = new javax.swing.JComboBox<>();
        Label_estado = new javax.swing.JLabel();
        Label_datafinal = new javax.swing.JLabel();
        Label_datainicio = new javax.swing.JLabel();
        Botao_confirmar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setMaximizable(true);
        setTitle("Relatórios");

        Painel_relatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabela_tarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Data Inicial", "Data Final", "Cliente", "Técnico", "Estado", "Observações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_tarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_tarefasMouseClicked(evt);
            }
        });
        Tabela_tarefas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tabela_tarefasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_tarefas);

        Botao_imprimir.setBackground(new java.awt.Color(51, 153, 255));
        Botao_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer.png"))); // NOI18N
        Botao_imprimir.setText("Imprimir");
        Botao_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_imprimirActionPerformed(evt);
            }
        });

        datainicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        datainicial.setText("Ano-Mês-Dia");
        datainicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datainicialActionPerformed(evt);
            }
        });

        datafinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        datafinal.setText("Ano-Mês.Dia");

        estado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o estado", " ", "Aberto", "Pendente", "Cancelado", "Atribuido", "Concluído" }));

        Label_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_estado.setText("Estado");

        Label_datafinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_datafinal.setText("Data Final");

        Label_datainicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_datainicio.setText("Data Inicial");

        Botao_confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/accept.png"))); // NOI18N
        Botao_confirmar.setText("Confirmar");
        Botao_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_relatoriosLayout = new javax.swing.GroupLayout(Painel_relatorios);
        Painel_relatorios.setLayout(Painel_relatoriosLayout);
        Painel_relatoriosLayout.setHorizontalGroup(
            Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_relatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_relatoriosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Botao_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_relatoriosLayout.createSequentialGroup()
                        .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_datainicio))
                        .addGap(27, 27, 27)
                        .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_datafinal))
                        .addGap(37, 37, 37)
                        .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_estado)
                            .addGroup(Painel_relatoriosLayout.createSequentialGroup()
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(Botao_confirmar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Painel_relatoriosLayout.setVerticalGroup(
            Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_relatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_datainicio)
                    .addComponent(Label_datafinal)
                    .addComponent(Label_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Botao_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_relatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_relatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela_tarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_tarefasMouseClicked
        // TODO add your handling code here:      
    }//GEN-LAST:event_Tabela_tarefasMouseClicked

    private void Tabela_tarefasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_tarefasKeyReleased
        // TODO add your handling code her
    }//GEN-LAST:event_Tabela_tarefasKeyReleased

    private void datainicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datainicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datainicialActionPerformed

    private void Botao_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_confirmarActionPerformed
        // TODO add your handling code here:
        String a = (String) estado.getSelectedItem();
        
        readJTable_relatorios(a);
        
    }//GEN-LAST:event_Botao_confirmarActionPerformed

    private void Botao_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_imprimirActionPerformed
        // TODO add your handling code here:
        Connection con = ConnectionFactory.getConnection();
        String src = "Gesttecbd.jasper";
        
        JasperPrint jasperprint = null;
        
        try {
            jasperprint = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            System.err.println("errro" + ex);
        }
        
        JasperViewer view = new JasperViewer(jasperprint,false);
        
        view.setVisible(true);
        
    }//GEN-LAST:event_Botao_imprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_confirmar;
    private javax.swing.JButton Botao_imprimir;
    private javax.swing.JLabel Label_datafinal;
    private javax.swing.JLabel Label_datainicio;
    private javax.swing.JLabel Label_estado;
    private javax.swing.JPanel Painel_relatorios;
    private javax.swing.JTable Tabela_tarefas;
    private javax.swing.JFormattedTextField datafinal;
    private javax.swing.JFormattedTextField datainicial;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
