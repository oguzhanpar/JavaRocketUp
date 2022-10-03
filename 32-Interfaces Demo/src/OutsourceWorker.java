
public class OutsourceWorker implements IWorkable, IPayable{

	@Override
	public void work() {
		
		System.out.println("OutsourceWorker can work !");
		
	}

	@Override
	public void pays() {
		System.out.println("OutsourceWorker is payable !");
		
	}

}
