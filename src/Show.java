
import java.util.Observable;

public class Show extends Observable{
    private String data;
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
        //mark the observable as changed
        setChanged();



    }


}
