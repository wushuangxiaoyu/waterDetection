<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="common/head.jsp"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath }/detail/js/tooltip/tooltip.css" rel="stylesheet" />
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=KyFfwEdehEoGoN8dQrRTsbFFFab7V64h"></script>
<!-- end: CSS -->

<jsp:include page="common/headMenu.jsp"/>

<!-- start: Header -->
<div class="container-fluid-full">
    <div class="row-fluid">

        <!-- start: Main Menu -->
        <jsp:include page="common/mainMenu.jsp"/>
        <!-- end: Main Menu -->

        <!-- start: Content -->
        <div id="content" class="span10" style="height: 1000px">


            <div class="row-fluid">

                <div class="box span12">
                    <div class="box-header">
                        <h2><i class="icon-edit"></i>参数修改</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="icon-remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <div id="MyWizard" class="wizard">
                            <br>
                            <h1>设备:${eqp.equipmentName}</h1>
                        </div>
                        <div class="step-content row">
                            <div class="step-pane active span6 offset3 row">
                                <form method="POST" action="/updateEqp${eqp.id}">
                                    <fieldset>
                                        <legend>位置</legend>
                                        <div class="offset2">
                                        <label>x</label>
                                        <input type="text" style="color: #000!important;" name="xPoint" value="${eqp.xPoint}" >
                                        <label>y</label>
                                        <input type="text" style="color: #000!important;" name="yPoint" value="${eqp.yPoint}" >
                                        </div>
                                        <legend>阈值</legend>
                                        <div class="offset2">
                                        <c:if test="${eqp.flagPh==1}">
                                            <label>PH</label>
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="minPh" value="${threshold.minPh}" >
                                            --
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="maxPh" value="${threshold.maxPh}" >
                                        </c:if>
                                        <c:if test="${eqp.flagTmpOxy==1}">
                                            <label>温度</label>
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="minTmp" value="${threshold.minTmp}" >
                                            --
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="maxTmp" value="${threshold.maxTmp}" >
                                            <label>含氧量</label>
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="minOxy" value="${threshold.minOxy}" >
                                            --
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="maxOxy" value="${threshold.maxOxy}" >
                                        </c:if>
                                        <c:if test="${eqp.flagHeavy==1}">
                                            <label>氨氮含量</label>
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="minHeavy" value="${threshold.minHeavy}" >
                                            --
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="maxHeavy" value="${threshold.maxHeavy}" >
                                        </c:if>
                                        <c:if test="${eqp.flagChy==1}">
                                            <label>磷含量</label>
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="minChy" value="${threshold.minChy}" >
                                            --
                                            <input type="text" class="span3" style="color: #000!important;display: inline;" name="maxChy" value="${threshold.maxChy}" >
                                        </c:if>
                                        </div>
                                        <legend>传感器</legend>
                                        <div class="offset2 row">
                                            <label class="checkbox inline">
                                                <input type="checkbox" name="checkWhat" value="0"
                                                <c:if test="${eqp.flagPh==1}">
                                                        checked="checked"
                                                </c:if>
                                                > PH
                                            </label>
                                            <label class="checkbox inline">
                                                <input type="checkbox" name="checkWhat" value="1"
                                                <c:if test="${eqp.flagTmpOxy==1}">
                                                       checked="checked"
                                                </c:if>
                                                > 温度&含氧量
                                            </label>
                                            <label class="checkbox inline">
                                                <input type="checkbox" name="checkWhat" value="2"
                                                <c:if test="${eqp.flagHeavy==1}">
                                                       checked="checked"
                                                </c:if>
                                                > 氨氮含量
                                            </label>
                                            <label class="checkbox inline">
                                                <input type="checkbox" name="checkWhat" value="3"
                                                <c:if test="${eqp.flagChy==1}">
                                                       checked="checked"
                                                </c:if>
                                                > 磷含量
                                            </label>
                                        </div>
                                        <br><br>
                                        <button type="submit" class="btn offset5">提交</button>
                                        <br><br>
                                        <br><br>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div><!--/span-->
            </div><!--/row-->
        </div>
        <!-- end: Content -->

    </div><!--/fluid-row-->



    <div class="clearfix"></div>


    <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">修改阈值(<span id="eqp"></span>)</h3>
        </div>
        <div class="modal-body" style="width: 100%">
            <table style="min-width: 80%;text-align: center;" >
                <tbody>
                <tr>
                    <td>PH</td>
                    <td>
                        <input class="input-mini" id="ph_low" type="text" value=""  style="color: #000000 !important"> --
                        <input class="input-mini" id="ph_high" type="text" value=""  style="color: #000000 !important">
                    </td>
                </tr>
                <tr>
                    <td>温度(°C)</td>
                    <td>
                        <input class="input-mini" id="tmp_low" type="text" value=""  style="color: #000000 !important">--
                        <input class="input-mini" id="tmp_high" type="text" value=""  style="color: #000000 !important">
                    </td>
                </tr>
                <tr>
                    <td>溶氧量(mg/L)</td>
                    <td>
                        <input class="input-mini" id="oxy_low" type="text" value=""  style="color: #000000 !important"> --
                        <input class="input-mini" id="oxy_high"  type="text" value=""  style="color: #000000 !important">
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="modal-footer">
            <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
            <button class="btn btn-primary" id="saveYuzhi"><span>修改</span></button>
        </div>
    </div>


    <footer>
        <br>
        <br>
        <p style="text-align:center">
            <span style="text-align:center">安徽农业大学 &copy; 2017<a target="_blank" href="#"></a></span>
        </p>

    </footer>

</div><!--/.fluid-container-->

<!-- start: JavaScript-->
<jsp:include page="common/js.jsp"/>
<script src="${pageContext.request.contextPath }/detail/js/tooltip/tooltip.js"></script>
<script type="text/javascript">
    $(".showDetail").bind("click",function(){
        /*$.ajax({
            type:"POST",
            url: "getThreshold/"+eqp,
            success: function(msg){

            }
        });*/
    });

    $(".upDetail").bind("click", function(){
        var eqp=$(this).parent().parent().prev().children(":first").text();
        $("#myModal :text").val("");
        $("#myModal #eqp").text(eqp);
        $('#myModal').modal('show');
        $.ajax({
            type:"POST",
            url: "water_stdAction",
            data: "eqp="+eqp,
            success: function(msg){
                $("#myModal #ph_low").val(msg.std.ph_low);
                $("#myModal #ph_high").val(msg.std.ph_high);
                $("#myModal #tmp_low").val(msg.std.tmp_low);
                $("#myModal #tmp_high").val(msg.std.tmp_high);
                $("#myModal #oxy_low").val(msg.std.oxy_low);
                $("#myModal #oxy_high").val(msg.std.oxy_high);
            }
        });
    });

    $(".clearEqp").bind("click", function(){
        var eqp=$(this).parent().parent().children(":first").text();
        $.ajax({
            type:"POST",
            url: "clearWater_stdAction",
            data: "eqp="+eqp,
            success: function(msg){
                if(msg==="Y"){
                    alert("已经通知清洗");
                }
            }
        });
    });
</script>
</body>
</html>