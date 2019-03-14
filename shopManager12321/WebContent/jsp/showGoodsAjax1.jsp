<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${ctxPath }/static/css/style.css" rel="stylesheet" type="text/css" />
<link href="${ctxPath }/static/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctxPath }/static/js/jquery.js"></script>
<script type="text/javascript" src="${ctxPath }/static/js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="${ctxPath }/static/js/select-ui.min.js"></script>
<script type="text/javascript" src="${ctxPath }/static/editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
var barCodeArry = new Array();
var dataIndex = 0;
$(function(e){
	
	$("input[name = 'barCode']").keypress(function(e){
		if (e.keyCode == 13) {
			addGoods(this.value);
			clearBarCode(this);
		}
	})
	
	$(".scbtn2").click(function(){
		var $barCodeValue = $("input[name = 'barCode']");
		addGoods($barCodeValue.val());
	})
	
	function clearBarCode(barCodeInput){
		barCodeInput.value = "";
		barCodeInput.focus();
	}
	
	function addGoods(barCodeValue){
		var goodsCount = parseInt($("input[name='goodsCount']").val());
		var isNotExist = true;
		$.each(barCodeArray, function(){
			if(this == barCodeValue) {
				isNotExist = false;
				return;
			}
		})
		if(isNotExist){
			$.ajax({
				type:"post",
				url:"${ctxPath }/ShowGoodsAjax1.do",
				data:{barCode:barCodeValue},
				dataType:"json",
				success:function(resData){
					if(resData.resCode) {
						resData.data.goodsCount = goodsCount;
						appendGoods(resData.data);
						barCodeArray[dataIndex++] = barCodeValue;
					} else {
						alert(resData.resMsg);
					}
				}
			})
		} else {
			$("#goodsCountTd"+barCodeValue).text(parseInt($("#goodsCountTd"+barCodeValue).text())+goodsCount);
		}
	}
	
	function appendGoods(goods){
		$("tbody").append("<tr id='" + goods.barCode + "Tr'><td><input name='' type='checkbox' value='' /></td><td>"+goods.barCode+
				"</td><td>" +goods.goodsName + "</td><td>" +goods.price + "</td><td id='goodsCountTd" + goods.barCode + "'>" +goods.goodsCount + 
				"</td><td><a href='#' class='tablelink'> 删除</a></td></tr>")
	}
})
</script>
</head>
<body class="sarchbody">
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">收银</a></li>
    </ul>
    </div>
    <div class="formbody">
    <div id="usual1" class="usual"> 
    <div class="formtitle"><span>商品列表</span></div>
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>商品编号<i class="sort"><img src="${ctxPath }/static/images/px.gif" /></i></th>
        <th>商品名称</th>
        <th>价格</th>
        <th>数量</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
	</div> 
    </div>
    <div>
    	<label>商品编号</label><input name="barCode" type="text" class="scinput1" />
    	<label>商品数量</label><input name="goodsCount" type="text" class="scinput1" value="1" />
    	<input type="button" class="scbtn2" value="提交"/>
    	<p>总金额:${BigDecimal.valueOf(0.00).equals(sum)?0.00:sum}</p>
    </div>
</body>

</html>
