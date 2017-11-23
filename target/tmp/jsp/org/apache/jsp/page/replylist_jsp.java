package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.fjh.entity.*;

public final class replylist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
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
      out.write("<title>帖子信息</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bt/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
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
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty logineduser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
          out.write("\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-export\">退出</span></a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
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
      out.write("\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2017-08-11\r\n");
      out.write("        \t描述：内容区域\r\n");
      out.write("        -->\r\n");
      out.write("\t<div class=\"container nav-margin-top\">\r\n");
      out.write("\t\t<!-- 面包导航 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\" col-lg-11\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb \">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">热门论坛</a><span class=\"divider\"></span></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">龙城茶座</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-1\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" id=\"b100\">发表新主题</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--帖子内容 -->\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t.topic-left-user-head {\r\n");
      out.write("\t\t\t\twidth: 130px;\r\n");
      out.write("\t\t\t\theight: 130px;\r\n");
      out.write("\t\t\t\tborder: 1px solid green;\r\n");
      out.write("\t\t\t\tpadding: 2px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topicmap}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("topic");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<!-- 供下面回帖子用 -->\r\n");
            out.write("\t\t\t");
            if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("\t\t\t<!-- 主题信息 -->\r\n");
            out.write("\t\t\t<div class=\"row\" style=\"border: solid orange 1px;\">\r\n");
            out.write("\t\t\t\t<!--\r\n");
            out.write("                \t作者：offline\r\n");
            out.write("                \t时间：2017-08-11\r\n");
            out.write("                \t描述：左侧网友信息\r\n");
            out.write("                -->\r\n");
            out.write("\t\t\t\t<div\r\n");
            out.write("\t\t\t\t\tstyle=\"height: 100%; text-align: center; border-bottom: dotted orange 1px;\"\r\n");
            out.write("\t\t\t\t\tclass=\"col-lg-3\">\r\n");
            out.write("\t\t\t\t\t<div style=\"height: 30px;\"></div>\r\n");
            out.write("\t\t\t\t\t<div >\r\n");
            out.write("\t\t\t\t\t\t<img style=\"uhead-img\" src=\"");
            out.print(basePath );
            out.write("img/head/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tuser.uhead}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" class=\"topic-left-user-head\" />\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t<div>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tuser.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" | 帖子数:<span>100</span></div>\r\n");
            out.write("\t\t\t\t\t<div></div>\r\n");
            out.write("\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t<div>查看:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.treaded}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" | 回复：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tgooded}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t<!--\r\n");
            out.write("\t\t\t\t\t右侧帖子信息\r\n");
            out.write("\t\t\t\t-->\r\n");
            out.write("\t\t\t\t<div class=\"col-lg-9\" style=\"border-left: solid orange 1px;\">\r\n");
            out.write("\t\t\t\t\t<!--\r\n");
            out.write("                    \t作者：offline\r\n");
            out.write("                    \t时间：2017-08-11\r\n");
            out.write("                    \t描述：帖子主题\r\n");
            out.write("                    -->\r\n");
            out.write("\t\t\t\t\t<div style=\"border-bottom: dashed 1px #9D9D9D;\">\r\n");
            out.write("\t\t\t\t\t\t发表于\r\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t<!--\r\n");
            out.write("                    \t作者：offline\r\n");
            out.write("                    \t时间：2017-08-11\r\n");
            out.write("                    \t描述：帖子正文\r\n");
            out.write("                    -->\r\n");
            out.write("\t\t\t\t\t<div style=\"padding-top: 15px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tcontent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("\t\t\t\t\t<!--\r\n");
            out.write("                    \t作者：offline\r\n");
            out.write("                    \t时间：2017-08-11\r\n");
            out.write("                    \t描述：帖子附带信息\r\n");
            out.write("                    -->\r\n");
            out.write("\t\t\t\t\t<div style=\"border-top: #9d9d9d dashed 1px; text-align: right;\">\r\n");
            out.write("\t\t\t\t\t\t<span class=\"text-danger\">楼主</span>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t</div>\r\n");
            out.write("\t\t\t<!-- 回复信息 -->\r\n");
            out.write("\t\t\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ topic.value }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            _jspx_th_c_forEach_1.setVar("reply");
            _jspx_th_c_forEach_1.setVarStatus("vs");
            int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
              if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t<div class=\"row\" style=\"border: solid orange 1px;\">\r\n");
                  out.write("\t\t\t\t\t<!--\r\n");
                  out.write("                \t作者：offline\r\n");
                  out.write("                \t时间：2017-08-11\r\n");
                  out.write("                \t描述：左侧网友信息\r\n");
                  out.write("                -->\r\n");
                  out.write("\t\t\t\t\t<div\r\n");
                  out.write("\t\t\t\t\t\tstyle=\"height: 100%; text-align: center; border-bottom: dotted orange 1px;\"\r\n");
                  out.write("\t\t\t\t\t\tclass=\"col-lg-3\">\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"height: 30px;\"></div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"uhead\">\r\n");
                  out.write("\t\t\t\t\t\t\t<img src=\"");
                  out.print(basePath );
                  out.write("img/head/");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reply.ruser.uhead}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" alt=\"\" class=\"topic-left-user-head\" />\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t<div>");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reply.ruser.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</div>\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t<!--\r\n");
                  out.write("\t\t\t\t\t右侧帖子信息\r\n");
                  out.write("\t\t\t\t-->\r\n");
                  out.write("\t\t\t\t\t<div class=\"col-lg-9\" style=\"border-left: solid orange 1px;\">\r\n");
                  out.write("\t\t\t\t\t\t<!--\r\n");
                  out.write("                    \t作者：offline\r\n");
                  out.write("                    \t时间：2017-08-11\r\n");
                  out.write("                    \t描述：帖子主题\r\n");
                  out.write("                    -->\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"border-bottom: dashed 1px #9D9D9D;\">\r\n");
                  out.write("\t\t\t\t\t\t\t发表于\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t<!--\r\n");
                  out.write("                    \t作者：offline\r\n");
                  out.write("                    \t时间：2017-08-11\r\n");
                  out.write("                    \t描述：帖子正文\r\n");
                  out.write("                    -->\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"padding-top: 15px;\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reply.rcontent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</div>\r\n");
                  out.write("\t\t\t\t\t\t<!--\r\n");
                  out.write("                    \t作者：offline\r\n");
                  out.write("                    \t时间：2017-08-11\r\n");
                  out.write("                    \t描述：帖子附带信息\r\n");
                  out.write("                    -->\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"border-top: #9d9d9d dashed 1px; text-align: right;\">\r\n");
                  out.write("\t\t\t\t\t\t\t<span class=\"text-danger\">【");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("】楼</span>\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t</div>\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t\t</div>\r\n");
                  out.write("\t\t\t");
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
              _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
            }
            out.write("\r\n");
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
      out.write("\t\t<!-- 分页 -->\r\n");
      out.write("\t\t<div class=\"row right\">\r\n");
      out.write("\t\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">&laquo;</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"\"><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">&raquo;</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 回贴子 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">快速回复</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(basePath);
      out.write("newreply.do\">\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" name=\"rcontent\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<br> <input type=\"hidden\" name=\"tid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageScope.tid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-danger\" value=\"回复\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/bt/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#b100\").click(function(){\r\n");
      out.write("\t\t\t\twindow.location=\"");
      out.print(basePath);
      out.write("newtopicmv.do\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("tid");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("page");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.key.tpublishdate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("both");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatDate_1.setType("both");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reply.tpublishdate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }
}
