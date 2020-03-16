package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Here are the list of commands available:"
            + "\n add - add a new recipe"
            + "\n addStep - add steps to selected recipe"
            + "\n edit - edit selected recipe"
            + "\n find - find a specific recipe"
            + "\n delete - delete selected recipe"
            + "\n list - list all recipes"
            + "\n switch - switch tabs"
            + "\n exit - to leave HYBB";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}
