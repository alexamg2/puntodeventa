/**
 * @author FRANCISCO DIAZ DIEGO
 */
package Restrincion;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validaciones {
    public static void esNumeroEntero(java.awt.event.KeyEvent evt, javax.swing.JTextField jt){
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')) {            
            evt.consume();               
        }               
    }
    
    //validar un rango de valores numerico en el txt
    public static boolean esNumeroNoValido(javax.swing.JTextField jt, int li, int ls, String msg){
        int valor=Integer.parseInt(jt.getText());
        if(valor<li || valor>ls){ 
           JOptionPane.showMessageDialog(null, msg);
           jt.setText(null);
           jt.requestFocus();
           return true;
        } 
        return false;
    }
    
    //Método para validar que el txt no este vacio
    public static boolean esCajaVacia(javax.swing.JTextField cajaTexto, String msj){
        if(cajaTexto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, msj);
            cajaTexto.requestFocus();
            return true;
        }
        else
            return false;        
    }
    
    //Revisar la longitud de un campo de texto
    public static void revisarLongitud(java.awt.event.KeyEvent evt, javax.swing.JTextField jt,int lim){
        if(jt.getText().length()==lim){ 
            evt.consume(); 
        } 
        
    }
    
    //la caja solo acepta texto
    public static void TextoSinEspacio(KeyEvent evt){
        char caracter=evt.getKeyChar();
         if (!Character.isLetter(caracter) ){
             Toolkit.getDefaultToolkit().beep();
             evt.consume();
             //JOptionPane.showMessageDialog(null, evt);
         }
    }
    
     //la caja acepta Texto y Espacios
    public static void TextoConEspacios(KeyEvent evt){
        char caracter=evt.getKeyChar();
         if (!Character.isLetter(caracter) && caracter !=KeyEvent.VK_SPACE){
             Toolkit.getDefaultToolkit().beep();
             evt.consume();
             //JOptionPane.showMessageDialog(null, evt);
         }
    }

}
