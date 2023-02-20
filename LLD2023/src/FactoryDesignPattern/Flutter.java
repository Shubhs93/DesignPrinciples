package FactoryDesignPattern;

public class Flutter {
    private SupportedPlatForm platForm;

    public Flutter(SupportedPlatForm platForm){
        this.platForm=platForm;
    }

    public void setTheme() {
        System.out.println("Theme");
    }

    public void RefreshRate() {
        System.out.println("Rate");
    }

   public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platForm);
    }

}
