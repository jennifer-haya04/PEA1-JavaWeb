package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;


public class CineSVL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CineSVL() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		Object id = request.getParameter("id");
		dao.CineDAO cineDao = new dao.CineDAO();
		if( id == null ) {
			String[][] mCines = cineDao.getCines();
			session.setAttribute("id", mCines == null ? null : "cines");
			session.setAttribute("mCines", mCines);
		}else {
			String[][] aCine = cineDao.getCine(id);
			session.setAttribute("id", aCine == null ? null : "cine");
			session.setAttribute("aCine", aCine);
			session.setAttribute("mTarifas", cineDao.getCineTarifas(id));
			session.setAttribute("mPeliculas", cineDao.getCinePeliculas(id));
		}
		
		response.sendRedirect("index.jsp");
		
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
