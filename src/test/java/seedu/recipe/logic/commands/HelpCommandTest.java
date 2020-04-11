package seedu.recipe.logic.commands;

import static seedu.recipe.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.recipe.logic.commands.common.HelpCommand.SHOWING_HELP_MESSAGE;

import org.junit.jupiter.api.Test;

import seedu.recipe.logic.commands.common.HelpCommand;
import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;

public class HelpCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_help_success() {
        CommandResult expectedCommandResult = new CommandResult(SHOWING_HELP_MESSAGE, false,
                true, null, false);
        assertCommandSuccess(new HelpCommand(), model, expectedCommandResult, expectedModel);
    }
}
