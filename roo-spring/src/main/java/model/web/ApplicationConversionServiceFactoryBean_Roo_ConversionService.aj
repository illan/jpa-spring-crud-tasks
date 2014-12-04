// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package model.web;

import model.domain.Direccion;
import model.domain.Ejecucion;
import model.domain.Operario;
import model.domain.Tarea;
import model.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Direccion, String> ApplicationConversionServiceFactoryBean.getDireccionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<model.domain.Direccion, java.lang.String>() {
            public String convert(Direccion direccion) {
                return new StringBuilder().append(direccion.getDescripcion()).toString();
            }
        };
    }
    
    public Converter<Long, Direccion> ApplicationConversionServiceFactoryBean.getIdToDireccionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, model.domain.Direccion>() {
            public model.domain.Direccion convert(java.lang.Long id) {
                return Direccion.findDireccion(id);
            }
        };
    }
    
    public Converter<String, Direccion> ApplicationConversionServiceFactoryBean.getStringToDireccionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, model.domain.Direccion>() {
            public model.domain.Direccion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Direccion.class);
            }
        };
    }
    
    public Converter<Ejecucion, String> ApplicationConversionServiceFactoryBean.getEjecucionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<model.domain.Ejecucion, java.lang.String>() {
            public String convert(Ejecucion ejecucion) {
                return new StringBuilder().append(ejecucion.getFecha()).toString();
            }
        };
    }
    
    public Converter<Long, Ejecucion> ApplicationConversionServiceFactoryBean.getIdToEjecucionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, model.domain.Ejecucion>() {
            public model.domain.Ejecucion convert(java.lang.Long id) {
                return Ejecucion.findEjecucion(id);
            }
        };
    }
    
    public Converter<String, Ejecucion> ApplicationConversionServiceFactoryBean.getStringToEjecucionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, model.domain.Ejecucion>() {
            public model.domain.Ejecucion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Ejecucion.class);
            }
        };
    }
    
    public Converter<Operario, String> ApplicationConversionServiceFactoryBean.getOperarioToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<model.domain.Operario, java.lang.String>() {
            public String convert(Operario operario) {
                return new StringBuilder().append(operario.getNombre()).toString();
            }
        };
    }
    
    public Converter<Long, Operario> ApplicationConversionServiceFactoryBean.getIdToOperarioConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, model.domain.Operario>() {
            public model.domain.Operario convert(java.lang.Long id) {
                return Operario.findOperario(id);
            }
        };
    }
    
    public Converter<String, Operario> ApplicationConversionServiceFactoryBean.getStringToOperarioConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, model.domain.Operario>() {
            public model.domain.Operario convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Operario.class);
            }
        };
    }
    
    public Converter<Tarea, String> ApplicationConversionServiceFactoryBean.getTareaToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<model.domain.Tarea, java.lang.String>() {
            public String convert(Tarea tarea) {
                return new StringBuilder().append(tarea.getDescripcion()).toString();
            }
        };
    }
    
    public Converter<Long, Tarea> ApplicationConversionServiceFactoryBean.getIdToTareaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, model.domain.Tarea>() {
            public model.domain.Tarea convert(java.lang.Long id) {
                return Tarea.findTarea(id);
            }
        };
    }
    
    public Converter<String, Tarea> ApplicationConversionServiceFactoryBean.getStringToTareaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, model.domain.Tarea>() {
            public model.domain.Tarea convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Tarea.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getDireccionToStringConverter());
        registry.addConverter(getIdToDireccionConverter());
        registry.addConverter(getStringToDireccionConverter());
        registry.addConverter(getEjecucionToStringConverter());
        registry.addConverter(getIdToEjecucionConverter());
        registry.addConverter(getStringToEjecucionConverter());
        registry.addConverter(getOperarioToStringConverter());
        registry.addConverter(getIdToOperarioConverter());
        registry.addConverter(getStringToOperarioConverter());
        registry.addConverter(getTareaToStringConverter());
        registry.addConverter(getIdToTareaConverter());
        registry.addConverter(getStringToTareaConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
