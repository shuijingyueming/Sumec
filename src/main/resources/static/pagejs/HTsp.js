var checked_item="";

$(document).ready(function () {

    window.parent.layer.closeAll();

    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_b2");
    $("#menu_b2", parent.document).addClass("active");

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
                    url: "spname", //后台处理程序
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
        },
        messages: {
            t1: {
                required: "必须填写",
                remote:"已有相同的规格名称"
            }
        },
        submitHandler: function(form) {
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
    form_submit("toPr/tosp","post",params,"_self");
}

//添加编辑
function edit(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toPr/serachsp?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                // console.log(item);
                $("#t1").val(item.usf002);
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改规格信息");
    }else{
        $("#mtitle").html("添加规格信息");
    }
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#id").val("");
    $("#t1").val("");
    $("#shtp").attr("src","");
    $("#adiv").removeClass("an");
    $("#active").hide();
    $(".form-control").removeClass("error");
    $(".error").remove();
}

function xxcx(){
    var params = [["pages", $("#pages").val()],["name", $("#name").val()]];
    form_submit("toPr/tosp","post",params,"_self");
}

function del(id){
    var r = confirm("确定删除此规格吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","D"],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())]];
        form_submit("toPr/tosp","get",params,"_self");
    } else {
    }
}

//批量删除
function delete_item(){
    checked_item ="#";
    $("[name='cbox']").each(function(){
        if(this.checked) checked_item+=$(this).attr("date-id")+"#";
    });
    var r = confirm("确定删除这些规格吗？");
    if (r == true) {
        var params = [ ["id",checked_item], ["zt","AD"],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())]];
        form_submit("toPr/tosp","get",params,"_self");
    } else {
    }
}