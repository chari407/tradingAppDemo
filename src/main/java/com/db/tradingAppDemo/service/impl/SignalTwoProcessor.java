package com.db.tradingAppDemo.service.impl;

import com.db.tradingAppDemo.enums.SignalType;
import com.db.tradingAppDemo.service.Algo;
import com.db.tradingAppDemo.service.SignalProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignalTwoProcessor implements SignalProcessor {

    @Autowired
    private Algo algo;

    @Override
    public void processSignal() {
        algo.reverse();
        algo.setAlgoParam(1, 80);
        algo.submitToMarket();
    }

    @Override
    public SignalType type() {
        return SignalType.TWO;
    }
}
