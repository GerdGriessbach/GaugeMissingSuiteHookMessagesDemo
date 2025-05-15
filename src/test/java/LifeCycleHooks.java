import java.util.UUID;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.AfterStep;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.datastore.SuiteDataStore;

public class LifeCycleHooks {

    @BeforeSuite
    public static void beforeSuite() throws InterruptedException {

        // extend Gauge report
        Gauge.writeMessage("Message from @BeforeSuite");
    }

    @AfterSuite
    public static void afterSuite() throws InterruptedException {

        // extend Gauge report
        Gauge.writeMessage("Message from @AfterSuite");
    }
}
