
package facade;
public class Isik {
    private boolean durum;

    public Isik() {
        this.durum = false;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
    
     public void ac() { 
        durum = true;
        System.out.println("Işık açıldı."); 
    }

    public void kapat() { 
        durum = false;
        System.out.println("Işık kapatıldı."); 
    }
    
}