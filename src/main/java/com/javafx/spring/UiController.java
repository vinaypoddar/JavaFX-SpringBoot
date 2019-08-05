package com.javafx.spring;

import org.springframework.stereotype.Component;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Component
public class UiController {

    private final HostServices hostServices;

    @FXML
    public Label label;

    public UiController(final HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @FXML
    public void initialize() {
        this.label.setText(this.hostServices.getDocumentBase());
    }
}
