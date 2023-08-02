package com.gihub.bixboy.UI.Panel;

import com.gihub.bixboy.UI.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {
    void init(PanelManager panelManager);
    GridPane getLayout();
    void onShow();
    String getName();
    String getStylesheetPath();
}
