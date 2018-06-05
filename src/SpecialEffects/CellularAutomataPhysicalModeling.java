package SpecialEffects;

//GEMS 3 - math

public class CellularAutomataPhysicalModeling {

	
	//Explosions are large amounts of air pressure
	//A grenade for example would generate a large amount of air pressure
	//which would dissapate damaging objects nearby
	
	//air and fluid modeling
	
	/*
	 * if (cell->Turn != CurrentTurn)
	 * {
	 * 		cell->Turn = CurrentTurn;
	 * 		cell->Pressure = cell->NewPressure
	 * }
	 * 
	 * for (neigh = each neighboring cell)
	 * {
	 * 		if (neight->Material->IsInert() ) continue;
	 * 		if (neigh->Turn != CurrentTurn)
	 * 		{
	 * 			neigh->Turn = CUrrentTurn;
	 * 			neigh->Pressure = neigh->NewPressure
	 * 		}
	 * 
	 * 		float DPresss = cell->Pressure - neigh->Pressure
	 * 		float Flow = cell->Material->Flow * DPress;
	 * 		Flow = clamp(Flow, cell->Pressure / 6.0f, -neigh->pressure / 6.0f);
	 * 		cell->NewPressure -= Flow;
	 * 		neigh->NewPressure += Flow;
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	/* Water modeling
	 * 
	 * As you go towards the bottom, the water compression value slowly increases (by like !%)
	 * 
	 * if (neighbor cell is above this one)
	 * {
	 * 		if ((cell->Mass < material->MaxMass) || (neigh->Mass < material->MaxMass))
	 * 		{
	 * 			Flow = cell->Mass - material->MaxMass;
	 * 		} else
	 * 		{
	 * 			Flow = cell->Mass - neigh->Mass -= material->MaxCompress
	 * 			Flow *= 0.5f;
	 * 		}
	 * 
	 * 	}
	 * 
	 * else if (neighbnor cell is below this one)
	 * {
	 * 		if ( ( cell->Mass < material->MaxMass) || (neigh->Mass < material->MaxMass))
	 * {
	 * 		Flow = material->MaxMass - neigh->Mass;
	 * 		else
	 * 		{
	 * 			Flow = cell->Mass - neigh->Mass + material->MaxCompress;
	 * 			Flow *= -0.5f;
	 * 		}
	 * 
	 * else    //neighbor is on the same level
	 * {
	 * 		Flow = (cell->Mass - neigh->Mass) * 0.5f;
	 * }
	 * 
	 * 
	 * HEAT
	 * Conduction
	 * 
	 *Find current heat capactities
	 *float HCCell = cell->material->SHC * cell->Mass      //SHC = specific heat capacity -- different materials are heated
	 *														// by different amounts of the same energy
	 *
	 * float HCNeigh = neigh->material->SHC * neigh->Mass
	 * float EnergyFlow = neigh->Temp - cell->Temp
	 *
	 * convert from heat to energy
	 * 
	 * if (EnergyFlow > 0.0f)
	 * 		EnergyFlow *= HCNeigh
	 * else
	 * 		EnergyFlow *= HCCell;
	 * 
	 * A constant according to cell update speed.
	 * Usually found by trial and error
	 * 
	 * EnergyFlow *= ConstantEnergyFlowFactor;
	 * neigh->Temp -= EnergyFlow / HCNeigh;
	 * cell->Temp += EnergyFlow / HCCell;
	 * 
	 * Dtect and kill oscillations
	 * 
	 * if (((EnergyFlow>0.0f)&&(niegh->Temp<cell->Temp)) ||
	 * 	((EnergyFlow<=0.0f( && (neigh->Temp->cell->Temp)))
	 * 	{
	 * 		float TotalEnergy = HCCell * cell->Temp + HCNeigh * neigh->Temp;
	 *		float AverageTemp  TotalEnergy / (HCCell + HCNeigh);
	 *		cell-Temp = AverageTemp;
	 *				neigh->Temp = AverageTEmp;
	 *}
	 *
	 *CONVECTION
	 *
	 *Phenomonon of heat rising. Hot areas of fluid are less dense and tend to rise
	 *This can be simulated by using integrating temperature into the model for air
	 *
	 *RADIATION
	 *
	 *Too complex
	 *
	 *FIRE
	 *
	 *float Temp = cell->Temp - material->Flashpoint
	 *Damage the cell
	 *CellDamage = Temp * material->BurnRate
	 *float Burn
	 *Convert ot actual burning value
	 *
	 *if (Temp -> material->MaxBurn * 2)
	 *	Burn = material->MaxBurn
	 *else
	 *	Burn = (1.0f -  (0.25f * Temp / material->MaxBurn ) ) * Temp
	 *ASSERT ( BUrn <= material->MaxBurn);
	 *ASSERT ( Burn >= 0.0f);
	 *
	 *ANd heat the cell up from the burning
	 *cell->Temp += Burn * material->BurnTemp
	 *
	 
	 * 
	 */
	
	
	
}
