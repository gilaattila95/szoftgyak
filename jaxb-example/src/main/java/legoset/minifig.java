package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class minifig {

    @XmlValue
    private String name;

    @XmlAttribute
    private int count;

    public minifig() {}

    public minifig(String name, int db) {
        this.name  = name;
        this.count = db;
    }

}