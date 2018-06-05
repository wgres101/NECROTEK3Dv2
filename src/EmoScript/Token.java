package EmoScript;

public class Token {
	String s = new String();
	int i;
	double d;
	float f;
	long l;
	boolean b; 
	
	//control structures
	
	
	private String[] tokens = {"if", "else", "elseif", "while", "do", "until", "foreach", "where",
								"for", "continue", "string", "int", "double", "float", "long", "boolean", "char",
								"void", "function", "params", "static", "return", 
								"<>", "==", "<!?>", "and", "or", "xor", "not" , "true", "false", "null",
								"<", ">", "<=", ">=", ";", "array", "arraylist", "linkedlist",
								"map", "object", "list", "tree", "stack", "queue", "matrix",
								"tuple", "try", "catch", "finally", "throw", "=", "+=", "-=",
								"*=", "/=", ".", "new", "switch", "case", "exit", "break", "print", "(c)",
								"+", "-", "/", "*","intdiv"
								};
	

}
