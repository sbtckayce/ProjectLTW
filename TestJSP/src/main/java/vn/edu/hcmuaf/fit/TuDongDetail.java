package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.bean.AllProduct;
import vn.edu.hcmuaf.fit.bean.Category;
import vn.edu.hcmuaf.fit.bean.Product;
import vn.edu.hcmuaf.fit.dao.AllProductDAO;
import vn.edu.hcmuaf.fit.dao.CategoryDAO;
import vn.edu.hcmuaf.fit.dao.ProductDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TuDongDetail", value = "/tudongdetail")
public class TuDongDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tdid = request.getParameter("tdid");
        AllProduct detailProductTuDongs = AllProductDAO.getInstance().detailProductTuDongByID(tdid);
        request.setAttribute("detail",detailProductTuDongs);
        List<Category> categories = CategoryDAO.getInstance().getAll();
        request.setAttribute("category",categories);
        request.getRequestDispatcher("detail.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
