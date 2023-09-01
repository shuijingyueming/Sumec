var checked_item="";

$(document).ready(function () {

    window.parent.layer.closeAll();

    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_b5");
    $("#menu_b5", parent.document).addClass("active");

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
    var params = [["pages",pageindex], ["name",$.trim($("#name").val())]];
    form_submit("toPr/todd","post",params,"_self");
}

//详情
function toxq(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toPr/serachdd?id='+id,
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
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">订单编号：</label>';
                html+= '<span class="jspan">'+item.uta002+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">产品名称：</label>';
                html+= '<span class="jspan">'+(item.uta017!=null?item.uta017:'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">名称：</label>';
                html+= '<span class="jspan">'+(item.uta005!=null?item.uta005:'')+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">电话：</label>';
                html+= '<span class="jspan">'+(item.uta007!=null?item.uta007:'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">电子邮件：</label>';
                html+= '<span class="jspan">'+(item.uta008!=null?item.uta008:'')+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">公司名称：</label>';
                html+= '<span class="jspan">'+(item.uta009!=null?item.uta009:'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">城市：</label>';
                html+= '<span class="jspan">'+(item.uta010!=null?item.uta010:'')+'</span></div></div>';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">详细地址：</label>';
                html+= '<span class="jspan">'+(item.uta011!=null?item.uta011:'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">下单日期：</label>';
                html+= '<span class="jspan">'+(item.uta006!=null?getTime(item.uta006):'')+'</span></div></div>';
                html+= '</div>';
                html+= '<div class="row">';
                html+= '<div class="col-md-10"><div class="form-group"><label class="layui-form-label">信息内容：</label>';
                html+= '<span class="jspan">'+(item.uta012!=null?item.uta012:'')+'</span></div></div>';
                html+= '</div>';
                if(item.use!=null){
                    html+= '<div class="row">';
                    html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">处理日期：</label>';
                    html+= '<span class="jspan">'+getTime(item.uta013)+'</span></div></div>';
                    html+= '<div class="col-md-5"><div class="form-group"><label class="layui-form-label">处理人：</label>';
                    html+= '<span class="jspan">'+item.use.use002+'</span></div></div>';
                    html+= '</div>';
                }
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
function xgzt(id,type){
    var r = confirm("确定修改此订单的状态吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","U"],["type",type],
            ["pages",$("#pages").val()], ["name",$.trim($("#name").val())]];
        form_submit("toPr/todd","get",params,"_self");
    }
}
function xxcx(){
    var params = [["pages", $("#pages").val()],["name", $("#name").val()]];
    form_submit("toPr/todd","post",params,"_self");
}