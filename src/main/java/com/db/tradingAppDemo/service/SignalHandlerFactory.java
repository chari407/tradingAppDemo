package com.db.tradingAppDemo.service;

import com.db.tradingAppDemo.enums.SignalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SignalHandlerFactory implements SignalHandler {
    @Autowired
    private List<SignalProcessor> signalProcessors;

    private Map<Integer, SignalProcessor> signalProcessorsPool = new HashMap<>();

    @PostConstruct
    public void initPool() {
        signalProcessors.forEach(processor -> signalProcessorsPool.put(processor.type().signalCode, processor));
    }

    @Override
    public void handleSignal(int signal) {
        signalProcessorsPool.getOrDefault(signal,
                        signalProcessorsPool.get(SignalType.DEFAULT.signalCode))
                .processSignal();
    }
}
