package pensiones;

import javax.swing.JOptionPane;


public class TestPensiones {
    public static void main(String[] args) {
        Pensiones pen = new Pensiones();
        
    double MesadaR;
    int Edad;
    int Trabajo;
    int Opcion;
    int Fuerzas = 0;
    double result=0.0; 
    String Genero;
    double MRetencion;
    double MBono;
    double MFuerza;
    double MAuxilio;
    String MensajeR;
    double MTotal;
    String NombrePensionado;
    
    NombrePensionado = JOptionPane.showInputDialog("Ingrese su nombre\n");
    Opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su genero\n"+
                                                          "1. Hombre\n"+
                                                          "2. Mujer\n"));
    Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    MesadaR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del ultimo sueldo cotizado"));   
    Trabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sector de trabajo\n"+
                                                          "1. Sector Privado\n"+
                                                          "2. Sector Publico\n"));
    if( Trabajo == 2){
    Fuerzas = Integer.parseInt(JOptionPane.showInputDialog("Estuvo en las fuerzas armadas\n"+
                                                          "1. Si\n"+
                                                          "2. No\n")); 
         }
    
    pen.setOpcion(Opcion);
    pen.setEdad(Edad);
    pen.setMesadaR(MesadaR);
    pen.setTrabajo(Trabajo);
    pen.setFuerzas(Fuerzas);
    pen.setSalarioM(895);
    
    Genero = pen.ObtenerGenero();
    MRetencion = pen.CalcularRetencion();
    MensajeR = pen.getMensajeR();
    MBono = pen.CalcularBono();
    MFuerza = pen.CalcularBonoFuerzasA();
    MAuxilio = pen.CalcularAuxilio();
    MTotal = pen.CalcularTotal();
   
            JOptionPane.showMessageDialog(null,"Informacion de los Beneficios y retenciones\n"+
                                                          "* El pensionado: "+ Genero+"\n"+
                                                          "* Con tipo de liquidacióin: "+ MensajeR+"\n"+
                                                          "* Con valor de retencion: "+ MRetencion+" IRD\n"+  
                                                          "* El valor del bono pensional es: "+ MBono+" IDR\n"+
                                                          "* Bono por fuerzas armadas es: "+ MFuerza+"\n"+
                                                          "* Auxilo de transporte: "+ MAuxilio+"\n"+
                                                          "* El pago de su pension mensual. : "+ MTotal+" IDR\n");
    
    
    }
    
}
