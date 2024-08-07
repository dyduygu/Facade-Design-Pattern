
package facade;

public class AkilliEvSistemi {
    private Klima klima;
    private Kapi kapi;
    private Isik isik;
    private Televizyon televizyon;
    
    public AkilliEvSistemi() {
        klima = new Klima();
        kapi = new Kapi();
        isik = new Isik();
        televizyon = new Televizyon();
    }
    public void isikAc(){
        isik.ac();
    }
    public void isikKapa(){
       isik.kapat();
    }
    public void tvAc(){
       televizyon.ac();
    }
    public void tvKapat(){
        televizyon.kapat();
    }
    public void tvSesAzalt(){
        televizyon.sesAzalt();
    }
    public void tvSesArttır(){
        televizyon.sesArttir();
    }
    public void tvKanalAzalt(){
        televizyon.kanalAzalt();
    }
    public void tvKanalArttır(){
        televizyon.kanalArttir();
    }
    public void klimaGuncelle(int sıcaklık){
        klima.guncelle(sıcaklık);
    }
    public void klimaAc(){
        klima.ac();
    }
    public void klimaKapay(){
        klima.kapat();
    }
    public void kapiKilitle(){
        kapi.kilitle();
    }
    public void kilitAc(){
        kapi.kilitAc();
    }
    public void sinemaModu(){
        System.out.println("Sinema Modu açık");
        isik.kapat();
        kapi.kilitle();
    }
   public void misafirModu(){
       System.out.println("Misafir Modu Aktif");
       isik.ac();
       klima.ac();
       televizyon.ac();
       kapi.kilitAc();
   }
}