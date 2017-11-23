package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.fjh.entity.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

 	String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>导航条</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./bt/css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"nav navbar navbar-default navbar-fixed-top hidden-sm hidden-xs bg-info\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-brand\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./img/ydlogo.jpg\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write(".loginbox {\r\n");
      out.write("\tborder: #FFA500 solid 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginbox-left {\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginbox-right {\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("\tmargin: 0px;;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"margin: 69px auto;\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div id=\"loginbox-left\"\r\n");
      out.write("\t\t\t\tclass=\"col-lg-8 col-md-12 carousel hidden-md hidden-sm hidden-xs\">\r\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#loginbox-left\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#loginbox-left\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#loginbox-left\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#loginbox-left\" data-slide-to=\"3\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/1.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>夏天</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Hello Jack</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"item \">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/2.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/3.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>秋天</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<span>满林的枫叶，红透了半山</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./img/4.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"#loginbox-left\" class=\"carousel-control left\"\r\n");
      out.write("\t\t\t\t\tdata-slide=\"prev\" d>&lt;</a> <a href=\"#loginbox-left\"\r\n");
      out.write("\t\t\t\t\tclass=\"carousel-control right\" data-slide=\"next\">&gt;</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t\t\t\t右侧登录区域\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\t<div class=\"row col-lg-4 col-md-12\"\r\n");
      out.write("\t\t\t\tstyle=\"background-color: #F8EFC0; border: #F0AD4E solid 1px; height: 450px; border-radius: 5px;\">\r\n");
      out.write("\t\t\t\t<div class=\"row\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-color: #F0AD4E; text-align: center; margin-left: -15px; margin-right: -15px;\">\r\n");
      out.write("\t\t\t\t\t<h1>登录</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div class=\"row input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\">用户名</span>\r\n");
      out.write("\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"t100\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div class=\"row input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-lock\">密 码</span>\r\n");
      out.write("\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"t101\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div class=\"row input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\">验证码</span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control fom\" style=\"width: 150px;\" id=\"t102\" /> <img\r\n");
      out.write("\t\t\t\t\t\tid=\"300\" name=\"checkcode\" src=\"");
      out.print(basePath);
      out.write("checkcode.do\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 5px; width: 100px; height: 45px\" alt=\"点击更换一张\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div class=\"row input-group \" style=\"margin: 0 auto;\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-default btn-lg btn-success\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 120px;\" id=\"b100\">登录</button>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-default btn-lg btn-info\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 120px;\" id=\"b200\">注册新用户</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t作者：offline\r\n");
      out.write("\t时间：2017-08-11\r\n");
      out.write("\t描述：页尾\r\n");
      out.write("-->\r\n");
      out.write("<nav class=\"nav navbar navbar-default  col-md-hide foot\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div style=\"width:250px;float:left;margin-top: 25px\">\r\n");
      out.write("\t\t\t关注我们:<a href=\"mailto:hewlh@163.com\">hewlh@163.com</a>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t©1997-2017 Jack版权所有\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"float:left;margin-top: 10px\">\r\n");
      out.write("\t\t\t\t<img style=\"width:80px;height:80px\" alt=\"微信公众号\" src=\"");
      out.print(basePath);
      out.write("img/wxgzh.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./bt/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar errormsg = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.errormsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\t\t");
 session.removeAttribute("errormsg");
      out.write("\r\n");
      out.write("\t\t\tif(errormsg.length>0){\r\n");
      out.write("\t\t\t\twindow.alert(errormsg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//验证码\r\n");
      out.write("\t\t\t$(\"#300\").click(function(){\r\n");
      out.write("\t\t\t\t$(this).attr(\"src\",\"");
      out.print(basePath);
      out.write("checkcode.do?param=\"+Math.random());\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//注册\r\n");
      out.write("\t\t\t$(\"#b200\").click(function(){\r\n");
      out.write("\t\t\t\twindow.location=\"");
      out.print(basePath);
      out.write("regist.jsp\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t//登录\r\n");
      out.write("\t\t$(\"#b100\").click(function(){\r\n");
      out.write("\t\t\tvar $uname= $(\"#t100\").val();\r\n");
      out.write("\t\t    var $upass= $(\"#t101\").val()\r\n");
      out.write("\t\t    var $checkcode =$(\"#t103\").val();\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var url=\"");
      out.print(basePath);
      out.write("login.do?uname=\"+$uname+\"&upass=\"+$upass;\r\n");
      out.write("\t\t    window.location = url;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});//end jquery\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
