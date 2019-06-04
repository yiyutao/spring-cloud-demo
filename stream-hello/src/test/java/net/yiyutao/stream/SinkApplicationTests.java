package net.yiyutao.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author masteryi
 * @version 1.0
 **/
@RunWith(SpringRunner.class)
@EnableBinding(value = {SinkApplicationTests.SinkSender.class})
public class SinkApplicationTests {

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void sinkSenderTest() {
        sinkSender.output().send(MessageBuilder.withPayload("hello rabbitmq").build());
    }

    public interface SinkSender {
        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();
    }
}
