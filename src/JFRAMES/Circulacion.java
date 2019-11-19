/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFRAMES;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import pfpoo.Bus;
import pfpoo.Estacion;
import pfpoo.Mapa;
import pfpoo.Ruta;
import pfpoo.Transmetro;

/**
 *
 * @author TheLokestraps
 */
public class Circulacion extends javax.swing.JDialog  {

    /**
     * Creates new form Circulacion
     */
    ImageIcon Resize,Resize1,Resize2,Resize3,Resize4,Resize5,ResizeBoton;    
    
    
    public Circulacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
       initComponents();
              
       Back.setBackground(new Color(45,22,0,69));
       
       SetearIconos();
       this.boton.setIcon(ResizeBoton);
       
       boton.setBorderPainted(false);
       boton.setContentAreaFilled(false);
       boton.setFocusPainted(false);
       boton.setOpaque(false);
       
       jLabel2.setBackground(new Color(16,208,60,180));
       jLabel3.setBackground(new Color(16,208,60,180));
       jLabel1.setBackground(new Color(16,208,60,180));
               
               
       Timer s = new Timer(50, new ActionListener(){
           int i = 1;
           public void actionPerformed(ActionEvent e){
                if(i == 1)Anim.setIcon(Resize1);
                if(i == 2)Anim.setIcon(Resize2);
                if(i == 3)Anim.setIcon(Resize3);
                if(i == 4)Anim.setIcon(Resize4);
            
                if(i > 4){
                    i = 0;
                }
            
                i++;
           }
       });s.start();
       
       
       
       
        Timer t = new Timer(250, new ActionListener(){
        int i = 1;
        @Override
        public void actionPerformed(ActionEvent e) {
           if(Anim.getX() >= 575){
               ((Timer)e.getSource()).stop();
           }
            
            
            Anim.setLocation((Anim.getX()+1), Anim.getY());
            Anim.revalidate();
            Anim.repaint();
            
            
//            if(i == 1)Anim.setIcon(Resize1);
//            if(i == 2)Anim.setIcon(Resize2);
//            if(i == 3)Anim.setIcon(Resize3);
//            if(i == 4)Anim.setIcon(Resize4);
//            
//            if(i > 4){
//                i = 0;
//            }
//            
//            i++;
             
//            System.out.println(SwingUtilities.isEventDispatchThread());
                
         }
            });
            t.start();
        
        this.tf_estacion.setEditable(false);
        this.tf_ruta.setEditable(false);
        this.tf_time.setEditable(false);
            
            
            
    }
        
    
    
    
    
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anim = new javax.swing.JLabel();
        goal = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_estacion = new javax.swing.JTextField();
        tf_time = new javax.swing.JTextField();
        tf_ruta = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        Anim.setText("Animation");
        Anim.setDoubleBuffered(true);
        getContentPane().add(Anim);
        Anim.setBounds(60, 140, 100, 70);

        goal.setText("Llegada");
        getContentPane().add(goal);
        goal.setBounds(670, 130, 80, 100);

        Back.setBackground(new java.awt.Color(153, 255, 0));
        Back.setOpaque(true);
        getContentPane().add(Back);
        Back.setBounds(30, 110, 730, 130);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Esperando ruta");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 420, 150, 20);

        jLabel2.setBackground(new java.awt.Color(16, 208, 60));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Tiempo de llegada ");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 280, 150, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Estacion");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 350, 150, 20);

        tf_estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_estacionActionPerformed(evt);
            }
        });
        getContentPane().add(tf_estacion);
        tf_estacion.setBounds(240, 350, 180, 30);

        tf_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timeActionPerformed(evt);
            }
        });
        getContentPane().add(tf_time);
        tf_time.setBounds(240, 280, 140, 30);

        tf_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rutaActionPerformed(evt);
            }
        });
        getContentPane().add(tf_ruta);
        tf_ruta.setBounds(240, 420, 180, 30);

        boton.setBorder(null);
        boton.setBorderPainted(false);
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton);
        boton.setBounds(540, 410, 110, 90);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2D/1543588021_056671_1543588194_noticia_normal.jpg"))); // NOI18N
        Background.setText("dadsad");
        Background.setMaximumSize(new java.awt.Dimension(800, 600));
        Background.setMinimumSize(new java.awt.Dimension(800, 600));
        Background.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(Background);
        Background.setBounds(0, -10, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_estacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_estacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_estacionActionPerformed

    private void tf_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_timeActionPerformed

    private void tf_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_rutaActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
        String estacion = tf_estacion.getText();
        String ruta = tf_ruta.getText();
        if (Mapa.EstacionExisteNombre(estacion) && Mapa.rutaExiste(ruta)) {
            Ruta laRuta = Mapa.buscarRuta(ruta);
            String sol = "";
            Estacion laEstacion = Mapa.buscarEstacionConNombre(ruta);
            ArrayList<Bus> buses = Mapa.busesProximos(laEstacion);
            for (int i = 0; i < buses.size(); i++) {
                sol = sol + "\n"+buses.get(i).ID;
            }
            if (sol.isEmpty()) {
                JOptionPane.showMessageDialog(null,"No hay ningun bus cercano");
            }else{
                JOptionPane.showMessageDialog(null,sol);
            
            }
            Transmetro.avanzarBuses();
                
        }

    }//GEN-LAST:event_botonActionPerformed

    
    
    private void SetearIconos(){
        ImageIcon LaImg = new ImageIcon("src\\Imagenes2D\\1543588021_056671_1543588194_noticia_normal.jpg");
        Resize = new ImageIcon(LaImg.getImage().getScaledInstance(Background.getWidth(),Background.getHeight(),Image.SCALE_SMOOTH));
        this.Background.setIcon(Resize);
        
        ImageIcon BUS1 = new ImageIcon("src\\Imagenes2D\\bus01.png");
        Resize1 = new ImageIcon(BUS1.getImage().getScaledInstance(Anim.getWidth(),Anim.getHeight(),Image.SCALE_SMOOTH));
        this.Anim.setIcon(Resize1);
        
        ImageIcon BUS2 = new ImageIcon("src\\Imagenes2D\\bus02.png");
        Resize2 = new ImageIcon(BUS2.getImage().getScaledInstance(Anim.getWidth(),Anim.getHeight(),Image.SCALE_SMOOTH));
        
        ImageIcon BUS3 = new ImageIcon("src\\Imagenes2D\\bus03.png");
        Resize3 = new ImageIcon(BUS3.getImage().getScaledInstance(Anim.getWidth(),Anim.getHeight(),Image.SCALE_SMOOTH));
        
        ImageIcon BUS4 = new ImageIcon("src\\Imagenes2D\\bus04.png");
        Resize4 = new ImageIcon(BUS4.getImage().getScaledInstance(Anim.getWidth(),Anim.getHeight(),Image.SCALE_SMOOTH));
        
        ImageIcon Golazo = new ImageIcon("src\\Imagenes2D\\images.png");
        Resize5 = new ImageIcon(Golazo.getImage().getScaledInstance(goal.getWidth(),goal.getHeight(),Image.SCALE_SMOOTH));
        goal.setIcon(Resize5);
        
        ImageIcon Buton = new ImageIcon("src\\Imagenes2D\\boton.png");
        ResizeBoton = new ImageIcon(Buton.getImage().getScaledInstance(boton.getWidth(),boton.getHeight(),Image.SCALE_SMOOTH));
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
            java.util.logging.Logger.getLogger(Circulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Circulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Circulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Circulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {Circulacion dialog = new Circulacion(new javax.swing.JFrame(), true);
                
               dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anim;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton boton;
    private javax.swing.JLabel goal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf_estacion;
    private javax.swing.JTextField tf_ruta;
    private javax.swing.JTextField tf_time;
    // End of variables declaration//GEN-END:variables
}
