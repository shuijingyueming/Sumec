$(document).ready(function () {
    var msg = $("#msg").val();
    if(msg!=''){
        if(msg=='D'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("删除成功");
                });
            });
        }else if(msg=='U'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("修改成功");
                });
            });
        }else if(msg=='I'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("添加成功");
                });
            });
        }else if(msg=='H'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("操作失败");
                });
            });
        }else if(msg=='C'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("操作成功");
                });
            });
        }else if(msg=='M'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("重置密码成功,重置密码为123456");
                });
            });
        }else if(msg=='DR'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("导入成功");
                });
            });
        }
    }

    //表格全选/反选
    $("#chkbox").change(function(){
        if($("#chkbox").is(":checked")){
            $("[name='cbox']").prop("checked",'checked');//全选
        }else{
            $("[name='cbox']").each(function(){
                this.checked=!this.checked;
            });
        }
        checked_item ="#";
        $("[name='cbox']").each(function(){
            if(this.checked) checked_item+=$(this).attr("date-id")+"#";
        });
        console.log(checked_item)
    });
});