$(document).ready(function () {
    $('#example').DataTable();
    //账户管理
   $('#staffexm').DataTable({
       // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,7]
        }]
    });
    $('#ggexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}},],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3]
        }]
    });
    $('#bqexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}},],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3]
        }]
    });
    $('#spexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}},],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3]
        }]
    });
    $('#ddexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,11]
        }]
    });
    $('#cpexm').DataTable({
        // "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [/*'excel','print',*/
            {text: '新添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '批量删除',action: function ( e, dt, node, config ) {delete_item();}},],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,7]
        }]
    });
});
