package taller3.televisores;

public class TV {
    private static int numTV;
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.precio = 500;
        this.volumen = 1;
        this.control = control;
        numTV++;

    }
    
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int nuevoNumTV){
        TV.numTV = nuevoNumTV;

    }

    public void turnOn(){
        this.estado = false;  // encender
    }
    public void turnOff(){        // apagar
        this.estado = true;
    }

    public void canalUp(){                 // siguiente canal
        if (estado && canal <120){
            canal+=1;
        }      
    }
    public void canalDown(){               // canal anterior
        if(estado && canal>1){
            canal--;

        }
        
    }

    public void volumenUp(){
        if(estado && volumen < 7){
            volumen++;
        }
    }
    public void volumenDown(){
        if(estado && volumen >0){
            volumen--;
        }
    }
    

    public boolean getEstado(){
        return estado;
    }

    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca nuevaMarca){
        this.marca = nuevaMarca;
    }

    public int getCanal(){
        return canal;
    }
    public void setCanal(int nuevoCanal){
        if (nuevoCanal>0 && nuevoCanal<121){
            this.canal = nuevoCanal;}
    }

    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int nuevoVolumen){
        this.volumen = nuevoVolumen;
    }

    public Control getControl(){
        return control;
    }
    public void setControl(Control nuevoControl){
        this.control = nuevoControl;
    }
    
    









    







}
