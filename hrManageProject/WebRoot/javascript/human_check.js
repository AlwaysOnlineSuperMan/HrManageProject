$(function() {
	getTime("#create_time");
	$("#create_time").mouseover(function() {
		getTime("#create_time");
		$("#lastly_change_time").val($(this).val());
	});
	$("#birthday").click(function() {
		displayDatePicker('humanFile.humanBirthday', false, 'ymd', '')
	});
	$("form:first")[0].onreset = function() {
		if (confirm("是否全部清除？")) {
			return true;
		}
		return false;
	};
	
	
	
	
	
	
	//***********************************************************
	$("#firstKind").change(function() {
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "xml",
			url : "humanFile!doChangeFirstKind.action",
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
					$("#firstKind + input").val("");
				} else {
					$("#firstKind + input").val($("#firstKind")[0].options[$("#firstKind")[0].selectedIndex].innerHTML);
				}
				if ($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#secondKind + input").val("");
				}else {
					$("#secondKind + input").val($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML);	
				}
				if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#thirdKind + input").val("");
				}else {
					$("#thirdKind + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
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
			url : "humanFile!doChangeSecondKind.action",
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
					$("#secondKind + input").val("");
				} else {
					$("#secondKind + input").val($("#secondKind")[0].options[$("#secondKind")[0].selectedIndex].innerHTML);
				}
				if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
					$("#thirdKind + input").val("");
				}else {
					$("#thirdKind + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
				}
				
			}
		});
	});
	$("#thirdKind").change(function() {
		if ($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML == "请选择") {
			$("#thirdKind + input").val("");
		}else {
			$("#thirdKind + input").val($("#thirdKind")[0].options[$("#thirdKind")[0].selectedIndex].innerHTML);
		}
	});
	$("#majorKind").change(function() {
		$.ajax({
			cache : false,
			type : "POST",
			dataType : "xml",
			url : "humanFile!doChangeMajorKind",
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
				$("#majorName + input").val($("#majorName")[0].options[$("#majorName")[0].selectedIndex].innerHTML);
				$("#majorKind + input").val($("#majorKind")[0].options[$("#majorKind")[0].selectedIndex].innerHTML);
			}
		});
	});
	$("#majorName").change(function() {
		$("#majorName + input").val($("#majorName")[0].options[$("#majorName")[0].selectedIndex].innerHTML);
	});
	$("form:first")[0].onreset = function() {
		if (confirm("是否全部清除？")) {
			return true;
		}
		return false;
	};
	
	
	//**********************************************************
	
	
	
	
	
	
	
});