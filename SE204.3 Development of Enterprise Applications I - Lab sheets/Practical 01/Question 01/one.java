public class one extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plane");
         response.getWriter().println("The first lab session of DEA module");
        //processRequest(request, response);
    }
}