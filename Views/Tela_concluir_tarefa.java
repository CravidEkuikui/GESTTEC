/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.bean.Tarefa;
import Model.dao.TarefaDAO;

/**
 *
 * @author Cravid Ekuikui
 */
public class Tela_concluir_tarefa extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tela_concluir_tarefa
     */
    public Tela_concluir_tarefa() {
        initComponents();
        TarefaDAO task = new TarefaDAO();

        for (Tarefa t : task.consultaTarefas_por_concluir()) {
            descricao.addItem(t);
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

        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Painel_conclusao = new javax.swing.JPanel();
        Label_selecionar_tarefa = new javax.swing.JLabel();
        Label_observacoes = new javax.swing.JLabel();
        Label_selecionar_estado = new javax.swing.JLabel();
        descricao = new javax.swing.JComboBox<>();
        estado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacoes = new javax.swing.JTextArea();
        Botao_concluir = new javax.swing.JButton();
        Botao_cancelar_conclusao = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setTitle("Concluir Tarefa");

        Painel_conclusao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_selecionar_tarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_selecionar_tarefa.setText("Selecione a Tarefa a Concluir");

        Label_observacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_observacoes.setText("Observações");

        Label_selecionar_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_selecionar_estado.setText("Selecione o Estado Final");

        descricao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descricao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Tarefa", " " }));

        estado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indique o estado", " ", "Aberto", "Pendente", "Cancelado", "Concluído" }));

        observacoes.setColumns(20);
        observacoes.setRows(5);
        jScrollPane1.setViewportView(observacoes);

        Botao_concluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_concluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/accept.png"))); // NOI18N
        Botao_concluir.setText("Concluir");
        Botao_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_concluirActionPerformed(evt);
            }
        });

        Botao_cancelar_conclusao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_cancelar_conclusao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        Botao_cancelar_conclusao.setText("Cancelar");
        Botao_cancelar_conclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_cancelar_conclusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_conclusaoLayout = new javax.swing.GroupLayout(Painel_conclusao);
        Painel_conclusao.setLayout(Painel_conclusaoLayout);
        Painel_conclusaoLayout.setHorizontalGroup(
            Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                        .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_selecionar_tarefa)
                            .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                                .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_observacoes)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_selecionar_estado))
                                    .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                                        .addComponent(Botao_concluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao_cancelar_conclusao)))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        Painel_conclusaoLayout.setVerticalGroup(
            Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Label_selecionar_tarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_observacoes)
                    .addComponent(Label_selecionar_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Painel_conclusaoLayout.createSequentialGroup()
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Painel_conclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao_cancelar_conclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_conclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_conclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_cancelar_conclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_cancelar_conclusaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Botao_cancelar_conclusaoActionPerformed

    private void Botao_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_concluirActionPerformed
        // TODO add your handling code here:
        Tarefa Task = new Tarefa();
        TarefaDAO Task_dao = new TarefaDAO();

        Tarefa cbtask = (Tarefa) descricao.getSelectedItem();
        int codtarefa = cbtask.getCodTarefa();
        String E = (String) estado.getSelectedItem();

        Task.setEstado(E);
        Task.setObservacoes(observacoes.getText());
        Task.setCodTarefa(codtarefa);

        Task_dao.ConcluirTarefa(Task);

        descricao.setSelectedIndex(0);
        observacoes.setText("");
        estado.setSelectedIndex(0);

    }//GEN-LAST:event_Botao_concluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_cancelar_conclusao;
    private javax.swing.JButton Botao_concluir;
    private javax.swing.JLabel Label_observacoes;
    private javax.swing.JLabel Label_selecionar_estado;
    private javax.swing.JLabel Label_selecionar_tarefa;
    private javax.swing.JPanel Painel_conclusao;
    private javax.swing.JComboBox<Object> descricao;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacoes;
    // End of variables declaration//GEN-END:variables
}
