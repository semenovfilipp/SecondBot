package org.example.service.impl;

import lombok.extern.log4j.Log4j;
import org.example.service.UpdateProducer;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Log4j
public class UpdateProducerImpl implements UpdateProducer {
    @Override
    public void produce(String RabbitQueue, Update update) {
        log.debug(update.getMessage().getText());
    }
}
