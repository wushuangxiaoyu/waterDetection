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
                        <h2><i class="icon-edit"></i>国家水质标准</h2>
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
                                    <div class="water_body" id="water_body2" style="margin-top:130px;">
                                        <h2>国家水质标准</h2>
                                        <div id="biaozhun_title">
                                            <p>国家规定的各种用水在物理性质、化学性质和生物性质方面的要求。根据供水目的的不同，存在着饮用水水质标准、农用灌溉水水质标准等。我国地面水分五大类:Ⅰ类：主要适用于源头水，国家自然保护区；Ⅱ类：主要适用于集中式生活饮用水、地表水源地一级保护区，珍稀水生生物栖息地，鱼虾类产卵场，仔稚幼鱼的索饵场等； Ⅲ类：主要适用于集中式生活饮用水、地表水源地二级保护区，鱼虾类越冬、回游通道，水产养殖区等渔业水域及游泳区； Ⅳ类：主要适用于一般工业用水区及人体非直接接触的娱乐用水区；Ⅴ类：主要适用于农业用水区及一般景观要求水域。</p>
                                            <span>以下为部分指标的标准</span>
                                        </div>
                                        <div id="biaozhun_body">
                                            <h3>物理指标</h3>
                                            <span>气味：第Ⅰ类到第Ⅳ类均要求无气味，第Ⅳ类允许有气味。</span>
                                            <span>浑浊度：第Ⅰ类到第Ⅲ类浑浊度要小于等于3，第Ⅳ类小于等于10，第Ⅳ类可以大于10。</span>
                                            <h3>化学指标</h3>
                                            <span>PH:第Ⅰ类到第Ⅲ类的PH要求大于等于6.5并且小于等于8.5,第Ⅳ类是5.5到6.5,或者8.5到9，第Ⅴ类可以为大于9或者小于5.5的PH。</span>
                                            <span>硫酸盐：第Ⅰ类含量应小于50（mg/L），第Ⅱ类应小于150（mg/L），第Ⅲ类应小于250（mg/L），第Ⅳ类应小于350（mg/L），第Ⅴ类可大于350（mg/L）。</span>
                                            <h3>生物指标</h3>
                                            <span>细菌总数：第Ⅰ类到第Ⅲ类应小于100，第Ⅳ类应小于1000（个/L），第Ⅴ类可大于1000（个/L）</span>
                                            <span>大肠杆菌总数：第Ⅰ类到第Ⅲ类应小于3.0（个/L），第Ⅳ类应小于100（个/L），第Ⅴ类可大于100（个/L）</span>
                                            <h3>放射性指标</h3>
                                            <span>总α射线：第Ⅰ类到第Ⅲ类应小于0.1（Bq/L），第Ⅳ类第Ⅴ类可以大于0.1（Bq/L）</span>
                                            <span>总β射线：第Ⅰ类到第Ⅲ类应小于0.1（Bq/L），第Ⅳ类第Ⅴ类可以大于0.1（Bq/L）</span>
                                            <span style="color:blue;font-size: 18px;"><p>详情请见：</p><a href="https://baike.baidu.com/item/%E5%9B%BD%E5%AE%B6%E6%B0%B4%E8%B4%A8%E6%A0%87%E5%87%86/6190054?fr=aladdin" style="color:blue;">国家水质标准</a></span>
                                        </div>
                                    </div>
                                    <!-- end: water_body2 -->
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