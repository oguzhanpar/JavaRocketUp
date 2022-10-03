
public class Main {

	public static void main(String[] args) {
		
		
		Worker worker = new Worker();
		worker.eat();
		worker.work();
		worker.pays();
		
		OutsourceWorker outsourceWorker = new OutsourceWorker();
		outsourceWorker.work();
		outsourceWorker.pays();
		
		Robot robot = new Robot();
		robot.work();
	
		
	}

}
