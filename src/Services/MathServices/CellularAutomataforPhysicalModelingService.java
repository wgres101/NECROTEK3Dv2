package Services.MathServices;

import java.util.ArrayList;

import javax.jws.WebMethod;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import WSObjects.WSObject;

//GEM 3

public class CellularAutomataforPhysicalModelingService {
	
	Octree octree = new Octree();
	
	public octree_cell findNextDoorNeighbor(octree_cell cell);
	
	
	//air pressure
	
	public void simulateAirPressure()
	{
		for (neigh == findNextDoorNeighboringCells)
		{
			if (neigh.Material.IsInert()) continue;
			float DPress = cell.Pressure - neigh.Pressure;
			float Flow = cell.Material.Flow * Dpress;
			Flow = Clamp( cell.Pressure / 6.0f, -neigh.Pressure/ 6.0f);
			cell.NewPressure = -= Flow;
			neigh.newPressure += Flow;
		}
		
	}
	
	public void conduction()
	{
		float HCCell = cell.material.SHC * cell.mass;
		float HCNeigh = neigh.material.SHC * neigh.mass;
		float EnergyFlow = neigh.temp - cell.temp;
		//convert from heat to energy
		
		if (EnergyFlow > 0.0f)
		{
			EnergyFlow *= HCNeigh
		}
		else
			EnergyFlow *= HCCell;
		//A constant according to cell update speed
		//usually found by trial and error
		EnergyFlow += ConstantEnergyFlowFactor;
		neigh.temp -= EnergyFlow/HCCNeigh;
		cell.temp += EnergyFlow/HCCell;
		//Detect and kill oscillations
		
		if (((EnergyFlow>0.0f) && (neigh.temp.cell.temp)) ||
				((EnergFlow <= 0.0f>) && (neigh.temp.cell.temp))
		{
			float TotalEnergy = HCCell * cell.temp + HCNeigh * neigh.temp;
			float AverageTemp = TotalEnergy / (HCCell + HCNeigh);
			cell.temp = AverageTemp;
			neigh.temp = AverageTemp'
		}
	}
	
	public void fire()
	{
		float Temp = cell.temp - material.Flashpoint;
		//Damage the cell
		CellDamage = Temp * material.BurnRate;
		float Burn;
		
		//convert to actual burning value
		if (Temp > material.MaxBurn * 2)
		{
			Burn = material.MaxBurn;
		}
		else
			Burn = (1.0f - (0.25f * Temp / material.MaxBurn) * Temnp;
		ASSERT (Burn <= MaxBurn>);
		ASSERT (Burn > 0.0f);
		//And heat the cell up from burning
		cell.Temp += Burn* material.BurnTemp;
	}
			
	
	
		
	public ServiceRoot() {
		
	}
	
	public ServiceRoot(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}


	public static ArrayList<WSObject> objectPossesions = new ArrayList<WSObject>();
	
	
	//called by the engine to create an instance
	//of the object WSObject that is associated with this service
	@WebMethod
	public static void Launch() {}
	
	
	//called on object creation
	@WebMethod
	public static void Init() {}
	
	//called once per turn to update state
	//updates Air Pressure, Conduction, and Fire Routines
	@WebMethod
	public static void Update() {}
	
	//called when object is no longer needed
	@WebMethod
	public static void Destroy() {}
	
	@WebMethod
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService");
		
		
		return ws_object;
	}
	

	//renders fire, water, and anything else calculated by this simulation
	@WebMethod
	public void Render()
	{
		
	}
	
	//called every turn. checks messagemanager for message
	@WebMethod
	public void parseMessage()
	{
		
	}
	
	public void Collision()
	{
		
	}
	
	


}
