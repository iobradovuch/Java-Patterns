package ua.iobradovuch.lab6.part5.formTemplateMethod;

class PastaRecipe extends CookingRecipe {
    @Override
    protected void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking pasta");
    }
}