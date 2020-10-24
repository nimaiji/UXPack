package Core;

/**
 * Created by nima on 10/24/2020 AD.
 */
public class EventLogger extends UXTool {

    @Override
    public void run() {
        System.out.println("Event Logger");
    }

    @Override
    public void active() {
        super.active();
    }

    @Override
    void shutDown() {
        super.shutDown();
    }

    @Override
    boolean doBrake() {
        return super.doBrake();
    }
}
