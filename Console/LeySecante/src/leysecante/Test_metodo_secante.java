package leysecante;

//Importamos librerias
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Test_metodo_secante extends JFrame{
    
   
    
    
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
    private JLabel etiqueta;
    
    
    //Declaramos los comboBox
    private JComboBox cbxOperador7;
    private JComboBox cbxOperador6;
    private JComboBox cbxOperador5;
    private JComboBox cbxOperador4;
    private JComboBox cbxOperador3;
    private JComboBox cbxOperador2;
    private JComboBox cbxOperador1;
    private JComboBox cbxDecimales;
    
    //Declaramos TextField
    static private JTextField txtX6;
    static private JTextField txtX5;
    static private JTextField txtX4;
    static private JTextField txtX3;
    static private JTextField txtX2;
    static private JTextField txtX1;
    static private JTextField txtCons;
    static private JTextField txtIntervaloA;
    static private JTextField txtIntervaloB;
    static private JTextField txtError;
    
    //Declaramos los botones
    private JButton btnCalcular;
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
    
    //Creamos variables pata trabajar nuestros valores de los limites, el error y los decimales;
        private Double IntervaloA;
        private Double IntervaloB;
        private Double Error;
        private String Decimales;
    
    private Test_metodo_secante(){
        
        
        //setSize(930, 230); //Tamaño
        
	setTitle(" Método de la Secante "); //Titulo
        setLayout(null);
        setBounds(30, 30, 1080,720); //Margenes
        
        //setLocation(500, 200); //Locacion en la pantalla
        //setResizable(true); //Da la opcion de agrandar la ventana (habilitar el boton maximizar)
        //setLayout(new GridLayout(5,3,5,10)); //Dar formato a la ventana (Filas, columnas)
        
        //Creamos los JLabel
        etiqueta = new JLabel(new ImageIcon(getClass().getResource("Mia.jpg")));
        etiqueta.setBounds(20,20,800,700);
        etiqueta.setLocation(150,150);
        etiqueta.setVisible(true);
        
        lblIngreso = new JLabel("Llene los campos vacios con lo que se le indique");
            //Ecuacion
        lblX6 = new JLabel("x^6");
        lblX5 = new JLabel("x^5");
        lblX4 = new JLabel("x^4");
        lblX3 = new JLabel("x^3");
        lblX2 = new JLabel("x^2");
        lblX1 = new JLabel("x^1");
            //Intervalos
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
        
        //Creamos el boton
        btnCalcular = new JButton("Calcular");
        
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
            //Intervalos
        lblInterA.setBounds(20, 110, 80, 20);
        txtIntervaloA.setBounds(100, 110, 60, 20);
        lblInterB.setBounds(20, 140, 80, 20);
        txtIntervaloB.setBounds(100, 140, 60, 20);
            //Error y Decimales
        lblError.setBounds(20, 190, 110, 20);
        txtError.setBounds(120, 190, 60, 20);
        lblDecimal.setBounds(20, 220, 110, 20);
        cbxDecimales.setBounds(120, 220, 40, 20);
            //Boton de calcular
        btnCalcular.setBounds(910, 220, 100, 20);
        //Añadimos los JLabel
        add(etiqueta);
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
            //Intervalos
        add(lblInterA);
        add(txtIntervaloA);
        add(lblInterB);
        add(txtIntervaloB);
            //Error y Decimales
        add(lblError);
        add(txtError);
        add(lblDecimal);
        add(cbxDecimales);
        add(btnCalcular);
        setVisible(true); //Mostrar verntana
       // pack();
        
        //Objeto que conecta nuestras clases
        final Calcular_metodo_secante calcular = new Calcular_metodo_secante();
        
        
        btnCalcular.addActionListener(new ActionListener() { //Agregamos una accion al boton
            @Override
            public void actionPerformed(ActionEvent e) {
                //Comprobamos si los intervalos, el error y los decimales están vacios. En caso de estarlo se le da una notificacion 
                if(txtIntervaloA.getText().equals("") || txtIntervaloB.getText().equals("") || txtError.getText().equals("")){
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
                    
                    //Convertimos los valores de nuestros intervalos, error y decimales
                    IntervaloA = Double.parseDouble(txtIntervaloA.getText());
                    IntervaloB = Double.parseDouble(txtIntervaloB.getText());
                    Error = Double.parseDouble(txtError.getText());
                    Decimales = (String) cbxDecimales.getSelectedItem();
                    
                    //Enviamos los valores a la clase de metodo para que trabajen
                    calcular.CalcularSecante(Operador7, Operador6, Operador5, Operador4, Operador3, Operador2, Operador1, IntervaloA, IntervaloB, Error, Decimales, X6, X5, X4, X3, X2, X1, constante);
                  
                        
                    
                }
            }
        });
    }
    
    private void validarCaracteres(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                //Una validacion para que solo tome estos 11 caracteres 
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
    
    private void validarCaracteresIntervalos(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                //Validacion en los intervalos para los caracteres 
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
        Test_metodo_secante ventana = new Test_metodo_secante();
        
        
        //Llamamos los metodos para validar nuestros caracteres en cada txt
        
        ventana.validarCaracteres(txtX6);
        ventana.validarCaracteres(txtX5);
        ventana.validarCaracteres(txtX4);
        ventana.validarCaracteres(txtX3);
        ventana.validarCaracteres(txtX2);
        ventana.validarCaracteres(txtX1);
        ventana.validarCaracteres(txtCons);
        ventana.validarCaracteresIntervalos(txtIntervaloA);
        ventana.validarCaracteresIntervalos(txtIntervaloB);
        ventana.validarCaracteres(txtError);
         
    }
 
}
