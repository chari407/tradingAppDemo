package com.db.tradingAppDemo.service.impl;

import com.db.tradingAppDemo.enums.SignalType;
import com.db.tradingAppDemo.service.Algo;
import com.db.tradingAppDemo.service.SignalProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignalThreeProcessor implements SignalProcessor {

    @Autowired
    private Algo algo;

    @Override
    public void processSignal() {
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
    }

    @Override
    public SignalType type() {
        return SignalType.THREE;
    }
}
