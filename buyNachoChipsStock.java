
public class buyNachoChipsStock implements NachoChipOrderCommand{
	
	NachoChipsStock nacho;
	public buyNachoChipsStock(NachoChipsStock nacho)
	{
		this.nacho = nacho;
	}
	
	public void executeOrderCommand()
	{
		nacho.buyNachoChipsStock(100);
	}

}
