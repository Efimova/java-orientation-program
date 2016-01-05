package com.epam.efimova.filter;

import org.springframework.http.HttpHeaders;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anna_Efimova on 12/22/2015.
 */
public class AuthenticateUser implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Authenticate user");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        Cookie userCookie = new Cookie("user", "hanna");
        response.addCookie(userCookie);
        Cookie passwordCookie = new Cookie("pass", "1");
        response.addCookie(passwordCookie);

//        if (request.getAttribute("user").equals("hanna") && request.getAttribute("password").equals("1")) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
      //  response.sendError(javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED);
      //  ((HttpServletResponse) servletResponse).sendRedirect(request.getContextPath() + "/login");

    }

    @Override
    public void destroy() {

    }
}
