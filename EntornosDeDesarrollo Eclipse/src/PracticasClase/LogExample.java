package PracticasClase;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

 

public class LogExample {

    private static final Logger logger = LogManager.getLogger(LogExample.class);

 

    public static void main(String[] args) {

        logger.info("Aplicación iniciada.");

        try {

            int result = 10 / 0; // Genera un error

        } catch (Exception e) {

            logger.error("Ocurrió un error: " + e.getMessage(), e);

        }

        logger.warn("Esta es una advertencia.");

        logger.info("Aplicación finalizada.");

    }

}