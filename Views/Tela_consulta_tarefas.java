/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.bean.Clientes;
import Model.bean.Tarefa;
import Model.dao.ClientesDAO;
import Model.dao.TarefaDAO;
import Model.dao.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cravid Ekuikui
 */
public class Tela_consulta_tarefas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tela_consulta_tarefas
     */
    public Tela_consulta_tarefas() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_tarefas.getModel();
        Tabela_tarefas.setRowSorter(new TableRowSorter(modelo));
        
        UsuarioDAO user = new UsuarioDAO();
        ClientesDAO cli = new ClientesDAO();
        
//        for (Usuario u: user.consultaUsuario()){
//            nomeuser.addItem(u);      
//        }
        for (Clientes c: cli.consultaClientes()){
            nomecliente.addItem(c);      
        }

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
     public void readJTable_for_desc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela_tarefas.getModel();
        modelo.setNumRows(0);
         TarefaDAO TaskDAO = new TarefaDAO();
         

        for (Tarefa task : TaskDAO.consultaTarefas_for_desc(desc)) {
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

        Painel_consulta_tarefas = new javax.swing.JPanel();
        Botao_procurar_tarefas = new javax.swing.JButton();
        Campo_pesquisa_tarefa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_tarefas = new javax.swing.JTable();
        Botao_editar_tarefa = new javax.swing.JButton();
        Botao_apagar_tarefa = new javax.swing.JButton();
        descricao = new javax.swing.JTextField();
        Label_descricao = new javax.swing.JLabel();
        Label_datainicio = new javax.swing.JLabel();
        Label_datafinal = new javax.swing.JLabel();
        Label_cliente = new javax.swing.JLabel();
        nomecliente = new javax.swing.JComboBox<>();
        datafinal = new javax.swing.JFormattedTextField();
        datainicial = new javax.swing.JFormattedTextField();
        Label_observacoes = new javax.swing.JLabel();
        Label_estado = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacoes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        codigotarefa = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Consulta de Tarefas");

        Painel_consulta_tarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Botao_procurar_tarefas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_procurar_tarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        Botao_procurar_tarefas.setText("Procurar");
        Botao_procurar_tarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_procurar_tarefasActionPerformed(evt);
            }
        });

        Campo_pesquisa_tarefa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

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

        Botao_editar_tarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_editar_tarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disk_multiple.png"))); // NOI18N
        Botao_editar_tarefa.setText("Atualizar");
        Botao_editar_tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_editar_tarefaActionPerformed(evt);
            }
        });

        Botao_apagar_tarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_apagar_tarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        Botao_apagar_tarefa.setText("Apagar");
        Botao_apagar_tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_apagar_tarefaActionPerformed(evt);
            }
        });

        descricao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        Label_descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_descricao.setText("Descrição da Tarefa");

        Label_datainicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_datainicio.setText("Data Inicia de Execuçáol");

        Label_datafinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_datafinal.setText("Data Final de Execução");

        Label_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_cliente.setText("Cliente");

        nomecliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        nomecliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        datafinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        datafinal.setText("Ano-Mês.Dia");

        datainicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        datainicial.setText("Ano-Mês-Dia");
        datainicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datainicialActionPerformed(evt);
            }
        });

        Label_observacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_observacoes.setText("Observções");

        Label_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_estado.setText("Estado");

        estado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o estado", " ", "Aberto", "Pendente", "Cancelado", "Atribuido", "Concluído" }));

        observacoes.setColumns(10);
        observacoes.setRows(3);
        observacoes.setTabSize(6);
        observacoes.setAutoscrolls(false);
        jScrollPane2.setViewportView(observacoes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        codigotarefa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        codigotarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigotarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_consulta_tarefasLayout = new javax.swing.GroupLayout(Painel_consulta_tarefas);
        Painel_consulta_tarefas.setLayout(Painel_consulta_tarefasLayout);
        Painel_consulta_tarefasLayout.setHorizontalGroup(
            Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))
                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_descricao)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigotarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                                        .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                                        .addComponent(Label_datainicio)
                                        .addGap(18, 18, 18)
                                        .addComponent(Label_datafinal)
                                        .addGap(30, 30, 30)
                                        .addComponent(Label_estado)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                                        .addComponent(Label_cliente)
                                        .addGap(146, 146, 146)
                                        .addComponent(Label_observacoes))
                                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                                        .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                .addContainerGap(600, Short.MAX_VALUE)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addComponent(Botao_editar_tarefa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao_apagar_tarefa)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addComponent(Botao_procurar_tarefas)
                        .addGap(18, 18, 18)
                        .addComponent(Campo_pesquisa_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        Painel_consulta_tarefasLayout.setVerticalGroup(
            Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_procurar_tarefas)
                    .addComponent(Campo_pesquisa_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigotarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Label_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_datainicio)
                    .addComponent(Label_datafinal)
                    .addComponent(Label_estado)
                    .addComponent(Label_cliente)
                    .addComponent(Label_observacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_editar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_apagar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_consulta_tarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_consulta_tarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_editar_tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_editar_tarefaActionPerformed
        // TODO add your handling code here:
         if(Tabela_tarefas.getSelectedRow() != -1){
            Tarefa task = new Tarefa();
            TarefaDAO taskDAO = new TarefaDAO();
            Clientes cli = (Clientes) nomecliente.getSelectedItem();
            int C = cli.getCodCliente();
          //  Usuario user = (Usuario) nomeuser.getSelectedItem();
        //    int U = user.getCodUser();
            String E = (String) estado.getSelectedItem();
        
            
            
            task.setCodTarefa((int) Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 0));
            task.setDescricao(descricao.getText());
            task.setDataInicial(datainicial.getText());
            task.setDataFinal(datafinal.getText());
            task.setCliente(C);
            //task.setUsuario(U);
            task.setEstado(E);
            task.setObservacoes(observacoes.getText());
            
            taskDAO.EditarTarefa(task);
            
            codigotarefa.setText("");
            descricao.setText("");
            datafinal.setText("");
            datainicial.setText("");
            observacoes.setText("");
            estado.setSelectedIndex(0);
            nomecliente.setSelectedIndex(0);
           
      
            readJTable();
         }
    }//GEN-LAST:event_Botao_editar_tarefaActionPerformed

    private void datainicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datainicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datainicialActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void codigotarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigotarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigotarefaActionPerformed

    private void Tabela_tarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_tarefasMouseClicked
        // TODO add your handling code here:
         if(Tabela_tarefas.getSelectedRow() != -1){
             
             codigotarefa.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 0).toString());
             descricao.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 1).toString());
             datainicial.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 2).toString());
             datafinal.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 3).toString());
             nomecliente.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 4).toString());
//             nomeuser.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 5).toString());
             estado.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 6).toString());
             observacoes.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 7).toString());
          
          }
    }//GEN-LAST:event_Tabela_tarefasMouseClicked

    private void Tabela_tarefasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_tarefasKeyReleased
        // TODO add your handling code here:
        if(Tabela_tarefas.getSelectedRow() != -1){
             
             codigotarefa.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 0).toString());
             descricao.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 1).toString());
             datainicial.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 2).toString());
             datafinal.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 3).toString());
             nomecliente.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 4).toString());
            // nomeuser.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 5).toString());
             estado.setSelectedItem(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 6).toString());
             observacoes.setText(Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 7).toString());
          
          }
    }//GEN-LAST:event_Tabela_tarefasKeyReleased

    private void Botao_apagar_tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_apagar_tarefaActionPerformed
        // TODO add your handling code here:
     if(Tabela_tarefas.getSelectedRow() != -1){
         
          Tarefa task = new Tarefa();
            TarefaDAO taskDAO = new TarefaDAO();
            
            task.setCodTarefa((int) Tabela_tarefas.getValueAt(Tabela_tarefas.getSelectedRow(), 0));
            taskDAO.ExcluirTarefa(task);
            
            readJTable();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
                                               
    }//GEN-LAST:event_Botao_apagar_tarefaActionPerformed

    private void Botao_procurar_tarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_procurar_tarefasActionPerformed
        // TODO add your handling code here:
        readJTable_for_desc(Campo_pesquisa_tarefa.getText());
    }//GEN-LAST:event_Botao_procurar_tarefasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_apagar_tarefa;
    private javax.swing.JButton Botao_editar_tarefa;
    private javax.swing.JButton Botao_procurar_tarefas;
    private javax.swing.JTextField Campo_pesquisa_tarefa;
    private javax.swing.JLabel Label_cliente;
    private javax.swing.JLabel Label_datafinal;
    private javax.swing.JLabel Label_datainicio;
    private javax.swing.JLabel Label_descricao;
    private javax.swing.JLabel Label_estado;
    private javax.swing.JLabel Label_observacoes;
    private javax.swing.JPanel Painel_consulta_tarefas;
    private javax.swing.JTable Tabela_tarefas;
    private javax.swing.JTextField codigotarefa;
    private javax.swing.JFormattedTextField datafinal;
    private javax.swing.JFormattedTextField datainicial;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<Object> nomecliente;
    private javax.swing.JTextArea observacoes;
    // End of variables declaration//GEN-END:variables
}
