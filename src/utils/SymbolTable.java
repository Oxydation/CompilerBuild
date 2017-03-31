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
	}

	public void enterScope(Scope scope) {
		currentLevel++;
	}

	public void leaveScope(Scope scope) {
		currentLevel--;
	}

	public void insert(Symbol symbol) {
		if (start == null) {
			start = symbol;
		} else {
			Symbol currentSymbol = start;
			while (currentSymbol.next != null) {
				currentSymbol = currentSymbol.next;
			}
			currentSymbol.next = symbol;
		}
	}

	public Symbol lookup(String name) {
		if (start != null) {
			Symbol currentSymbol = start;

			while (currentSymbol.name != null && !currentSymbol.name.equals(name) && currentSymbol.next != null) {
				currentSymbol = currentSymbol.next;
			}

			if (currentSymbol.name != null && currentSymbol.name.equals(name)) {
				return currentSymbol;
			}
		}

		return null;
	}

	public void printSymbols() {
		Symbol currentSymbol = start;
		
		while (currentSymbol.next != null) {
			System.out.println(currentSymbol.name + " - " + currentSymbol.kind);
			currentSymbol = currentSymbol.next;
		}		
		System.out.println(currentSymbol.name + " - " + currentSymbol.kind);
	}
}
