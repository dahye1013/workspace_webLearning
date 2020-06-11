/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-06-10 02:34:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.bean.MemberDTO;
import member.dao.MemberDAO;

public final class modifyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.dao.MemberDAO");
    _jspx_imports_classes.add("member.bean.MemberDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

//데이터
//String id = request.getParameter("id");
String id = (String)session.getAttribute("memId");

//DB
MemberDAO memberDAO = MemberDAO.getInstance();
MemberDTO memberDTO = memberDAO.getMember(id);


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원정보수정</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>회원정보수정</h3>\r\n");
      out.write("<form name=\"modifyForm\" method=\"post\" action=\"modify.jsp\">\r\n");
      out.write("<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"70\" align=\"center\">이름</td>\r\n");
      out.write("  <td><input type=\"text\" name=\"name\" id=\"name\" value=\"");
      out.print(memberDTO.getName() );
      out.write("\" placeholder=\"이름 입력\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"70\" align=\"center\">아이디</td>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type=\"text\" name=\"id\" value=\"");
      out.print(id );
      out.write("\" size=\"30\" readonly>\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr> \r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"70\" align=\"center\">비밀번호</td>\r\n");
      out.write("  <td><input type=\"password\" name=\"pwd\" size=\"35\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"70\" align=\"center\">재확인</td>\r\n");
      out.write("  <td><input type=\"password\" name=\"repwd\" size=\"35\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td width=\"70\" align=\"center\">성별</td>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type=\"radio\" name=\"gender\" value=\"0\">남 &emsp;\r\n");
      out.write("   <input type=\"radio\" name=\"gender\" value=\"1\">여\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td align=\"center\">이메일</td>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type=\"text\" name=\"email1\" value=\"");
      out.print(memberDTO.getEmail1() );
      out.write("\" size=\"15\" >\r\n");
      out.write("   @\r\n");
      out.write("   <input type=\"email\" name=\"email2\" id=\"email2\" list=\"defaultEmails\" placeholder=\"직접입력\">\r\n");
      out.write("   <datalist id=\"defaultEmails\">\r\n");
      out.write("    <option value=\"naver.com\">\r\n");
      out.write("\t<option value=\"hanmail.net\">\r\n");
      out.write("\t<option value=\"gmail.com\">\r\n");
      out.write("   </datalist>\r\n");
      out.write("  </td>\t\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td align=\"center\">핸드폰</td>\r\n");
      out.write("  <td>\r\n");
      out.write("   <select name=\"tel1\" id=\"tel1\" style=\"width: 60px;\">\r\n");
      out.write("    <option value=\"010\">010</option>\r\n");
      out.write("\t<option value=\"02\">02</option>\r\n");
      out.write("   </select>\r\n");
      out.write("   -\r\n");
      out.write("   <input type=\"text\" name=\"tel2\" value=\"");
      out.print(memberDTO.getTel2() );
      out.write("\" size=\"5\">\r\n");
      out.write("   -\r\n");
      out.write("   <input type=\"text\" name=\"tel3\" value=\"");
      out.print(memberDTO.getTel3() );
      out.write("\" size=\"5\">\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td align=\"center\">주소</td>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type=\"text\" name=\"zipcode\" id=\"zipcode\" value=\"");
      out.print(memberDTO.getZipcode() );
      out.write("\" size=\"7\" readonly>\r\n");
      out.write("   <input type=\"button\" value=\"우편번호검색\" onclick=\"checkPost()\"><br>\r\n");
      out.write("   \r\n");
      out.write("   <input type=\"text\" name=\"addr1\" id=\"addr1\" value=\"");
      out.print(memberDTO.getAddr1() );
      out.write("\" placeholder=\"주소\" size=\"50\" readonly><br>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <input type=\"text\" name=\"addr2\" id=\"addr2\" value=\"");
      out.print(memberDTO.getAddr2() );
      out.write("\" placeholder=\"상세 주소\" size=\"50\">\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" <tr>\r\n");
      out.write("  <td colspan=\"2\" align=\"center\">\r\n");
      out.write("   <input type=\"button\" value=\"회원정보수정\" onclick=\"checkModifyForm()\">\r\n");
      out.write("   <input type=\"reset\" value=\"다시작성\">\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/member.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onload=function(){\r\n");
      out.write("\tdocument.modifyForm.gender['");
      out.print(memberDTO.getGender());
      out.write("'].checked = true;\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.modifyForm.email2.value = '");
      out.print(memberDTO.getEmail2());
      out.write("';\r\n");
      out.write("\t//document.getElementById('email2').value = '");
      out.print(memberDTO.getEmail2());
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.modifyForm.tel1.value = '");
      out.print(memberDTO.getTel1());
      out.write("';\r\n");
      out.write("\t//document.getElementById('tel1').value = '");
      out.print(memberDTO.getTel1());
      out.write("';\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
