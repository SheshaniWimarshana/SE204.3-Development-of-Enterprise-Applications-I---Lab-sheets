public class two extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
         response.getWriter().println("<h1>The first lab session of DEA module</h1>");
        //processRequest(request, response);
    }
}