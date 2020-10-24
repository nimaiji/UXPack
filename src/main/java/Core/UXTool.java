package Core;

/**
 * Created by nima on 10/24/2020 AD.
 */
public abstract class UXTool extends Thread {

    boolean brake = false;
    boolean isActive = false;

    void active() {
        if (!isActive) {
            this.start();
            isActive = true;
        }
    }

    void shutDown() {
        if (isActive) {
            while (brake || isActive) {
                if (this.doBrake())
                    isActive = false;
            }
        }
    }

    boolean doBrake() {
        this.brake = true;
        return this.isAlive();
    }
}
