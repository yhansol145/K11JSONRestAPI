package mybatis;

import java.util.ArrayList;

public class ParameterDTO {
	
	private String num;
	private String searchField;
	private ArrayList<String> searchTxt; 
	private int start; 
	private int end;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSearchField() {
		return searchField;
	}
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}
	public ArrayList<String> getSearchTxt() {
		return searchTxt;
	}
	public void setSearchTxt(ArrayList<String> searchTxt) {
		this.searchTxt = searchTxt;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	} 
	
	
	
}
