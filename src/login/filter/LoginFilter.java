package login.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/index.jsp/*")
public class LoginFilter implements Filter {

    /**
     * @see Filter#init(FilterConfig)
     */
  
    public void init(FilterConfig filterConfig) throws ServletException {}

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        System.out.println("in filter");
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user_info") == null) {
            response.sendRedirect(request.getContextPath() + "/Login.jsp");
            System.out.println("sign in first");
        } else {
            chain.doFilter(request, response);
            System.out.println("do chain ??");
        }      
    }


    /**
     * @see Filter#destroy()
     */
    @Override
    public void destroy() {}

}