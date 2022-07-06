package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); // query parameter 조회
        System.out.println("username = " + username);

        response.setContentType("text/plain"); // http 응답 메시지를 문자 형식으로
        response.setCharacterEncoding("utf-8"); // 문자 인코딩 정보
        response.getWriter().write("hello"+username); // write -> http body에 메시지가 들어가게 됨


    }
}
