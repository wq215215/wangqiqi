 $(function(){
	 //下拉
	 $.ajax({
		type:"post", 
		url:"/exam_06/xiala.do",
		dataType:"json",
		data:{},
		success:function(obj){
			alert(obj);
			for (var i = 0; i < obj.length; i++){
				$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>")
				
			}
			
		}
	 });
	 //添加
	 $("input[value='添加']").click(function(){
		 $.ajax({
				type:"post", 
				url:"/exam_06/add.do",
				dataType:"json",
				data:$("form").serialize(),
				success:function(obj){
					alert(obj);
					 if(obj){
						 alert("添加成功！")
						 location.href="/exam_06/list.do";
					 }else{
						 alert("添加失败！")
						 location.href="/exam_06/list.do";
					 }
				}
			 });
	 });
	 
	 //h1添加样式
	$("h1").css({"text-align":"center","font-size":"30px"})
	
	 
 });