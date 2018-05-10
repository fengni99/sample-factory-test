/**
 * Creation Date:2018年5月10日-下午2:11:40
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.discovery.darchrow.bean.TypeReflect;

/**
 * Description Of The Class<br/>
 * 
 * @author mdl47196
 * @version 1.0.0, 2018年5月10日-下午2:11:40
 * @since 2018年5月10日-下午2:11:40
 */
public class TestFactory {
    
    /**
     * 适配器分组容器
     */
    private Set<TypeReflect> typeReflects;
    
    /**
     * 适配器容器
     */
    private Map<Integer, AbstractAdaptor> abstractAdaptormap;
    
    
    
    public TestFactory() {
        super();
    }

    public TestFactory(Set<TypeReflect> typeReflects, Map<Integer, AbstractAdaptor> abstractAdaptormap) {
        super();
        this.typeReflects = typeReflects;
        this.abstractAdaptormap = abstractAdaptormap;
    }

    public Set<TypeReflect> getTypeReflects() {
        return typeReflects;
    }
    
    public void setTypeReflects(Set<TypeReflect> typeReflects) {
        this.typeReflects = typeReflects;
    }
    
    public Map<Integer, AbstractAdaptor> getAbstractAdaptormap() {
        return abstractAdaptormap;
    }
    
    public void setAbstractAdaptormap(Map<Integer, AbstractAdaptor> abstractAdaptormap) {
        this.abstractAdaptormap = abstractAdaptormap;
    }
    
    /**
     * 获取适配器
     * 
     * @param p1
     * @param p2
     * @return
     * @throws Exception
     */
    public AbstractAdaptor getAbstractAdaptor(String p1, String p2) throws Exception {
        if (null == typeReflects || typeReflects.isEmpty()) {
            throw new Exception("typeReflects error.");
        }
        if (null == abstractAdaptormap || abstractAdaptormap.isEmpty()) {
            throw new Exception("abstractAdaptormap error.");
        }
        if (null == p1 || null == p2) {
            throw new Exception("param error.");
        }
        String type = new StringBuffer(p1).append("_").append(p2).toString();
        List<TypeReflect> collects = typeReflects.stream().filter(typeReflect -> typeReflect.getTypeList().contains(type)).collect(Collectors.toList());
        if (null == collects || collects.size() <= 0) {
            throw new Exception("not find TypeReflect. p1: " + p1 + ", p2:" + p2);
        }
        Integer factoryKey = collects.get(0).getFactoryKey();
        return abstractAdaptormap.get(factoryKey);
    }
    
}
