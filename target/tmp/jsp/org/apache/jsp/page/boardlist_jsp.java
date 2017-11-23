package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.fjh.entity.*;

public final class boardlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>版块列表</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../bt/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tif('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isFirstLoad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'!='true'){\r\n");
      out.write("\t\tlocation.href=\"");
      out.print(basePath);
      out.write("boardlist.do\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! empty logineduser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\"><img\r\n");
          out.write("\t\t\t\t\t\t\tsrc=\"");
          out.print(basePath );
          out.write("img/head/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logineduser.uhead}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\tclass=\"img-circle\" style=\"width: 40px; height: 40px;\" /></a></li>\r\n");
          out.write("\t\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t\t<li>欢迎您【");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logineduser.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("】</li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-export\">退出</span></a>\r\n");
          out.write("\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t");
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
      out.write("\t<style type=\"text/css\">\r\n");
      out.write(".boardlogo {\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tborder: orange solid 1px;\r\n");
      out.write("\tmargin: 5px;\r\n");
      out.write("\twidth: 140px;\r\n");
      out.write("\tbackground-color: #FFFFCC;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".board-img {\r\n");
      out.write("\twidth: 110px;\r\n");
      out.write("\theight: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardlogo:hover {\r\n");
      out.write("\tborder: red;\r\n");
      out.write("\tbackground-color: #F0AD4E;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container nav-margin-top\">\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${boardmap}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("board");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<div class=\"panel panel-primary\">\r\n");
            out.write("\t\t\t\t<div class=\"panel-heading\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${board.key.bname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
            out.write("\t\t\t\t\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${board.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            _jspx_th_c_forEach_1.setVar("subboard");
            int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
              if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<div class=\"col-lg-4  col-md-2 col-xs-2 boardlogo\">\r\n");
                  out.write("\t\t\t\t\t\t\t<img src=\"");
                  out.print(basePath);
                  out.write("img/boardlogo/");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subboard.bimg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" alt=\"\"\r\n");
                  out.write("\t\t\t\t\t\t\t\tclass=\"board-img img-rounded\" /> <br> <br>\r\n");
                  out.write("\t\t\t\t\t\t\t<div class=\"row\" style=\"text-align: center; font-weight: bold;\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"");
                  out.print(basePath);
                  out.write("pager.do?bid=");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subboard.bid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write('"');
                  out.write('>');
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subboard.bname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("(1000)</a>\r\n");
                  out.write("\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"\">天气太热...</a>\r\n");
                  out.write("\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_forEach_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_forEach_1.doFinally();
              _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
            }
            out.write("\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t</div>\r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2017-08-11\r\n");
      out.write("        \t描述：页尾\r\n");
      out.write("        -->\r\n");
      out.write("\t<nav class=\"nav navbar navbar-default  col-md-hide foot\">\r\n");
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
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../bt/js/bootstrap.js\"></script>\r\n");
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
