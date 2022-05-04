package Business.ekg;

public interface EkgObservable extends Runnable {
    void register(EKGObserver EkgObserver);
}
