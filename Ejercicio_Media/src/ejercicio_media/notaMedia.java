package ejercicio_media;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class notaMedia {
    private double notaTeoria;
    private double notaPractica;
    
    public float pedirNotas(){
        
        float res;
        do {
       res = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota : "));
       
    }while(res < 1 || res > 10);
    return res;
    }
    
    public void ponerNotasTeorico(){
        int cont , numNotas;
        float nota;
        float suma = 0;
        
        numNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de notas de examen teorico : "));
        for(cont = 0 ; cont<numNotas ; cont++){
           nota = pedirNotas();
           suma += nota;
    }
        
     notaTeoria = suma / numNotas * 0.4;
     JOptionPane.showMessageDialog(null,"La nota media de la teoria es : " + notaTeoria);
     
    }
     public void ponerNotasPractico(){
        int cont , numNotas;
        float nota;
        float suma = 0;
        
        numNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de notas de examen practico : "));
        for(cont = 0 ; cont<numNotas ; cont++){
           nota = pedirNotas();
           suma += nota;
    }
        
     notaPractica = suma / numNotas * 0.4;
     JOptionPane.showMessageDialog(null,"La nota media de la practica es : " + notaPractica);
     
    }
  }


     
            