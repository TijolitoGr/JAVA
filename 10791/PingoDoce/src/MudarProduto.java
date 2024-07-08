import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JTextField;

public class MudarProduto extends javax.swing.JInternalFrame {
    Connection conn;
    
    private final int idAlteracao;
    
    public MudarProduto(int IdAlteracao){
            
        initComponents();
        this.idAlteracao = IdAlteracao;
        
        if (idAlteracao != 0) {
            JTextField myTitle = new JTextField("Alterar Produto");
            this.setTitle(myTitle.getText());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        produtoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        precoProduto = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Novo Produto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        produtoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Preco:");

        precoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(produtoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(precoProduto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(produtoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {   /* Botao de Guardar NORMAL */
            String host = "jdbc:mysql://localhost:3306/mcabral_PingoDoce";
            String uNome = "mcabral";
            String uPass = "6669mcabral";
            
            conn = DriverManager.getConnection(host, uNome, uPass);
            
            if (idAlteracao == 0) { 
            String SQL = "INSERT INTO produtos (nomeProduto, precoProduto) VALUES (?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(SQL);
            
            stmt.setString(1, this.produtoNome.getText());
            stmt.setString(2, this.precoProduto.getText());
            
            stmt.execute();
            
            stmt.close();
            conn.close();
            
            this.dispose();
            
            } else if (idAlteracao != 0) {
                /* Botao de Guardar não NORMAL (Alterar Clientes) */
                String sql = "UPDATE produtos SET nomeProduto = ?, precoProduto = ? WHERE idProduto = ?";
                
                PreparedStatement stmt = conn.prepareStatement(sql);
                
                stmt.setString(1, this.produtoNome.getText());
                stmt.setString(2, this.precoProduto.getText());
                stmt.setInt(3, idAlteracao);
                
                stmt.execute();
                
                stmt.close();
                conn.close();
                
                this.dispose();
            }
            
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void produtoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoNomeActionPerformed

    private void precoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField precoProduto;
    private javax.swing.JTextField produtoNome;
    // End of variables declaration//GEN-END:variables
}
