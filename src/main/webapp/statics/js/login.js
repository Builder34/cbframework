var COOKIE_NAME = 'sys__username';
$(function() {
    choose_bg();
    changeCodeImage();
    if ($.cookie(COOKIE_NAME)){
        $("#j_username").val($.cookie(COOKIE_NAME));
        $("#j_password").focus();
        $("#j_remember").attr('checked', true);
    } else {
        $("#j_username").focus();
    }

});
function choose_bg() {
    var bg = Math.floor(Math.random() * 9 + 1);
    $('body').css('background-image', 'url(statics/BJUI_3rdPlugin/images/loginbg_0'+ bg +'.jpg)');
}

function changeCodeImage() {
    $( "#captcha_img" ).attr( "src", "./code.jsp?timestemp=" + new Date().getTime() );
}