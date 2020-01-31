/*package junit;

import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class InfluxListenerRunner extends BlockJUnit4ClassRunner {

    private final MyTestListener listener;

    public InfluxListenerRunner(Class<?> klass) throws InitializationError {
        super(klass);
        this.listener = new MyTestListener();
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(listener);
        notifier.fireTestRunStarted(Description.TEST_MECHANISM);
        super.run(notifier);
    }

}*/
