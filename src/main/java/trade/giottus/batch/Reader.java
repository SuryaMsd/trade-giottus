package trade.giottus.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

    // Keeping this array with only one element, so that everytime we will invoke the script only once.
    private String[] messages = { "mykas3trade" };

    private int count = 0;

    @Override
    public String read() throws UnexpectedInputException {
        String result = null;

        if (count < messages.length) {
            result = messages[count++];
        } else {
            count = 0;
        }
        return result;
    }

}
