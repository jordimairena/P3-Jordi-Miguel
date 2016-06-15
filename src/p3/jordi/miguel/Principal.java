/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.jordi.miguel;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jordi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("./togo.jpg").getImage().getScaledInstance(lbl_togo.getWidth(), lbl_togo.getHeight(), Image.SCALE_DEFAULT));
        lbl_togo.setIcon(imageIcon);
        Scanner sc = null;
        File archivo2 = null;
        try {
            archivo2 = new File("./torres.txt");
            sc = new Scanner(archivo2);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                Torre torre1 = new Torre(sc.next(), sc.next());
                torres.insert(torre1, size2);
                size2++;
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
        torres.Print_Lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_mapa = new javax.swing.JDialog();
        jd_crear_torre = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nom_lugar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_repetidor = new javax.swing.JComboBox();
        jd_crear_coneccion = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_distancia = new javax.swing.JTextField();
        btn_crear_conexion = new javax.swing.JButton();
        cb_lugar1 = new javax.swing.JComboBox();
        cb_lugar2 = new javax.swing.JComboBox();
        jcb_tipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ancho_de_banda = new javax.swing.JTextField();
        lbl_togo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jd_mapaLayout = new javax.swing.GroupLayout(jd_mapa.getContentPane());
        jd_mapa.getContentPane().setLayout(jd_mapaLayout);
        jd_mapaLayout.setHorizontalGroup(
            jd_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_mapaLayout.setVerticalGroup(
            jd_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel5.setText("Crear Nueva Torre");

        jLabel6.setText("Nombre:");

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de Repetidor:");

        cb_repetidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Domestica", "Empresarial", "Celular", "Dedicada" }));

        javax.swing.GroupLayout jd_crear_torreLayout = new javax.swing.GroupLayout(jd_crear_torre.getContentPane());
        jd_crear_torre.getContentPane().setLayout(jd_crear_torreLayout);
        jd_crear_torreLayout.setHorizontalGroup(
            jd_crear_torreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_torreLayout.createSequentialGroup()
                .addGroup(jd_crear_torreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_crear_torreLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel5))
                    .addGroup(jd_crear_torreLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton2))
                    .addGroup(jd_crear_torreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(txt_nom_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crear_torreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_repetidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jd_crear_torreLayout.setVerticalGroup(
            jd_crear_torreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_torreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_torreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nom_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_torreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_repetidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );

        jLabel2.setText("Crear Nueva Conexion");

        jLabel3.setText("Nuevo Lugar:");

        jLabel4.setText("Lugar que esta conectado:");

        jLabel7.setText("Distancia entre ambos:");

        btn_crear_conexion.setText("Agregar");
        btn_crear_conexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crear_conexionMouseClicked(evt);
            }
        });

        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cobre", "Fibra Optica" }));

        jLabel1.setText("Tipo Cable:");

        jLabel8.setText("Ancho de Banda:");

        javax.swing.GroupLayout jd_crear_coneccionLayout = new javax.swing.GroupLayout(jd_crear_coneccion.getContentPane());
        jd_crear_coneccion.getContentPane().setLayout(jd_crear_coneccionLayout);
        jd_crear_coneccionLayout.setHorizontalGroup(
            jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(86, 86, 86)
                                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_distancia)
                                    .addComponent(cb_lugar1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_lugar2, 0, 140, Short.MAX_VALUE)))
                            .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(69, 69, 69)
                                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_tipo, 0, 140, Short.MAX_VALUE)
                                    .addComponent(txt_ancho_de_banda)))))
                    .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btn_crear_conexion))
                    .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jd_crear_coneccionLayout.setVerticalGroup(
            jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_coneccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_lugar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crear_coneccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ancho_de_banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_crear_conexion)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_togo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_togo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_togo.setMaximumSize(new java.awt.Dimension(3120, 1200));
        lbl_togo.setMinimumSize(new java.awt.Dimension(3120, 1200));

        jMenu1.setText("File");

        jMenuItem1.setText("Cargar Mapa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Torre de Conexion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Union entre Torres");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ver");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Mapa de Torres");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Floyd");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Prim");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_togo, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_togo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Scanner sc = null;
        File archivo = null;
        try {
            archivo = new File("./mapa.txt");
            sc = new Scanner(archivo);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                int distancia = sc.nextInt();
                double capacidad = sc.nextDouble();
                String tipo = sc.next();
                Torre lugar1 = new Torre(sc.next());
                Torre lugar2 = new Torre(sc.next());
//                for (int i = 0; i < size; i++) {
//                    if (lugar1.getNombre().contentEquals(lista_torres.get(i).getNombre())) {
//                       //Torre lugar3 = ((lista_torres.get(i).getNombre()));
//                       break;
//                    }
//                }
//                for (int i = 0; i < size; i++) {
//                    if (lugar2.getNombre().contentEquals(lista_torres.get(i).getNombre())) {
//                       lugar2 = (Torre)lista_torres.get(i);
//                       break;
//                    }
//                }
                if (size == 0) {
                    Relacion_Torres m = new Relacion_Torres(distancia, capacidad, tipo, lugar1, lugar2);
                    relaciones.insert(m, size);
                    size++;
                    ContadorNodos++;
                } else if (relaciones.get(size - 1).getPunto1().getNombre().equals(lugar1.getNombre())) {
                    Relacion_Torres m = new Relacion_Torres(distancia, capacidad, tipo, relaciones.get(size - 1).getPunto1(), lugar2);
                    relaciones.insert(m, size);
                    size++;
                    ContadorNodos++;
                } else if (relaciones.get(size - 1).getPunto2().getNombre().equals(lugar1.getNombre())) {
                    Relacion_Torres m = new Relacion_Torres(distancia, capacidad, tipo, relaciones.get(size - 1).getPunto2(), lugar2);
                    relaciones.insert(m, size);
                    size++;
                    ContadorNodos++;
                } else if (relaciones.get(size - 1).getPunto1().getNombre().equals(lugar2.getNombre())) {
                    Relacion_Torres m = new Relacion_Torres(distancia, capacidad, tipo, relaciones.get(size - 1).getPunto1(), lugar1);
                    relaciones.insert(m, size);
                    size++;
                    ContadorNodos++;
                } else if (relaciones.get(size - 1).getPunto2().getNombre().equals(lugar2.getNombre())) {
                    Relacion_Torres m = new Relacion_Torres(distancia, capacidad, tipo, relaciones.get(size - 1).getPunto2(), lugar1);
                    relaciones.insert(m, size);
                    size++;
                    ContadorNodos++;
                }
            }
            relaciones.Print_Lista();
            JOptionPane.showMessageDialog(null, "Archivo Cargado Correctamente");
            System.out.println(ContadorNodos);
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
// 
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jd_crear_torre.setModal(true);
        jd_crear_torre.pack();
        jd_crear_torre.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nombre = txt_nom_lugar.getText();
        String tipo = cb_repetidor.getSelectedItem().toString();
        Torre nom = new Torre(nombre, tipo);
        txt_nom_lugar.setText("");
        boolean existe = false;
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nom.getNombre().equals(relaciones.get(i).getPunto1().getNombre())) {
                    existe = true;
                }
                if (nom.getNombre().equals(relaciones.get(j).getPunto2().getNombre())) {
                    existe = true;
                }
            }
        }
        for (int i = 0; i <= size2 - 1; i++) {
            if (nom.getNombre().contentEquals(torres.get(i).getNombre())) {
                existe = true;
            }
        }
        txt_nom_lugar.setText("");
        if (existe) {
            JOptionPane.showMessageDialog(this, "Ya Existe");
        } else {
            grafo.addVertex(nom);
            torres.insert(nom, size2);
            size2++;
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./torres.txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(nom + ",");
                bw.write(tipo + ",");
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }

            }

            torres.Print_Lista();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        for (int i = 0; i <= size2 - 1; i++) {
            modelo.addElement(torres.get(i).toString());
            modelo1.addElement(torres.get(i).toString());
        }
        cb_lugar1.setModel(modelo);
        cb_lugar2.setModel(modelo1);
        this.jd_crear_coneccion.setModal(true);
        this.jd_crear_coneccion.pack();
        this.jd_crear_coneccion.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_crear_conexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_conexionMouseClicked
        // TODO add your handling code here:
        boolean validar = false;
        Torre NuevoLugar = torres.get(cb_lugar1.getSelectedIndex());
        Torre lugarconectado = torres.get(cb_lugar2.getSelectedIndex());
        //System.out.println(grafo.get()+"lista de vertices");
        int distancia = Integer.parseInt(txt_distancia.getText());
        String Tipo = jcb_tipo.getSelectedItem().toString();
        double capacidad = Double.parseDouble(txt_ancho_de_banda.getText().toString());
        try {
            if (Tipo.equalsIgnoreCase("cobre")) {
                if (capacidad > 100) {
                    JOptionPane.showMessageDialog(null, "Ancho de Banda de cobre ha sobrepasado el limite de 100 MB/s");
                    txt_ancho_de_banda.setText("");
                } else {
                    Relacion_Torres z = new Relacion_Torres(distancia, capacidad, Tipo, NuevoLugar, lugarconectado);
                    boolean existe = false;
                    for (int i = 0; i <= size - 1; i++) {
                        if (NuevoLugar.getNombre().contentEquals(lugarconectado.getNombre())) {
                            existe = true;
                        } else if ((z.getPunto1().getNombre().contentEquals(relaciones.get(i).getPunto1().getNombre())) && (z.getPunto2().getNombre().contentEquals(relaciones.get(i).getPunto2().getNombre()))) {//.equals(relaciones.get(i).getPunto1())&&z.getPunto2().equals(relaciones.get(i).getPunto2()))
                            existe = true;
                        } else {
                            existe = false;
                        }

                    }
                    relaciones.Print_Lista();
                    if (existe) {
                        JOptionPane.showMessageDialog(this, "Ya Existe o mismo destino entre ambos");
                        txt_distancia.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "No existe, sera agregado");
                        relaciones.insert(z, size);
                        size++;
                        ContadorNodos++;
                        relaciones.Print_Lista();
                        File archivo = new File("./mapa.txt");
                        FileWriter fw = null;
                        BufferedWriter bw = null;
                        try {
                            archivo = new File("./mapa.txt");
                            fw = new FileWriter(archivo, true);
                            bw = new BufferedWriter(fw);
                            bw.write(distancia + ",");
                            bw.write(capacidad + ",");
                            bw.write(Tipo + ",");
                            bw.write(NuevoLugar + ",");
                            bw.write(lugarconectado + ",");
                            bw.flush();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                bw.close();
                                fw.close();
                            } catch (IOException ex) {
                            }

                        }
                        txt_distancia.setText("");

                    }
                }
            } else if (Tipo.equalsIgnoreCase("fibra optica")) {
                if (capacidad > 10) {
                    JOptionPane.showMessageDialog(null, "Ancho de Banda de cobre ha sobrepasado el limite de 10 GB/s");
                    txt_ancho_de_banda.setText("");
                } else {
                    Relacion_Torres z = new Relacion_Torres(distancia, capacidad, Tipo, NuevoLugar, lugarconectado);
                    boolean existe = false;
                    for (int i = 0; i <= size - 1; i++) {
                        if (NuevoLugar.getNombre().contentEquals(lugarconectado.getNombre())) {
                            existe = true;
                        } else if ((z.getPunto1().getNombre().contentEquals(relaciones.get(i).getPunto1().getNombre())) && (z.getPunto2().getNombre().contentEquals(relaciones.get(i).getPunto2().getNombre()))) {//.equals(relaciones.get(i).getPunto1())&&z.getPunto2().equals(relaciones.get(i).getPunto2()))
                            existe = true;
                        } else {
                            existe = false;
                        }

                    }
                    relaciones.Print_Lista();
                    if (existe) {
                        JOptionPane.showMessageDialog(this, "Ya Existe o mismo destino entre ambos");
                        txt_distancia.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "No existe, sera agregado");
                        relaciones.insert(z, size);
                        size++;
                        ContadorNodos++;
                        relaciones.Print_Lista();
                        File archivo = new File("./mapa.txt");
                        FileWriter fw = null;
                        BufferedWriter bw = null;
                        try {
                            archivo = new File("./mapa.txt");
                            fw = new FileWriter(archivo, true);
                            bw = new BufferedWriter(fw);
                            bw.write(distancia + ",");
                            bw.write(capacidad + ",");
                            bw.write(Tipo + ",");
                            bw.write(NuevoLugar + ",");
                            bw.write(lugarconectado + ",");
                            bw.flush();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                bw.close();
                                fw.close();
                            } catch (IOException ex) {
                            }

                        }
                        txt_distancia.setText("");
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_crear_conexionMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < size; i++) {
            grafo.addEdge(relaciones.get(i), relaciones.get(i).getPunto1(), relaciones.get(i).getPunto2(), EdgeType.UNDIRECTED);
        }
        Layout<Integer, String> layout = new CircleLayout(grafo);
        layout.setSize(new Dimension(550, 550));
        BasicVisualizationServer<Integer, String> visualization = new BasicVisualizationServer<Integer, String>(layout);
        visualization.setPreferredSize(new Dimension(600, 600));
        visualization.getRenderContext().setLabelOffset(20);
        visualization.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        visualization.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        JFrame frame = new JFrame("Togo Map");
        frame.getContentPane().add(visualization);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        int[][] adyacent = new int[ContadorNodos][ContadorNodos];
        for (int i = 0; i < ContadorNodos; i++) {
            for (int j = 0; j < ContadorNodos; j++) {
                if (i == j) {
                    adyacent[i][j] = 0;
                }
            }
        }
        System.out.println("size:"+size);
        System.out.println("size2:"+size2);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("entro al for");
                if ((relaciones.get(i).getPunto1().getNombre().contentEquals(torres.get(j).getNombre())) || (relaciones.get(i).getPunto2().getNombre().contentEquals(torres.get(j).getNombre()))) {
                    System.out.println("entro al if");
                    adyacent[i][j]=relaciones.get(i).getDistancia();
                }
                else{
                    System.out.println("entro al else");
                    adyacent[i][j]=999;
                }
            }
        }
        Floyd.printMatrix(adyacent);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_conexion;
    private javax.swing.JComboBox cb_lugar1;
    private javax.swing.JComboBox cb_lugar2;
    private javax.swing.JComboBox cb_repetidor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JComboBox jcb_tipo;
    private javax.swing.JDialog jd_crear_coneccion;
    private javax.swing.JDialog jd_crear_torre;
    private javax.swing.JDialog jd_mapa;
    private javax.swing.JLabel lbl_togo;
    private javax.swing.JTextField txt_ancho_de_banda;
    private javax.swing.JTextField txt_distancia;
    private javax.swing.JTextField txt_nom_lugar;
    // End of variables declaration//GEN-END:variables
    public static UndirectedSparseMultigraph grafo = new UndirectedSparseMultigraph<Torre, Relacion_Torres>();
    public static Lista_Relacion relaciones = new Lista_Relacion();
    public static lista_torres torres = new lista_torres();
    public static grafo g = new grafo();
    public static int ContadorNodos = 0;
    public static int size = 0;
    public static int size2 = 0;
}
