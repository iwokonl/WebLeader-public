import Wzorzec.Fasada.Fasadaa;
import Wzorzec.MetodaSzablonowa.Kawa;

public class Main {
    public static void main(String[] args) {
        // Prezentacja metody szablonowej
        Kawa kawa = new Kawa();
        kawa.recepturaPrzygotowania();
        System.out.println();
        System.out.println();
        System.out.println();
        // Prezentacja Fasady
        Fasadaa fasadaa = new Fasadaa(kawa);
        fasadaa.zróbPicie();
    }
}