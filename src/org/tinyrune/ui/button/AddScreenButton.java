package org.tinyrune.ui.button;

import org.tinyrune.Client;
import org.tinyrune.ui.UIButton;

import java.awt.event.ActionEvent;

public class AddScreenButton extends UIButton {

    private Client client;

    public AddScreenButton(Client client) {
        super(client);
        this.setButtonIcon("plus.png");
        this.client = client;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.client.addRunescapeClient();
    }
}
