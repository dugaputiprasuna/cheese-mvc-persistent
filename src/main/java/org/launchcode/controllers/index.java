package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDao;
import org.launchcode.models.data.CheeseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.util.resources.cldr.teo.CalendarData_teo_KE;

@Controller
@RequestMapping("")
public class index {

    @Autowired
    public CategoryDao categoryDao;


}
