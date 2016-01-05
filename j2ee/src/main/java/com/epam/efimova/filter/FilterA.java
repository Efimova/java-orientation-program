package com.epam.efimova.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Anna_Efimova on 12/24/2015.
 */
public class FilterA implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter A");
        System.out.println(filterConfig.toString());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter A before chain");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("filter A after chain");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter A");
    }
}
