
package io.fabric8.kubernetes.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "appProtocol",
    "name",
    "nodePort",
    "port",
    "protocol",
    "targetPort"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class ServicePort implements Editable<ServicePortBuilder> , KubernetesResource
{

    @JsonProperty("appProtocol")
    private String appProtocol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nodePort")
    private Integer nodePort;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("targetPort")
    private IntOrString targetPort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServicePort() {
    }

    public ServicePort(String appProtocol, String name, Integer nodePort, Integer port, String protocol, IntOrString targetPort) {
        super();
        this.appProtocol = appProtocol;
        this.name = name;
        this.nodePort = nodePort;
        this.port = port;
        this.protocol = protocol;
        this.targetPort = targetPort;
    }

    @JsonProperty("appProtocol")
    public String getAppProtocol() {
        return appProtocol;
    }

    @JsonProperty("appProtocol")
    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nodePort")
    public Integer getNodePort() {
        return nodePort;
    }

    @JsonProperty("nodePort")
    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("targetPort")
    public IntOrString getTargetPort() {
        return targetPort;
    }

    @JsonProperty("targetPort")
    public void setTargetPort(IntOrString targetPort) {
        this.targetPort = targetPort;
    }

    @JsonIgnore
    public ServicePortBuilder edit() {
        return new ServicePortBuilder(this);
    }

    @JsonIgnore
    public ServicePortBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
