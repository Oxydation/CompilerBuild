package utils;

/**
 * Represents the symbol table with a linked list.
 * 
 * @author Mathias
 *
 */
public class SymbolTable {

	public Symbol start;

	public int currentLevel;
	public Scope currentScope;

	public SymbolTable() {
		start = new Symbol(); // should be program symbol
	}

	public void enterScope(Scope scope) {
		currentLevel++;
	}

	public void leaveScope(Scope scope) {
		currentLevel--;
	}

	public void insert(Symbol symbol) {
		Symbol currentSymbol = start;
		while (currentSymbol.next != null) {
			currentSymbol = currentSymbol.next;
		}
		currentSymbol.next = symbol;
	}

	public Symbol lookup(String name) {
		Symbol currentSymbol = start;

		while (currentSymbol.name != null && !currentSymbol.name.equals(name) && currentSymbol.next != null) {
			currentSymbol = currentSymbol.next;
		}

		if (currentSymbol.name != null && currentSymbol.name.equals(name)) {
			return currentSymbol;
		} else {
			return null;
		}
	}

	public void printSymbols() {
		Symbol currentSymbol = start;

		while (currentSymbol.next != null) {
			System.out.println(currentSymbol.name);
			currentSymbol = currentSymbol.next;
		}
	}
}
