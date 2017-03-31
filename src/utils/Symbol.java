package utils;

public class Symbol {
	/**
	 * Represents the kind of a symbol.
	 * @author Mathias
	 *
	 */
	public enum Kind {
		Undefined,
		Constant,
		Variable,
		Parameter,
		Function
	}
	
	public Type type;
	
	/**
	 * The kind of the symbol.
	 */
	public Kind kind;
	public String name;
	
	public boolean init;
	public int value;
	public int address;
	
	public boolean defined;
	public Symbol symbols;
	public int level;
	public Symbol next;
}
