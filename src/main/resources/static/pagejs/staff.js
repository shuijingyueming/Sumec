var checked_item="";

$(document).ready(function () {
    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
        $("#menuName", parent.document).val("menu_a3");
        $("#menu_a3", parent.document).addClass("active");

    pdyes($("#pages").val(), $("#counts").val());

    $("#submitForm").validate({
        errorPlacement: function(error, element) {
            //替换错误显示位置，error表示错误信息
            $(element).parent("div").append(error);
            $(element).parent("div").find("label").attr("style","margin-left:5px;");
        },
        rules : {
            t1: {
                required : true,
                remote:{
                    url: "zhname", //后台处理程序
                    type: "post",  //数据发送方式
                    async : false,
                    dataType: "json",       //接受数据格式
                    data:{
                        "name":function(){
                            return $("#t1").val().trim();
                        },
                        "id":function(){
                            return $("#id").val().trim();
                        }//要传递的数据
                    }
                }
            },
            t2 :{
                required : true,
            },
            t3 :{
                required : true,
            },
        },
        messages: {
            t1: {
                required: "必须填写",
                remote:"已有相同的账号名称"
            }
        },
        submitHandler: function(form) {
            var index = window.parent.tis("保存中");
            form.submit();
        }
    });
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
        ["name",$.trim($("#name").val())],
        ["phone",$.trim($("#phone").val())]];
    form_submit("toHt/staff","post",params,"_self");
}

function xxcx(){
    var params = [ ["pages",$("#pages").val()],
        ["name",$.trim($("#name").val())],
        ["phone",$.trim($("#phone").val())]];
    form_submit("toHt/staff","post",params,"_self");
}

function xgzt(id,name,type){
    var r = confirm("确定修改此账户的状态吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","U"],["type",type],["uname",name],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())],
            ["phone",$.trim($("#phone").val())]];
        form_submit("toHt/staff","get",params,"_self");
    }
}

function czmm(id){
    var r = confirm("确定重置此账户的密码吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","R"],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())],
            ["phone",$.trim($("#phone").val())]];
        form_submit("toHt/staff","get",params,"_self");
    }
}


//详情
function toxq(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toHt/serachyh?id='+id,
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
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">账户名称：</label>';
                html+= '<span class="jspan">'+item.use002+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">真实姓名：</label>';
                html+= '<span class="jspan">'+(item.use005!=null?item.use005:'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">联系手机：</label>';
                html+= '<span class="jspan">'+(item.use006!=null?item.use006:'')+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">状态：</label>';
                html+= '<span class="jspan">'+(item.use008=='A'?'正常':(item.use008=='B'?'封号':''))+'</span></div></div>';
                html+= '</div>';
                $("#xq").append(html);
            },
            error:function(){}
        });
        $("#dtitle").html("账户信息详情");
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
            url:'toHt/serachyh?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                $("#t1").val(item.use002);
                $("#t2").val(item.use004);
                $("#t3").val(item.use005);
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改账户信息");
    }else{
        $("#mtitle").html("添加账户信息");
    }
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#t1").val("");
    $("#t2").val("");
    $("#t3").val("");
    $("#id").val("");
    $("#adiv").removeClass("an");
    $("#active").hide();
    $(".form-control").removeClass("error");
    $(".error").remove();
}

