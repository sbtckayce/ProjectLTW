package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.services.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/doSignIn")
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (UserService.getInstance().checkSignIn(username, password)) {
            response.sendRedirect("/Adev/HomeController");
        } else {
            request.setAttribute("error","Username or Password is incorrect");
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }
}
