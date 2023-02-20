package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.IOSButton;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.DropDown.IOSDropDown;
import FactoryDesignPattern.Components.Menu.IOSMenu;
import FactoryDesignPattern.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
