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
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        BackgroundMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CadastroMenu = new javax.swing.JMenu();
        ClienteMenu = new javax.swing.JMenuItem();
        ServicoMenu = new javax.swing.JMenuItem();
        UsuarioMenu = new javax.swing.JMenuItem();
        OperacaoMenu = new javax.swing.JMenu();
        AgendaMenu = new javax.swing.JMenuItem();
        RelatorioMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/background-menu.png"))); // NOI18N
        getContentPane().add(BackgroundMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(197, 30));

        CadastroMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/planning-icon-24.png"))); // NOI18N
        CadastroMenu.setText("Cadastro");

        ClienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/user-icon-24.png"))); // NOI18N
        ClienteMenu.setText("Cliente");
        CadastroMenu.add(ClienteMenu);

        ServicoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/servico-icon-24.png"))); // NOI18N
        ServicoMenu.setText("Serviço");
        CadastroMenu.add(ServicoMenu);

        UsuarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/group-users-icon-24.png"))); // NOI18N
        UsuarioMenu.setText("Usuário");
        CadastroMenu.add(UsuarioMenu);

        jMenuBar1.add(CadastroMenu);

        OperacaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/setting-icon-24.png"))); // NOI18N
        OperacaoMenu.setText("Operação");

        AgendaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/plus-icon-24.png"))); // NOI18N
        AgendaMenu.setText("Agendar");
        OperacaoMenu.add(AgendaMenu);

        jMenuBar1.add(OperacaoMenu);

        RelatorioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/relatorio-icon-24.png"))); // NOI18N
        RelatorioMenu.setText("Relatório");
        jMenuBar1.add(RelatorioMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgendaMenu;
    private javax.swing.JLabel BackgroundMenu;
    private javax.swing.JMenu CadastroMenu;
    private javax.swing.JMenuItem ClienteMenu;
    private javax.swing.JMenu OperacaoMenu;
    private javax.swing.JMenu RelatorioMenu;
    private javax.swing.JMenuItem ServicoMenu;
    private javax.swing.JMenuItem UsuarioMenu;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}