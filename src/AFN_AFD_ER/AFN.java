package AFN_AFD_ER;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AFN extends javax.swing.JFrame {
    //public static AFD afd = new AFD();
    private String alfabeto[];
    private int siguienteLineaAFD;
    private int cuentaLineasAFN;
    private int cuentaLineasAFD;
    
    public AFN() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEstados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlfabeto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstadoInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstadosFinales = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTransicionesAFN = new javax.swing.JTable();
        convertir = new javax.swing.JButton();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTransicionesAFD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros del AFN"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Estados");

        txtEstados.setText("a,b,c");

        jLabel2.setText("Alfabeto");

        txtAlfabeto.setText("0,1");
        txtAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlfabetoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado inicial");

        txtEstadoInicial.setText("a");

        jLabel4.setText("Estados Finales");

        txtEstadosFinales.setText("c");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAlfabeto, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(txtEstadoInicial))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadosFinales)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtEstadosFinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Transiciones del AFN"));

        tablaTransicionesAFN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "1", "a"},
                {"a", "0", "a,b"},
                {"b", "0", "c"},
                {null, null, null}
            },
            new String [] {
                "Estado (q)", "Elemento (a)", "Transicion  s(q,a)"
            }
        ));
        jScrollPane2.setViewportView(tablaTransicionesAFN);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        convertir.setText("Convertir a AFD");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de transiciones AFD"));

        tablaTransicionesAFD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", null},
                {"", "", "", null},
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Estados (q)", "Elementos (a)", "Transicion  S(q,a)", "F"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaTransicionesAFD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(convertir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cuentaLineasAFD(){
        //Cuenta el total de lineas de la TABLA DE TRANSICIONES EN EL AFN 
        for (int i=0; (i<tablaTransicionesAFN.getRowCount() && tablaTransicionesAFN.getValueAt(i,0)!=null); i++) {
            if (!tablaTransicionesAFN.getValueAt(i,0).toString().isEmpty())
                cuentaLineasAFN++;
        }
    }
    
    //Método que crea los nuevos estados para la tabla de transiciones AFD utilizando la tabla de transiciones AFN
    private void crearEstados(String estado) {
        int i,j,k;
        String nuevoEstado;
        String estadoFinal;
        String estados[];
        
        // Se ejecuta una vez para cada símbolo del alfabeto
        for (j=0; j<alfabeto.length; j++) {
            nuevoEstado = "";
            estados = estado.split(",");
            
            //recorre a través de los estados recibidos como parametro para encontrar un nuevo estado
            for (k=0; k<estados.length; k++) {
                //Recorre la tabla de transiciones del AFN
                 for (i=0; i<cuentaLineasAFN; i++) {
                    //Encuentra la línea en la que el estado de origen y el estado que se esta analizando
                    if (tablaTransicionesAFN.getValueAt(i,0).toString().equals(estados[k]) &&
                        tablaTransicionesAFN.getValueAt(i,1).toString().equals(alfabeto[j])) {
                        //Incluye sólo el nuevo estado si el nuevo estado contiene al estado que se esta analizando
                        if(!estadoContieneEstado(nuevoEstado,tablaTransicionesAFN.getValueAt(i,2).toString())) {
                            if(nuevoEstado != "")
                                nuevoEstado += ",";
                            nuevoEstado += tablaTransicionesAFN.getValueAt(i,2).toString();
                        }
                    }
                }
            }
            //Si no se encuentra el nuevo estado entonces pasa a la siguiente iteración.
            if(nuevoEstado == "")
                continue;
            //Verifica si el nuevo estado se ha incluido en la tabla AFN
            for (i=0; i<=(siguienteLineaAFD-1); i++) {
                //if (tabelaTransicaoAFD.getValueAt(i,0).toString().equals(novoEstado))
                if (tablaTransicionesAFD.getValueAt(i,0).toString().equals(estado) &&
                    tablaTransicionesAFD.getValueAt(i,1).toString().equals(alfabeto[j]) &&
                    tablaTransicionesAFD.getValueAt(i,2).toString().equals(nuevoEstado))
                    break;
            }
            //Si nuevoEstado no ha sido incluido en la tabla del AFN, a continuación se incluye y se contruyen los nuevos estados
            if(i>(siguienteLineaAFD-1)) {
                tablaTransicionesAFD.setValueAt(estado,siguienteLineaAFD,0);                  
                tablaTransicionesAFD.setValueAt(alfabeto[j],siguienteLineaAFD,1);                  
                tablaTransicionesAFD.setValueAt(nuevoEstado,siguienteLineaAFD,2);                  
                estadoFinal = estadoFinalAFN(nuevoEstado);
                tablaTransicionesAFD.setValueAt(estadoFinal,siguienteLineaAFD,3);                  
                siguienteLineaAFD++;
                
                     
                crearEstados(nuevoEstado);
            }
        }
        System.out.println(tablaTransicionesAFD.getRowCount());
    }
    
    //Método que determina si un nuevo estado contiene al estado que se esta analizando, por ello se mandan dos estados
    private boolean estadoContieneEstado(String estado1, String estado2) {
        String nuevoEstado[] = estado1.split(",");
        int i;
        
        for (i=0; i<nuevoEstado.length; i++) {
            if(nuevoEstado[i].equals(estado2))
                break;
        }
        if(i<nuevoEstado.length)
            return true;
        else
            return false;
    }
    
    //Método en el que se  verifica si el nuevo estado creado contiene al estado final del AFN, para aí establecerlo como 
    //un estado Final en el AFD.
    private String estadoFinalAFN(String s) {
        int i,j;     
        String estadosFinales[] = txtEstadosFinales.getText().split(",");
        String nuevoEstadoAux[] = s.split(",");
        
        // Comprueba que el estado final es uno de los estados finales del AFN
        for (i=0; i<estadosFinales.length; i++)
            for (j=0; j<nuevoEstadoAux.length; j++)
                if (estadosFinales[i].equals(nuevoEstadoAux[j]))
                    return "*";
        return "";
    }   
    
    //el método split ayuda a que la cadena recibida en el jtextfield 'txtAlfabeto' la conviertamos en una lista de
    //los elementos que contiene el alfabeto utilizando la ',' como separador entre elementos.
    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        
        cuentaLineasAFN = 0;
        siguienteLineaAFD = 0;
        
        for (int i=0; i<tablaTransicionesAFD.getRowCount(); i++) {
            tablaTransicionesAFD.setValueAt(null,i,0);                  
            tablaTransicionesAFD.setValueAt(null,i,1);                  
            tablaTransicionesAFD.setValueAt(null,i,2);                  
            tablaTransicionesAFD.setValueAt(null,i,3);                  
        }
        
        alfabeto = txtAlfabeto.getText().split(",");
        cuentaLineasAFD();
        crearEstados(txtEstadoInicial.getText());
        new AFD(tablaTransicionesAFD).show();
    }//GEN-LAST:event_convertirActionPerformed
    
    private void txtAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlfabetoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFN().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaTransicionesAFD;
    private javax.swing.JTable tablaTransicionesAFN;
    private javax.swing.JTextField txtAlfabeto;
    private javax.swing.JTextField txtEstadoInicial;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtEstadosFinales;
    // End of variables declaration//GEN-END:variables
}
