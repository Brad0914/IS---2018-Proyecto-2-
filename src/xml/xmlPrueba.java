package xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class xmlPrueba {
	private List<codigo> codigos;

	public List<codigo> getCodigos() {
		return codigos;
	}
	
	@XmlElement
	public void setCodigos(List<codigo> codigos) {
		this.codigos = codigos;
	}
}
