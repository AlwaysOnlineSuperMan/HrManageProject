$(function(){
	/*/$("#firstKind").change(function(){
			alert("sdsdsdsd");
		$.ajax({
			
			cache :false,
			type :"POST",
			datatype :"xml",
			url : "myNingsi!selectAjax.action",
			data : "configFileSecondKind.firstKindId = " + $(this).val(),
			success : function (response,status,xhr){
				alert(xhr.responseText);
				var secondKinds = $(data).find("secondKind");
				var thirdKinds = $(data).find("thirdKind");
				var oSecondKind = $("#secondKind");
				var oThirdKind = $("#thirdKind");
					
				var allOption = $("<option></option>");
				allOption.val("").attr("selected", "selected").html("请你选择");
				var allOption2 = $("<option></option>");
				allOption2.val("").attr("selected", "selected").html("请你选择");
				
				oSecondKind.html("");
				oThirdKind.html("");
				oSecondKind.append(allOption);
				oThirdKind.append(allOption2);
					
				secondKinds.each(function(i) {
					var option = $("<option></option");
					option.attr("value", $(secondKinds[i]).attr("id")).html($(secondKinds[i]).attr("name"));
					oSecondKind.append(option);
				});
					
				thirdKinds.each(function(i) {
					var option = $("<option></option");
					option.attr("value", $(thirdKinds[i]).attr("id")).html($(thirdKinds[i]).attr("name"));
					oThirdKind.append(option);
				});
					
				oSecondKind[0].selectedIndex = 0;
				oThirdKind[0].selectedIndex = 0;
					
					
				
			},
			error : function (arg){
				alert(arg.responseText);
				alert("1");
				alert(arg);
			}
			
		})
		
	})
		*/
		$("#firstKind").change(function() {
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "xml",
			url : "myNingsi!doChangeFirstKind.action",
			data : "configFileSecondKind.firstKindId=" + $(this).val(),
			success : function(data,sts,res) {
				var secondKinds = $(data).find("secondKind");
				var oSecondKind = $("#secondKind");
				var sOption = $("<option></option>").val("0").html("请选择");
				oSecondKind.html("").append(sOption);
				secondKinds.each(function(i) {
					var option = $("<option></option");
					option.attr("value", $(secondKinds[i]).attr("id")).html($(secondKinds[i]).attr("name"));
					oSecondKind.append(option);
				});
				if ($("#firstKind")[0].options[$("#firstKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#newFirstKindName + input").val("");
				} else {
					$("#newFirstKindName + input").val($("#firstKind")[0].options[$("#firstKind")[0].selectedIndex].innerHTML);
				}
				if ($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#newSecondKindName + input").val("");
				}else {
					$("#newSecondKindName + input").val($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML);	
				}
				if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#newThirdKindName + input").val("");
				}else {
					$("#newThirdKindName + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
				}
			},
			error:function(){
				alert("error firstKind-->");
			}
		});
	});
	$("#secondKind").change(function() {
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "xml",
			url : "myNingsi!doChangeSecondKind.action",
			data : "configFileThirdKind.firstKindId=" + $("#firstKind").val() + "&configFileThirdKind.secondKindId=" + $(this).val(),
			success : function(data) {
				var thirdKinds = $(data).find("thirdKind");
				var oThirdKind = $("#thirdKind");
				var sOption = $("<option></option>").val("0").html("请选择");
				oThirdKind.html("").append(sOption);
				thirdKinds.each(function(i) {
					var option = $("<option></option");
					option.attr("value", $(thirdKinds[i]).attr("id")).html($(thirdKinds[i]).attr("name"));
					oThirdKind.append(option);
				});
				if ($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#newSecondKindName + input").val("");
				} else {
					$("#newSecondKindName + input").val($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML);
				}
				if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#newThirdKindName + input").val("");
				}else {
					$("#newThirdKindName + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
				}
				
			}
		});
	});
	$("#thirdKind").change(function() {
		if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
			$("#newThirdKindName + input").val("");
		}else {
			$("#newThirdKindName + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
		}
	});
	$("#majorKind").change(function() {
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "xml",
			url : "myNingsi!doChangeMajorKind",
			data : "configMajor.majorKindId=" + $(this).val(),
			success : function(data) {
				var configMajors = $(data).find("configMajor");
				var oMajorName = $("#majorName");
				var sOption = $("<option></option>").val("0").html("请选择");
				oMajorName.html("").append(sOption);
				configMajors.each(function(i) {
					var option = $("<option></option");
					option.attr("value", $(configMajors[i]).attr("id")).html($(configMajors[i]).attr("name"));
					oMajorName.append(option);
				});
				$("#newmajorName + input").val($("#majorName")[0].options[$("#majorName")[0].selectedIndex].innerHTML);
				$("#majorKind + input").val($("#majorKind")[0].options[$("#majorKind")[0].selectedIndex].innerHTML);
			}
		});
	});
	$("#majorName").change(function() {
		$("#newmajorNames + input").val($("#majorName")[0].options[$("#majorName")[0].selectedIndex].innerHTML);
	});
	$("form:first")[0].onreset = function() {
		if (confirm("是否全部清除？")) {
			return true;
		}
		return false;
	};
		
		
	
	$("#standardId").change(function() {
		//alert("qqqqqqqqqqqqqqqqqq");
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "text",
			url : "myNingsi!doChangMonery",
			data : "salaryStandardDetails.standardId=" + $(this).val(),
			success : function(data,sts,res) {
					//alert(data);
					//alert(sts);
					//alert(res);
				//*var configMajors = $(data).find("configMajor");
				////var oMajorName = $("#standardName");
				///var inputs = $("<input ></input>");
				//oMajorName.html("").append(inputs);
					//inputs.attr("value", $(configMajors[i]).attr("monery"));*/
				$("#newSalarySum").val(data);
			}
		});
	});
		
	
});