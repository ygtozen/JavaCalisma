public abstract class GameCalculator {
    //  Fakat hesaplaya gelinde, hesaplayı kim inherit ediyorsa hesaplayı içermek zorunda, fakat hesaplayı override etmek
    // zorunda yani kendi hesapla'sını yazamak zorunda
    // Abstrack operasyon
    public abstract void hesapla();

    // gameOver'ı kim kullanıyorsa olduğu gibi kulannmak zorunda, hiç bir zaman değişmeyecek bir olaydır.
    // Tamamlanmış opersyan
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
