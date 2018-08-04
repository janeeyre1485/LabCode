package psi.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = ContainerItem.class, name = "ContainerItem"), @JsonSubTypes.Type(value = StaticItem.class, name = "StaticItem"), @JsonSubTypes.Type(value = DynamicItem.class, name = "DynamicItem")})
public interface Item {
//    String getId();

//    void setId(String id);
}
