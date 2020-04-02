package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {})
@Data
public class Weight {

    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;


   /* public weight(String unit, double value ) {
        this.unit = unit;
        this.value = value;


    }*/
}