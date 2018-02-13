package com.scc.events.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.scc.agria.services.DogService;
import com.scc.events.CustomChannels;
import com.scc.events.models.DogChangeModel;

@EnableBinding(CustomChannels.class)
public class DogChangeHandler {

    @Autowired
    private DogService dogService;

    private static final Logger logger = LoggerFactory.getLogger(DogChangeHandler.class);

    @StreamListener("inboundDogChanges")
    public void loggerSink(DogChangeModel dogChange) {
        logger.debug("Received a message of type {} traceId {} ", dogChange.getType(), dogChange.getTraceId());
        switch(dogChange.getAction()){
            case "GET":
                logger.debug("Received a GET event from daemon service for dog id {}", dogChange.getDog().getId());
                break;
            case "SAVE":
            case "UPDATE":
                logger.debug("Received a {} event from the daemon service for dog id {}", dogChange.getAction(), dogChange.getDog().toString());
                dogService.saveDog(dogChange.getDog(), dogChange.getTimestamp());
                break;
            case "DELETE":
                logger.debug("Received a DELETE event from the daemon service for dog id {}", dogChange.getDog().getId());
                dogService.deleteDogById(dogChange.getDog().getId());
                break;
            default:
                logger.error("Received an UNKNOWN event from the organization service of type {}", dogChange.getDog().getId());
                break;
        }
    }
}
