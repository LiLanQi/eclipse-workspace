package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.PropertiesUtil;
import util.YeePayUtil;

public class PayEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1_MerId = PropertiesUtil.getValue("p1_MerId");
		String r0_Cmd = request.getParameter("r0_Cmd");
		String r1_Code = request.getParameter("r1_Code");
		String r2_TrxId = request.getParameter("r2_TrxId");
		String r3_Amt = request.getParameter("r3_Amt");
		String r4_Cur = request.getParameter("r4_Cur");
		String r5_Pid = request.getParameter("r5_Pid");
		String r6_Order = request.getParameter("r6_Order");
		String r7_Uid = request.getParameter("r7_Uid");
		String r8_MP = request.getParameter("r8_MP");
		String r9_BType = request.getParameter("r9_BType");
		String hmac = request.getParameter("hmac");
		String keyValue = PropertiesUtil.getValue("keyValue");
		boolean result = YeePayUtil.checkHmac(p1_MerId, r0_Cmd, r1_Code, r2_TrxId, r3_Amt,
				r4_Cur, r5_Pid, r6_Order, r7_Uid, r8_MP, r9_BType, keyValue, hmac);

		if(result) {
			if(r1_Code.equals("1")){
				System.out.println("扣款成功");
			}else {
				System.out.println("扣款失败");
			}
		}else {
			System.out.println("交易失败");
		}
		
	}

}
