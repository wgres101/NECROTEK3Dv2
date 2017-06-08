package HUD;

//contains references to all current visiblke HUDS
//Methods for adding and removing HUDs programmatically


//All HUDS are implementations of a template/interface that providefs
//callbacks for th ings like triggering rendering to a suitable surface
//(painting the HUD to a back buffer) (or feedeing in GUI events like
//mouse clicks) (This class is the Acetate class)


//Three aspects to the useres interaction with the HUD editing system
//1. Interactive, heads-up selection of which toool to use
//2. Activation and de-activation ofg individual HUDs and their tools
//3. Peeking at the internal state of the heads up editing system

//proxying. One HUD can trigger others 
//translate, scale, rotate tools can trigger HUDs
//HUDs are treated in a stack

//To manage the differents HUDs we simply cvopy the sdtandard layer
//paleltete from high end paint programs

//The show/hide features is similar to paint programs
//Hiding a HUD just means turning off its paint code


public class CHUDManager {

}
