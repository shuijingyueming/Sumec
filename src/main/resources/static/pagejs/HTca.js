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

    $("#submitForm").validate({
        errorPlacement: function(error, element) {
            //替换错误显示位置，error表示错误信息
            $(element).parent("div").append(error);
            $(element).parent("div").find("label").attr("style","margin-left:5px;");
        },
        rules : {
            t1: {
                required: true,
            },
        },
        messages: {
        },
        submitHandler: function(form) {
            if($("#sjid").val()==""&&$("#t3").val()==""&&!document.getElementById("t2").files[0]){
                $(".t2").append("<label id='t2-error' class='error' for='t2'>请选择图片</label>");
                return;
            }
            var index = window.parent.tis("保存中");
            form.submit();
        }
    });
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
                if(item.xtf004!=null){
                    $("#t3").val(item.xtf004);
                    $("#shtp").attr("src","upload/typeimg/"+item.xtf004);
                }
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改类别信息");
    }else{
        $("#mtitle").html("添加类别信息");
    }
    if(sjid==""){
        $("#tp").show();
    }else{
        $("#tp").hide();
    }
    $("#sjid").val(sjid);
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#tp").hide();
    $("#t3").val("");
    $("#shtp").attr("src","");
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

//判断图片
function showpdtpgs(){
    var filePath = ['.jpg','.png'];
    var file = document.getElementById("t2").files[0];
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