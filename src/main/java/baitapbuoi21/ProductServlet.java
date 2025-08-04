package baitapbuoi21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "productServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<Product> productList = (List<Product>) session.getAttribute("productList");
		req.setAttribute("productList", productList); 
		req.getRequestDispatcher("product.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		
		
		HttpSession session = req.getSession();
	    List<Product> productList = (List<Product>) session.getAttribute("productList");
        
	    if (productList == null) {
	        productList = new ArrayList<>();
	    }
		
		
	     String tenSanPham =req.getParameter("tenSanPham");
	     int soLuong = Integer.parseInt(req.getParameter("soLuong"));
	     double giaBan = Double.parseDouble(req.getParameter("giaBan"));
	     
	    
	     
	     Product p = new Product(tenSanPham, soLuong, giaBan);
	     productList.add(p);
	     session.setAttribute("productList", productList);
	     resp.sendRedirect("product");
	}
}
