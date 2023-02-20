package FactoryDesignPattern;


public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatForm platform){
        if(platform==SupportedPlatForm.ANDROID){
            return new AndroidUIFactory();
        }else if(platform==SupportedPlatForm.IOS){
            return new IOSUIFactory();
        }
        return null;
    }

}
