import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorWarning {

    private static final Logger log =
            LoggerFactory.getLogger(ErrorWarning.class);

    public static void main(String[] args) {

        log.warn("Low memory warning");

        log.error("Application error occurred");

    }
}