jQuery(document).ready(function () {
    jQuery('#vmap').vectorMap({
        map: 'world_en',
        backgroundColor: '#fff',
        color: '#ffffff',
        hoverOpacity: 0.7,
        selectedColor: '#000000',
        enableZoom: true,
        showTooltip: true,
        scaleColors: ['#555555', '#CCCCCC'],
        values: sample_data,
        normalizeFunction: 'polynomial'
    });
});
// new Chart(document.getElementById("vertical-bar-chart3"), {
//     type: 'bar',
//     data: {
//         labels: labellist4,
//         datasets: [
//             {
//                 label: "Sales",
//                 backgroundColor: ["#5084E3"],
//                 data: datalist4
//             }
//         ]
//     },
//     options: {
//         maintainAspectRatio: false,
//         responsive: true,
//         legend: {display: false},
//         title: {
//             display: true,
//             text: '社区心愿分布'
//         }
//     }
//
// });
// new Chart(document.getElementById("pie-chart"), {
//     type: 'pie',
//     data: {
//         labels: ["群众","入党积极分子","银辉党员", "流动党员", "在职党员",  "在册党员",  "共青团员"],
//         datasets: [{
//             label: "Revenues ($)",
//             backgroundColor: ["#D95040","#EE752F","#5084E3", "#F2BD42", "#68BBC4",  "#58A55C",  "#B886F8"],
//             data: [rsM,rsF, rsD, rsC, rsB, rsE,  rsA]
//         }]
//     },
//     options: {
//         maintainAspectRatio: false,
//         responsive: true,
//         legend: {display: false},
//         title: {
//             display: false,
//             text: ''
//         }
//     }
// });
//
// new Chart(document.getElementById("pie-chart1"), {
//     type: 'pie',
//     data: {
//         labels: labellist1,
//         datasets: [{
//             label: "Revenues ($)",
//             backgroundColor: ["#D95040","#EE752F","#5084E3", "#F2BD42", "#68BBC4",  "#58A55C",  "#B886F8"],
//             data: datalist1
//         }]
//     },
//     options: {
//         maintainAspectRatio: false,
//         responsive: true,
//         legend: {display: false},
//         title: {
//             display: false,
//             text: ''
//         }
//     }
// });
//
// new Chart(document.getElementById("line-chart"), {
//     type: 'line',
//     data: {
//         labels: labellist2,
//         datasets: [{
//             label: '',
//             backgroundColor: window.chartColors.red,
//             borderColor: window.chartColors.red,
//             data: datalist2,
//             fill: false,
//         }]
//     },
//     options: {
//         maintainAspectRatio: false,
//         responsive: true,
//         legend: { display: false },
//         title: {
//             display: false,
//             text: 'Chart.js Line Chart'
//         },
//         tooltips: {
//             mode: 'index',
//             intersect: false,
//         },
//         hover: {
//             mode: 'nearest',
//             intersect: true
//         },
//         scales: {
//             xAxes: [{
//                 display: true,
//                 scaleLabel: {
//                     display: false,
//                     labelString: 'Month'
//                 }
//             }],
//             yAxes: [{
//                 display: true,
//                 scaleLabel: {
//                     display: true,
//                     labelString: 'Value'
//                 }
//             }]
//         }
//     }
// });