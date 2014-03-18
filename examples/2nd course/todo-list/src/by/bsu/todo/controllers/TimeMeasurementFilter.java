package by.bsu.todo.controllers;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author Sergey Krauchenia
 */
@WebFilter("/*")
public class TimeMeasurementFilter implements Filter {

    private Logger logger = Logger.getAnonymousLogger();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        long start = System.currentTimeMillis();
        chain.doFilter(request, response);
        long end = System.currentTimeMillis();

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String path = httpRequest.getRequestURI();
        String method = httpRequest.getMethod();

        logger.info(String.format("%s '%s' - done (%d ms)", method, path, end - start));
    }

    @Override
    public void destroy() {

    }
}
