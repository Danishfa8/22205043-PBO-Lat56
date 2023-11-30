package pkg22205043.pbo.lat56;

/* Nama : Danish Fadlan Azam Nim : 22205043 
 * Prodi : Teknik Informatika
 * Semseter : 3/pagi
 */

class BarangAntik {
    int umur;
    
    public BarangAntik(int umur){
      this.umur = umur;  
    }
    
    public void tampilUmur(){
        System.out.println("Umur Barang Antik ini adalah : " +this.umur+ " tahun ");
        
    }    
}

class Radio extends BarangAntik {
    private String name;

    public Radio(int umur){
        super(umur);
        this.umur = umur;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }          
}

public class PBOLat56{

    public static void main(String[] args) {
        Radio rd = new Radio(234);
        rd.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rd.getName());
        rd.tampilUmur();
    }

}
