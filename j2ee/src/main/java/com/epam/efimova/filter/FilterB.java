package com.epam.efimova.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anna_Efimova on 12/24/2015.
 */
public class FilterB implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter B");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter B before chain");
        //servletRequest.getRequestDispatcher("pages/test-page.jsp").forward(servletRequest, servletResponse);
      //  ((HttpServletResponse)servletResponse).sendRedirect("pages/test-page.jsp");
      filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("filter B after chain");

    }

    @Override
    public void destroy() {
        System.out.println("destroy filter B");
    }
}
