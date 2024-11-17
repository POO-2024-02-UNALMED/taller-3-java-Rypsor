package taller3.televisores;

public class TV {
    private static int numTV;
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = canal;
        this.precio = precio;
        this.volumen = volumen;
        this.control = control;
        numTV++;

    }
    
    static int getNumTV(){
        return numTV;
    }
    static void setNumTV(int nuevoNumTV){
        TV.numTV = nuevoNumTV;

    }

    void turnOn(){
        this.estado = false;  // encender
    }
    void turnOff(){        // apagar
        this.estado = true;
    }

    void canalUp(){                 // siguiente canal
        if (estado && canal <120){
            canal+=1;
        }      
    }
    void canalDown(){               // canal anterior
        if(estado && canal>1){
            canal--;

        }
        
    }

    void volumenUp(){
        if(estado && volumen < 7){
            volumen++;
        }
    }
    void volumenDown(){
        if(estado && volumen >0){
            volumen--;
        }
    }
    

    boolean getEstado(){
        return estado;
    }

    Marca getMarca(){
        return marca;
    }
    void setMarca(Marca nuevaMarca){
        this.marca = nuevaMarca;
    }

    int getCanal(){
        return canal;
    }
    void setCanal(int nuevoCanal){
        this.canal = nuevoCanal;
    }

    int getPrecio(){
        return precio;
    }
    void setPrecio(int nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    int getVolumen(){
        return volumen;
    }
    void setVolumen(int nuevoVolumen){
        this.volumen = nuevoVolumen;
    }

    Control getControl(){
        return control;
    }
    void setControl(Control nuevoControl){
        this.control = nuevoControl;
    }
    
    









    







}
