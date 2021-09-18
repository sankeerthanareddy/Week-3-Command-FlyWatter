
public class Supplier_InvokeCommand {
	
	NachoChipOrderCommand invoke;
	
	public void setOrderCommand(NachoChipOrderCommand order)
	{
		invoke = order;
	}
	
	public void executeOrder()
	{
		invoke.executeOrderCommand();
	}

}
