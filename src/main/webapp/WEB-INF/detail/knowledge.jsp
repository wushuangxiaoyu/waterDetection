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
						<h2><i class="icon-edit"></i>衡量水质标准</h2>
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
									<!-- end: water_title -->
									<div class="water_body" id="water_body1" style="margin-top:130px;">
									<h2>衡量水质的指标</h2>
										<span>四大指标</span>
										<div id="zhibiao_contant">
										<div class="zhibiao" id="zhibiao1"><h3>生物指标</h3>
										<img src="img/heshui1.jpg" />
										<p>河水中含有的各种物质均是反映水质情况的重要指标，而水中含有的物质也是复杂的，从生物类的角度来看，河水中的一些藻类物质和细菌类等都是水质的重要反映。像河水中的部分浮游藻类的数量和组成就与河水中的N元素和P元素有很大关系，从藻类的组成和含量就可以来分析河水的水质。水中细菌总数反映了水体受细菌污染的程度。细菌总数不能说明污染的来源，必须结合大肠菌群数来判断水体污染的来源和安全程度。</p></div>
										
										<div class="zhibiao" id="zhibiao2"><h3>放射性指标</h3>
										<img src="img/heshui1.jpg" />
										<p>由于部分工业废水的排放，使得河水中常常会含有总α射线、总β射线、铀、镭、钍等放射性物质，河水中放射性物质的含量是水质被污染的程度的一个重要的衡量标准。对于用于不同作用的水体，对于放射性物质的指标也是不同的，要求水体中的放射性物质不能超过相应的指标。所以对于水体中的放射性物质含量的测量，对于决定该水体的作用有重要的意义。</p></div>	
										<div class="zhibiao" id="zhibiao3">
										<h3>物理指标</h3>
										<img src="img/heshui1.jpg" />
										<p>温度，气味，浑浊度，透明度，颜色等均可展现河水的水质。河水的温度对于水中的微生物和化学反应都会产生影响，一般情况下，温度升高，会加快水中化学反应以及微生物和藻类的数量。对于气味，洁净的水是没有什么气味的，但对于有污染的水，就会产生各种臭味。浑浊是悬浮于水体中的胶体颗粒产生的散射现象，浑浊程度直接河水反映的水质。河水透明清澈，一般它的水质也较好。而对于有颜色的河水，一般是受到了不同程度的污染，不同的污染源会导致河水呈现不同的颜色。</p></div>
										<div class="zhibiao" id="zhibiao4">
										<h3>化学指标</h3>
										<img src="img/heshui1.jpg" />
										<p>化学指标又可以从四个方面来看，第一个方面是非专一性指标，是指电导率、pH值、硬度、碱度、无机酸度等；非专一性指标可以反映出河水中所含有化学离子的成分与相对含量，是对水质的一种总体反映。第二个方面是无机物指标：有毒金属、有毒准金属、硝酸盐、亚硝酸盐、磷酸盐等。第三方面是非专一性有机物指标：总耗氧量、化学耗氧量、生化耗氧量、总有机碳、高锰酸钾指数、酚类等。第四方面是溶解性气体：氧气、二氧化碳等。这些有机化学物和无机化学物直接反映了河水水质。</p></div>
										</div>
									</div>
										<!-- end: water_body1 -->
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