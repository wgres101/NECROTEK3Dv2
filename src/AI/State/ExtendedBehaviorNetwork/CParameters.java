package AI.State.ExtendedBehaviorNetwork;

public class CParameters {

	static float gamma;  //activation influence parameter controls the activation from predecessor links
	static float delta; //is the negative activation from conflict links
	static float beta;  //inertia
	static float theta; //global threshold
	static float deltatheta; //decay
	public static float triangularnorm() { return 0; }//
	static float ex_j;
	public static float sigma(float value) { return 0; }
	public static float tau(float value) { return 0; }
}
