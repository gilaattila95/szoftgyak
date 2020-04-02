package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {})
@Data
public class weight {

    @XmlAttribute
    private String unit;

    private double value;


   /* public weight(String unit, double value ) {
        this.unit = unit;
        this.value = value;


    }*/
}