package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {})
@Data
public class legoset {
    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;
    private int piecess;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<minifig> minifigs;

    private String weight;
    //@XmlAttribute
    //private String unit;

    private URL url;

    @XmlAttribute
    private int number;


}