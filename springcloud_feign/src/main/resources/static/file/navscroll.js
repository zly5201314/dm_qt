define(function(){return function(){function t(t){this.opts=$.extend({},t)}function s(t){this.opts=$.extend({},t)}function i(){$(".triggler").each(function(t,s){$(s).on("click",function(t){$("html, body").stop(!0,!1).animate({scrollTop:$("[data-target="+$(s).attr("data-control")+"]").offset().top-52},1e3)})})}function e(t){this.pageindex=0,this.maxHeight=0,this.firstMaxHeightstep=0,this.opts=$.extend({},{prev:"prev",next:"next",step:1,needimg:!1,hiddenWrap:"wrapper-inner",simpleBox:"simple-box",switchBtn:"switch_btn"},t)}function h(t){this.cur_step=0,this.opts=$.extend({},{prev:"prev",next:"next",innerWrap:"nav_inner",activeClass:"current",pos:"1",isInitPos:!1},t)}return t.prototype={init:function(t,s,e){this._navs=t,this._scrollBlocks=s;var h=this;this.scrollobj=[],this.tabThreshold=this._navs.offset().top,this._scrollBlocks.each(function(t,s){h.scrollobj.push({index:t,num:$(s).offset().top})}),$(window).on("scroll",function(){var t=document.body.scrollTop|document.documentElement.scrollTop;t>=h.tabThreshold?(h._navs.addClass("navFixed"),h._navs.siblings(".navZkong").removeClass("hide"),h._navs.find("em").length&&h._navs.find("em").show()):(h._navs.removeClass("navFixed"),h._navs.siblings(".navZkong").addClass("hide"),h._navs.find("em").length&&h._navs.find("em").hide()),h.scrollobj.map(function(s,i){if(s.num<=t+150)return h._navs.children("a").eq(i).addClass("on").siblings().removeClass("on"),!0})}),i(),e&&e()},update:function(){var t=this;this.scrollobj.length=0,this.tabThreshold=this._navs.offset().top,this._scrollBlocks.each(function(s,i){t.scrollobj.push({index:s,num:$(i).offset().top})})}},s.prototype={init:function(t){this._dayscontain=t,this._daystarget=this._dayscontain.find(".daysTarget"),this._daysnav=this._dayscontain.find(".day-aside"),this._dayslist=this._dayscontain.find(".day-main");var s=this;this.dayobj=[],this.maxdays=this._daystarget.length,this.daystep=Math.ceil(this.maxdays/20),this.daysChosen="",this.daysChosenMaxHeight="";for(var e=0;e<this.maxdays;e+=this.daystep){this._daystarget.eq(e).addClass("daysTargetVisible");var h="<li data-control="+this._daystarget.eq(e).attr("data-target")+" class='triggler'><span>D"+this._daystarget.eq(e).attr("day-offset")+"</span></li>";this._daysnav.find("ul").append(h)}this.daysChosen=this._daysnav.offset().top-window.screen.height/5,this.daysChosenMaxHeight=this.daysChosen+this._dayslist.outerHeight(!0)-this._daysnav.outerHeight(!0),this._daystarget.each(function(t,i){if($(i).hasClass("daysTargetVisible")){var e=$(i).attr("data-target");s.dayobj.push({name:e,num:$(i).offset().top-150})}}),$(window).on("scroll",function(){var t=document.body.scrollTop|document.documentElement.scrollTop;t>=s.daysChosen&&t<s.daysChosenMaxHeight?s._daysnav.children(".day-inner").addClass("aside_fixed").show():t<s.daysChosen?s._daysnav.children(".day-inner").removeClass("aside_fixed"):t>=s.daysChosenMaxHeight&&s._daysnav.children(".day-inner").removeClass("aside_fixed").hide(),s.dayobj.map(function(i,e){if(i.num<=t)return cur=i.name,s._daysnav.find("[data-control="+cur+"]").addClass("current").siblings("li").removeClass("current"),!0})}),i()},update:function(){var t=this;this.daysChosen=this._daysnav.offset().top-window.screen.height/5,this.daysChosenMaxHeight=this.daysChosen+this._dayslist.outerHeight(!0)-this._daysnav.outerHeight(!0),t.dayobj.length=0,this._daystarget.each(function(s,i){if($(i).hasClass("daysTargetVisible")){var e=$(i).attr("data-target");t.dayobj.push({name:e,num:$(i).offset().top-150})}})}},e.prototype={init:function(t,s,i){this._wrappers=t,this._wraps=s,this._targetlist=i,this.$prev=this._wrappers.find("."+this.opts.prev),this.$next=this._wrappers.find("."+this.opts.next),this.$swithBtn=this._wrappers.find("."+this.opts.switchBtn),this._targetlistBox=this._wraps.find("."+this.opts.simpleBox),this.hiddenWrap=this._wrappers.find("."+this.opts.hiddenWrap),this._simpleBox=this.hiddenWrap.css("height"),this.firstMaxbox(this.hiddenWrap,this._targetlistBox);var e=this;this.v_width=this._targetlist.outerWidth(!0)*this.opts.step;var h=this._targetlist.length;this.stepnums(h,this.opts.step),this.opts.needimg&&this._targetlist.on("click",function(){e.pageindex=index=$(this).index(),e.inner_handler.apply(e,[index])}),0!=this.pageindex||this.opts.needimg||this.$prev.hide(),this.pageindex+1>=this.steps&&!this.opts.needimg&&this.$next.hide(),this.$next.on("click",function(){e.next_handler.apply(e)}),this.$prev.on("click",function(){e.prev_handler.apply(e)}),this.$swithBtn.on("click",function(){e.expand_handler.apply(e)}),this.setUlWidth(this._wraps,this.v_width,h),this._wrappers.width()>=this._wraps.width()&&!this.opts.needimg&&this.$next.hide()},firstMaxbox:function(t,s){var i=this;s.each(function(s,e){if($(e).height()>t.height())return i.$swithBtn.show(),i.maxHeight=$(e).height(),i.firstMaxHeightstep=s,!1;i.$swithBtn.hide()})},stepnums:function(t,s){this.steps=t%s==0?parseInt(t/s):parseInt(t/s)+1},inner_handler:function(t){this._targetlist.eq(t).addClass("on").siblings().removeClass("on"),this._wrappers.find(".slideholder .currentnum").text(t+1),this._wrappers.find(".slideholder .imgb").attr("src",this._targetlist.eq(t).children("img").attr("src"))},next_handler:function(){this.pageindex++,this.pageindex+1<=this.steps&&(this.opts.needimg?(this.inner_handler(this.pageindex),this.pageindex<this._targetlist.length-3&&this.scrollHorizontal(this._wraps,this.pageindex,this.v_width)):this.scrollHorizontal(this._wraps,this.pageindex,this.v_width)),this.pageindex+1>=this.steps&&(this.opts.needimg?this.pageindex>=this._targetlist.length&&(this.pageindex=0,this.scrollHorizontal(this._wraps,0,this.v_width),this.inner_handler(this.pageindex)):this.$next.hide()),0!=this.pageindex&&this.$prev.show()},prev_handler:function(){this.pageindex--,this.pageindex>=0&&(this.opts.needimg?(this.inner_handler(this.pageindex),this.pageindex<4?this.scrollHorizontal(this._wraps,0,this.v_width):this.scrollHorizontal(this._wraps,this.pageindex-3,this.v_width)):this.scrollHorizontal(this._wraps,this.pageindex,this.v_width)),0==this.pageindex&&(this.opts.needimg||this.$prev.hide()),this.pageindex<0&&(this.pageindex=this._targetlist.length-1,this.scrollHorizontal(this._wraps,this.pageindex-3,this.v_width),this.inner_handler(this.pageindex)),this.pageindex<this.steps&&this.$next.show()},expand_handler:function(){this.$swithBtn.hasClass("on")?(this.$swithBtn.removeClass("on"),this.hiddenWrap.css("height",this._simpleBox)):(this.pageindex=parseInt(this.firstMaxHeightstep/this.opts.step),this.scrollHorizontal(this._wraps,this.pageindex,this.v_width),this.$swithBtn.addClass("on"),this.hiddenWrap.css("height","auto"),this.pageindex+1>=this.steps?this.$next.hide():this.$next.show(),0!=this.pageindex?this.$prev.show():this.$prev.hide())},scrollHorizontal:function(t,s,i){var e=-s*i;t.stop(!0,!1).animate({left:e},300)},setUlWidth:function(t,s,i){t.css("width",s*i)}},h.prototype={init:function(t,s,i){var e=this;this._wrappers=t,this._wraps=s,this._targetlist=i,this.$prev=this._wrappers.find("."+this.opts.prev),this.$next=this._wrappers.find("."+this.opts.next),this._activeBlock=this._wraps.children("."+this.opts.activeClass),this.v_width=this.setUlWidth(this._wraps,this._targetlist),this._maxLeft=this._wraps.outerWidth()-this._wrappers.find("."+this.opts.innerWrap).width(),this.steps=this._targetlist.length,this.$next.on("click",function(){e.next_handler.apply(e)}),this.$prev.on("click",function(){e.prev_handler.apply(e)}),this.opts.isInitPos&&"全部"!=$.trim(this._activeBlock.text())&&(this.cur_step=1)},next_handler:function(){this.cur_step++,this._hasLeft=Math.abs(parseInt(this._wraps.css("left"))),this.cur_step>this.steps&&(this.cur_step=this.steps),this._hasLeft>=this._maxLeft?this._wraps.css({left:"-"+this._maxLeft+"px"}):this._wraps.css({left:"-"+Math.round(this._wraps.children("."+this.opts.activeClass).outerWidth()+this._hasLeft)+"px"}),this.setActiveBlock()},prev_handler:function(){this.cur_step--,this._hasLeft=Math.abs(parseInt(this._wraps.css("left"))),this.cur_step<0&&(this.cur_step=0),this.cur_step==this.steps-1&&(this.cur_step-=1),parseInt(this._wraps.css("left"))>0?this._wraps.css({left:"0px"}):Math.round(this._wraps.children("."+this.opts.activeClass).position().left)<=this._hasLeft&&this._wraps.css({left:"-"+Math.round(this._wraps.children("."+this.opts.activeClass).position().left-this._wraps.children("."+this.opts.activeClass).prev().outerWidth())+"px"}),this.setActiveBlock()},setActiveBlock:function(){this._targetlist.eq(this.cur_step).addClass(this.opts.activeClass).siblings().removeClass(this.opts.activeClass)},setUlWidth:function(t,s){var i=0;s.each(function(t,s){i+=$(s).outerWidth(!0)+1}),t.css("width",i)}},{Nav:t,Days:s,carousel:e,navCarousel:h}}()});