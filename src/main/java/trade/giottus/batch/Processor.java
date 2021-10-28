package trade.giottus.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) {
        return data.toUpperCase();
    }

}
