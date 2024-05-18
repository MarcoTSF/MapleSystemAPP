/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author mtsfs
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        TabelaAgenda = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ObservacaoAgenda = new javax.swing.JScrollPane();
        Observacao1 = new javax.swing.JTextArea();
        CampoHora = new javax.swing.JFormattedTextField();
        CampoDataEntrega = new javax.swing.JFormattedTextField();
        CampoDataReserva = new javax.swing.JFormattedTextField();
        CampoServico = new javax.swing.JComboBox<>();
        CampoCliente = new javax.swing.JComboBox<>();
        CampoId = new javax.swing.JTextField();
        TextHora = new javax.swing.JLabel();
        TextDataEntrega = new javax.swing.JLabel();
        TextDataReserva = new javax.swing.JLabel();
        TextServico = new javax.swing.JLabel();
        TextCliente = new javax.swing.JLabel();
        TextId = new javax.swing.JLabel();
        TextAgenda = new javax.swing.JLabel();
        PainelAgenda = new javax.swing.JLabel();
        BackgroundAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Serviço", "Data Reserva", "Data Entrega", "Hora", "Observação"
            }
        ));
        TabelaAgenda.setViewportView(Tabela1);

        getContentPane().add(TabelaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 630, 120));

        jButton1.setBackground(new java.awt.Color(164, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agendar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 190, 30));

        Observacao1.setColumns(20);
        Observacao1.setRows(5);
        ObservacaoAgenda.setViewportView(Observacao1);

        getContentPane().add(ObservacaoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 260, 130));
        getContentPane().add(CampoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 150, -1));
        getContentPane().add(CampoDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 150, -1));
        getContentPane().add(CampoDataReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, -1));

        CampoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CampoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, -1));

        CampoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CampoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, -1));

        CampoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdActionPerformed(evt);
            }
        });
        getContentPane().add(CampoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 150, -1));

        TextHora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextHora.setForeground(new java.awt.Color(255, 255, 255));
        TextHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextHora.setText("Hora");
        getContentPane().add(TextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, -1));

        TextDataEntrega.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextDataEntrega.setForeground(new java.awt.Color(255, 255, 255));
        TextDataEntrega.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextDataEntrega.setText("Data Entrega");
        getContentPane().add(TextDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, -1));

        TextDataReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextDataReserva.setForeground(new java.awt.Color(255, 255, 255));
        TextDataReserva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextDataReserva.setText("Data Reserva");
        getContentPane().add(TextDataReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, -1));

        TextServico.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextServico.setForeground(new java.awt.Color(255, 255, 255));
        TextServico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextServico.setText("Serviço");
        getContentPane().add(TextServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, -1));

        TextCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextCliente.setForeground(new java.awt.Color(255, 255, 255));
        TextCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextCliente.setText("Cliente");
        getContentPane().add(TextCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, -1));

        TextId.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TextId.setForeground(new java.awt.Color(255, 255, 255));
        TextId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextId.setText("ID");
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        TextAgenda.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        TextAgenda.setForeground(new java.awt.Color(255, 255, 255));
        TextAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextAgenda.setText("Agenda");
        getContentPane().add(TextAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 70, 730, -1));

        PainelAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PainelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/agenda-painel-fundo.png"))); // NOI18N
        getContentPane().add(PainelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        BackgroundAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/background-menu-clean.png"))); // NOI18N
        getContentPane().add(BackgroundAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundAgenda;
    private javax.swing.JComboBox<String> CampoCliente;
    private javax.swing.JFormattedTextField CampoDataEntrega;
    private javax.swing.JFormattedTextField CampoDataReserva;
    private javax.swing.JFormattedTextField CampoHora;
    private javax.swing.JTextField CampoId;
    private javax.swing.JComboBox<String> CampoServico;
    private javax.swing.JTextArea Observacao1;
    private javax.swing.JScrollPane ObservacaoAgenda;
    private javax.swing.JLabel PainelAgenda;
    private javax.swing.JTable Tabela1;
    private javax.swing.JScrollPane TabelaAgenda;
    private javax.swing.JLabel TextAgenda;
    private javax.swing.JLabel TextCliente;
    private javax.swing.JLabel TextDataEntrega;
    private javax.swing.JLabel TextDataReserva;
    private javax.swing.JLabel TextHora;
    private javax.swing.JLabel TextId;
    private javax.swing.JLabel TextServico;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}