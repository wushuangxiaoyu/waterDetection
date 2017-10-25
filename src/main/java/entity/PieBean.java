package entity;

/**
 * 用于返回饼状图json格式数据工具实体类
 */
public class PieBean {
    private String name;
	private int value;
	
	public PieBean() {
		super();
	}
	public PieBean(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	//ОннШ
	public void addOne(){
		this.value++;
	}
	
	
}