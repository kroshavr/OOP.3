import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> infoAuto;
    public ServiceStation(Queue<Transport> infoAuto) {
        this.infoAuto = infoAuto;
    }

    public void addToQueue (Transport transport) {
        if (transport.needService()) {
            infoAuto.offer(transport);
        }
    }
    public void technicalInspection () {
        while (infoAuto.poll() != null) {
            System.out.println(infoAuto.poll());
        }
    }
}
