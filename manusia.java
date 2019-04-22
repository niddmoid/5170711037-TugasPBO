package tugaspengganti;

public class manusia {
    protected String gender, status;
    
    public String getKelamin(){
        return gender;
    }
    public void setKelamin(String gender){
        this.gender = gender;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void from(){
        System.out.println("Asal : ");
    }
    
    
}
