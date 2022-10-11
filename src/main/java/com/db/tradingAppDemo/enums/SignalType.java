package com.db.tradingAppDemo.enums;

public enum SignalType {
    DEFAULT(0),
    ONE(1),
    TWO(2),
    THREE(3);

    public final int signalCode;

    SignalType(int signalCode) {
        this.signalCode = signalCode;
    }
}
