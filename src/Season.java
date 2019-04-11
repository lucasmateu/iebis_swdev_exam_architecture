import java.util.Observer;

public class Season {

    public class Screen implements Observer {
        @Overridepublic
        void update(Observable o, Object arg) {
            //act on the update
        }

        show.notifyObservers();
    }

}
