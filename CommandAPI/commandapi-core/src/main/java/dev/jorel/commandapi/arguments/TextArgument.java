package dev.jorel.commandapi.arguments;

import com.mojang.brigadier.arguments.StringArgumentType;

/**
 * An argument that represents text, encased in quotes
 */
public class TextArgument extends Argument {

	/**
	 * A string argument for one word, or multiple words encased in quotes
	 */
	public TextArgument(String nodeName) {
		super(nodeName, StringArgumentType.string());
	}

	@Override
	public Class<?> getPrimitiveType() {
		return String.class;
	}
	
	@Override
	public CommandAPIArgumentType getArgumentType() {
		return CommandAPIArgumentType.SIMPLE_TYPE;
	}
}
