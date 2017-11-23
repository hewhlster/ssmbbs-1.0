package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.fjh.entity.*;

public final class newtopic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
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
      out.write("<title>新主题</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../bt/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2017-08-11\r\n");
      out.write("        \t描述：头部\r\n");
      out.write("        -->\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"nav navbar navbar-default navbar-fixed-top hidden-sm hidden-xs bg-info\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-brand\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./img/ydlogo.jpg\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ !empty logineduser }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<li><a href=\"#\"><img\r\n");
          out.write("\t\t\t\t\t\tsrc=\"");
          out.print(basePath );
          out.write("img/head/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logineduser.uhead}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\tclass=\"img-circle\" style=\"width: 40px; height: 40px;\" /></a></li>\r\n");
          out.write("\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t<li>欢迎您【");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logineduser.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("】</li>\r\n");
          out.write("\t\t\t\t<li><a href=\"");
          out.print(basePath);
          out.write("logout.do\"><span\r\n");
          out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-export\">退出</span></a></li>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2017-08-11\r\n");
      out.write("        \t描述：内容区域\r\n");
      out.write("        -->\r\n");
      out.write("\t<div class=\"container nav-margin-top\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">发表主题</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(basePath);
      out.write("newtopic.do\" name=\"example\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control fom\" name=\"tname\" id=\"t102\" />\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<textarea rows=\"12\" class=\"form-control\" name=\"tcontent\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<br> <input type=\"hidden\" name=\"bid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-danger\" value=\"回复\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2017-08-11\r\n");
      out.write("        \t描述：页尾\r\n");
      out.write("        -->\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../bt/js/bootstrap.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../themes/default/default.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../js/kindeditor/plugins/code/prettify.css\" />\r\n");
      out.write("<script charset=\"utf-8\" src=\"../js/kindeditor/kindeditor.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"../js/kindeditor/lang/zh_CN.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"../js/kindeditor/plugins/code/prettify.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t<!-- 富文本编辑器 -->\r\n");
      out.write("\t\tKindEditor.ready(function(K) {\r\n");
      out.write("\t\t\tvar editor1 = K.create('textarea[name=\"tcontent\"]', {\r\n");
      out.write("\t\t\t\tcssPath : '../js/kindeditor/plugins/code/prettify.css',\r\n");
      out.write("\t\t\t\tallowFileManager : true,\r\n");
      out.write("\t\t\t\tafterCreate : function() {\r\n");
      out.write("\t\t\t\t\tvar self = this;\r\n");
      out.write("\t\t\t\t\tK.ctrl(document, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tK.ctrl(self.edit.doc, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})});\r\n");
      out.write("\t</script>\r\n");
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
