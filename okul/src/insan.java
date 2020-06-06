/**
 *
 * @author ilisi
 */
public class insan {
    private String isim,dogumtarihi,tcno,dogumyeri;
    private int yas;

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the dogumtarihi
     */
    public String getDogumtarihi() {
        return dogumtarihi;
    }

    /**
     * @param dogumtarihi the dogumtarihi to set
     */
    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    /**
     * @return the tcno
     */
    public String getTcno() {
        return tcno;
    }

    /**
     * @param tcno the tcno to set
     */
    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    /**
     * @return the dogumyeri
     */
    public String getDogumyeri() {
        return dogumyeri;
    }

    /**
     * @param dogumyeri the dogumyeri to set
     */
    public void setDogumyeri(String dogumyeri) {
        this.dogumyeri = dogumyeri;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }
    public void insanbilgileri(){
        System.out.println("---İnsani Bilgiler---");
        System.out.println("İsim = " + isim);
        System.out.println("Doğum Tarihi = " + dogumtarihi);
        System.out.println("Yaşı = " + yas);
        System.out.println("Doğum Yeri = " + dogumyeri);
        System.out.println("T.C. Kimlik Numarası = " + tcno);
    }
}
