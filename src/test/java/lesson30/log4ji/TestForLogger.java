package lesson30.log4ji;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TestForLogger {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void logger(){
        logger.info("Trace logging level");
    }
}
