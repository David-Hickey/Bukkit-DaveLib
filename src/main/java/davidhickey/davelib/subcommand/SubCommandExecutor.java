package davidhickey.davelib.subcommand;

import org.bukkit.command.CommandSender;

public interface SubCommandExecutor {

    public boolean execute(SubCommand command, CommandSender sender, String superAlias, String alias, String[] args);

}
