/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-16 05:24:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public final class board_005fwrite_005fok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(8);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>게시판</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../style_contents.css\" type=\"text/css\">\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var name = document.getElementById(\"name\").value;\n");
      out.write("            var pw = document.getElementById(\"pw\").value;\n");
      out.write("            var email = document.getElementById(\"email\").value;\n");
      out.write("            var sub = document.getElementById(\"sub\").value;\n");
      out.write("            var cont = document.getElementById(\"cont\").value;\n");
      out.write("            \n");
      out.write("            if (name === \"\" || pw === \"\" || email === \"\" || sub === \"\" || cont === \"\") {\n");
      out.write("                alert(\"모든 필드를 입력해주세요.\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <iframe src=\"../head.jsp\" id=\"bodyFrame\" name=\"body\" width=\"100%\" frameborder=\"0\"></iframe>\n");
      out.write("    <div id=\"board_contents\" class=\"contents\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 String b_name = request.getParameter("name"); 
      out.write("\n");
      out.write("        ");
 String b_pw = request.getParameter("pw"); 
      out.write("\n");
      out.write("        ");
 String b_email = request.getParameter("email"); 
      out.write("\n");
      out.write("        ");
 String b_sub = request.getParameter("sub"); 
      out.write("\n");
      out.write("        ");
 String b_cont = request.getParameter("cont"); 
      out.write("\n");
      out.write("        ");
 String b_tag = request.getParameter("tag"); 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("         ");
 String f_error = (String) request.getAttribute("att_file_error"); 
      out.write("\n");
      out.write("         ");
 String f_name = (String) request.getAttribute("att_file_name"); 
      out.write("\n");
      out.write("         ");
 String f_tmp = (String) request.getAttribute("att_file_tmp"); 
      out.write("\n");
      out.write("         ");
 String f_size = (String) request.getAttribute("att_file_size"); 
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 Class.forName("oracle.jdbc.driver.OracleDriver"); 
      out.write("\n");
      out.write("        ");
 Connection conn = DriverManager.getConnection("192.168.151.223", "abraxas", "2076063678"); 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 String strSQL = "INSERT INTO board (strName, strPassword, strEmail, strSubject, strContent, htmlTag, writeDate"; 
      out.write("\n");
      out.write("        ");
 if (f_error == null || f_error.equals("0")) { 
      out.write("\n");
      out.write("            ");
 strSQL += ", filename, filesize"; 
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        ");
 strSQL += ") VALUES (?, ?, ?, ?, ?, ?, SYSDATE"; 
      out.write("\n");
      out.write("        ");
 if (f_error == null || f_error.equals("0")) { 
      out.write("\n");
      out.write("            ");
 strSQL += ", ?, ?"; 
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        ");
 strSQL += ")"; 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 PreparedStatement pstmt = conn.prepareStatement(strSQL); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(1, b_name); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(2, b_pw); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(3, b_email); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(4, b_sub); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(5, b_cont); 
      out.write("\n");
      out.write("        ");
 pstmt.setString(6, b_tag); 
      out.write("\n");
      out.write("        ");
 if (f_error == null || f_error.equals("0")) { 
      out.write("\n");
      out.write("            ");
 pstmt.setString(7, f_name); 
      out.write("\n");
      out.write("            ");
 pstmt.setString(8, f_size); 
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        ");
 int result = pstmt.executeUpdate(); 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 if (result > 0) { 
      out.write("\n");
      out.write("            <script>alert('success.'); location.replace('board_list.jsp');</script>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <script>alert('fail.'); history.back();</script>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 pstmt.close(); 
      out.write("\n");
      out.write("        ");
 conn.close(); 
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
