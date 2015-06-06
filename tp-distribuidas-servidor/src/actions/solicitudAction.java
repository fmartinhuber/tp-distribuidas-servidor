package actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.SolicitudDeCargaDto;

/**
 * Servlet implementation class solicitudAction
 */
public class solicitudAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public solicitudAction() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void init(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SolicitudDeCargaDto soli = new SolicitudDeCargaDto(null, null, null, null, null, null, null, null);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
