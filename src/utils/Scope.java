package utils;

public class Scope {
	public Scope outerScope;
	public int level = 0;
	public int numberOfParams;
	public int numberOfLocals;
	
	public Symbol locals;
}
