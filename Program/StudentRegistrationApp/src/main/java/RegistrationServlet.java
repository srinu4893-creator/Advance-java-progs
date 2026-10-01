import java.io.IOException;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String EMAIL_REGEX = "^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // Validation
        if (name == null || name.trim().isEmpty()
                || email == null || !Pattern.matches(EMAIL_REGEX, email)
                || course == null || course.trim().isEmpty()) {

            request.setAttribute("errorMsg", "Invalid input. Please check name, email, and course.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        // Store in request scope, pass to success page
        Student student = new Student(name, email, course);
        request.setAttribute("student", student);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}