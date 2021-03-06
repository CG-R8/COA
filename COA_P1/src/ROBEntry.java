/**
 *
 */
public class ROBEntry
{

	private String instrROobContent;
	private int instructionAddress;
	private String destinationAddress;
	private int result;
	private boolean status;
	private String instrOperation;
	private String PhysicalDest;
	private String ArchiDest;
	private int instrReadyBit;

	public String getArchiRegister()
	{
		return ArchiDest;
	}

	public void setArchiRegister(String value)
	{
		ArchiDest = value;
	}

	public void setInstructionOperation(String value)
	{
		instrOperation = value;
	}

	public String getInstructionOperation()
	{
		return instrOperation;
	}

	public void setPhysicalDest(String value)
	{
		PhysicalDest = value;
	}

	public String getPhysicalDest()
	{
		return PhysicalDest;
	}

	public void setReadyBit(int value)
	{
		instrReadyBit = value;
	}

	public int getReadyBit()
	{
		return instrReadyBit;
	}

	// Set Instruction address that need to be dispatch in ROB
	public void setInstructionAddress(int value)
	{
		instructionAddress = value;
	}

	// Returns Instruction address for the ROB entry
	public int getInstructionAddress()
	{
		return instructionAddress;
	}

	// Set destination Operand in destination address field
	public void setDestinationAddress(String value)
	{
		destinationAddress = value;
	}

	// Return destination operand
	public String getDestinationAddress()
	{
		return destinationAddress;
	}

	// Set value of destination operand at the time of forward result
	public void setResult(int value)
	{
		result = value;
	}

	// Returns result of destination operand
	public int getResult(int value)
	{
		return result;
	}

	// Set valid if result is forwarded
	public void setStatus(boolean value)
	{
		status = value;
	}

	// Return status(valid or invalid)
	public boolean getStatus()
	{
		return status;
	}

	public String getInstrROobContent()
	{
		return instrROobContent;
	}

	public void setInstrROobContent(String instrROobContent)
	{
		this.instrROobContent = instrROobContent;
	}
}