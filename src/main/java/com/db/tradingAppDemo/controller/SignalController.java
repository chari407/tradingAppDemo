package com.db.tradingAppDemo.controller;

import com.db.tradingAppDemo.exchanges.SignalHandleRequestDTO;
import com.db.tradingAppDemo.service.SignalHandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signal")
public class SignalController {

    @Autowired
    private SignalHandlerFactory signalHandlerFactory;

    @PostMapping
    public void handleSignal(@RequestBody SignalHandleRequestDTO signalHandleRequestDTO) {
        signalHandlerFactory.handleSignal(signalHandleRequestDTO.getSignalCode());
    }
}
