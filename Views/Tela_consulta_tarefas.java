/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

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

        setClosable(true);
        setMaximizable(true);
        setTitle("Consulta de Tarefas");

        Painel_consulta_tarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Botao_procurar_tarefas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_procurar_tarefas.setText("Procurar");

        Campo_pesquisa_tarefa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        Tabela_tarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Data Inicial", "Data Final", "Cliente", "Técnico", "Estado", "Observações"
            }
        ));
        jScrollPane1.setViewportView(Tabela_tarefas);

        Botao_editar_tarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_editar_tarefa.setText("Editar");
        Botao_editar_tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_editar_tarefaActionPerformed(evt);
            }
        });

        Botao_apagar_tarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Botao_apagar_tarefa.setText("Apagar");

        javax.swing.GroupLayout Painel_consulta_tarefasLayout = new javax.swing.GroupLayout(Painel_consulta_tarefas);
        Painel_consulta_tarefas.setLayout(Painel_consulta_tarefasLayout);
        Painel_consulta_tarefasLayout.setHorizontalGroup(
            Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_consulta_tarefasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_consulta_tarefasLayout.createSequentialGroup()
                                .addComponent(Botao_procurar_tarefas)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_pesquisa_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_consulta_tarefasLayout.createSequentialGroup()
                                .addComponent(Botao_editar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao_apagar_tarefa)
                                .addGap(30, 30, 30))))))
        );
        Painel_consulta_tarefasLayout.setVerticalGroup(
            Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_tarefasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_procurar_tarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_pesquisa_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(Painel_consulta_tarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_editar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_apagar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addComponent(Painel_consulta_tarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_editar_tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_editar_tarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_editar_tarefaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_apagar_tarefa;
    private javax.swing.JButton Botao_editar_tarefa;
    private javax.swing.JButton Botao_procurar_tarefas;
    private javax.swing.JTextField Campo_pesquisa_tarefa;
    private javax.swing.JPanel Painel_consulta_tarefas;
    private javax.swing.JTable Tabela_tarefas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}