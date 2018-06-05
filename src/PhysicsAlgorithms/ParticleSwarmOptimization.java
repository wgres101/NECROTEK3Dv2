package PhysicsAlgorithms;

public class ParticleSwarmOptimization {

//physics and animation gems 8
	
/*
 *	Create a swarm of N randomly distributed particles
 *
 * 	FOR ERACH particle(P) i=1, .., N do
 * 			FOR EACH dimension j=1,....,M do
 * 				P[i].X[j] = Xmin[j] + rand(0,1)*(Xmax[j] - Xmin[j])
 * 				P[i].V[j] = rand(0,1)*Vmax[j]*sign(rand(0,1)=0.5; // or = 0
 * 				END
 *  END
 * 
 *  g_Best = P[0];
 *  numIterations = 1;
 *  
 *  //Iterative optimization process
 *  
 *  REPEAT
 *  	FOR EACH particle(P) i=1,...,N do
 *  		IF Eval(P[i].X) BETTER_THAN Eval(g_Best.x)
 *  			g_Best = P[i]
 *  		END
 *  		IF Eval(P[i].X) BETTER THAN Eval(P[i].x_best)
 *  			P[i].x_best = P[i].X;
 *  		END
 *  	END
 *  
 *  	//Apply equations of motion
 *  	FOR EACH particle i=1,...,N do
 *  		FOR EACH dimension j=1,...,M do
 *  			V_Inertia = w*P[i].V[j]
 *  			V_social = c1*rand(0,1)*(g_Best.X[j] - P[i].X[j])
 *  			V_cognitive = c2*rand(0,1)*(P[i].x_best[j] - P[i].X[j]);
 *  			
 *  			P[i].V[j] = V_Inertia + V_social + V_cognitive;
 *  						Clamp(P[i].V[j]);
 *  			P[i}.X[j] = P[i].X[j] + P[i].V[j];
 *  						Clamp(P[i].X[j]);
 *  		END
 *  	END
 *  	numIterations++;
 *  UNTIL (m_numIterations > MAX_NUM_ITER || GOOD_ENOUGH(Eval(g_Best));
 * 
 * 
 * 
 */
}
