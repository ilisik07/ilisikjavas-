/**
 *
 * @author ilisi
 */
public class degeratama extends insan {
    public static void main(String[] args) {
        ogrenci og = new ogrenci();
        og.setIsim("Mustafa İLİŞİK");
        og.setDogumtarihi("16 Ekim 1996");
        og.setDogumyeri("Serik");
        og.setTcno("12345678900");
        og.setYas(24);
        
        og.setBolum("BPR");
        og.setFakulte("TBMYO");
        og.setOgNo("1813409051");
        og.setAgno(3.20);
        
        og.ogrencibilgileri();
        
    }
}
