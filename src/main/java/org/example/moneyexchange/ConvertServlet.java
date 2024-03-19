package org.example.moneyexchange;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

@WebServlet(name="ConverServlet", urlPatterns = "/convert")
public class ConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        int vnd = (int) (rate * usd);
        Locale locale = Locale.GERMANY;
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
//        decimalFormat.setGroupingUsed(true);
//        decimalFormat.setGroupingSize(3);
        String formattedNumber = formatter.format(vnd);


        PrintWriter writer = resp.getWriter();
        writer.println("<html");
        writer.println("<h1> Rate: " + rate + "</h1>");
        writer.println("<h1> USD: " + usd + "</h1>");
        writer.println("<h1> VND: " + formattedNumber + "</h1>");
        writer.println("</html");

    }
}
