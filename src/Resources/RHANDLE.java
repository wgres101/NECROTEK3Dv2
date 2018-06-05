package Resources;

import CustomAssert.CAssert;

public class RHANDLE<TAG> {

	int magicNumber = -1;
	boolean locked = false;
	int m_Index = -1; //index into resource array
	
	
	
	final int MAX_BITS_INDEX = 16;
	final int MAX_BITS_MAGIC = 16;
	
	final int MAX_INDEX = ( 1 << MAX_BITS_INDEX - 1);
	final int MAX_MAGIC = ( 1 << MAX_BITS_MAGIC -1);
	
	static int s_AutoMagic = 0;
	int index = 0;
	int m_Magic = 0;
	
	class Handle
	{
		int m_Index;  //index into resource array
		int m_Magic;  //magic number to check
	}
	
	
	Handle m_handle;


	public static int getS_AutoMagic() {
		return s_AutoMagic;
	}


	public static void setS_AutoMagic(int s_AutoMagic) {
		RHANDLE.s_AutoMagic = s_AutoMagic;
	}


	public int getMAX_BITS_INDEX() {
		return MAX_BITS_INDEX;
	}


	public int getMAX_BITS_MAGIC() {
		return MAX_BITS_MAGIC;
	}


	public int getMAX_INDEX() {
		return MAX_INDEX;
	}


	public int getMAX_MAGIC() {
		return MAX_MAGIC;
	}


	public int getMagicNumber() {
		return magicNumber;
	}


	public void setMagicNumber(int magicNumber) {
		this.magicNumber = magicNumber;
	}


	public boolean isLocked() {
		return locked;
	}


	public void setLocked(boolean locked) {
		this.locked = locked;
	}


	public int getM_Index() {
		return m_Index;
	}


	public void setM_Index(int m_Index) {
		this.m_Index = m_Index;
	}


	public Handle getM_handle() {
		return m_handle;
	}


	public void setM_handle(Handle m_handle) {
		this.m_handle = m_handle;
	}
	
	public boolean IsNull() {
		if (m_handle == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void RHANDLE()
	{
		
	}
	
	void Init(int index)
	{
		
	}
	
	public void init()
	{
		CAssert.Assert(IsNull(), RHANDLE.class, "init()", "Dont' allow reassignment");
		CAssert.Assert((index <= MAX_INDEX), RHANDLE.class, "init()", "verify range");
		
		if (++s_AutoMagic  > MAX_MAGIC)
		{
			s_AutoMagic = 1;
		}
		
		m_Index = index;
		m_Magic = s_AutoMagic;
	}
	
	public boolean notequals ( RHANDLE l, RHANDLE r)
	{
		return (l.getM_handle() != r.getM_handle());
		
	}
	
	public boolean equals ( RHANDLE l, RHANDLE r)
	{
		return (l.getM_handle() == getM_handle());
	}
	
	
}
