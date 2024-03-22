public class three extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       String firstname = request.getParameter("fname");
       String surname = request.getParameter("sname");
       
       response.getWriter().println("Welcome " +firstname+ "" +surname);
        //processRequest(request, response);
    }
}