package xml;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"code1", "code2", "code3", "code4"})
public class codigo {
	private String code1;
	private String code2;
	private String code3;
	private String code4;
	
	
	public codigo(String code1, String code2, String code3, String code4) {
		this.code1 = code1;
		this.code2 = code2;
		this.code3 = code3;
		this.code4 = code4;
	 }
	
	public String getCode1() {
		return code1;
	}
	public void setCode1(String code1) {
		this.code1 = code1;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	public String getCode3() {
		return code3;
	}
	public void setCode3(String code3) {
		this.code3 = code3;
	}
	public String getCode4() {
		return code4;
	}
	public void setCode4(String code4) {
		this.code4 = code4;
	}
}
