/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


// Esta playlist de youtube fue de mucha ayuda para poder hacer el programa, nos pudimos guiar con algunos de los los codigos usados en los videos para hacer el trabajo mas ameno.
//https://www.youtube.com/watch?v=0a_Y2itvK_I&list=PL-Mlm_HYjCo_uketceEXL4CuoPf9t38FZ&index=1&ab_channel=C%C3%B3digosdeProgramaci%C3%B3n

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_BD extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/basedatos"; //Con este codigo llamamos a la base de datos creada en mysql.
    public static final String USERNAME = "root"; // nombre para ingresar a mysql.
    public static final String PASSWORD = ""; // contraseña para ingresar a mysql.
    DefaultTableModel modelo = new DefaultTableModel(); //Creamos un modelo de tipo tabla.

    /**
     * Creates new form MainVista
     */
    public Vista_BD() {
        initComponents();
        this.setLocationRelativeTo(null); // Metodo para que la ventana se inicie al medio de la pantalla
        try {

            tablaBD.setModel(modelo);//Instanciamos nuestra tabla modelo.

            PreparedStatement ps = null; // Creamos nuestro ps de tipo PreparedStatement para poder hacer las acciones con nuestra base de datos.
            ResultSet rs; // Creamos nuestro resultset para poder consultar nuestros datos de la base de datos
            
            Connection con = null; //Creamos nuestra conexion con la base de datos.
            con = getConnection(); //Llamamos al metodo creado getconnection para poder hacer la conexion con la base de datos 

            String sql = "SELECT ID,Marca,Modelo,Precio,Descripcion FROM Productos"; //Creamos un sql tipo string, para poder hacer la consulta a la base de datos
            ps = con.prepareStatement(sql); // Con este metodo pedimos las filas de nuestra base de datos, de la tabla productos
            rs = ps.executeQuery(); // rs nos va a entregar el resultado de la consulta
            
            ResultSetMetaData rsMD = rs.getMetaData();//Con este codigo podemos saber la cantidad de filas o columnas que tiene una tabla de una base de datos
            int cantcolumnas = rsMD.getColumnCount();//Creamos cantcolumnas de tipo int, para saber el resultado de nuestra consulta de arriba

            modelo.addColumn("ID"); //Agregamos las columnas que estan en nuestra base de datos a nuestra tabla
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Precio");
            modelo.addColumn("Descripcion");

            while (rs.next()) {

                Object[] filas = new Object[cantcolumnas]; //Creamos un arreglo de objetos para llenar la tabla
                for (int i = 0; i < cantcolumnas; i++) { //Mientras i sea menor a cantcolumnas, va a recorrer toda la base de datos, hasta que sea 0

                    filas[i] = rs.getObject(i + 1); //Al momento de recorrer la BD, va a llenar nuestra tabla
                                                    //es i+1 porque al momento de instanciar nuestro i=0, no hay un valor en la fila 0 de la tabla

                }
                modelo.addRow(filas); // Finalmente se agregan las filas

            }

        } catch (SQLException ex) { //Excepcion usada cuando algo no funciona en la base de datos
            System.err.println(ex.toString());
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

        btnEditarObjeto = new javax.swing.JButton();
        btnEliminarObjeto = new javax.swing.JButton();
        btnCrearObjeto = new javax.swing.JButton();
        btnCerrarBD = new javax.swing.JButton();
        btnbd = new javax.swing.JButton();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEditarObjeto.setText("Editar");
        btnEditarObjeto.setToolTipText("");
        btnEditarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarObjetoActionPerformed(evt);
            }
        });

        btnEliminarObjeto.setText("Eliminar");
        btnEliminarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarObjetoActionPerformed(evt);
            }
        });

        btnCrearObjeto.setText("Crear");
        btnCrearObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearObjetoActionPerformed(evt);
            }
        });

        btnCerrarBD.setText("Cerrar");
        btnCerrarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarBDActionPerformed(evt);
            }
        });

        btnbd.setText("Conectar BD");
        btnbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbdActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Precio");

        jLabel5.setText("Descripcion");

        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Precio", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBD);
        if (tablaBD.getColumnModel().getColumnCount() > 0) {
            tablaBD.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaBD.getColumnModel().getColumn(0).setHeaderValue("ID");
            tablaBD.getColumnModel().getColumn(1).setHeaderValue("Marca");
            tablaBD.getColumnModel().getColumn(2).setHeaderValue("Modelo");
            tablaBD.getColumnModel().getColumn(3).setHeaderValue("Precio");
            tablaBD.getColumnModel().getColumn(4).setHeaderValue("Descripcion");
        }

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmarca)
                    .addComponent(txtmodelo)
                    .addComponent(txtprecio)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCrearObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbd)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnCrearObjeto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarObjeto)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarObjeto)))
                        .addGap(138, 138, 138)
                        .addComponent(btnCerrarBD)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarBDActionPerformed
        // TODO add your handling code here:
        dispose(); // Se cierra la ventana
    }//GEN-LAST:event_btnCerrarBDActionPerformed

    private void btnCrearObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearObjetoActionPerformed

        Vista_Objeto i = new Vista_Objeto(); //Creamos nuestra ventana objeto tipo i
        i.setVisible(true);//la hacemos visible al apretar el boton
    }//GEN-LAST:event_btnCrearObjetoActionPerformed

    private void btnEditarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarObjetoActionPerformed

        Connection con = null; //Creamos nuestra conexion con la base de datos.
        PreparedStatement ps = null; // Creamos nuestro ps de tipo PreparedStatement para poder hacer las acciones con nuestra base de datos.

        try {
            con = getConnection();  //Llamamos al metodo creado getconnection para poder hacer la conexion con la base de datos 
            ps = con.prepareStatement("UPDATE productos SET  Marca=?, Modelo=?, Precio=?, Descripcion=? WHERE Id=?"); //Le pedimos a nuestro PS, que nos pueda modificar los datos pedidos en la base 
            //de datos

            ps.setString(1, txtmarca.getText()); //En la ventana escribiremos lo que vamos a cambiar de nuestro producto, y con este codigo nuestro PS pedira por codigo ese texto
            ps.setString(2, txtmodelo.getText()); // Para poder modificar la base de datos, cada numero corresponde a una fila de la base de datos
            ps.setString(3, txtprecio.getText());
            ps.setString(4, txtdescripcion.getText());
            ps.setString(5, txtid.getText());

            int res = ps.executeUpdate(); //Variable que cambia los datos en la BD

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "¡Producto editado con exito!"); //Si nuestro res, es mayor a 1, quiere decir que se cambiaron los datos y saldra un mensaje por pantalla

            } else {
                JOptionPane.showMessageDialog(null, "Producto no se pudo editar.");//Si nuestro res, es menor a 1, no se hicieron los cambios y saldra un mensaje por pantalla.

            }

            con.close(); //se cierra la conexion a la bd

        } catch (SQLException e) {//Excepcion usada cuando algo no funciona en la base de datos
            System.err.println(e);

        }

    }//GEN-LAST:event_btnEditarObjetoActionPerformed

    private void btnbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbdActionPerformed

        try {
            DefaultTableModel modelo = new DefaultTableModel();//Instanciamos de nuevo nuestro modelo ya que si no lo hacemos se crearan muchas tablas encima de la que usamos.
            tablaBD.setModel(modelo);

            PreparedStatement ps = null;  // Creamos nuestro ps de tipo PreparedStatement para poder hacer las acciones con nuestra base de datos.
            ResultSet rs;// Creamos nuestro resultset para poder consultar nuestros datos de la base de datos
            Connection con = null;//Creamos nuestra conexion con la base de datos.
            con = getConnection(); //Llamamos al metodo creado getconnection para poder hacer la conexion con la base de datos 

            String sql = "SELECT ID,Marca,Modelo,Precio,Descripcion FROM Productos"; //Creamos un STRING con lo que le vamos a pedir que haga a nuestro PS, en este caso queremos consultar la tabla productos
            ps = con.prepareStatement(sql); // Nuestro PS sera igual al string creado antes
            rs = ps.executeQuery(); //El rs ejecutara el resultado en el query de la base de datos
            ResultSetMetaData rsMD = rs.getMetaData(); //Con este codigo podemos saber la cantidad de filas o columnas que tiene una tabla de una base de datos
            int cantcolumnas = rsMD.getColumnCount(); //Creamos cantcolumnas de tipo int, para saber el resultado de nuestra consulta de arriba

            modelo.addColumn("ID"); //Agregaremos las columnas de la tabla productos en la BD, a nuestra tabla, y asi poder actualizarla con el boton
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Precio");
            modelo.addColumn("Descripcion");

            while (rs.next()) {

                Object[] filas = new Object[cantcolumnas]; //Creamos un arreglo de objetos para llenar la tabla
                for (int i = 0; i < cantcolumnas; i++) { //Mientras i sea menor a cantcolumnas, va a recorrer toda la base de datos, hasta que sea 0

                    filas[i] = rs.getObject(i + 1);  //Al momento de recorrer la BD, va a llenar nuestra tabla
                                                    //es i+1 porque al momento de instanciar nuestro i=0, no hay un valor en la fila 0 de la tabla

                }
                modelo.addRow(filas);//Finalmente se agregan las filas.

            }

        } catch (SQLException ex) { //Excepcion usada cuando algo no funciona en la base de datos
            System.err.println(ex.toString());
        }

    }//GEN-LAST:event_btnbdActionPerformed

    private void btnEliminarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarObjetoActionPerformed

        PreparedStatement ps = null; // Creamos nuestro ps de tipo PreparedStatement para poder hacer las acciones con nuestra base de datos.
        try { 

            Connection con; //Creamos nuestra conexion con la base de datos.
            con = getConnection(); //Llamamos al metodo creado getconnection para poder hacer la conexion con la base de datos 

            int fila = tablaBD.getSelectedRow(); //Creamos una fila tipo int para seleccionar la fila en la ventana.
            String codigo = tablaBD.getValueAt(fila, 0).toString(); //creamos un codigo tipo string que nos entregar los valores de la fila seleccionada

            ps = con.prepareStatement("DELETE FROM Productos WHERE ID=?"); //Con nuestro ps podemos eliminar la fila seleccionada
            ps.setString(1, codigo); // Nuestro ps, tendra la primera fila de tipo codigo, que es la consulta que hicimos anteriormente
            ps.execute(); // se ejecuta la accion

            modelo.removeRow(fila); // y se borra la fila

        } catch (SQLException ex) { //Excepcion usada cuando algo no funciona en la base de datos
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_btnEliminarObjetoActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tablaBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBDMouseClicked

        PreparedStatement ps = null; // Creamos nuestro ps de tipo PreparedStatement para poder hacer las acciones con nuestra base de datos.
        ResultSet rs = null; // Creamos nuestro resultset para poder consultar nuestros datos de la base de datos 

        try {
            Connection conn; //Creamos nuestra conexion con la base de datos.
            conn = getConnection(); //Llamamos al metodo creado getconnection para poder hacer la conexion con la base de datos 

            int fila = tablaBD.getSelectedRow(); //Creamos una fila tipo int para seleccionar la fila en la ventana.
            String codigo = tablaBD.getValueAt(fila, 0).toString(); //creamos un codigo tipo string que nos entregar los valores de la fila seleccionada

            ps = conn.prepareStatement("SELECT ID, Marca, Modelo, Precio, Descripcion FROM productos WHERE ID=?"); //Nuestro PS hara la accion de pedir los datos sobre una fila
            ps.setString(1, codigo); // Nuestro ps, tendra la primera fila de tipo codigo, que es la consulta que hicimos anteriormente
            rs = ps.executeQuery(); //Se ejecuta la accion y se guardan los datos en nuestro ss

            while (rs.next()) { //Para nuestro rs

                txtid.setText(rs.getString("ID")); //Se le agregara el texto guardado en el rs a cada textfield de la ventana
                txtmarca.setText(rs.getString("Marca"));
                txtmodelo.setText(rs.getString("Modelo"));
                txtprecio.setText(rs.getString("Precio"));
                txtdescripcion.setText(rs.getString("Descripcion"));

            }

        } catch (SQLException e) { //Excepcion usada cuando algo no funciona en la base de datos
            System.out.println(e.toString());

        }
    }//GEN-LAST:event_tablaBDMouseClicked

    public static Connection getConnection() {

        Connection con = null; //Creamos nuestra conexion con la base de datos.

        try {
            Class.forName("com.mysql.jdbc.Driver");//Cargamos nuestra BD
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD); //Pedimos los datos de nuestro MYSQL que creamos arriba.

        } catch (Exception e) { //Excepcion usada cuando algo no funciona en la base de datos

            System.out.println(e);

        }
        return con; //retorna la conexion

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
                if ("WINDOWS".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_BD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_BD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_BD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_BD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_BD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarBD;
    public javax.swing.JButton btnCrearObjeto;
    public javax.swing.JButton btnEditarObjeto;
    public javax.swing.JButton btnEliminarObjeto;
    private javax.swing.JButton btnbd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaBD;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
