package com.cmcc.gs.web;

import com.cmcc.gs.service.ChangePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BusiController {
    @Autowired
    private ChangePlanService changePlanService;
    //@RequestMapping(value = "/cmccgs/changePlan", method = RequestMethod.POST)
}
