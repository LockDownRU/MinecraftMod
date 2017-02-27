package name.lockdown.mod.api.util.helper;


import name.lockdown.mod.api.ModAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {

    private Logger logger;

    public LogHelper(String logger)
    {
        this.logger = LogManager.getLogger(logger);
    }

    public void info(String info, Object... format)
    {
        if (ModAPI.isLoggingEnabled())
            logger.info(info, format);
    }

    public void error(String error, Object... format)
    {
        if (ModAPI.isLoggingEnabled())
            logger.error(error, format);
    }

    public void debug(String debug, Object... format)
    {
        if (ModAPI.isLoggingEnabled())
            logger.debug(debug, format);
    }

    public void fatal(String fatal, Object... format)
    {
        logger.error(fatal, format);
    }

    public Logger getLogger()
    {
        return logger;
    }
}
