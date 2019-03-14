package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.PropertiesUtil;
import util.YeePayUtil;


public class PayBeginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p0_Cmd = "Buy";
		String p1_MerId = PropertiesUtil.getValue("p1_MerId");
		String p2_Order = "1000117";
		String p3_Amt = "0.1";
		String p4_Cur = "CNY";
		String p5_Pid = "";
		String p6_Pcat = "";
		String p7_Pdesc = "";
		String p8_Url = PropertiesUtil.getValue("p8_Url");
		String p9_SAF = "0";
		String pa_MP = "";
		String pd_FrpId = request.getParameter("pd_FrpId");
		String pr_NeedResponse = "1";
		String keyValue = PropertiesUtil.getValue("keyValue");
		String hmac = YeePayUtil.getHmac(p0_Cmd,p1_MerId,p2_Order,p3_Amt,
				p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc,p8_Url, p9_SAF, 
				pa_MP, pd_FrpId, pr_NeedResponse, keyValue);
		String url="https://www.yeepay.com/app-merchant-proxy/node?"+
				"&p0_Cmd="+p0_Cmd+
				"&p1_MerId="+p1_MerId+
				"&p2_Order="+p2_Order+
				"&p3_Amt="+p3_Amt+
				"&p4_Cur="+p4_Cur+
				"&p5_Pid="+p5_Pid+
				"&p6_Pcat="+p6_Pcat+
				"&p7_Pdesc="+p7_Pdesc+
				"&p8_Url="+p8_Url+
				"&p9_SAF="+p9_SAF+
				"&pa_MP="+pa_MP+
				"&pd_FrpId="+pd_FrpId+
				"&pr_NeedResponse="+pr_NeedResponse+
				"&hmac="+hmac;
		response.sendRedirect(url);
	}
}
