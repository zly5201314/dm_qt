define(["cookie","checkForm","commonTips"],function(e,t,o){$("div.dm-search-top input").focus(function(e){$(this).parents(".search_top").animate({width:"250px"},500)}).blur(function(e){var t=$(this);""===t.val()&&t.parents(".search_top").animate({width:"85px"},500)}),$("div.dm-search-top img").on("click",function(e){e.stopPropagation(),$("div.dm-search-top input").val()?$("form#dm-head-search").submit():o.Walert({closeBtn:!1,contentHtml:"请输入你想要搜索的关键词"})}),$("form#dm-head-search").keypress(function(e){if(13==e.which&&""==$("div.search_top input").val())return o.Walert({closeBtn:!1,contentHtml:"请输入你想要搜索的关键词"}),!1}),function(){var e=$(".footer_diy_wrapper input[name=city]"),t=$(".footer_diy_wrapper input[name=phone]"),n=$(".footer_diy_wrapper textarea[name='更多']"),i=!1,a=/^1\d{10}$/;t.blur(function(){a.test(t.val())?(i=!0,t.css("border","none")):(i=!1,t.css("border","2px solid red"))}),$("a.footsubmitBtn").click(function(){if(i){var a=$.trim(t.val()),s=$.trim(e.val()),c=$.trim(n.val()),l=$.trim($(".footer_diy_wrapper input[name=url]").val());o.loadShow.init(),$.post("/diy/_request.html",{type:1,action:2,is_code:2,url:l,city:s,phone:a,"更多":c},function(e){if(o.loadShow.close(),5==e.code){i=!1;var t={flagicon:"icon-success",color:"#41d090",contentHtml:e.info,closeBtn:!1};o.Walert(t),$("#footer_diyform")[0].reset()}else o.Walert({closeBtn:!1,contentHtml:e.info})},"json")}else t.css("border","2px solid red")})}();var n=function(){var e=window.location.href.match(/cart/);if(e&&$(".dm_btm_recommend").length&&$(".dm_btm_recommend").hide(),!e){var t=$(".btm-banner"),o=$(".btm-banner-min");sessionStorage.getItem("dm_btm")&&(t.css("left","-200%"),o.css("left","0")),t.find(".btm_banner_img").attr("src")||$(".btm-banner .close").css("visibility","hidden"),$(".btm-banner .close").on("click",function(e){e.preventDefault(),sessionStorage.setItem("dm_btm","hasshow"),sessionStorage.setItem("dm_btm","hasshow"),t.animate({left:"-200%"},1e3),o.animate({left:"0"},1e3)}),o.on("click",function(){o.animate({left:"-100%"},1e3),t.animate({left:"0"},1e3)})}}(),i={init:function(e){e=$.extend({callback:null},e);var n=$("<div class='dm-pub-login'></div>"),i=$("<div class='shadow-box'></div>");n.append('<h3>快速登录</h3><div class="login-form smslogin"><form action="" id="smsLogin" method="post"><div class="form_group" id="dm-smsphone" rel="form"><div class="item-info form-tel" ><label class="fl label-tel" title="手机号码" alt="手机号码">+86（中国）</label><input type="text" name="phone" value="" placeholder="手机号码" autocomplete="new-password"></div><p class="warn-text ptb5"></p></div><div class="form_group" id="dm-code" rel="form"><div class="input-code clearfix"><div class="form-code fl"><input type="text" name="vcode" value="" placeholder="请输入验证码" autocomplete="new-password"></div><label class="label-code" id="getCode" title="验证码" alt="验证码" >获取验证码</label></div><p class="warn-text ptb5"></p></div><div class="item-info btn"><input type="button" class="login-btn f18" id="submit-smsbtn" value="登录"/></div></form></div>'),$("body").append(n).append(i);var a;$.get("/user/_login.html?action=8",function(e){a=e.data.dm_login_validate},"json"),$("div.shadow-box").on("click",function(){$("div.shadow-box").remove(),$("div.dm-pub-login").remove()});var s;$(".item-info input").blur(function(e){}).focus(function(){s=$(this).parents('*[rel="form"]').attr("class"),$(this).parents('*[rel="form"]').attr("class","form_group"),$(this).parent().next(".warn-text").html("")}),$("#dm-smsphone input").blur(function(){t.phone("#dm-smsphone","blur",!1)}).focus(function(){$("#dm-smsphone").attr("class","form_group"),$("#dm-smsphone .warn-text").html("")}),$("#getCode").click(function(){var e=$.trim($("#dm-smsphone input").val()),t=/^1[1-9][0-9]{9}$/.test(e);if(!e)return $("#dm-smsphone").attr("class","form_group form_warning"),void $("#dm-smsphone .warn-text").html("请先输入手机号！");$(this).parents('*[rel="form"]').attr("class","form_group"),$("#dm-code .warn-text").html(""),"label-code"==$(this).attr("class")&&t&&a&&function(e,t,o){var n,i=60,a=$("."+t),s=setInterval(function(){i--,a.addClass(t+"_on"),a.html("重新发送("+i+"S)"),0==i&&(clearInterval(s),a.html("获取验证码"),c=!0,a.removeClass(t+"_on"))},1e3);n=$.trim($(e).val());var l="/user/_login.html?s="+Math.random()+"&phone="+n+"&action=1&dm_login_validate="+o;$.get(l,function(e){switch(e.code){case 6:$("#dm-code .warn-text").html("验证码已发送，请查收短信！").css("color","#4d8ac6");break;case 7:$("#dm-code").attr("class","form_group form_warning"),$("#dm-code .warn-text").html(e.info).css("color","#f50")}},"json")}("#dm-smsphone input","label-code",a+function(e){return["q","w","e","r","t","y","u","i","o","p"][e]}(e.charAt(e.length-1)))}),$("#submit-smsbtn").on("click",function(n){if(user=t.phone("#dm-smsphone","click",!1),!user||!t.phoneCode("#dm-code","click"))return!1;var i,a;i=$.trim($("#dm-smsphone input").val()),a=$.trim($("#dm-code input").val()),o.loadShow.init();var s="/user/_login.html?s="+Math.random()+"&phone="+i+"&code="+a+"&action=2";$.get(s,function(t){switch(t.code){case 1:o.loadShow.close(),$("#dm-code").attr("class","form_group form_warning"),$("#dm-code .warn-text").html(t.info+"<a href="+registerUrl+' style="text-decoration: underline;color:#4d8ac6">,请注册!</a>');break;case 5:o.loadShow.close(),$("#dm-code .warn-text").html(t.info).css("color","#4d8ac6"),$("div.shadow-box").remove(),$("div.dm-pub-login").remove(),dmw.swOpenAjaxCheck(),e.callback&&e.callback();break;default:o.loadShow.close(),$("#dm-code .warn-text").html(t.info).css("color","#f50")}},"json")});var c=!0}},a={init:function(){var e=$("<div class='dm-feedback-box'></div>"),t=$("<div class='shadow-box'></div>");e.append('<div class="title_top"><span class="f17">说说您在达美旅行网遇到的问题</span><a href="javascript:;" class="feedback_close"><i class="iconfont icon-close"></i> </a></div><div class="q_types"><ul><li class="on" data-type="1">页面问题</li><li data-type="2">流程问题</li><li data-type="3">其他问题</li></ul></div><div class="q_text"><textarea style="color:#999;" id="feedback_content" onfocus="if(this.value==\'请尽可能详细的描述您遇到的问题，我们会认真处理您提交的反馈（至少输入7个字），请留下您的联系方式，以便我们能更好的解决您的困惑。\'){this.value=\'\'}"onblur="if(this.value==\'\'){this.value=\'请尽可能详细的描述您遇到的问题，我们会认真处理您提交的反馈（至少输入7个字），请留下您的联系方式，以便我们能更好的解决您的困惑。\'}">请尽可能详细的描述您遇到的问题，我们会认真处理您提交的反馈（至少输入7个字），请留下您的联系方式，以便我们能更好的解决您的困惑。</textarea></div><div class="q_input clearfix"><div class="fl"><input type="text" class="q_name" placeholder="先生/女士"></div><div class="fl"><input type="text" class="q_contact" placeholder="联系方式（手机或邮箱）"/></div></div><div class="q_btn"><a href="javascript:;">提交反馈</a></div>'),$("body").append(e).append(t);var n={type:"1",content:"",name:"",contact:""};$("a.feedback_close").on("click",function(){$("div.shadow-box").remove(),$("div.dm-feedback-box").remove()}),$("div.q_types li").on("click",function(){var e=$(this);e.addClass("on").siblings().removeClass("on"),e.hasClass("on")&&(n.type=e.data("type"))}),$("div.q_btn a").on("click",function(e){e.preventDefault();var t=$("input.q_contact").val();if(/^1[1-9][0-9]{9}$/.test(t))n.contact=t,$("input.q_contact").css({border:"1px solid #dadada"});else if(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(t))n.contact=t,$("input.q_contact").css({border:"1px solid #dadada"});else{if(""!=t)return n.contact="",$("input.q_contact").css({border:"1px solid #f50"}),$("input.q_contact").val(""),void o.Walert({closeBtn:!1,contentHtml:"请输入正确手机号或邮箱！"});n.contact=""}"请尽可能详细的描述您遇到的问题，我们会认真处理您提交的反馈（至少输入7个字），请留下您的联系方式，以便我们能更好的解决您的困惑。"!=$("#feedback_content").val()?(n.name=$("input.q_name").val(),n.content=$("#feedback_content").val(),$.post("/index/_feedback.html",n,function(e){1==e.code?(o.Walert({flagicon:"icon-duihao1",color:"#45cd8f",closeBtn:!1,contentHtml:"您的反馈已经提交，谢谢！"}),$("div.shadow-box").remove(),$("div.dm-feedback-box").remove()):o.Walert({closeBtn:!1,contentHtml:e.info})})):o.Walert({closeBtn:!1,contentHtml:"请输入反馈的详细内容"})})}};$("span#emailTake").on("click",function(e){$(this);s.init({url:"/index/_email.html",action:"subscribe"})}),$("span#feedback").on("click",function(e){$(this);a.init()});var s={init:function(e){this.opts=$.extend({url:"/product/_email.html",action:"",no:"",tag_name:"",email:""},e);var n=this,i=$("<div class='dm-email-box'></div>"),a=$("<div class='shadow-box'></div>");i.append('<div class="title_top"><span class="f17">发送邮件</span><a href="javascript:;" class="email_close"><i class="iconfont icon-close"></i> </a></div><div class="email_num"><input type="text" class="sendemail" placeholder="请输入邮箱地址"/><p class="warn-text"></p></div><div class="btn_send"><a href="javascript:;" id="gtm-popup-email">发送</a></div>'),$("body").append(i).append(a),$("a.email_close").on("click",function(){$("div.shadow-box").remove(),$("div.dm-email-box").remove()}),$(".email_num input").blur(function(){t.email(".email_num","blur")}).focus(function(){$(".email_num").attr("class","email_num"),$(".email_num .warn-text").html("")}),$("div.btn_send a").on("click",function(e){e.preventDefault();if(!t.email(".email_num","click"))return!1;if(o.loadShow.init(),n.opts.action){i={action:n.opts.action,no:n.opts.no,email:$(".email_num input").val()};$.post(n.opts.url,i,function(e){o.loadShow.close(),1==e.code?(o.Walert({flagicon:"icon-duihao1",color:"#45cd8f",closeBtn:!1,contentHtml:"邮件已发送到您的邮箱,请查收！"}),$("div.shadow-box").remove(),$("div.dm-email-box").remove()):o.Walert({closeBtn:!1,contentHtml:e.info})},"json").error(function(e){o.loadShow.close(),$("div.shadow-box").remove(),$("div.dm-email-box").remove(),o.Walert({closeBtn:!1,contentHtml:"网络错误"})})}else{var i={no:n.opts.no,tag_name:n.opts.tag_name,email:$(".email_num input").val()};$.get(n.opts.url,i,function(e){o.loadShow.close(),1==e.code?(o.Walert({flagicon:"icon-duihao1",color:"#45cd8f",closeBtn:!1,contentHtml:"邮件已发送到您的邮箱,请查收！"}),$("div.shadow-box").remove(),$("div.dm-email-box").remove()):o.Walert({closeBtn:!1,contentHtml:e.info})})}})}},c={init:function(){var e=this,n={private:"定制旅游",gentuan:"跟团游",freetravel:"自由行",baotuan:"包团游",onetour:"一日游",study:"游学",baoche:"包车",curise:"邮轮",hotel:"酒店",visa:"签证",tourapply:"行程规划服务",other:"其他"},i=$("<div class='dm-tel-box'></div>"),a=$("<div class='shadow-box'></div>");i.append('<img src="/pc/img/rightaside/tan_telBack.png" class="tan_telBackImg"><a href="javascript:;" class="tel_close"></a><div class="title_top" style="display:none;"><img src="/pc/img/common/telavatar2.png"><span class="f17">我们将安排旅行规划师为您回电！</span><a href="javascript:;" class="tel_close"><i class="iconfont icon-close"></i> </a></div><div class="tel_inner tel_init_inner"><form action="/index/_right.html" method="post" id="rightSideTel"><input type="hidden" name="action" value="phone"><div class="services_types"><ul></ul></div><div class="input_box" id="phonenum"><input type="text" class="phonenum" name="right_phone" placeholder="请输入您的手机（必填）"/><p class="warn-text"></p></div><div class="more_text"><textarea style="color:#999;" id="more" placeholder="备注" name="remark" value=""></textarea></div></form><div class="btn_send"><a href="javascript:;" class="send_rq" id="gtm-popup-tel">提交需求</a><a href="javascript:dmw.alertkf()" class="online_consul">在线咨询</a></div><p class="fc99 ac mt10 pb10">或拨打免费服务热线：400-025-5588</p></div>'),$("body").append(i).append(a),dmw.pcSiteAlertBG&&$(".tan_telBackImg").attr("src",dmw.pcSiteAlertBG),i.animate({width:"520px",height:"450px",right:"50%","margin-right":"-260px","margin-top":"-225px"},500);for(var s in n)$("div.services_types ul").append('<li><input type="checkbox" id="box_tel_'+s+'" class="checkbox_input service" value="'+n[s]+'" name="services[]"><label for="box_tel_'+s+'" class="checkbox_label"></label><span>'+n[s]+"</span></li>");$("#phonenum input").blur(function(){t.phone("#phonenum","blur",!1)}).focus(function(){$("#phonenum").attr("class","input_box"),$("#phonenum .warn-text").html("")}),this.$closeBtn=$("a.tel_close"),this.$closeBtn.on("click",function(e){$("div.shadow-box").remove(),i.animate({width:"0",height:"0",right:"-5%","margin-right":"0","margin-top":"0"},500),setTimeout(function(){$("div.dm-tel-box").remove()},500)}),this.$contactBtn=$("a.send_rq"),this.$contactBtn.on("click",function(n){n.preventDefault();var i=0;if(user=t.phone("#phonenum","click",!1),$("div.services_types ul").find("input").each(function(e,t){if($(t).is(":checked"))return i=1,!1}),!i)return o.Walert({closeBtn:!1,contentHtml:"至少选择一项服务"}),!1;if(!user)return!1;var a={action:"phone",url:location.href,phone:$("input[name='right_phone']").val(),remark:$("#more").val(),service:[]};$.each($("input.service:checked"),function(e,t){a.service[e]=$(t).val()}),o.loadShow.init(),$.post("/index/_right.html",a,function(t){o.loadShow.close(),1==t.code?($("div.dm-tel-box").remove(),e.succeed()):o.Walert({closeBtn:!1,contentHtml:t.info})})})},succeed:function(){var e=$("<div class='dm-tel-box dm-success-box'></div>");e.append('<div class="title_top"><img src="/pc/img/common/telavatar2.png"><span class="f17">北美旅游资讯，随时掌握</span><a href="javascript:;" class="tel_close"><i class="iconfont icon-close"></i> </a></div><div class="tel_inner tel_success_inner"><div class="successInfo"><p>您的电话信息已提交完成！专属旅游顾问将于30分钟内与您电话沟通，</p><p>我们的呼出号码为025（南京）开头的座机，请您留意接听电话。</p><p>祝您生活愉快！</p></div><div class="codeimg"><img src="//oss.dameicdn.com/images/new_footer/dm_fuwu.jpg"><p>微信扫一扫</p></div></div>'),$("body").append(e),e.animate({width:"520px",height:"360px",right:"50%","margin-right":"-260px","margin-top":"-180px"},0),this.$closeBtn=$("a.tel_close"),this.$closeBtn.on("click",function(t){$("div.shadow-box").remove(),e.animate({width:"0",height:"0",right:"-5%","margin-right":"0","margin-top":"0"},500),setTimeout(function(){$("div.dm-tel-box").remove()},500)})}},l={elements:[".dm-side-menus"],isExpand:!0,init:function(){var e=$(".dm_goTop"),t=$(".currency_switch"),n=this,i=["side-item-compare","side-item-consul","side-item-tel","side-item-app","side-item-currency","side-item-gotop","side-item-close"];this.$dm_side_menus=$(".dm-side-menus"),this.$side_item_tel=$(".side-item-tel"),this.$side_item_compare=$(".side-item-compare"),this.$side_item_close=$(".side-item-close"),this.$side_item_tips=this.$side_item_close.find(".dm-side-tips"),this.fill_compare(),this.setElementHeight(),this.resize(),$("#cart-num").text($.cookie("cart_number")),this.$side_item_compare.on("click",".addComItem",function(e){e.preventDefault();var t=$(this),i=$(this).prev("span").children("input").val();i?$.get("/product/_compare.html",{type:"plus",no:$.trim(i)},function(e){4==e.code?n.show_compare(e.data):(t.prev("span").children("input").val(""),o.Walert({closeBtn:!1,contentHtml:e.info}))}):o.Walert({closeBtn:!1,contentHtml:"请输入产品编号"})}),this.$side_item_compare.on("click",".closeComItem",function(e){e.preventDefault();var t=$(this).data("no");$.get("/product/_compare.html",{type:"desc",no:t},function(e){5==e.code?(n.$side_item_compare.find("li[data-no="+t+"]").remove(),($("span.compare").length||$("a.compare").length)&&($("span.compare").removeClass("on"),$("a[data-no="+t+"]").removeClass("on"),$("span.compare").children("em").text("对比"))):o.Walert({closeBtn:!1,contentHtml:e.info})})}),this.$side_item_compare.on("click",".startCom",function(e){e.preventDefault();var t=$(this),i=n.$side_item_compare.find(".compared_list").children("li"),a="";i.each(function(e,t){a+=$(t).data("no")+",",2==e&&(a=a.replace(/,$/,""))}),i.length<2?o.Walert({closeBtn:!1,contentHtml:"至少添加两个产品"}):window.open(t.attr("href")+"?nos="+a)}),sessionStorage.getItem("dt_tan")||setTimeout(function(){!$(".dm-tel-box").length&&n.$side_item_tel.length&&(c.init(),sessionStorage.setItem("dt_tan","hasview"))},5e3),this.$side_item_tel.on("click",function(e){e.stopPropagation(),c.init()}),this.$side_item_close.on("click",function(e){e.stopPropagation(),n.isExpand=!n.get_isExpand()||!n.isExpand,sessionStorage.setItem("isExpand",n.isExpand?1:0),n.toggle_expandBar(n.isExpand)}),e.on("click",function(e){e.stopPropagation(),$("body,html").animate({scrollTop:"0px"},800)}),t.children("a").on("click",function(e){e.preventDefault(),$.cookie(dmw.currencyCookie,""+$(this).data("value"),{path:"/",expires:7}),location.reload()}),function(){$.each(i,function(e,t){var o=$("."+t).find(".dm-side-tips"),n=$("."+t).find(".dm-hide-list");$("."+t).hover(function(){o.show(),n.fadeIn("fast"),setTimeout(function(){o.animate({left:"-80px",opacity:1},600)})},function(){o.animate({left:"-100px",opacity:0},600),n.fadeOut("fast"),setTimeout(function(){o.hide()},700)})});var e=n.get_isExpand();e||"undefined"==e?n.toggle_expandBar(!0):n.toggle_expandBar(!1)}()},get_isExpand:function(){return!!(sessionStorage.getItem("isExpand")?parseInt(sessionStorage.getItem("isExpand")):"undefined")},setElementHeight:function(){var e=document.documentElement.clientHeight;$.each(this.elements,function(t,o){$(o).css({height:e})});var t=this.$dm_side_menus.children(".dm-side-special");t.length&&this.$dm_side_menus.children(".dm-side-top").css({top:t.height()})},resize:function(){var e=this;$(window).resize(function(){e.setElementHeight()})},fill_compare:function(){var e=this;$.get("/product/_compare.html?action=compare",function(t){if(7==t.code){e.$side_item_compare.find(".comparepro").fadeIn("fast");for(var o="",n=0;n<t.data.length;n++)o+='<li class="com_li clearfix" data-no="'+t.data[n].no+'"><div class="tours "><div><b>编号：'+t.data[n].no+'</b></div><a href="'+t.data[n].url+'" title="'+t.data[n].title+'" target="_blank">'+t.data[n].title+'</a></div><div class="btn"><a href="javascript:;" class="closeComItem" data-no="'+t.data[n].no+'"><i class="iconfont icon-close"></i></a></div></li>';e.$side_item_compare.find(".compared_list").append(o)}})},hide_expand:function(){return $(this.elements[1]).animate({right:"-285px"},400).promise()},show_expand:function(){return $(this.elements[1]).animate({right:"-235px"},400).promise()},show_compare:function(e){this.$side_item_compare.find(".comparepro").fadeIn("fast");var t='<li class="com_li clearfix" data-no="'+e.no+'"><div class="tours "><div><b>编号：'+e.no+'</b></div><a href="'+e.url+'" title="'+e.title+'" target="_blank">'+e.title+'</a></div><div class="btn"><a href="javascript:;" class="closeComItem" data-no="'+e.no+'"><i class="iconfont icon-close"></i></a></div></li>';this.$side_item_compare.find(".compared_list").append(t)},hide_compare:function(e){this.$side_item_compare.find(".comparepro").fadeOut("fast"),this.$side_item_compare.find("li[data-no="+e+"]").remove()},toggle_expandBar:function(e){e?(this.$side_item_tips.text("隐藏"),this.$side_item_close.removeClass("expand"),this.$dm_side_menus.removeClass("toggle-menus")):(this.$side_item_tips.text("展开"),this.$side_item_close.addClass("expand"),this.$dm_side_menus.addClass("toggle-menus")),sessionStorage.setItem("isExpand",e?1:0)}};l.init();var d,r={init:function(e){var t={barrageJson:[],closeBtnHtml:"不再提示",closeBtn:!0,close:function(){d.close()}};this.opts=$.extend(t,e),this.domCon=null,this.show()},create:function(){var e=$("<div class='dm-g-barrageBox'></div>"),t=$("<div class='dm-g-barrage-close clearfix'><span class='closeHtml'>"+this.opts.closeBtnHtml+"</span></div>"),o=$("<div class='dm-g-barrage'></div>");if(this.opts.barrageJson)for(var n=this.opts.barrageJson.length-1;n>=0;n--){var i=$("<div class='content'>"+this.opts.barrageJson[n].content+"</div>"),a=$("<a href='javascript:;' class='close iconfont icon-close'></a>");i.append(a),o.append(i)}this.domCon=e;var s=$("body");return this.opts.closeBtn&&this.opts.barrageJson.length>0?e.append(o).append(t):e.append(o),s.append(e).promise()},destroy:function(){this.domCon.hide().remove().promise(),this.domCon.off("click",".dm-g-barrage-close")},close:function(){this.opts.closeBtn&&this.opts.close(),this.destroy()},show:function(){var e=this;$.when(e.create()).then(function(){e.domCon.on("click",".dm-g-barrage-close",function(){e.close()}),e.domCon.on("click",".content .close",function(){var t=this;$(t).parent().animate({left:"380px",opacity:"0"}),setTimeout(function(){$(t).parent().remove()},500);1===$(".dm-g-barrage").children().length&&e.destroy()})})}},m=dmw.route;if(dmw.websocket_url)p=dmw.websocket_url;else var p="";var u=["index/index","list/index","product/detail"],h={init:function(){var e=[];(d=new WebSocket(p)).onopen=function(e){console.log("---ws 连接成功---");var t,o,n=dmw.route;switch($.inArray(n,u)){case 0:o="";break;case 1:o=dmw.cids;break;case 2:o=dmw.product_id;break;default:o=""}t=n;var i={cookie:function(e){var t=e+"=",o="";return document.cookie.length>0&&(sd=document.cookie.indexOf(t),-1!=sd&&(sd+=t.length,end=document.cookie.indexOf(";",sd),-1==end&&(end=document.cookie.length),o=unescape(document.cookie.substring(sd,end)))),o}(dmw.token_cookie),type:t,value:o};d.send(JSON.stringify(i))},d.onclose=function(e){console.log("---ws 连接断开---"),$(".dm-g-barrageBox").length>0&&r.destroy()},d.onmessage=function(t){if(t){var o={barrageJson:e=JSON.parse(t.data)};$(".dm-g-barrageBox").length>0&&r.destroy(),r.init(o)}},d.onerror=function(e,t){console.log("Error occured: "+e.data)}}};return{collect:function(e){this.opts=$.extend({contain:"",url:"/product/_favorite.html",product_id:"",type:"plus"},e);var t=$(this.opts.contain);t.hasClass("on")?(this.opts.type="desc",$.get(this.opts.url,{type:this.opts.type,product_id:this.opts.product_id},function(e){1==e.code?(t.removeClass("on"),t.children("em").text("收藏"),o.Walert({flagicon:"icon-duihao1",color:"#45cd8f",closeBtn:!1,contentHtml:e.info})):o.Walert({closeBtn:!1,contentHtml:e.info})})):$.get(this.opts.url,{type:this.opts.type,product_id:this.opts.product_id},function(e){1==e.code?(t.addClass("on"),t.children("em").text("已收藏"),o.Walert({flagicon:"icon-duihao1",color:"#45cd8f",closeBtn:!1,contentHtml:e.info})):o.Walert({closeBtn:!1,contentHtml:e.info})})},compare:function(e){var t=this;t.opts=$.extend({contain:"",url:"/product/_compare.html",no:"",type:"plus"},e);var n=$(t.opts.contain);n.hasClass("on")?(t.opts.type="desc",$.get(t.opts.url,{type:t.opts.type,no:t.opts.no},function(e){5==e.code?(n.removeClass("on"),n.children("em").text("对比"),l.hide_compare(t.opts.no)):o.Walert({closeBtn:!1,contentHtml:e.info})})):$.get(t.opts.url,{type:t.opts.type,no:t.opts.no},function(e){4==e.code?(n.addClass("on"),n.children("em").text("取消对比"),l.show_compare(e.data)):o.Walert({closeBtn:!1,contentHtml:e.info})})},rightSide:l,btmAdvertisement:n,dmPublogin:i,dmPubfeedback:a,dmPubemail:s,commonBarrage:{init:function(){"WebSocket"in window&&$.inArray(m,u)>-1&&p&&h.init()}},initBarrage:r}});