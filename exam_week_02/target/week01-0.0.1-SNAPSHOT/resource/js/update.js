 $(function(){
	 //下拉
	 $.ajax({
		type:"post", 
		url:"/exam_06/xiala.do",
		dataType:"json",
		data:{},
		success:function(obj){
			alert(obj);
			for (var i = 0; i < obj.length; i++) {
				$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>")
				
			}
		}
	 });
	 //回显
		 $.ajax({
				type:"post", 
				url:"/exam_06/show.do",
				dataType:"json",
				data:{
					eno:$("#eno").val()
					},
				 success:function(obj){
					 
					$("#ename").val(obj.ename)
					$("#addr").val(obj.addr)
					$("#salary").val(obj.salary)
					$("select option[value='"+obj.dept.did+"']").prop("selected",true)
				}
			 });
	 //修改
	 $("input[value='修改']").click(function(){
		 $.ajax({
				type:"post", 
				url:"/exam_06/update.do",
				dataType:"json",
				data:$("form").serialize(),
				success:function(obj){
					alert(obj);
					 if(obj){
						 alert("修改成功！")
						 location.href="/exam_06/list.do";
					 }else{
						 alert("修改失败！")
						 location.href="/exam_06/list.do";
					 }
				}
			 });
	 });
	 
	 
	 //h1添加样式
	$("h1").css({"text-align":"center","font-size":"30px"})
	
	 
 });