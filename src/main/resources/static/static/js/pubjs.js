document.addEventListener("error", function(e) {
	var elem = e.target;
	console.log(elem.tagName.toLowerCase());
	if (elem.tagName.toLowerCase() === 'img') {
		elem.src = "upload/wzimg/nopic.png";
	}
}, true /* 指定事件处理函数在捕获阶段执行 */);


//提交表单
function form_submit(url, method, params, target) {
	var form = document.createElement("form");//创建一个表单
	form.setAttribute("method", method);//设置form表单的method属性
	form.setAttribute("action", url);
	form.setAttribute("target", target); 
	for (var i = 0; i < params.length; i++) {
		var hiddenField = document.createElement("input");
		hiddenField.setAttribute("type", "hidden");
		hiddenField.setAttribute("name", params[i][0]);
		hiddenField.setAttribute("value", params[i][1]);
		form.appendChild(hiddenField);
	}
	document.body.appendChild(form);
	form.submit();
}

window.onload=function(){
	var params = window.location.search;
	if(params.indexOf("msg")>=0){
		window.history.pushState({},0,window.location.pathname+params.replace("msg=","wang="));
	}
};

/*$(function(){
	$("textarea").each(function(){
		var len = $(this).val().length;
		$(this).next().find(".dqzs").html(len);
		$(this).next().find(".zzs").html($(this).attr("maxlength"));
	});
	
	$("textarea").bind('input propertychange',function(){
		textareasr(this);
	});
});*/

function textareasr(obj){
	var len = $(obj).val().length;
	var maxlen = $(obj).attr("maxlength");
	if(parseInt(len)>parseInt(maxlen)){
		len = maxlen;
	}
	$(obj).next().find(".dqzs").html(len);
}

function putIn(id,text,listSetName,divclassName,spanid,className,listName) {
	if(id!="")listName.push(id+"#"+text);
	//去重
	listSetName = new Set(listName);
	str = '#';
	listSetName.forEach((val) => {
		str += val.split('#')[0]+'#';
	})
	$(className).val(str);
	let html = ``;
	listSetName.forEach(val => {
		html +=  `<div class=dpcs xs='${val.split('#')[1]}'><image src=./static/images/delicon.png class=`;
		html +=spanid;
		html +=  ` name=`;
		html +=spanid;
		html +=` id=${val.split('#')[0]} value=${val.split('#')[0]} ></image>${val.split('#')[1]}</div>`
	})
	$(divclassName).empty();
	$(divclassName).append(html);
	return listSetName;
}
function putOn(isVal,isText,listSetName,divclassName,spanid,className,listName) {
	listSetName.forEach(val => {
		if(val==isVal+"#"+isText){
			listSetName.delete(val);
		}
	})
	$(className).val("");
	str="#";
	listName.splice(0,listName.length);
	listSetName.forEach((val) => {
		str += val.split('#')[0]+'#';
		listName.push(val);
	})
	$(className).val(str);
	let html = ``;
	listSetName.forEach(val => {
		html +=  `<div class=dpcs xs='${val.split('#')[1]}'><image src=./static/images/delicon.png class=`;
		html +=spanid;
		html +=  ` name=`;
		html +=spanid;
		html +=` id=${val.split('#')[0]} value=${val.split('#')[0]} ></image>${val.split('#')[1]}</div>`
	})
	$(divclassName).empty();
	$(divclassName).append(html);
}