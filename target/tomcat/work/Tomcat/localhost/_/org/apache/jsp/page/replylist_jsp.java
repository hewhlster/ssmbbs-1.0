/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-23 07:04:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.fjh.entity.*;

public final class replylist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /page/replylist.jsp(36,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty logineduser}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<li><a href=\"#\"><img\r\n");
          out.write("\t\t\t\t\t\tsrc=\"");
          out.print(basePath );
          out.write("img/head/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logineduser.uhead}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\tclass=\"img-circle\" style=\"width: 40px; height: 40px;\" /></a></li>\r\n");
          out.write("\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t<li>欢迎您【");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logineduser.uname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("】</li>\r\n");
          out.write("\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-export\">退出</span></a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
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
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /page/replylist.jsp(81,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/page/replylist.jsp(81,2) '${topicmap}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${topicmap}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /page/replylist.jsp(81,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("topic");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<!-- 供下面回帖子用 -->\r\n");
            out.write("\t\t\t");
            if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
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
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.tuser.uhead}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" alt=\"\" class=\"topic-left-user-head\" />\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t<div>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.tuser.uname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write(" | 帖子数:<span>100</span></div>\r\n");
            out.write("\t\t\t\t\t<div></div>\r\n");
            out.write("\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t<div>查看:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.treaded}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write(" | 回复：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.tgooded}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
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
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t<!--\r\n");
            out.write("                    \t作者：offline\r\n");
            out.write("                    \t时间：2017-08-11\r\n");
            out.write("                    \t描述：帖子正文\r\n");
            out.write("                    -->\r\n");
            out.write("\t\t\t\t\t<div style=\"padding-top: 15px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.tcontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
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
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
            _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /page/replylist.jsp(133,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/page/replylist.jsp(133,3) '${ topic.value }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ topic.value }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
            // /page/replylist.jsp(133,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVar("reply");
            // /page/replylist.jsp(133,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVarStatus("vs");
            int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
              if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reply.ruser.uhead}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                  out.write("\" alt=\"\" class=\"topic-left-user-head\" />\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t<div>");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reply.ruser.uname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
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
                  if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t<!--\r\n");
                  out.write("                    \t作者：offline\r\n");
                  out.write("                    \t时间：2017-08-11\r\n");
                  out.write("                    \t描述：帖子正文\r\n");
                  out.write("                    -->\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"padding-top: 15px;\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reply.rcontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                  out.write("</div>\r\n");
                  out.write("\t\t\t\t\t\t<!--\r\n");
                  out.write("                    \t作者：offline\r\n");
                  out.write("                    \t时间：2017-08-11\r\n");
                  out.write("                    \t描述：帖子附带信息\r\n");
                  out.write("                    -->\r\n");
                  out.write("\t\t\t\t\t\t<div style=\"border-top: #9d9d9d dashed 1px; text-align: right;\">\r\n");
                  out.write("\t\t\t\t\t\t\t<span class=\"text-danger\">【");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs.index+1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                  out.write("】楼</span>\r\n");
                  out.write("\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t</div>\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t\t</div>\r\n");
                  out.write("\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_005fforEach_005f1.doFinally();
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
            }
            out.write("\r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.tid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
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
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /page/replylist.jsp(83,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("tid");
    // /page/replylist.jsp(83,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/page/replylist.jsp(83,3) '${topic.key.tid}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${topic.key.tid}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /page/replylist.jsp(83,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /page/replylist.jsp(114,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.key.tpublishdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /page/replylist.jsp(114,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("both");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /page/replylist.jsp(161,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setType("both");
    // /page/replylist.jsp(161,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reply.tpublishdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }
}
