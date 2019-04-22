package tugaspengganti;

public class subclas extends manusia {

    public void kelamin() {
        this.setKelamin("laki-laki");
        System.out.println("Gender : "+this.getKelamin());
    }
    public void status() {
        this.setStatus("Lajang");
        System.out.println("Status : "+this.getStatus());
    }
    @Override
    public void from(){
        super.from();
        System.out.println("Pati");
    }
}
