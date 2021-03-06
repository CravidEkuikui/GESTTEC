/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.bean.Clientes;
import Model.dao.ClientesDAO;

/**
 *
 * @author Cravid Ekuikui
 */
public class Tela_cadastro_clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tela_cadastro_clientes
     */
    public Tela_cadastro_clientes() {
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

        Painel_consulta_cliente = new javax.swing.JPanel();
        Label_nome_cliente = new javax.swing.JLabel();
        Label_nif_cliente = new javax.swing.JLabel();
        Label_casa = new javax.swing.JLabel();
        Label_rua = new javax.swing.JLabel();
        Label_telefone = new javax.swing.JLabel();
        Label_municipio = new javax.swing.JLabel();
        Label_bairro = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        nifcliente = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        casacliente = new javax.swing.JTextField();
        municipio = new javax.swing.JTextField();
        ruacliente = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        Salvar_cliente = new javax.swing.JButton();
        Cancelar_cliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Clientes");

        Painel_consulta_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_nome_cliente.setText("Nome do Cliente");

        Label_nif_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_nif_cliente.setText("NIF Cliente");

        Label_casa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_casa.setText("Casa Nº");

        Label_rua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_rua.setText("Rua");

        Label_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_telefone.setText("Telefone");

        Label_municipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_municipio.setText("Município");

        Label_bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_bairro.setText("Bairro");

        nomecliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        nifcliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        telefone.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        casacliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        municipio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        ruacliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        bairro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        Salvar_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Salvar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disk.png"))); // NOI18N
        Salvar_cliente.setText("Salvar");
        Salvar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar_clienteActionPerformed(evt);
            }
        });

        Cancelar_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cancelar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        Cancelar_cliente.setText("Cancelar");
        Cancelar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_consulta_clienteLayout = new javax.swing.GroupLayout(Painel_consulta_cliente);
        Painel_consulta_cliente.setLayout(Painel_consulta_clienteLayout);
        Painel_consulta_clienteLayout.setHorizontalGroup(
            Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                        .addComponent(Label_nome_cliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                        .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Salvar_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomecliente, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                                            .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                                                    .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Label_nif_cliente)
                                                        .addComponent(Label_telefone))
                                                    .addGap(228, 228, 228))
                                                .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                                                    .addComponent(telefone)
                                                    .addGap(151, 151, 151)))
                                            .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Label_casa)
                                                .addComponent(Label_municipio)
                                                .addComponent(casacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(nifcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ruacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_rua)
                                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_bairro))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        Painel_consulta_clienteLayout.setVerticalGroup(
            Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_consulta_clienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Label_nome_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nif_cliente)
                    .addComponent(Label_casa)
                    .addComponent(Label_rua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nifcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_municipio)
                    .addComponent(Label_bairro)
                    .addComponent(Label_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Painel_consulta_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_consulta_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_consulta_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancelar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_clienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Cancelar_clienteActionPerformed

    private void Salvar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar_clienteActionPerformed
        // TODO add your handling code here:
        Clientes cli = new Clientes();
        ClientesDAO cli_dao = new ClientesDAO();

        cli.setNomeCliente(nomecliente.getText());
        cli.setNifCliente(nifcliente.getText());
        cli.setTelefone(Integer.parseInt(telefone.getText()));
        cli.setCasa(casacliente.getText());
        cli.setRua(ruacliente.getText());
        cli.setBairro(bairro.getText());
        cli.setMunicipio(municipio.getText());

        cli_dao.criarCliente(cli);

        nomecliente.setText("");
        nifcliente.setText("");
        telefone.setText("");
        casacliente.setText("");
        ruacliente.setText("");
        bairro.setText("");
        municipio.setText("");

    }//GEN-LAST:event_Salvar_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar_cliente;
    private javax.swing.JLabel Label_bairro;
    private javax.swing.JLabel Label_casa;
    private javax.swing.JLabel Label_municipio;
    private javax.swing.JLabel Label_nif_cliente;
    private javax.swing.JLabel Label_nome_cliente;
    private javax.swing.JLabel Label_rua;
    private javax.swing.JLabel Label_telefone;
    private javax.swing.JPanel Painel_consulta_cliente;
    private javax.swing.JButton Salvar_cliente;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField casacliente;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField nifcliente;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTextField ruacliente;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
