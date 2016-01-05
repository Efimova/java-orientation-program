package com.epam.efimova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeController extends HttpServlet {
    // int counter = 000000;
    //
    // public String welcome(ModelMap model) {
    // String message = "aaaaaaaaaaaaaaaaaaaaaaaaa";
    //
    // model.addAttribute("message", "Welcome");
    // model.addAttribute("counter", ++counter);
    // System.out.println(model.toString());
    // return "index";
    // }

    @Override
    public void init() throws ServletException {
        System.out.println("init servlet Welcome");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    void process(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Welcome controller");


//            for (int i = 1; i < 180; i++) {
//                Cookie cookie = new Cookie("trololo " + i, "j " + String.valueOf(i));
//                resp.addCookie(cookie);
//            }

        try {
            req.getRequestDispatcher("pages/index.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //   private static final String str = "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2. Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2. Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2. Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2. Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2. Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.         Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with  this work for additional information regarding copyright ownership   The ASF licenses this file to You under the Apache License, Version 2.!!!!!!!!!!";
}
