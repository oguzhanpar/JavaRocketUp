
public class Worker implements IWorkable, IEatable, IPayable{

	@Override
	public void eat() {
		
		System.out.println("Our Worker can eat !");
		
	}

	@Override
	public void work() {
		System.out.println("Our Worker can work !");
		
	}

	@Override
	public void pays() {
		System.out.println("Our Worker is payable !");
		
	}
	

}
