package com.jc4balos.logging_service.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "component")
public class ServiceComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "component_id")
    private Long componentId;

    @Column(nullable = false, length = 100, name = "component_name")
    private String componentName;

    public ServiceComponent() {
    }

    public ServiceComponent(Long componentId, String componentName) {
        this.componentId = componentId;
        this.componentName = componentName;
    }

    public Long getComponentId() {
        return this.componentId;
    }

    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ServiceComponent componentId(Long componentId) {
        setComponentId(componentId);
        return this;
    }

    public ServiceComponent componentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ServiceComponent)) {
            return false;
        }
        ServiceComponent component = (ServiceComponent) o;
        return Objects.equals(componentId, component.componentId)
                && Objects.equals(componentName, component.componentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, componentName);
    }

    @Override
    public String toString() {
        return "{" +
                " componentId='" + getComponentId() + "'" +
                ", componentName='" + getComponentName() + "'" +
                "}";
    }
}