
package facade;

public class Klima {
    private int sıcaklık;
    
    public int getSıcaklık() {
        return sıcaklık;
    }

    public void setSıcaklık(int sıcaklık) {
        this.sıcaklık = sıcaklık;
    }
    public void ac() { 
        System.out.println("Klimayı açtınız."); 
    }
    public void kapat() { 
        System.out.println("Klima kapattınız."); 
    }
    public void guncelle(int sıcaklık){
        setSıcaklık(sıcaklık);
    }
}
