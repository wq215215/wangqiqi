 $(function(){
	 //修改
	 $("input[value='修改']").click(function(){
		 var eno = $(this).prev().prev().val();
		 location.href="page/update.jsp?eno="+eno;
	 });
	//全选
		$("input[value='全选']").click(function(){
			$("input[name='eid']").each(function(){
				this.checked=true;
			});
		});
	 //添加
	 $("input[value='添加']").click(function(){
		 location.href="page/add.jsp";
	 });
	 //单删
	 $("input[value='删除']").click(function(){
		var eno = $(this).prev().val();
		 if(confirm("确定删除"+eno+"的信息吗？")){
			 $.ajax({
					type:"post", 
					url:"/exam_06/pldelete.do",
					dataType:"json",
					data:{
						ids:eno
						},
					success:function(obj){
						alert(obj);
						 if(obj){
							 alert("删除成功！")
							 location.href="/exam_06/list.do";
						 }else{
							 alert("删除失败！")
							 location.href="/exam_06/list.do";
						 }
					}
				 });
	 
	 }else{
		 alert("至少删一条");
	 }
		 
	 });
	 //批量删除
	 $("input[value='批量删除']").click(function(){
		 //获取复选框
		 var x = $("input[name='eno']:checked");
		 alert(x.val())
		 if(x.length>0){
			 //写一个变量
			 var ids = "";
			 for (var i = 0; i < x.length; i++) {
				 ids+=x[i].value+",";
			}
			 alert(ids)
			 //去掉一个逗号
			 var eno = ids.substring(0,ids.length-1);
			 if(confirm("确定删除"+eno+"的信息吗？")){
					 $.ajax({
							type:"post", 
							url:"/exam_06/pldelete.do",
							dataType:"json",
							data:{
								ids:eno
								},
							success:function(obj){
								alert(obj);
								 if(obj){
									 alert("删除成功！")
									 location.href="/exam_06/list.do";
								 }else{
									 alert("删除失败！")
									 location.href="/exam_06/list.do";
								 }
							}
						 });
			 
			 }else{
				 alert("至少删一条");
			 }
		 }
		 
	 });
	 
	 //h1添加样式
	$("h1").css({"text-align":"center","font-size":"30px"})
	
	
	 
 });