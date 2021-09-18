
public class TestOrderCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier_InvokeCommand invoke_order = new Supplier_InvokeCommand();
		NachoChipsStock nacho =new NachoChipsStock();
		
		invoke_order.setOrderCommand(new buyNachoChipsStock(nacho));
		invoke_order.executeOrder();
		invoke_order.setOrderCommand(new sellNachoChipsStock(nacho));
		invoke_order.executeOrder();

	}
}
