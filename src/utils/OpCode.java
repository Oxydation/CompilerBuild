package utils;

/**
 * Represents a instruction set for the JustVM, providing most used op codes used within the java VM.
 * @author Mathias
 *
 */
public enum OpCode{
	/**
	 * Do nothing.
	 * nop = 0
	 */
	NOP,
	
	/**
	 * Pops the top operand stack value.
	 * pop = 87
	 */
	POP,
	
	/**
	 * Duplicates the top operand stack value.
	 * dup = 89
	 */
	DUP,
	
	/**
	 * Pushes a item from the run-time constant pool.
	 * ldc_w = 19
	 * 
	 * Usage: ldc_w <index16>
	 */
	LDC_W,
	
	/**
	 * Stores an int into a local variable.
	 * istore = 54
	 * 
	 * Usage: istore <index8>
	 */
	ISTORE,
	
	/**
	 * Loads an int from a local variable.
	 * iload = 21
	 * 
	 * Usage: iload <index8>
	 */
	ILOAD,
	
	/**
	 * Sets a static field in a class.
	 * putstatic = 179
	 * 
	 * Usage: putstatic <index16>
	 */
	PUTSTATIC,
	GETSTATIC,
	
	IADD,
	ISUB,
	IMUL,
	IDIV,
	IAND,
	IOR,
	INEG,
	IF_ICMPEQ,
	IF_ICMPNE,
	IF_ICMPLT,
	IF_ICMPGE,
	IF_ICMPGT,
	IF_ICMPLE,
	GOTO,
	
	INVOKESTATIC,
	RETURN,
	IRETURN,
	
	ALOAD,
	ASTORE,
	NEWARRAY,
	IALOAD,
	IASTORE
}
