package design.pattern.factory;


import design.pattern.factory.button.Button;
import design.pattern.factory.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
