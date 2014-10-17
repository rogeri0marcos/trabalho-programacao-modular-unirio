/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.beans.PropertyVetoException;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;

/**
 *
 * @author Felipe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaPrincipal() {
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

        areaTrabalho = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuImportar = new javax.swing.JMenu();
        importarProdutos = new javax.swing.JMenuItem();
        importarPrecosProdutos = new javax.swing.JMenuItem();
        importarVendedores = new javax.swing.JMenuItem();
        importarVendas = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        consultarTotaisVendasComissoesVendedorMes = new javax.swing.JMenuItem();
        consultarTotaisVendasComissoesVendedorAcumulado = new javax.swing.JMenuItem();
        consultarMediasVendasComissoesVendedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        menuImportar.setText("Importar");

        importarProdutos.setText("Produtos");
        importarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarProdutosActionPerformed(evt);
            }
        });
        menuImportar.add(importarProdutos);

        importarPrecosProdutos.setText("Preços dos Produtos");
        importarPrecosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarPrecosProdutosActionPerformed(evt);
            }
        });
        menuImportar.add(importarPrecosProdutos);

        importarVendedores.setText("Vendedores");
        importarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarVendedoresActionPerformed(evt);
            }
        });
        menuImportar.add(importarVendedores);

        importarVendas.setText("Vendas");
        importarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarVendasActionPerformed(evt);
            }
        });
        menuImportar.add(importarVendas);

        barraMenu.add(menuImportar);

        menuConsultar.setText("Consultar");

        consultarTotaisVendasComissoesVendedorMes.setText("Totais de Vendas e Comissões por Vendedor / Mês");
        consultarTotaisVendasComissoesVendedorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarTotaisVendasComissoesVendedorMesActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarTotaisVendasComissoesVendedorMes);

        consultarTotaisVendasComissoesVendedorAcumulado.setText("Totais de Vendas e Comissões por Vendedor / Acumulado");
        consultarTotaisVendasComissoesVendedorAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarTotaisVendasComissoesVendedorAcumuladoActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarTotaisVendasComissoesVendedorAcumulado);

        consultarMediasVendasComissoesVendedor.setText("Médias de Vendas e Comissões por Vendedor");
        consultarMediasVendasComissoesVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMediasVendasComissoesVendedorActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarMediasVendasComissoesVendedor);

        barraMenu.add(menuConsultar);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarProdutosActionPerformed
        exibirSeletorArquivo("Importar Produtos");
    }//GEN-LAST:event_importarProdutosActionPerformed

    private void importarPrecosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarPrecosProdutosActionPerformed
        exibirSeletorArquivo("Importar Preços dos Produtos");
    }//GEN-LAST:event_importarPrecosProdutosActionPerformed

    private void importarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarVendedoresActionPerformed
        exibirSeletorArquivo("Importar Vendedores");
    }//GEN-LAST:event_importarVendedoresActionPerformed

    private void importarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarVendasActionPerformed
        exibirSeletorArquivo("Importar Vendas");
    }//GEN-LAST:event_importarVendasActionPerformed

    private void consultarTotaisVendasComissoesVendedorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarTotaisVendasComissoesVendedorMesActionPerformed
        TelaTotaisVendasComissoesPorMes telaTotaisVendasComissoesPorMes = new TelaTotaisVendasComissoesPorMes();
        exibirJanelaConsulta(telaTotaisVendasComissoesPorMes);
    }//GEN-LAST:event_consultarTotaisVendasComissoesVendedorMesActionPerformed

    private void consultarTotaisVendasComissoesVendedorAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarTotaisVendasComissoesVendedorAcumuladoActionPerformed
        TelaTotaisVendasComissoesAcumulado telaTotaisVendasComissoesAcumulado = new TelaTotaisVendasComissoesAcumulado();
        exibirJanelaConsulta(telaTotaisVendasComissoesAcumulado);
    }//GEN-LAST:event_consultarTotaisVendasComissoesVendedorAcumuladoActionPerformed

    private void consultarMediasVendasComissoesVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMediasVendasComissoesVendedorActionPerformed
        TelaMediasVendasComissoes telaMediasVendasComissoes = new TelaMediasVendasComissoes();
        exibirJanelaConsulta(telaMediasVendasComissoes);
    }//GEN-LAST:event_consultarMediasVendasComissoesVendedorActionPerformed

     
    private void exibirSeletorArquivo(String tituloJanela){
        JFileChooser seletorArquivo = criarSeletorArquivo(tituloJanela);
        seletorArquivo.showOpenDialog(this);
    }
    
     private JFileChooser criarSeletorArquivo(String tituloJanela){
        JFileChooser seletorArquivo = new JFileChooser();
        seletorArquivo.setMultiSelectionEnabled(false);
        seletorArquivo.setDialogTitle(tituloJanela);
        return seletorArquivo;
    }
    
    private void exibirJanelaConsulta(JInternalFrame janelaInterna){
        areaTrabalho.add(janelaInterna);
        janelaInterna.setVisible(true);
        try {
            janelaInterna.setMaximum(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem consultarMediasVendasComissoesVendedor;
    private javax.swing.JMenuItem consultarTotaisVendasComissoesVendedorAcumulado;
    private javax.swing.JMenuItem consultarTotaisVendasComissoesVendedorMes;
    private javax.swing.JMenuItem importarPrecosProdutos;
    private javax.swing.JMenuItem importarProdutos;
    private javax.swing.JMenuItem importarVendas;
    private javax.swing.JMenuItem importarVendedores;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuImportar;
    // End of variables declaration//GEN-END:variables
}
