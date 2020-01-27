package reglafalsatrigonometrica;

//Librerías
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Test_Regla_Falsa_Tri extends JFrame{
    //Declaracion de los JLabel
    private JLabel lblIngreso;
    private JLabel lblX6;
    private JLabel lblX5;
    private JLabel lblX4;
    private JLabel lblX3;
    private JLabel lblX2;
    private JLabel lblX1;
    private JLabel lblInterA;
    private JLabel lblInterB;
    private JLabel lblError;
    private JLabel lblDecimal;
    private JLabel lblTipoFuncion;
    private JLabel lblTipoIntervalo;
    
    //Declaramos los comboBox
    private JComboBox cbxOperador7;
    private JComboBox cbxOperador6;
    private JComboBox cbxOperador5;
    private JComboBox cbxOperador4;
    private JComboBox cbxOperador3;
    private JComboBox cbxOperador2;
    private JComboBox cbxOperador1;
    private JComboBox cbxDecimales;
    private JComboBox cbxTipoFuncion;
    private JComboBox cbxTipoIntervalo;
    
    //Declaramos TextField
    static private JTextField txtX6;
    static private JTextField txtX5;
    static private JTextField txtX4;
    static private JTextField txtX3;
    static private JTextField txtX2;
    static private JTextField txtX1;
    static private JTextField txtCons;
    static private JTextField txtError;
    
    //Declaramos los botones
    private JButton btnCalcular;
    
    //CAMPOS DE INTERVALOS
    //Creamos campos para ingresar los intervalos
    private JLabel lblRadian;
    private JLabel lblPiRadian;
    private JLabel lblSexagesimales;
    private JLabel lblIngreso2;
    private JLabel lblIntervaloA;
    private JLabel lblIntervaloB;
    private JLabel lblIntervaloA2;
    private JLabel lblIntervaloB2;
    private JLabel lblIntervaloA3;
    private JLabel lblIntervaloB3;
    private JLabel lblRad;
    private JLabel lblRad2;
    private JLabel lblRad_2;
    private JLabel lblRad2_2;
    private JLabel lblRad_3;
    private JLabel lblRad2_3;
    //Declaramos los ingresos para los multiples de intervalos
    //Radianes
    static private JTextField txtIntervaloA;
    static private JTextField txtIntervaloB;
    //Pi Radianes
    static private JTextField txtIntAUp;
    static private JTextField txtIntADown;
    static private JTextField txtIntBUp;
    static private JTextField txtIntBDown;
    private JLabel lblLinea;
    private JLabel lblLinea2;
    //Grados sexagesimales
    private static JTextField txtIntA0;
    private static JTextField txtIntA1;
    private static JTextField txtIntA2;
    private static JTextField txtIntB0;
    private static JTextField txtIntB1;
    private static JTextField txtIntB2;
    private JLabel lbl0;
    private JLabel lbl02;
    private JLabel lbl1;
    private JLabel lbl12;
    private JLabel lbl2;
    private JLabel lbl22;
    //Declaramos botones de accion.
    private JButton btnConfirmarIntervalos;
    private JButton btnConfirmarPiRadianes;
    private JButton btnConfirmarSexagesimales;
    
    //Creamos variables para comprobar los valores de nuestra ecuacion y nuestros demas datos
        private String compX6;
        private String compX5;
        private String compX4;
        private String compX3;
        private String compX2;
        private String compX1;
        private String compCons;
        private String compInterA;
        private String compInterB;
        private String tipoFuncion;
        private String tipoIntervalo;
    
        
    //Creamos variables para guardar los valores una vez ya comprobados
        private Double X6;
        private Double X5;
        private Double X4;
        private Double X3;
        private Double X2;
        private Double X1;
        private Double constante;
        
    //Creamos variables para trabajar nuestros valores asignados en el comboBox
        private String Operador7;
        private String Operador6;
        private String Operador5;
        private String Operador4;
        private String Operador3;
        private String Operador2;
        private String Operador1;
    
    //Creamos variables para trabajar nuestros valores de los limites, el error y los decimales;
        //Guardado de los intervalos
        private Double IntervaloA;
        private Double IntervaloB;
        //Guardado intermedio para los intervalos Pi Radianes
        private Double IntSupA;
        private Double IntInfA;
        private Double IntSupB;
        private Double IntInfB;
        //Guardado intermedio para los intervalos Sexagesimales
        private Double IntA0;
        private Double IntA1;
        private Double IntA2;
        private Double IntB0;
        private Double IntB1;
        private Double IntB2;
        //Variables para el error y los decimales
        private Double Error;
        private String interDecimales;
        private int Decimales;
        
    Test_Regla_Falsa_Tri(){
        //setSize(930, 230); //Tamaño
	setTitle(" Método de Regla Falsa Trigonométrica "); //Titulo
        setLayout(null);
        setBounds(30, 30, 1050, 520); //Margenes
        //setLocation(500, 200); //Locacion en la pantalla
        //setResizable(true); //Da la opcion de agrandar la ventana (habilitar el boton maximizar)
        //setLayout(new GridLayout(5,3,5,10)); //Dar formato a la ventana (Filas, columnas)
        
        //Creamos los JLabel
        lblIngreso = new JLabel("Ingrese los datos que se le indiquen");
            //Ecuacion
        lblX6 = new JLabel("x^6");
        lblX5 = new JLabel("x^5");
        lblX4 = new JLabel("x^4");
        lblX3 = new JLabel("x^3");
        lblX2 = new JLabel("x^2");
        lblX1 = new JLabel("x^1");
        lblTipoFuncion =  new JLabel("Tipo de función: ");
            //Intervalos
        lblTipoIntervalo = new JLabel("Tipo de intervalo: ");
        lblInterA = new JLabel("Intervalo a: ");
        lblInterB = new JLabel("Intervalo b: ");
        
            //Error y Decimal
        lblError = new JLabel("Error esperado: ");
        lblDecimal = new JLabel("Decimales: ");
        
        //Creamos los ComboBox
        cbxOperador7 = new JComboBox();
            cbxOperador7.addItem("+");
            cbxOperador7.addItem("-");
        cbxOperador6 = new JComboBox();
            cbxOperador6.addItem("+");
            cbxOperador6.addItem("-");
        cbxOperador5 = new JComboBox();
            cbxOperador5.addItem("+");
            cbxOperador5.addItem("-");
        cbxOperador4 = new JComboBox();
            cbxOperador4.addItem("+");
            cbxOperador4.addItem("-");
        cbxOperador3 = new JComboBox();
            cbxOperador3.addItem("+");
            cbxOperador3.addItem("-");
        cbxOperador2 = new JComboBox();
            cbxOperador2.addItem("+");
            cbxOperador2.addItem("-");
        cbxOperador1 = new JComboBox();
            cbxOperador1.addItem("+");
            cbxOperador1.addItem("-");
        cbxDecimales = new JComboBox();
            cbxDecimales.addItem("1");
            cbxDecimales.addItem("2");
            cbxDecimales.addItem("3");
            cbxDecimales.addItem("4");
            cbxDecimales.addItem("5");
            cbxDecimales.addItem("6");
            cbxDecimales.addItem("7");
            cbxDecimales.addItem("8");
            cbxDecimales.addItem("9");
        cbxTipoFuncion = new JComboBox();
            cbxTipoFuncion.addItem("Seno");
            cbxTipoFuncion.addItem("Coseno");
            cbxTipoFuncion.addItem("Tangente");
        cbxTipoIntervalo = new JComboBox();
            cbxTipoIntervalo.addItem("Radianes");
            cbxTipoIntervalo.addItem("Pi Radianes");
            cbxTipoIntervalo.addItem("Grados Sexagesimales");
        
        //Creamos los textField
        txtX6 = new JTextField();
        txtX5 = new JTextField();
        txtX4 = new JTextField();
        txtX3 = new JTextField();
        txtX2 = new JTextField();
        txtX1 = new JTextField();
        txtCons = new JTextField();
        txtIntervaloA = new JTextField();
        txtIntervaloB = new JTextField();
        txtError = new JTextField();
        
        //Agregamos los campos de las ventanas para los intervalos
        //Inicializamos los label
        lblRadian = new JLabel("Radianes");
        lblPiRadian = new JLabel("Pi Radianes");
        lblSexagesimales = new JLabel("Grados Sexagesimales");
        lblIntervaloA = new JLabel("Intervalo A: ");
        lblIntervaloB = new JLabel("Intervalo B: ");
        lblIntervaloA2 = new JLabel("Intervalo A: ");
        lblIntervaloB2 = new JLabel("Intervalo B: ");
        lblIntervaloA3 = new JLabel("Intervalo A: ");
        lblIntervaloB3 = new JLabel("Intervalo B: ");
        lblRad = new JLabel("Rad");
        lblRad2 = new JLabel("Rad");
        lblRad_2 = new JLabel("Rad");
        lblRad2_2 = new JLabel("Rad");
        lblRad_3 = new JLabel("Rad");
        lblRad2_3 = new JLabel("Rad");
        //Requisitos para Radianes
        txtIntervaloA = new JTextField();
        txtIntervaloB = new JTextField();
        //Requisitos para Pi Radianes
        txtIntAUp = new JTextField();
        txtIntADown = new JTextField();
        txtIntBUp = new JTextField();
        txtIntBDown = new JTextField();
        lblLinea = new JLabel("---------------");
        lblLinea2 = new JLabel("---------------");
        //Requisitos para Grados sexagesimales
        txtIntA0 = new JTextField();
        txtIntA1 = new JTextField();
        txtIntA2 = new JTextField();
        txtIntB0 = new JTextField();
        txtIntB1 = new JTextField();
        txtIntB2 = new JTextField();
        lbl0 = new JLabel("0");
        lbl02 = new JLabel("0");
        lbl1 = new JLabel("I");
        lbl12 = new JLabel("I");
        lbl2 = new JLabel("II");
        lbl22 = new JLabel("II");
        
        //Creamos los botones
        btnCalcular = new JButton("Calcular");
        btnConfirmarIntervalos = new JButton("Confirmar Intervalo");
        btnConfirmarPiRadianes = new JButton("Confirmar");
        btnConfirmarSexagesimales = new JButton("Confirmar");
        
        //Damos medididas a nuestros elementos
        lblIngreso.setBounds(20, 10, 250, 40);
            //Ecuaciòn
        cbxOperador7.setBounds(20, 60, 40, 20);
        txtX6.setBounds(70, 60, 40, 20);
        lblX6.setBounds(120, 60, 40, 20);
        cbxOperador6.setBounds(170, 60, 40, 20);
        txtX5.setBounds(220, 60, 40, 20);
        lblX5.setBounds(270, 60, 40, 20);
        cbxOperador5.setBounds(320, 60, 40, 20);
        txtX4.setBounds(370, 60, 40, 20);
        lblX4.setBounds(420, 60, 40, 20);
        cbxOperador4.setBounds(470, 60, 40, 20);
        txtX3.setBounds(520, 60, 40, 20);
        lblX3.setBounds(570, 60, 40, 20);
        cbxOperador3.setBounds(620, 60, 40, 20);
        txtX2.setBounds(670, 60, 40, 20);
        lblX2.setBounds(720, 60, 40, 20);
        cbxOperador2.setBounds(770, 60, 40, 20);
        txtX1.setBounds(820, 60, 40, 20);
        lblX1.setBounds(870, 60, 40, 20);
        cbxOperador1.setBounds(920, 60, 40, 20);
        txtCons.setBounds(970, 60, 40, 20);
            //Tipo de funcion
        lblTipoFuncion.setBounds(20, 110, 100, 20);
        cbxTipoFuncion.setBounds(120, 110, 80, 20);
            //Tipo de intervalos
        lblTipoIntervalo.setBounds(20, 140, 100, 20);
        cbxTipoIntervalo.setBounds(125, 140, 150, 20);
        btnConfirmarIntervalos.setBounds(300,140,150,20);
        //lblInterA.setBounds(20, 110, 80, 20);
        //txtIntervaloA.setBounds(100, 110, 60, 20);
        //lblInterB.setBounds(20, 140, 80, 20);
        //txtIntervaloB.setBounds(100, 140, 60, 20);
            //Error y Decimales
        lblError.setBounds(20, 190, 110, 20);
        txtError.setBounds(120, 190, 60, 20);
        lblDecimal.setBounds(20, 220, 110, 20);
        cbxDecimales.setBounds(120, 220, 40, 20);
            //Boon de calcular
        btnCalcular.setBounds(910, 440, 100, 20);
        
        //Tamaños de los campos para los intervalos
        //Radian
        lblRadian.setBounds(10,280,70,20);
        lblIntervaloA.setBounds(10,320,150,20);
        txtIntervaloA.setBounds(85,320,60,20); //Dato por extraer
        lblRad.setBounds(150,320,30,20);
        lblIntervaloB.setBounds(200,320,120,20);
        txtIntervaloB.setBounds(275,320,60,20); //Dato por extraer
        lblRad2.setBounds(340,320,30,20);
        
        //Pi Radian
        lblPiRadian.setBounds(400,280,70,20);
        lblIntervaloA2.setBounds(400,320,150,20);
        txtIntAUp.setBounds(475,310,60,20);
        txtIntADown.setBounds(475,340,60,20);
        lblLinea.setBounds(474,320,80,20);
        lblRad_2.setBounds(544,320,30,20);
        lblIntervaloB2.setBounds(619,320,150,20);
        txtIntBUp.setBounds(695,310,60,20);
        txtIntBDown.setBounds(695,340,60,20);
        lblLinea2.setBounds(694,320,80,20);
        lblRad2_2.setBounds(764,320,30,20);
        
        //Sexagesimales
        lblSexagesimales.setBounds(10,400,150,20);
        //IntervaloA
        lblIntervaloA3.setBounds(10,440,150,20);
        //A0
        txtIntA0.setBounds(85,440,30,20);
        lbl0.setBounds(120,430,10,20);
        //A1
        txtIntA1.setBounds(140,440,30,20);
        lbl1.setBounds(175,430,10,20);
        //A2
        txtIntA2.setBounds(195,440,30,20);
        lbl2.setBounds(230,430,10,20);
        lblRad_3.setBounds(250,440,30,20);
        //Intervalo B
        lblIntervaloB3.setBounds(300,440,120,20);
        //B0
        txtIntB0.setBounds(380,440,30,20);
        lbl02.setBounds(415,430,10,20);
        //B1
        txtIntB1.setBounds(435,440,30,20);
        lbl12.setBounds(470,430,10,20);
        //B2
        txtIntB2.setBounds(490,440,30,20);
        lbl22.setBounds(525,430,10,20);
        lblRad2_3.setBounds(540,440,30,20);
        
        //Añadimos los JLabel
        add(lblIngreso);
            //Ecuacion
        add(cbxOperador7);
        add(txtX6);
        add(lblX6);
        add(cbxOperador6);
        add(txtX5);
        add(lblX5);
        add(cbxOperador5);
        add(txtX4);
        add(lblX4);
        add(cbxOperador4);
        add(txtX3);
        add(lblX3);
        add(cbxOperador3);
        add(txtX2);
        add(lblX2);
        add(cbxOperador2);
        add(txtX1);
        add(lblX1);
        add(cbxOperador1);
        add(txtCons);
            //Tipo función
        add(lblTipoFuncion);
        add(cbxTipoFuncion);
            //Tipo intervalos
        add(lblTipoIntervalo);
        add(cbxTipoIntervalo);
        add(btnConfirmarIntervalos);
            //Error y Decimales
        add(lblError);
        add(txtError);
        add(lblDecimal);
        add(cbxDecimales);
            //Intervalos en Radianes
        add(lblRadian);
            lblRadian.setEnabled(false);
        add(lblIntervaloA);
            lblIntervaloA.setEnabled(false);
        add(lblIntervaloB);
            lblIntervaloB.setEnabled(false);
        add(txtIntervaloA);
            txtIntervaloA.setEnabled(false);
        add(lblRad);
            lblRad.setEnabled(false);
        add(txtIntervaloB);
            txtIntervaloB.setEnabled(false);
        add(lblRad2);
            lblRad2.setEnabled(false);
            //Intervalos en Pi Radianes
        add(lblPiRadian);
            lblPiRadian.setEnabled(false);
        add(lblIntervaloA2);
            lblIntervaloA2.setEnabled(false);
        add(txtIntAUp);
            txtIntAUp.setEnabled(false);
        add(txtIntADown);
            txtIntADown.setEnabled(false);
        add(lblLinea);
            lblLinea.setEnabled(false);
        add(lblRad_2);
            lblRad_2.setEnabled(false);
        add(lblIntervaloB2);
            lblIntervaloB2.setEnabled(false);
        add(txtIntBUp);
            txtIntBUp.setEnabled(false);
        add(txtIntBDown);
            txtIntBDown.setEnabled(false);
        add(lblLinea2);
            lblLinea2.setEnabled(false);
        add(lblRad2_2);
            lblRad2_2.setEnabled(false);
            //Intervalos sexagesimales
        add(lblSexagesimales);
            lblSexagesimales.setEnabled(false);
        add(lblIntervaloA3);
            lblIntervaloA3.setEnabled(false);
        add(txtIntA0);
            txtIntA0.setEnabled(false);
        add(lbl0);
            lbl0.setEnabled(false);
        add(txtIntA1);
            txtIntA1.setEnabled(false);
        add(lbl1);
            lbl1.setEnabled(false);
        add(txtIntA2);
            txtIntA2.setEnabled(false);
        add(lbl2);
            lbl2.setEnabled(false);
        add(lblRad_3);
            lblRad_3.setEnabled(false);
        add(lblIntervaloB3);
            lblIntervaloB3.setEnabled(false);
        add(txtIntB0);
            txtIntB0.setEnabled(false);
        add(lbl02);
            lbl02.setEnabled(false);
        add(txtIntB1);
            txtIntB1.setEnabled(false);
        add(lbl12);
            lbl12.setEnabled(false);
        add(txtIntB2);
            txtIntB2.setEnabled(false);
        add(lbl22);
            lbl22.setEnabled(false);
        add(lblRad2_3);
            lblRad2_3.setEnabled(false);
        
        add(btnCalcular);
        setVisible(true); //Mostrar ventana
        //pack();
        
        btnConfirmarIntervalos.addActionListener(new ActionListener() { //Agregamos una accion al boton
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoIntervalo = (String) cbxTipoIntervalo.getSelectedItem();
            if(cbxTipoIntervalo.getSelectedItem().equals("Radianes")){
                lblRadian.setEnabled(true);
                lblIntervaloA.setEnabled(true);
                lblIntervaloB.setEnabled(true);
                txtIntervaloA.setEnabled(true);
                lblRad.setEnabled(true);
                txtIntervaloB.setEnabled(true);
                lblRad2.setEnabled(true);
                //Desactivamos los Pi Radianes
                lblPiRadian.setEnabled(false);
                lblIntervaloA2.setEnabled(false);
                txtIntAUp.setEnabled(false);
                txtIntADown.setEnabled(false);
                lblLinea.setEnabled(false);
                lblRad_2.setEnabled(false);
                lblIntervaloB2.setEnabled(false);
                txtIntBUp.setEnabled(false);
                txtIntBDown.setEnabled(false);
                lblLinea2.setEnabled(false);
                lblRad2_2.setEnabled(false);
                //Desactivamos los sexagesimales
                lblSexagesimales.setEnabled(false);
                lblIntervaloA3.setEnabled(false);
                txtIntA0.setEnabled(false);
                lbl0.setEnabled(false);
                txtIntA1.setEnabled(false);
                lbl1.setEnabled(false);
                txtIntA2.setEnabled(false);
                lbl2.setEnabled(false);
                lblRad_3.setEnabled(false);
                lblIntervaloB3.setEnabled(false);
                txtIntB0.setEnabled(false);
                lbl02.setEnabled(false);
                txtIntB1.setEnabled(false);
                lbl12.setEnabled(false);
                txtIntB2.setEnabled(false);
                lbl22.setEnabled(false);
                lblRad2_3.setEnabled(false);
            }
            else if(cbxTipoIntervalo.getSelectedItem().equals("Pi Radianes")){
                lblPiRadian.setEnabled(true);
                lblIntervaloA2.setEnabled(true);
                txtIntAUp.setEnabled(true);
                txtIntADown.setEnabled(true);
                lblLinea.setEnabled(true);
                lblRad_2.setEnabled(true);
                lblIntervaloB2.setEnabled(true);
                txtIntBUp.setEnabled(true);
                txtIntBDown.setEnabled(true);
                lblLinea2.setEnabled(true);
                lblRad2_2.setEnabled(true);
                //Desactivamos los Radianes
                lblRadian.setEnabled(false);
                lblIntervaloA.setEnabled(false);
                lblIntervaloB.setEnabled(false);
                txtIntervaloA.setEnabled(false);
                lblRad.setEnabled(false);
                txtIntervaloB.setEnabled(false);
                lblRad2.setEnabled(false);
                //Desactivamos los sexagesimales
                lblSexagesimales.setEnabled(false);
                lblIntervaloA3.setEnabled(false);
                txtIntA0.setEnabled(false);
                lbl0.setEnabled(false);
                txtIntA1.setEnabled(false);
                lbl1.setEnabled(false);
                txtIntA2.setEnabled(false);
                lbl2.setEnabled(false);
                lblRad_3.setEnabled(false);
                lblIntervaloB3.setEnabled(false);
                txtIntB0.setEnabled(false);
                lbl02.setEnabled(false);
                txtIntB1.setEnabled(false);
                lbl12.setEnabled(false);
                txtIntB2.setEnabled(false);
                lbl22.setEnabled(false);
                lblRad2_3.setEnabled(false);
            }
            else if(cbxTipoIntervalo.getSelectedItem().equals("Grados Sexagesimales")){
                lblSexagesimales.setEnabled(true);
                lblIntervaloA3.setEnabled(true);
                txtIntA0.setEnabled(true);
                lbl0.setEnabled(true);
                txtIntA1.setEnabled(true);
                lbl1.setEnabled(true);
                txtIntA2.setEnabled(true);
                lbl2.setEnabled(true);
                lblRad_3.setEnabled(true);
                lblIntervaloB3.setEnabled(true);
                txtIntB0.setEnabled(true);
                lbl02.setEnabled(true);
                txtIntB1.setEnabled(true);
                lbl12.setEnabled(true);
                txtIntB2.setEnabled(true);
                lbl22.setEnabled(true);
                lblRad2_3.setEnabled(true);
                //Desactivamos los Radianes
                lblRadian.setEnabled(false);
                lblIntervaloA.setEnabled(false);
                lblIntervaloB.setEnabled(false);
                txtIntervaloA.setEnabled(false);
                lblRad.setEnabled(false);
                txtIntervaloB.setEnabled(false);
                lblRad2.setEnabled(false);
                //Desactivamos los Pi Radianes
                lblPiRadian.setEnabled(false);
                lblIntervaloA2.setEnabled(false);
                txtIntAUp.setEnabled(false);
                txtIntADown.setEnabled(false);
                lblLinea.setEnabled(false);
                lblRad_2.setEnabled(false);
                lblIntervaloB2.setEnabled(false);
                txtIntBUp.setEnabled(false);
                txtIntBDown.setEnabled(false);
                lblLinea2.setEnabled(false);
                lblRad2_2.setEnabled(false);
            }
        }
        });    
        
        
        //Objeto que conecta nuestras clases
        Calcular_Regla_Falsa_Tri calcular = new Calcular_Regla_Falsa_Tri();
        
        btnCalcular.addActionListener(new ActionListener() { //Agregamos una accion al boton
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                //Comprobamos si el error y los decimales están vacios. En caso de estarlo se le da una notificacion 
                if(txtError.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Campos Vacios");
                }
                else{
                    //Remplazamos las comas de la ecuacion por puntos
                    compX6 = txtX6.getText();
                    if(compX6.contains(",")){
                        compX6 = compX6.replace(",", ".");
                    }
                    
                    compX5 = txtX5.getText();
                    if(compX5.contains(",")){
                        compX5 = compX5.replace(",", ".");
                    }
                    
                    compX4 = txtX4.getText();
                    if(compX4.contains(",")){
                        compX4 = compX4.replace(",", ".");
                    }
                    
                    compX3 = txtX3.getText();
                    if(compX3.contains(",")){
                        compX3 = compX3.replace(",", ".");
                    }
                    
                    compX2 = txtX2.getText();
                    if(compX2.contains(",")){
                        compX2 = compX2.replace(",", ".");
                    }
                    
                    compX1 = txtX1.getText();
                    if(compX1.contains(",")){
                        compX1 = compX1.replace(",", ".");
                    }
                    
                    compCons = txtCons.getText();
                    if(compCons.contains(",")){
                        compCons = compCons.replace(",", ".");
                    }
                    
                    compInterA = txtIntervaloA.getText();
                    if(compInterA.contains(",")){
                        compInterA = compInterA.replace(",", ".");
                    }
                    
                    compInterB = txtIntervaloB.getText();
                    if(compInterB.contains(",")){
                        compInterB = compInterB.replace(",", ".");
                    }
                    
                    //Cambiamos los valores de la ecuacion que esten vacios a 0 para que no los tome en cuenta en la formula
                    if(compX6.equals("")){
                        compX6 = compX6.replace("", "0.0");
                    }
                    if(compX5.equals("")){
                        compX5 = compX5.replace("", "0.0");
                    }
                    if(compX4.equals("")){
                        compX4 = compX4.replace("", "0.0");
                    }
                    if(compX3.equals("")){
                        compX3 = compX3.replace("", "0.0");
                    }
                    if(compX2.equals("")){
                        compX2 = compX2.replace("", "0.0");
                    }
                    if(compX1.equals("")){
                        compX1 = compX1.replace("", "0.0");
                    }
                    if(compCons.equals("")){
                        compCons = compCons.replace("", "0.0");
                    }
                    
                    //Una vez validados los valores los convertimos a Double para trabajarlos como valores numericos
                    X6 = Double.parseDouble(compX6);
                    X5 = Double.parseDouble(compX5);
                    X4 = Double.parseDouble(compX4);
                    X3 = Double.parseDouble(compX3);
                    X2 = Double.parseDouble(compX2);
                    X1 = Double.parseDouble(compX1);
                    constante = Double.parseDouble(compCons);
                    
                    //Una vez que se ingreso la opcion del comboBox (+) o (-), debemos cambiarlos a String para poder trabajarlos
                    Operador7 = (String) cbxOperador7.getSelectedItem();
                    Operador6 = (String) cbxOperador6.getSelectedItem();
                    Operador5 = (String) cbxOperador5.getSelectedItem();
                    Operador4 = (String) cbxOperador4.getSelectedItem();
                    Operador3 = (String) cbxOperador3.getSelectedItem();
                    Operador2 = (String) cbxOperador2.getSelectedItem();
                    Operador1 = (String) cbxOperador1.getSelectedItem();
                    
                    //Tipo de funcion
                    tipoFuncion = (String) cbxTipoFuncion.getSelectedItem();
                    
                    //Objeto que conecta nuestro main con nuestra clase que contiene los métodos
                    Metodos_Regla_Falsa_Tri Metodo = new Metodos_Regla_Falsa_Tri();
                    
                    //Obtenemos la cantidad de decimales
                    interDecimales = (String) cbxDecimales.getSelectedItem();
                    Decimales = Integer.parseInt(interDecimales);
                    
                    //Convertimos los valores de nuestros intervalos, error y decimales
                    tipoIntervalo = (String) cbxTipoIntervalo.getSelectedItem(); //Guaradamos el tipo del intervalo parea trabajarlos
                    if(tipoIntervalo.equals("Radianes")){
                        IntervaloA = Double.parseDouble(txtIntervaloA.getText());
                        IntervaloB = Double.parseDouble(txtIntervaloB.getText());
                        //Recortamos los decimales
                        IntervaloA = Metodo.recortarDecimales(IntervaloA, Decimales);
                        IntervaloB = Metodo.recortarDecimales(IntervaloB, Decimales);
                    }
                    else if(tipoIntervalo.equals("Pi Radianes")){
                        //Atraemoslos datos y los enviamos
                        
                        IntSupA = Double.parseDouble(txtIntAUp.getText());
                        IntInfA = Double.parseDouble(txtIntADown.getText());
                        System.out.println("Up: "+IntSupA);
                        System.out.println("Down: "+IntInfA);
                        IntervaloA = Metodo.CalcularIntervaloPiRadian(IntSupA, IntInfA);
                        
                        IntSupB = Double.parseDouble(txtIntBUp.getText());
                        IntInfB = Double.parseDouble(txtIntBDown.getText());
                        IntervaloB = Metodo.CalcularIntervaloPiRadian(IntSupB, IntInfB);
                        
                        //Recortamos los decimales
                        IntervaloA = Metodo.recortarDecimales(IntervaloA, Decimales);
                        IntervaloB = Metodo.recortarDecimales(IntervaloB, Decimales);
                    }
                    else if(tipoIntervalo.equals("Grados Sexagesimales")){
                        IntA0 = Double.parseDouble(txtIntA0.getText());
                        IntA1 = Double.parseDouble(txtIntA1.getText());
                        IntA2 = Double.parseDouble(txtIntA2.getText());
                        IntB0 = Double.parseDouble(txtIntB0.getText());
                        IntB1 = Double.parseDouble(txtIntB1.getText());
                        IntB2 = Double.parseDouble(txtIntB2.getText());
                        
                        //Intervalo A
                        IntA2 = IntA2/60;
                        IntA1 = IntA1+IntA2;
                        IntA1 = IntA1/60;
                        IntA0 = IntA0+IntA1;
                        IntervaloA = Metodo.ConvertirRadianes(IntA0);
                        
                        //Intervalo B
                        IntB2 = IntB2/60;
                        IntB1 = IntB1+IntB2;
                        IntB1 = IntB1/60;
                        IntB0 = IntB0+IntB1;
                        IntervaloB = Metodo.ConvertirRadianes(IntB0);
                        
                        //Recortamos los decimales
                        IntervaloA = Metodo.recortarDecimales(IntervaloA, Decimales);
                        IntervaloB = Metodo.recortarDecimales(IntervaloB, Decimales);
                    }
                    
                    //Obtenemos el error
                    Error = Double.parseDouble(txtError.getText());
                    
                    //Enviamos todos los datos a la clase de Calcular
                    Calcular_Regla_Falsa_Tri Calcular = new Calcular_Regla_Falsa_Tri();
                    Calcular.CalcularReglaFalsa(tipoFuncion, Operador7, Operador6, Operador5, Operador4, Operador3, Operador2, Operador1, IntervaloA, IntervaloB, Error, Decimales, X6, X5, X4, X3, X2, X1, constante);
                    
                }
            }
        });
}
    private void validarCaracteres(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char[] charValidos = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ','};
                int aux = 0;
                for (int i = 0; i <= 11; i++) {
                    if (charValidos[i] == e.getKeyChar()) {
                        aux = 1;
                    }
                }
                if (aux == 0) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
    }
    
    
    public void validarCaracteresIntervalos(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                char[] charValidos = {'1','2','3','4','5','6','7','8','9','0','.',',', '-'};
                int aux = 0;
                for (int i = 0; i <= 12; i++) {
                    if (charValidos[i] == e.getKeyChar()) {
                        aux = 1;
                    }
                }
                if (aux == 0) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
    }
    
    
    public static void main(String[] args) {
        Test_Regla_Falsa_Tri ventana = new Test_Regla_Falsa_Tri();
        
        //Llamamos los metodos para validar nuestros caracteres en
        ventana.validarCaracteres(txtX6);
        ventana.validarCaracteres(txtX5);
        ventana.validarCaracteres(txtX4);
        ventana.validarCaracteres(txtX3);
        ventana.validarCaracteres(txtX2);
        ventana.validarCaracteres(txtX1);
        ventana.validarCaracteres(txtCons);
        //Intervalo en Radianes
        ventana.validarCaracteresIntervalos(txtIntervaloA);
        ventana.validarCaracteresIntervalos(txtIntervaloB);
        //Intervalo en Pi Radianes
        ventana.validarCaracteresIntervalos(txtIntAUp);
        ventana.validarCaracteres(txtIntADown);
        ventana.validarCaracteresIntervalos(txtIntBUp);
        ventana.validarCaracteres(txtIntBDown);
        //Intervalo en Sexagesimales
        ventana.validarCaracteresIntervalos(txtIntA0);
        ventana.validarCaracteres(txtIntA1);
        ventana.validarCaracteres(txtIntA2);
        ventana.validarCaracteresIntervalos(txtIntB0);
        ventana.validarCaracteres(txtIntB1);
        ventana.validarCaracteres(txtIntB2);
        
        ventana.validarCaracteres(txtError);
        
        
    }

}