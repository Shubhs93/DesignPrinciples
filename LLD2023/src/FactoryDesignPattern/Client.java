package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlatForm.ANDROID);
        UIFactory factory=flutter.createUIFactory();
        Menu menu=factory.createMenu();
        Button button=factory.createButton();
        DropDown dropDown=factory.createDropDown();
    }
}
