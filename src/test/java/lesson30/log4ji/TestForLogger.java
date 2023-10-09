package lesson30.log4ji;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TestForLogger {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void logger(){
        System.out.println("hello");
        logger.trace("Trace logging level 600");
        logger.debug("Trace logging level 500");
        logger.info("Trace logging level 400");
        logger.warn("Trace logging level 300");
        logger.error("Trace logging level 200");
        logger.fatal("Trace logging level 100");
    }
}
