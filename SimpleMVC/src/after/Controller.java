package after;

public class Controller {
	Model m = null;
	
	public Controller() {
		this.m = new Model();
	}
	
	public void insertModel(Model m) {
		this.m = m;
	}
	public Model getModel() {
		return m;
	}
	
	public String getModelInfo() {
		if(m != null) {
			return "이름: " + m.getName();	
		} else {
			return "정보가 없습니다.";
		}
	}
	
	

}
