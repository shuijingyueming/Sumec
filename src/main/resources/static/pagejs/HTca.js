let listBz = [];
let listBzSet = new Set(listBz);
$(document).ready(function () {
    window.parent.layer.closeAll();
    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_b3");
    $("#menu_b3", parent.document).addClass("active");
});

//添加编辑
function edit(id,sjid){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toPr/serachca?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                // console.log(item);
                $("#t1").val(item.xtf002);
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改类别信息");
    }else{
        $("#mtitle").html("添加类别信息");
    }
    $("#sjid").val(sjid);
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#t1").val("");
    $("#sjid").val("");
    $("#type").val("");
    $("#id").val("");
    $("#adiv").removeClass("an");
    $("#active").hide();
    $(".form-control").removeClass("error");
    $(".error").remove();
}

function del(id){
    var r = confirm("确定删除此类别吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","D"]];
        form_submit("toPr/toca","get",params,"_self");
    } else {
    }
}