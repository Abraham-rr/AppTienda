
package Tienda;

public class Cliente implements subject{
   private final String name;

     public Cliente(String name) {
        this.name = name;
    }
     
     public String getName(){
         return name;
     }
     
    @Override
    public void notifyObserver(Observer observer) {
        System.out.println(this.name + "Hola " + "Has recibido una notifiacion " );
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }

    @Override
    public void removeObserver() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void registerObserver() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void registerObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
   
   
   
}
