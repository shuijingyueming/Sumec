// JavaScript Document
//粒子数（px），颜色，宽度，高度，速度，位置左，位置右，角度
function createLine(num, color, width, height, speed, left, top, deg) {

    var $sparkLine = $('<div class="sparkLine"></div>');
    $sparkLine.css("top", top);
    $sparkLine.css("left", left);
    $sparkLine.css("height", height);
    $sparkLine.css("transform", ' rotateZ(' + deg + 'deg)');
    for (var i = 0; i < num; i++) {
        var $sparkParticle = $('<div class="sparkParticle"></div>');
        $sparkParticle.css("-webkit-animation", "fade " + speed + "s " + i / 100 + "s infinite");
        $sparkParticle.css("width", width);
        $sparkParticle.css("height", height);
        $sparkLine.append($sparkParticle)
    }
    $(".container").append($sparkLine)
}
			