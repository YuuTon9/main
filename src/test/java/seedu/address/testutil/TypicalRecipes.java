package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_GOAL_GRAIN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GOAL_PROTEIN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_INGREDIENT_FISH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_INGREDIENT_TURKEY_SANDWICH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_FISH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_TURKEY_SANDWICH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STEP_FISH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STEP_TURKEY_SANDWICH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TIME_FISH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TIME_TURKEY_SANDWICH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.RecipeBook;
import seedu.address.model.recipe.Recipe;

/**
 * A utility class containing a list of {@code Recipe} objects to be used in tests.
 */
public class TypicalRecipes {

    public static final Recipe CAESAR_SALAD = new RecipeBuilder().withName("Vegan Thai Green Curry Soup")
            .withTime("35")
            .withIngredients("button mushrooms sliced, 4-5, vegetables",
                    "broccoli florets, 1 cup, vegetables",
                    "thai Green Curry Paste, 1 tbsp, others",
                    "coconut milk, 1/4 cup, others",
                    "vegetable stock, 4 Cups, vegetables",
                    "rice vermicelli noodles, 1, carbs",
                    "oil, 2 teaspoon, others",
                    "Salt, 1 tsp, others",
                    "Thai red eye bird's chili, 2, vegetables",
                    "soy sauce, 1 teaspoon, others",
                    "brown sugar, 1/2 teaspoon, others")
            .withSteps("Heat oil in a saucepan. Add the vegetables (broccoli, mushroom) and saute till they turn soft. Transfer to a plate and set aside.",
                    "In the same saucepan, add the green curry paste. Saute the curry paste for a minute.",
                    "Add the coconut milk, brown sugar and soy sauce. Stir until the curry paste is nicely dissolved.",
                    "Now add the vegetable stock, salt, red chillies and stir to combine.",
                    "Bring the soup to a boil over high heat. Reduce the heat and allow the soup to simmer for 5 minutes.",
                    "Add the vermicelli noodles and the vegetables. Simmer till the noodles are cooked.",
                    "Turn off the heat and give soup a nice stir. Taste and adjust the seasoning and consistency accordingly. If too thick add more stock or coconut milk.",
                    "Just before serving garnish soup with fresh herbs, crushed peanuts and juice of lemon.",
                    "Serve Thai Green Curry Soup warm.")
            .withGoals("Herbivore").build();

    public static final Recipe GRILLED_SANDWICH = new RecipeBuilder().withName("Thai Basil Ground Beef Bowl")
            .withTime("25")
            .withIngredients("95% lean ground beef, 1.33 lb, protein","garlic cloves (minced), 2, vegetables","garlic clove, 1, vegetables",
                    "fresh ginger (minced), 1 tbsp, protein","asparagus (chopped), 2 cups, vegetables")
            .withSteps("Prepare the cauliflower rice. Chop the cauliflower into florets and add to a food processor with the onion and garlic. Pulse into fine rice like pieces. You may have to do this in batches depending on your food processor. To cook, saute the cauliflower rice in 1 tbsp. coconut oil over medium heat until soft. You can also microwave it for 4-5 minutes.",
                    "Add the beef to a hot nonstick skillet over medium high heat. Brown and break up the larger chunks as you go until no longer pink.",
                    "Add in the garlic, ginger, green onions, and asparagus. Cook until the asparagus is just tender, about 3-4 minutes.",
                    "Add the soy sauce, chili paste, and basil. Cook for 30 seconds and remove from heat. Taste and season as needed with additional soy or chili sauce.",
                    "Serve the Thai Basil Beef over the cauliflower rice.")
            .withGoals("Bulk like the Hulk").build();

    public static final Recipe BOILED_CHICKEN = new RecipeBuilder().withName("Boiled Chicken")
            .withTime("10")
            .withIngredients("Chicken, 100, protein")
            .withSteps("Dice chicken")
            .withGoals("Bulk like the Hulk").build();

    public static final Recipe CHOCOLATE_CAKE = new RecipeBuilder().withName("Chocolate Cake")
            .withTime("120")
            .withIngredients("Sugar, 100, other")
            .withSteps("Caramelize sugar").build();

    public static final Recipe OMELET = new RecipeBuilder().withName("Omelet")
            .withTime("15")
            .withIngredients("Egg, 50, protein")
            .withSteps("Crack and beat eggs").build();

    public static final Recipe STEAMED_EGG = new RecipeBuilder().withName("Steamed Egg")
            .withTime("15")
            .withIngredients("Egg, 50, protein")
            .withSteps("Pour water into steamer and bring to a boil").build();

    public static final Recipe TUNA_BREAD = new RecipeBuilder().withName("Tuna Bread")
            .withTime("60")
            .withIngredients("Tuna, 100, protein", "Bread, 100, grain")
            .withGoals("Bulk like the Hulk", "Wholesome Wholemeal")
            .withSteps("Slice tuna").build();

    // Manually added
    public static final Recipe FISH_TACO = new RecipeBuilder().withName("Fish Taco").withTime("60")
            .withIngredients("Fish, 100, protein", "Taco, 50, grain")
            .withSteps("Grill fish until skin is slightly crispy and meat is opaque and flaky").build();
    public static final Recipe VEGETARIAN_PIZZA = new RecipeBuilder().withName("Vegetarian Pizza").withTime("45")
            .withIngredients("Tomato sauce, 100, other", "Dough, 300, grain", "Capsicum, 100, vegetable")
            .withGoals("Herbivore").withSteps("Roll dough until stretchy and thin").build();

    // Manually added - Recipe's details found in {@code CommandTestUtil}
    public static final Recipe TURKEY_SANDWICH = new RecipeBuilder().withName(VALID_NAME_TURKEY_SANDWICH)
            .withTime(VALID_TIME_TURKEY_SANDWICH)
            .withIngredients(VALID_INGREDIENT_TURKEY_SANDWICH)
            .withGoals(VALID_GOAL_GRAIN).withSteps(VALID_STEP_TURKEY_SANDWICH).build();
    public static final Recipe FISH = new RecipeBuilder().withName(VALID_NAME_FISH).withTime(VALID_TIME_FISH)
            .withIngredients(VALID_INGREDIENT_FISH)
            .withGoals(VALID_GOAL_PROTEIN).withSteps(VALID_STEP_FISH).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalRecipes() {} // prevents instantiation

    /**
     * Returns an {@code RecipeBook} with all the typical recipes.
     */
    public static RecipeBook getTypicalRecipeBook() {
        RecipeBook ab = new RecipeBook();
        for (Recipe recipe : getTypicalRecipes()) {
            ab.addRecipe(recipe);
        }
        return ab;
    }

    public static List<Recipe> getTypicalRecipes() {
        return new ArrayList<>(Arrays.asList(CAESAR_SALAD, GRILLED_SANDWICH, BOILED_CHICKEN, CHOCOLATE_CAKE,
                OMELET, STEAMED_EGG, TUNA_BREAD));
    }
}
