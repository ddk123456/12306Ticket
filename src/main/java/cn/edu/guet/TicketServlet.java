package cn.edu.guet;

/**
 * @Author liwei
 * @Date 2023/5/7 16:09
 * @Version 1.0
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("余票查询");

        /*
        WebServer：Tomcat（京东商城也在用）、JBOSS、WebLogic、WebsPhere
        后台如何获取网页中提交的数据呢？网页中的input的数据在点击《查询》的一瞬间都被《Web Server：Web服务器》封装到了一个对象中
        这个对象就是HttpServletRequest对象
        request对象是Tomcat容器帮我们创建的，很疑惑，Tomcat到底是做了什么样的工作，那么请你去图书馆借书：Tomcat源码
         */

        request.setCharacterEncoding("UTF-8");
        /*
        Tomcat把我们的数据封装到HttpServletRequest对象中的时候，自动把编码转变了，所以我们需要重新转变回来
         */

        String fromStation = request.getParameter("fromStation");
        System.out.println(fromStation);
        String toStation = request.getParameter("toStation");
        System.out.println(toStation);
        String departureDate = request.getParameter("departureDate");
        System.out.println(departureDate);

        String allTickets=TicketSearch.search(fromStation,toStation,departureDate);

        // 设置响应类型
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out= response.getWriter();
        out.print(allTickets);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
