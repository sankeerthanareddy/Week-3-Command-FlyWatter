
public class sellNachoChipsStock implements NachoChipOrderCommand{
	
	NachoChipsStock nacho;
	public sellNachoChipsStock(NachoChipsStock nacho)
	{
		this.nacho = nacho;
	}
	
	
	
	public void executeOrderCommand()
	{
		nacho.sellNachoChipsStock(12);
	}

}
