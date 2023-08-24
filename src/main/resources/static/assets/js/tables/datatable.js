$(document).ready(function () {
    $('#example').DataTable();
    //账户管理
   $('#staffexm').DataTable({
       // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A2#")>=0||$("#jsqx").val().indexOf("A4#")>=0?[/*'excel','print',*/
            $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
            $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A4#")>=0?{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}:undefined
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,7]
        }]
    });

   $('#roleexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A4#")>=0||$("#jsqx").val().indexOf("A4#")>=0?[/*'excel','print',*/
           $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
           $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("A4#")>=0?{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}:undefined
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3]
        }]
    });

   $('#logexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val().indexOf("B4#")>=0?[/*'excel','print',*/
            {text: '全部删除',action: function ( e, dt, node, config ) {delete_item();}}
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#jdexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("E2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [7]
        }]
    });

    $('#jgexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("F2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}}/*,
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [7]
        }]
    });

    $('#xnexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("G2#")>=0?[
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}}/*,
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],

    });

    $('#njexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("H2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [($("#jstype").val()=="B"?4:3)]
        }]
    });

    $('#bjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="school"||$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I2#")>=0||$("#jsqx").val().indexOf("I5#")>=0||$("#jsqx").val().indexOf("I6#")>=0?[
            $("#jsqx").val()=="school"||$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I5#")>=0?{text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}} :undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I6#")>=0?{text: '升班',action: function ( e, dt, node, config ) {sjbj();}} :undefined
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jstype").val()=="A"?7:($("#jtype").val()=='A'||$("#jtype").val()=='B'?7:5)]
        }]
    });


    $('#lsexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("J2#")>=0||$("#jsqx").val().indexOf("J5#")>=0?[/*'excel','print',*/
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("J2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("J5#")>=0?{text: '导入',action: function ( e, dt, node, config ) {$('#file2').click();}}:undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("J5#")>=0?{text: '下载模板',action: function ( e, dt, node, config ) {xzmb()}}:undefined,
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jstype").val()=="A"?5:4]
        }]
    });

    $('#dyexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:($("#jsqx").val()=="school"||$("#jsqx").val().indexOf("K2#")>=0)&&$("#xslx").val()=="K"?[/*'excel','print',*/
                $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("K2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
                /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/]:
            [/*'excel','print',*/],
        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jstype").val()=="A"?($("#xslx").val()=="K"?10:8):($("#jstype").val()=="B"?7:9)]
        }]
    });

    $('#jysdexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("L2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [3]
        }]
    });

    $('#jyflexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("L2#")>=0? [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {editsd();}}
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [4]
        }]
    });

    $('#pjseexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            // {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ],
/*        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jtype").val()=="A"?11:9]
        }]*/
    });

    $('#dhwpexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("O2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jtype").val()=="A"?7:9]
        }]
    });

    $('#pjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("M2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/
        ]:[],
    });

    $('#xhhexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:/* $("#jsqx").val()=="admin"||$("#jsqx").val()=="street"||$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("S6#")>=0?[/!*'excel','print',*!/
            {text: '导出',action: function ( e, dt, node, config ) {toxhhdc('','');}},
            /!*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*!/
        ]:*/[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [7]
        }]
    });

    $('#xzexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="admin"||$("#jsqx").val().indexOf("U2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,5]
        }]
    });

    $('#yhhdexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("T2#")>=0?[/*'excel','print',*/
            /*{text: '新添加',action: function ( e, dt, node, config ) {edit();}}*/
        ]:[],
    });

    $('#example2').DataTable({
        "scrollY": "500px",
        "scrollCollapse": true,
        "paging": false,
        "bFilter": false
    });

    $('#jzmbexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("U2#")>=0?[/*'excel','print',*/
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("U2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,2]
        }]
    });

    $('#jzexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("V2#")>=0?[/*'excel','print',*/
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("V2#")>=0?{text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}}:undefined,
        ]:[],
    });

    $('#xyqlxexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I2#")>=0||$("#jsqx").val().indexOf("I5#")>=0||$("#jsqx").val().indexOf("I6#")>=0?[
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I5#")>=0?{text: '导出二维码',action: function ( e, dt, node, config ) {ewmdc('');}} :undefined,
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I5#")>=0?{text: '导出二维码图片',action: function ( e, dt, node, config ) {tpdc();}} :undefined,
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I5#")>=0?{text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}} :undefined,
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("I6#")>=0?{text: '导入',action: function ( e, dt, node, config ) {drxyq();}} :undefined
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,4]
        }]
    });

    $('#xyqexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,8]
        }]
    });

    $('#sqtjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,4]
        }]
    });
    $('#xhhtjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,5]
        }]
    });
    $('#yhtjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,4]
        }]
    });
    $('#xyqtable').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [7]
        }]
    });
    $('#njtjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [7]
        }]
    });
    $('#xxyhhdexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("T2#")>=0?[/*'excel','print',*/
            /*{text: '新添加',action: function ( e, dt, node, config ) {edit();}}*/
        ]:[],
    });

    $('#xspjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [ {
            "orderable": false,
            "targets": [4]
        }]
    });

    $('#jzjlexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        "bSort":false,
        dom: 'Bfrtip',
        buttons: [],
    });

    $('#banexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("V2#")>=0?[/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3]
        }]
    });
    $('#xsexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:($("#jsqx").val()=="school"||$("#jsqx").val().indexOf("K2#")>=0)?[/*'excel','print',*/
                 $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("K2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
                 $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("M2#")>=0?{text: '新增评价',action: function ( e, dt, node, config ) {topyadd();}}:undefined,
                 $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("V2#")>=0?{text: '新增奖状',action: function ( e, dt, node, config ) {tojzadd();}}:undefined,
                /*{text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}}*/]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [$("#jstype").val()=="A"?10:9]
        }]
    });
    $('#dpexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("W2#")>=0?[/*'excel','print',*/
            $("#jsqx").val()=="street"||$("#jsqx").val().indexOf("W2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [5]
        }]
    });

    $('#xxjyflexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("L2#")>=0? [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {editsd();}}
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [3]
        }]
    });

    $('#xxbjexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:$("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I2#")>=0||$("#jsqx").val().indexOf("I5#")>=0||$("#jsqx").val().indexOf("I6#")>=0?[
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I2#")>=0?{text: '新添加',action: function ( e, dt, node, config ) {edit();}}:undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I5#")>=0?{text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}} :undefined,
            $("#jsqx").val()=="school"||$("#jsqx").val().indexOf("I6#")>=0?{text: '升班',action: function ( e, dt, node, config ) {sjbj();}} :undefined
        ]:[],
        "columnDefs": [ {
            "orderable": false,
            "targets": [6]
        }]
    });
});
