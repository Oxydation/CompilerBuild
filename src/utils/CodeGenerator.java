package utils;

public class CodeGenerator {

	public void generateClassfile(){
		
	}
	
	/**
	 * Creates code for the given op-code.
	 * @param opcode The op-code to create.
	 */
	public void emit(OpCode opcode){
		
	}
	
	/**
	 * Creates code for the given op-code with given operand.
	 * @param opcode The op-code to use.
	 * @param operandAddress The address of the operand to use.
	 */
	public void emitWithOperand(OpCode opcode, int operandAddress){
		
	}
	
	public void emitWithLabel(OpCode opcode, int label){
		
	}
	
	public void createLabel(){
		
	}
	
	public void markByLabel(int label){
		
	}
}
