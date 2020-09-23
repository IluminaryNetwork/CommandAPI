package dev.jorel.commandapi.arguments;

import dev.jorel.commandapi.CommandAPIHandler;
import dev.jorel.commandapi.wrappers.ScoreboardSlot;

/**
 * An argument that represents the Bukkit ScoreboardSlot object
 */
public class ScoreboardSlotArgument extends SafeOverrideableArgument<ScoreboardSlot> {

	/**
	 * A Display slot argument. Represents scoreboard slots
	 */
	public ScoreboardSlotArgument(String nodeName) {
		super(nodeName, CommandAPIHandler.getNMS()._ArgumentScoreboardSlot(), ScoreboardSlot::toString);
	}

	@Override
	public Class<?> getPrimitiveType() {
		return ScoreboardSlot.class;
	}
	
	@Override
	public CommandAPIArgumentType getArgumentType() {
		return CommandAPIArgumentType.SCOREBOARD_SLOT;
	}
}
