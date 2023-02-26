import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> infoAuto;
    public ServiceStation(Queue<Transport> infoAuto) {
        this.infoAuto = infoAuto;
    }

    public void addToQueue (Transport transport) {
        if (transport.getClass() != Bus.class) {
            infoAuto.add(transport);
        }
    }
    public void technicalInspection () {
        infoAuto.remove();
    }
}
