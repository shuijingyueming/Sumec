$(function(){
    var msg = $("#msg").val();
    if(msg!=''){
        if(msg=='C'){
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.ready(function(){
                    layer.msg("操作成功");
                });
            });
        }
    }

    $('#mode').hide(); //打开页面隐藏下拉列表
    $('#it').hover( //鼠标滑过导航栏目时
        function(){
            $('#mode').show(); //显示下拉列表
        },
        function(){
            $('#mode').hide(); //鼠标移开后隐藏下拉列表
        }
    );
    $('#mode').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#mode').show();
        },
        function(){
            $('#mode').hide();
        }
    );
});
function toproducts(yjid,ejid,sjid,bqid){
    var params = [["yjid",yjid],["ejid",ejid],["sjid",sjid],["bqid",bqid]];
    form_submit("toWeb/toproducts","get",params,"_self");
}

function toproduct(){
    var params = [["name",$("#name").val()]];
    form_submit("toWeb/toproducts","get",params,"_self");
}

function todetail(id){
	console.log(id)
    var params = [["id",id]];
    form_submit("toWeb/todetail","get",params,"_self");
}

function toorder(id){
    var params = [["id",id]];
    form_submit("toWeb/toorder","get",params,"_self");
}
