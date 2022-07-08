package design.pattern.factory;

import design.pattern.factory.button.Button;
import design.pattern.factory.button.HtmlButton;


public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
