
package facade;

public class Televizyon {
    private int sesSeviye;
    private int kanalNumara;

    public Televizyon() {
        this.sesSeviye = 10; 
        this.kanalNumara = 1; 
    }

    public void ac() { 
        System.out.println("Televizyonu açtınz"); 
    }

    public void kapat() { 
        System.out.println("Televizyon kapattınız"); 
    }

    public void sesAzalt() {
        if (sesSeviye > 0) {
            sesSeviye--;
            System.out.println("Ses seviyesi azaltıldı. Yeni ses seviyesi: " + sesSeviye);
        } else {
            System.out.println("Ses zaten en düşük seviyede.");
        }
    }

    public void sesArttir() {
        if (sesSeviye < 100) {
            sesSeviye++;
            System.out.println("Ses seviyesi arttırıldı. Yeni ses seviyesi: " + sesSeviye);
        } else {
            System.out.println("Ses zaten en yüksek seviyede.");
        }
    }

    public void kanalAzalt() {
        if (kanalNumara > 1) {
            kanalNumara--;
            System.out.println("Kanal azalttınız. şu anki numara: " + kanalNumara);
        } else {
            System.out.println("en düşük kanal");
        }
    }

    public void kanalArttir() {
        kanalNumara++;
        System.out.println("Kanal arttırdınız. şu anki numara: " + kanalNumara);
    }
}