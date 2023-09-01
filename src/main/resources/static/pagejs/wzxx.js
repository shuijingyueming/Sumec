$(function(){
    window.parent.layer.closeAll();

    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_a1");
    $("#menu_a1", parent.document).addClass("active");

    var msg = $("#msg").val();
    if(msg!=''){
        if(msg=='A'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("保存成功");
                });
            });
        }else if(msg=='B'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("保存失败");
                });
            });
        }
    }

    $("#submitForm").validate({
        errorPlacement: function(error, element) {
            //替换错误显示位置，error表示错误信息
            $(element).parent("div").append(error);
            $(element).parent("div").find("label").attr("style","margin-left:5px;");
        },
        rules : {
            t1: {
                required : true
            },
            t2: {
                required : true
            },
            t3: {
                required : true
            },
            t4: {
                required : true
            },
            t5: {
                required : true
            },
            t6: {
                required : true
            },
            t7: {
                required : true
            },
            t8: {
                required : true
            },

        },
        submitHandler: function(form) {
            var index = window.parent.tis("保存中");
            form.submit();
        }
    });

});
//判断图片
function pdtpgs(){
    var filePath = ['.png'];
    var file = document.getElementById("up").files[0];
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
            $("#input1").val("");
            layer.msg("只能上传以.png结尾的文件");
            return;
        }
    }
}

//判断图片
function pdtpgs1(){
    var filePath = ['.jpg'];
    var file = document.getElementById("up1").files[0];
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
                    $("#shtp1").attr("src",data);
                };
                pd =  true;
                return;
            }
        }
        if(!pd){
            file.value="";
            $("#input1").val("");
            layer.msg("只能上传以.jpg结尾的文件");
            return;
        }
    }
}


//判断图片
function pdtpgs2(){
    var filePath = ['.ico'];
    var file = document.getElementById("up2").files[0];
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
                    $("#shtp2").attr("src",data);
                };
                pd =  true;
                return;
            }
        }
        if(!pd){
            file.value="";
            $("#input2").val("");
            layer.msg("只能上传以.ico结尾的文件");
            return;
        }
    }
}