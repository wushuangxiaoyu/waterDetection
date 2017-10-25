<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="common/head.jsp"/>
<link href="${pageContext.request.contextPath }/detail/css/knowledge.css" rel="stylesheet" />
<!-- end: CSS -->


<!-- start: Header -->
<jsp:include page="common/headMenu.jsp"/>
<!--end:Header-->

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
                        <h2><i class="icon-edit"></i>鉴别水质安全</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="icon-remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <div class="step-content">
                            <div class="step-pane active" id="step1">
                                <form class="form-horizontal" />
                                <div id="water_con">
                                    <div class="water_body" id="water_body3" style="margin-top: 130px;">
                                        <h2>鉴别安全的水</h2>
                                        <span> 什么样的水才算是安全的呢？从以下几个方面可以判断出水质是否安全。</span>

                                        <h3>从感官上判断：</h3>
                                        <p>看：水体呈现清澈透明的状态,水中不存在任何浑浊物；嗅：水体没有怪异的气味 ；触：水体的水温和外界温度相差不大。</p>


                                        <h3>通过化学仪器测量化学属性：</h3>
                                        <p>测量水体的PH：PH大概在6.5到8.5之间；测水体硬度：总硬度应小于450（mg/L），以CaCO3计；溶解度：与温度和气压等有关，一般溶解度大于90%,大概7.5左右。</p>


                                        <h3>测量化学元素含量：</h3>
                                        <p>化学元素过多，就以几种为例。氯化物：水体中含量小于1.0（mg/L）；铅：含量小于0,01（mg/L）；
                                            铁：含量小于0.3（mg/L）；氯酸盐：含量小于0.7（mg/L）。</p>


                                        <h3>测量细菌和大肠杆菌含量：</h3>
                                        <p>细菌总量：含量小于100(个/L)；大肠杆菌总量：含量小于3（个/L）；</p>

                                        <h3>测量放射性物质：</h3>
                                        <p>总α射线:含量小于0.1（Bq/L）；总β射线：含量小于0.1（Bq/L）。</p>

                                    </div>
                                    <!-- end: water_body3 -->

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div><!--/span-->

                </div><!--/row-->
            </div>
            <!-- end: Content -->

        </div><!--/fluid-row-->

        <div class="modal hide fade" id="myModal">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h3>Settings</h3>
            </div>
            <div class="modal-body">
                <p>Here settings can be configured...</p>
            </div>
            <div class="modal-footer">
                <a href="#" class="btn" data-dismiss="modal">Close</a>
                <a href="#" class="btn btn-primary">Save changes</a>
            </div>
        </div>

        <div class="clearfix"></div>

        <footer>
            <br>
            <br>
            <p style="text-align:center">
                <span style="text-align:center">安徽农业大学 &copy; 2017<a target="_blank" href="#"></a></span>
            </p>

        </footer>

    </div><!--/.fluid-container-->
</div>

    <!-- start: JavaScript-->
    <jsp:include page="common/js.jsp"/>
</body>
</html>