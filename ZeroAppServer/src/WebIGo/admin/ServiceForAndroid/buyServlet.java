package WebIGo.admin.ServiceForAndroid;

import WebIGo.admin.Bean.OrderInfo;
import WebIGo.admin.utils.MyUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/android/buy.html")
public class buyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决正常中文字符串返回乱码
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String orders= MyUtils.getChineseParam(request,"orders");

        Gson gson=new Gson();
        //转为对象数组
        ArrayList<OrderInfo> orderInfos= gson.fromJson(orders, new TypeToken<ArrayList<OrderInfo>>(){}.getType());
        //此处处理订单请求。


        //ArrayList<OrderInfo> orderInfos= new Gson().fromJson(orders, new TypeToken<ArrayList<OrderInfo>>(){}.getType());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
