package trade.giottus.batch;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

@Slf4j
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) {
        for (String msg : messages) {
            log.info("Writing the data " + msg);
        }
    }

}