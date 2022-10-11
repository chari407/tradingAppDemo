package com.db.tradingAppDemo.service;

import com.db.tradingAppDemo.enums.SignalType;

public interface SignalProcessor {
    void processSignal();

    SignalType type();
}
