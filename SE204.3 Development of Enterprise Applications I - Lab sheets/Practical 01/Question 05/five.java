public class five extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));
        
        String operation = request.getParameter("operation");
        switch (operation) {
            case "add": response.getWriter().print("Answer: "+(a+b));break;
            case "substract": response.getWriter().print("Answer: "+(a-b));break;
            case "multiply": response.getWriter().print("Answer: "+(a*b));break;
            case "division": response.getWriter().print("Answer: "+(a/b));break;
        }
        //processRequest(request, response);
    }