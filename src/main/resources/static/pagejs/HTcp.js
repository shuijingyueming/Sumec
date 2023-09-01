var checked_item="";
let listBz = [];
let listBzSet = new Set(listBz);
$(document).ready(function () {
    $('select[id=bq]').change(function() {
        const text = $("#bq").find("option:selected").text();
        const id =$(this).val();
        if(id!="")listBzSet=putIn(id,text,listBzSet,"#alllzbzlx",'bz',"#t8",listBz);
    });
    $('body').on('click','.bz',function(){
        const isVal = $(this).attr('id');
        const isText = $(this).parent().text();
        if(id!="")putOn(isVal,isText,listBzSet,"#alllzbzlx",'bz',"#t8",listBz);
    })
    window.parent.layer.closeAll();

    //菜单样式
    if($("#menuName", parent.document).val()!=""){
        $("#"+$("#menuName", parent.document).val(), parent.document).removeClass("active");
    }
    $("#menuName", parent.document).val("menu_b4");
    $("#menu_b4", parent.document).addClass("active");

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
                    url: "cpname", //后台处理程序
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
            t4: {
                required : true,
            },
            t5: {
                required : true,
            },
            t6: {
                required : true,
            },
            t7: {
                required : true,
            },
        },
        messages: {
            t1: {
                required: "必须填写",
                remote:"已有相同的产品名称"
            }
        },
        submitHandler: function(form) {
            if($("#tyj").val()==""&&$("#tej").val()==""&&$("#tsj").val()==""){
                $(".t3").append("<label id='t3-error' class='error' for='t3'>请选择类别</label>");
                return;
            }
            var index = window.parent.tis("保存中");
            form.submit();
        }
    });

    pdyes($("#pages").val(), $("#counts").val());

    $('select[name=tyj]').change(function() {
        tosjid($("#tyj").val(),"tej")
    })
    $('select[name=tej]').change(function() {
        tosjid($("#tej").val(),"tsj")
    })
});

function tosjid(sjid,name){
    $.ajax({
        url:'getallfl?sjid='+sjid,
        type:'post',
        async: false,
        cache: false,
        processData: false,
        contentType: false,
        dataType:'json',
        success:function(data) {
            var list = eval(data.list);
            $("select[id="+name+"]").empty();
            $("select[id="+name+"]").append("<option value=''>请选择类别</option>");
            for(var i=0;i<list.length;i++){
                $("select[id="+name+"]").append("<option value='"+list[i].xtf001+"'>"+list[i].xtf002+"</option>");
            }
        },
        error:function(){}
    });
}

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
    form_submit("toPr/tocp","post",params,"_self");
}

//添加编辑
function edit(id){
    if(id!=null&&id!=''){
        $.ajax({
            url:'toPr/serachcp?id='+id,
            type:'post',
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            dataType:'json',
            success:function(data) {
                var item = eval(data.item);
                console.log(item);
                $("#t1").val(item.jsb002);
                KE.html(item.jsb003);
                $("#t3").val(item.jsb004);
                if(item.xtf.xtf!=null){
                    tosjid(item.xtf.xtf.xtf003,"tej")
                    tosjid(item.xtf.xtf003,"tsj")
                    $("#tyj").val(item.xtf.xtf.xtf003);
                    $("#tej").val(item.xtf.xtf003);
                    $("#tsj").val(item.jsb004);
                }else if(item.xtf.xtf003!=null){
                    tosjid(item.xtf.xtf003,"tej")
                    $("#tyj").val(item.xtf.xtf003);
                    $("#tej").val(item.jsb004);
                }else{
                    $("#tyj").val(item.jsb004);
                    $("#tej").val();
                    $("#tsj").val();
                }
                $("#t4").val(getTime(item.jsb005,'YY-MM-DD'));
                $("#t5").val(item.jsb006);
                $("#t6").val(item.jsb007);
                $("#t7").val(item.jsb008);

                var list =item.wzalist;
                $("#alllzbzlx").empty();
                var html=``;
                if(list!=null&&list.length>0){
                    for(var i=0;i<list.length;i++){
                        html +=  "<div class=dpcs><image src='./static/images/delicon.png' class='bz' name='bz' id='"+list[i].wzb.wzb001+"' value='"+list[i].wzb.wzb002+"'></image>"+list[i].wzb.wzb002+"</div>";
                    }
                }
                $("#alllzbzlx").append(html);
                $("img[class='bz']").each(function(){
                    listBz.push($(this).attr('id')+"#"+$(this).parent().text());
                    listBzSet.add($(this).attr('id')+"#"+$(this).parent().text());
                });
                //
                list =item.jbblist;
                let o=$(".timemode").eq(0);
                var size=list.length;
                if(size>=1){
                    for(let i=0;i<size;i++){
                        var t1=list[i].jbb002;
                        var t2=list[i].jbb004;
                        if(i==0){
                            let ca=o.find("[name='ca']");
                            let t9=o.find("[name='t9']");
                            ca.val(t1);
                            t9.val(t2);
                        }else{
                            let c=o.clone();
                            let ca=c.find("[name='ca']");
                            let t9=c.find("[name='t9']");
                            ca.val(t1);
                            t9.val(t2);
                            if(i==(size-1)){
                                c.append(" <button type='button' class='effect-btn btn btn-light mt-2 mr-2 sm-btn' style='margin-top:25px;' onclick='deltime(this)'>删除</button>")
                            }
                            $("#time").append(c);
                        }
                    }
                }
                //图片
                list =item.jsclist;
                if(list!=null&&list.length>0){
                    for(var i=0;i<list.length;i++){
                        $("#p11").append("<img alt='...' src='upload/pimg/"+list[i].jsc003+"' style='width:180px;height: 180px;border:1px solid rgb(229, 229, 229);' />");
                    }
                }
            },
            error:function(){}
        });
        $("#id").val(id);
        $("#mtitle").html("修改产品信息");
    }else{
        $("#mtitle").html("添加产品信息");
    }
    $("#active").show();
    $("#adiv").addClass("an");
    //$('#active').css("height",$('#bash', parent.document).css("height"));
}

function clean(){
    $("#t1").val("");
    $("#t2").val("");
    $("#t3").val("");
    $("#t4").val("");
    $("#t5").val("");
    $("#t6").val("");
    $("#t7").val("");
    $("#shtp").attr("src","");
    $("#adiv").removeClass("an");
    $("#active").hide();
    $(".form-control").removeClass("error");
    $(".error").remove();
}

function xxcx(){
    var params = [["pages", $("#pages").val()],["name", $("#name").val()]];
    form_submit("toPr/tocp","post",params,"_self");
}

function del(id){
    var r = confirm("确定删除此产品吗？");
    if (r == true) {
        var params = [ ["id",id], ["zt","D"],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())]];
        form_submit("toPr/tocp","get",params,"_self");
    } else {
    }
}

//批量删除
function delete_item(){
    checked_item ="#";
    $("[name='cbox']").each(function(){
        if(this.checked) checked_item+=$(this).attr("date-id")+"#";
    });
    var r = confirm("确定删除这些产品吗？");
    if (r == true) {
        var params = [ ["id",checked_item], ["zt","AD"],
            ["pages",$("#pages").val()],
            ["name",$.trim($("#name").val())]];
        form_submit("toPr/tocp","get",params,"_self");
    } else {
    }
}

//判断图片
function showpdtpgs(id){
    var filePath = ['.jpg','.png'];
    var file = document.getElementById("t"+id).files;
    $("#p"+id).empty();
    if(file){
        for(var i=0;i<file.length;i++){
            console.log(i)
            var filename = file[i].name;
            var filejw = filename.substring(filename.lastIndexOf("."));
            if(filePath.indexOf(filejw)>=0){
                var reader = new FileReader();
                reader.readAsDataURL(file[i]);
                reader.onload = function(e) {
                    var data = e.target.result;
                    $("#p"+id).append("<img alt='...' src='"+data+"' style='width:180px;height: 180px;border:1px solid rgb(229, 229, 229);' />");
                };
            }
        }
    }
}

function addtime(){
    let len =$("#time").find('.timemode').length;
    let o=$(".timemode").eq(len-1);
    let c=o.clone();
    let time2=o.find("[name='ca']");
    o.find('button').remove();
    c.find("[name='ca']").val("");
    c.find("[name='t9']").val("");
    console.log(c.find("[name='ca']").val())
    if(len==1) c.append("<button type='button' class='effect-btn btn btn-light mt-2 mr-2 sm-btn' style='margin-top:25px;' onclick='deltime(this)'>删除</button>")
    $("#time").append(c);
    $("#time").find('.error').remove();
}

function deltime(o){
    o.parentNode.parentNode.removeChild(o.parentNode);
    let len =$("#time").find('.timemode').length;
    if(len>1){
        let lo=$(".timemode").eq(len-1);
        lo.append(" <button type='button' class='effect-btn btn btn-light mt-2 mr-2 sm-btn' style='margin-top:25px;' onclick='deltime(this)'>删除</button>")
    }
}