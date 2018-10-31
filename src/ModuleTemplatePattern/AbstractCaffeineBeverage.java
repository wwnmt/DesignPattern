package ModuleTemplatePattern;

public abstract class AbstractCaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourIntoCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    boolean customerWantsCondiments() {
        return true;
    }

    private void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
