package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;

import bean.Cine;


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
		
		Object idCine = request.getParameter("idCine");
		dao.CineDAO cineDao = new dao.CineDAO();
		if( idCine == null ) {
			//String[][] mCines = cineDao.getCines();
			//session.setAttribute("id", mCines == null ? null : "cines");
			//session.setAttribute("mCines", mCines);
			
			List<Cine> lstCine = cineDao.getCinesList();
			session.setAttribute("id", lstCine == null ? null : "cines");
			session.setAttribute("lstCine", lstCine);
		}else {
			//String[] aCine = cineDao.getCine(idCine);
			//session.setAttribute("id", aCine == null ? null : "cine");
			//session.setAttribute("aCine", aCine);
			//session.setAttribute("mTarifas", cineDao.getCineTarifas(idCine));
			//session.setAttribute("mPeliculas", cineDao.getCinePeliculas(idCine));
			
			Cine cine = cineDao.getCineList(idCine);
			session.setAttribute("id", cine == null ? null : "cine");
			session.setAttribute("cine", cine);
			session.setAttribute("lstCineTarifas", cineDao.getCineTarifasList(idCine));
			session.setAttribute("lstCinePeliculas", cineDao.getCinePeliculasList(idCine));
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
