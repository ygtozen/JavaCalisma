public class Main {

    public static void main(String args[]){
        KrediUI krediUI = new KrediUI();
        // OgretmenKrediManager, TarimKrediManager, AskerKrediManager class'ları BaseKrediManager'den extends
        // kalıtım aldığı için BaseKrediManager parametresi olarak kullanabiliriz.
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
