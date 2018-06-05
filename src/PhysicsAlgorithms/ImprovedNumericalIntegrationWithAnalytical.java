package PhysicsAlgorithms;


//GEMS 8 physics and animation

public class ImprovedNumericalIntegrationWithAnalytical {

	/*
	 * 
	 * State of a body in time using Kineematic integration equations:
	 * 
	 * 
	 * v_n+1 = v_n + dv
	 * x_n+1 = x_n + v_n*delta*t + dx
	 * 
	 * 
	 *  //methods of calculating dv and dx
	 *  
	 *  exact method:
	 *  
	 *  dv = integral from 0 to delta t (a_n*dt)
	 *  dx = integral from 0 to delta t (indefinite integral(a_n*dt))*dt
	 * 
	 *  average accleration method
	 *  
	 *  dv = integral from 0 to delta t (a_n*dt)
	 *  dx = (1/2)*dv*deltat
	 *  
	 *  pulse
	 *  
	 *  dv = integral from 0 to delta t (a_n*dt)
	 *  dx = dv*delta t
	 *  
	 *  symplectic euler method
	 *  
	 *  dv = a_n*delta t
	 *  dx = a_n * delta t squared\
	 *  
	 */
	
	
	/*
	 *  Spring with constant k and nautral length l
	 *  
	 *  c = cos (w * delta t)
	 *  s = sin(w * delta t)
	 *  
	 *  dv = x_n(-wx) + v_n(c-1) + (w*ls)
	 *  dx = x_n(c-1) + v_n(s/w + delta t) + (l - l*c)
	 *  
	 *  Viscous Force
	 *  
	 *  v is the contribution of viscuous force, with a viscosity constant v
	 *  
	 *  
	 *  dv = -(k/m) * v_n * delta t\
	 *  dx = -(m/k)*v_n
	 *  
	 *  Colision Response FOrce
	 *  
	 *  dv = -2(x_n+1 - x_n) / delta t
	 *  dx = -(x_n+1 - x_n) ( 1- f)
	 *  where f is the fraction of the time step when the collision begins
	 *  
	 *  
	 *  
	 * 
	 */
}
