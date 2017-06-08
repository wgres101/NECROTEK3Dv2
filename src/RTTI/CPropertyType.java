package RTTI;


enum EPROPS  {
		eptBOOL,
		eptINT,
		eptFLOAT,
		eptCHAR,
		eptSTRING
};


class ePropertyType
{
	int value;
}

public class CPropertyType <T> {

	static ePropertyType ms_TypeID - new ePropertyType();
	
	CPropertyType<Boolean> msTypeID.value = EPROPS.eptBOOL; 
	CPropretyType<INTEGER> ms_TypeID =EPROPS.eptINT;
	CPropretyType<FLOAT> ms_TypeID = EPROPS.eptFLOAT;
	CPropretyType<CHAR> ms_TypeID = EPROPS.eptCHAR;
	CPropertyType<String> ms_TypeID = EPROPS.eptSTRING;
	
	
	
	
}
