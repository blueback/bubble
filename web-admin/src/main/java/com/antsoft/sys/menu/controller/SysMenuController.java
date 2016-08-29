package com.antsoft.sys.menu.controller;

import com.antsoft.common.web.Response;
import com.antsoft.sys.menu.bean.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justin on 16/8/27.
 */
@RestController
@RequestMapping("/admin/sysmenu")
public class SysMenuController {

    @Autowired
    SysMenu sysMenu;

    @RequestMapping(value = "listAllActiveMenu",method = RequestMethod.GET)
    public Response<List<SysMenu>> sayHelloWorld(){
        List<SysMenu> sysMenuList = new ArrayList<>();

        SysMenu mainMenu = new SysMenu();
        mainMenu.setId(1);
        mainMenu.setName("Dashboard");
        mainMenu.setKey("1");
        mainMenu.setIcon("user");
        List<SysMenu> mainSubMenus = new ArrayList<>();
        SysMenu sub1 = new SysMenu();
        sub1.setId(2);
        sub1.setKey("101");
        sub1.setName("选项1");
        mainSubMenus.add(sub1);
        SysMenu sub2 = new SysMenu();
        sub2.setId(3);
        sub2.setKey("102");
        sub2.setName("选项2");
        mainSubMenus.add(sub2);
        mainMenu.setSubSysMenus(mainSubMenus);
        sysMenuList.add(mainMenu);

        SysMenu mainMenu1 = new SysMenu();
        mainMenu1.setId(1);
        mainMenu1.setName("导航二");
        mainMenu1.setKey("2");
        mainMenu1.setIcon("laptop");
        List<SysMenu> main1SubMenus = new ArrayList<>();
        SysMenu sub21 = new SysMenu();
        sub21.setId(2);
        sub21.setKey("201");
        sub21.setName("选项21");
        main1SubMenus.add(sub21);
        SysMenu sub22 = new SysMenu();
        sub22.setId(3);
        sub22.setKey("202");
        sub22.setName("选项22");
        main1SubMenus.add(sub22);
        mainMenu1.setSubSysMenus(main1SubMenus);
        sysMenuList.add(mainMenu1);
        return Response.getSuccessResponse(sysMenuList);
    }
}
