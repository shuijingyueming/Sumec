var checked_item="";

$(document).ready(function () {

    window.parent.layer.closeAll();

    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_a5");
    $("#menu_a5", parent.document).addClass("active");

    $("#submitForm").validate({
        errorPlacement: function(error, element) {
            //替换错误显示位置，error表示错误信息
            $(element).parent("div").append(error);
            $(element).parent("div").find("label").attr("style","margin-left:5px;");
        },
        rules : {
        },
        messages: {
        },
        submitHandler: function(form) {
            if($("#t2").val()==""&&!document.getElementById("t1").files[0]){
                $(".t2").append("<label id='t2-error' class='error' for='t2'>请选择图片</label>");
                return;
            }
            var index = window.parent.tis("保存中");
            form.submit();
        }
    });

    pdyes($("#pages").val(), $("#counts").val());
});

//翻页
function fanye(pageindex) {
    var isnum=/^\d+$/.test(pageindex);
    if(isnum)
        usefanye(pageindex);
    else{
        alert("格式错误");
    }
}

//翻页
function usefanye(pageindex){
    var params = [["pages",pageindex],
        ["name",$.trim($("#name").val())]];
    form_submit("toHt/togg","post",params,"_self");
}

//批量删除
function delete_item(){
    checked_item ="#";
    $("[name='cbox']").each(function(){
        if(this.checked) checked_item+=$(this).attr("date-id")+"#";
    });
    var r = confirm("确定删除这些广告吗？");
    if (r == true) {
        var params = [ ["id",checked_item], ["zt","AD"],
            ["pages",$("#pages").val()]/*,
            ["name",$.trim($("#name").val())]*/];
        form_submit("toHt/togg","get",params,"_self");
    } else {
    }
}



//详情
function toxq(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toQt/serachgg?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                $("#xq").empty(item);
                let html="";
                html+= "<div class='row'><div class='col-md-6'>";
                html+= "<div class='form-group'><label class='layui-form-label'>图片：</label>";
                html+= "<img class='form-control' src='upload/ggimg/"+item.jsd002+"' style='width:100px;height:auto;object-fit:cover;border:1px solid rgb(229, 229, 229);' /></div></div></div>";
                html+= "</div></div></div>";
                $("#xq").append(html);
            },
            error:function(){}
        });
        $("#dtitle").html("广告信息详情");
    }
    $("#detail").show();
    $("#ddiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function gb(){
    $("#ddiv").removeClass("an");
    $("#detail").hide();
}

//添加编辑
function edit(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toHt/serachgg?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                // console.log(item);
                $("#t2").val(item.jsd002);
                $("#shtp").attr("src","upload/ggimg/"+item.jsd002);
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改广告信息");
    }else{
        $("#mtitle").html("添加广告信息");
    }
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#id").val("");
    $("#t1").val("");
    $("#t2").val("");
    $("#shtp").attr("src","");
    $("#adiv").removeClass("an");
    $("#active").hide();
    $(".form-control").removeClass("error");
    $(".error").remove();
}

function xxcx(){
    var params = [["pages", $("#pages").val()]/*,["name", $("#name").val()]*/];
    form_submit("toHt/togg","post",params,"_self");
}

function del(id){
    var r = confirm("确定删除此广告吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","D"],
            ["pages",$("#pages").val()]/*,
            ["name",$.trim($("#name").val())]*/];
        form_submit("toHt/togg","get",params,"_self");
    } else {
    }
}

//判断图片
function showpdtpgs(){
    var filePath = ['.jpg','.png'];
    var file = document.getElementById("t1").files[0];
    if(file){
        var filename = file.name;
        var filejw = filename.substring(filename.lastIndexOf("."));
        var pd = false;
        for(var i=0;i<filePath.length;i++){
            if(filejw==filePath[i]){
                var reader = new FileReader();
                reader.readAsDataURL(file);
                reader.onload = function(e) {
                    var data = e.target.result;
                    $("#shtp").attr("src",data);
                };
                pd =  true;
                return;
            }
        }
        if(!pd){
            file.value="";
            $("#file").val("");
            layer.msg("只能上传以.jpg、.png结尾的图片");
            return;
        }
    }
}