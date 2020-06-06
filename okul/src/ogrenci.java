/**
 *
 * @author ilisi
 */
public class ogrenci extends insan {
    private String ogNo,fakulte,bolum;
    private double agno;

    /**
     * @return the ogNo
     */
    public String getOgNo() {
        return ogNo;
    }

    /**
     * @param ogNo the ogNo to set
     */
    public void setOgNo(String ogNo) {
        this.ogNo = ogNo;
    }

    /**
     * @return the fakulte
     */
    public String getFakulte() {
        return fakulte;
    }

    /**
     * @param fakulte the fakulte to set
     */
    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    /**
     * @return the bolum
     */
    public String getBolum() {
        return bolum;
    }

    /**
     * @param bolum the bolum to set
     */
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    /**
     * @return the agno
     */
    public double getAgno() {
        return agno;
    }

    /**
     * @param agno the agno to set
     */
    public void setAgno(double agno) {
        this.agno = agno;
    }
   public void ogrencibilgileri(){
       insanbilgileri();
       System.out.println("---Öğrencilik Bilgileri---");
       System.out.println("Öğrenci Numarası = " + ogNo);
       System.out.println("Fakülte = " + fakulte);
       System.out.println("Bölümü = " + bolum);
       System.out.println("Ağırlıklı Genel Not Ortalaması = " + agno);
   }
}
