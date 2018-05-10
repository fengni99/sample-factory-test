/**
 * Creation Date:2018年5月10日-下午2:57:37
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.discovery.darchrow.TestFactory;

/**
 * Description Of The Class<br/>
 * 
 * @author mdl47196
 * @version 1.0.0, 2018年5月10日-下午2:57:37
 * @since 2018年5月10日-下午2:57:37
 */
@Controller
public class TestController {
    
    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    private TestFactory testFactory;
    
    @RequestMapping(value = "/testquery.htm", method = RequestMethod.GET)
    public String testquery(HttpServletRequest request, Model model) {
        
        try {
            testFactory.getAbstractAdaptor("501", "1").exute("hello");
            testFactory.getAbstractAdaptor("852", "1").exute("hello");
        } catch (Exception e) {
            log.debug("error");
        }
        
        return "testquery";
    }
    
}
