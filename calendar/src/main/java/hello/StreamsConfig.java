package hello;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Streams.class)
public class StreamsConfig {

}

