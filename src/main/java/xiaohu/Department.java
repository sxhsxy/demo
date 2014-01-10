package xiaohu;

import java.io.Serializable;

public class Department implements Serializable {
	public Department(String name) {
		super();
		this.name = name;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
