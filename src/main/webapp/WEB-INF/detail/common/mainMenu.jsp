<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/9/23
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- start: Main Menu -->
<div id="sidebar-left" class="span2">

    <div class="row-fluid actions">

        <input type="text" class="search span12" placeholder="..." />

    </div>

    <div class="nav-collapse sidebar-nav">
        <ul class="nav nav-tabs nav-stacked main-menu">
            <li>
                <a href="#" class="dropmenu"><i class="icon-eye-open"></i><span class="hidden-tablet">监控中心</span><span class="label"><i class="icon-chevron-down"></i></span></a>
                <ul>
                    <li><a class="submenu" href="realTimeData">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<i class="icon-hdd"></i><span class="hidden-tablet">实时数据</span></a></li>
                    <li><a class="submenu" href="screenData">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<i class="icon-tasks"></i><span class="hidden-tablet">数据总览</span></a></li>
                    <li><a class="submenu" href="pipelineData">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<i class="icon-signal"></i><span class="hidden-tablet">流水数据</span></a></li>
                    <li><a class="submenu" href="analysisData">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<i class="icon-bar-chart"></i><span class="hidden-tablet">数据分析</span></a></li>
                </ul>
            </li>

            <li><a href="personal"><i class="icon-user"></i><span class="hidden-tablet">用户中心</span></a></li>
            <li><a href="control"><i class="icon-cogs"></i><span class="hidden-tablet"> 设备管理</span></a></li>
            <li><a href="#"  class="dropmenu"><i class="icon-book"></i><span class="hidden-tablet"> 关于水质</span><span class="label"><i class="icon-chevron-down"></i></span></a>
                <ul>
                    <li><a class="submenu" href="knowledge"><i class="icon-th-list"></i><span class="hidden-tablet">衡量水质标准</span></a></li>
                    <li><a class="submenu" href="knowledge1"><i class=" icon-list"></i><span class="hidden-tablet">国家水质标准</span></a></li>
                    <li><a class="submenu" href="knowledge2"><i class=" icon-list-alt"></i><span class="hidden-tablet">鉴别安全的水</span></a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!-- end: Main Menu -->
