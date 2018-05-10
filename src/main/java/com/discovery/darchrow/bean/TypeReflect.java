/**
 * Creation Date:2018年5月10日-下午2:14:09
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow.bean;

import java.util.List;

/**
 * Description Of The Class<br/>
 * 
 * @author mdl47196
 * @version 1.0.0, 2018年5月10日-下午2:14:09
 * @since 2018年5月10日-下午2:14:09
 */
public class TypeReflect {
    
    private Integer factoryKey;
    
    private List<String> typeList;
    
    private String desc;
    
    public TypeReflect(Integer factoryKey, List<String> typeList, String desc) {
        super();
        this.factoryKey = factoryKey;
        this.typeList = typeList;
        this.desc = desc;
    }

    public Integer getFactoryKey() {
        return factoryKey;
    }
    
    public void setFactoryKey(Integer factoryKey) {
        this.factoryKey = factoryKey;
    }
    
    public List<String> getTypeList() {
        return typeList;
    }
    
    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
