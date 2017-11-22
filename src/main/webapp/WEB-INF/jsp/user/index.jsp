<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/taglib.jspf" %>
<!DOCTYPE html>
<html>
<head>
<title>用户管理</title>
<%@ include file="/WEB-INF/common/head.jspf" %>
</head>

<body>
	<%@ include file="/WEB-INF/common/top.jspf" %>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#">
				<span class="menu-text"></span>
			</a>
			<%@ include file="/WEB-INF/common/left.jspf" %>
			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
					</script>

					<ul class="breadcrumb">
						<li>
							<i class="icon-home home-icon"></i>
							<a href="#">Home</a>
						</li>
						<li>
							<a href="#">Tables</a>
						</li>
						<li class="active">jqGrid plugin</li>
					</ul>

					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="icon-search nav-search-icon"></i>
							</span>
						</form>
					</div><!-- #nav-search -->
				</div>

				<div class="page-content">
					<div class="page-header">
						<h1>
							jqGrid
							<small>
								<i class="icon-double-angle-right"></i>
								Dynamic tables and grids using jqGrid plugin
							</small>
						</h1>
					</div>

					<div class="row">
						<div class="col-xs-12">

						<!-- <div class="alert alert-info">
								<i class="icon-hand-right"></i>

								Please note that demo server is not configured to save the changes, therefore you may get an error message.
								<button class="close" data-dismiss="alert">
									<i class="icon-remove"></i>
								</button>
							</div> -->

							<table id="grid-table"></table>

							<div id="grid-pager"></div>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="/WEB-INF/common/right.jspf" %>
		</div>

		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
			<i class="icon-double-angle-up icon-only bigger-110"></i>
		</a>
	</div>

	<%@ include file="/WEB-INF/common/foot.jspf" %>

	<script type="text/javascript">
		jQuery(function($) {
			var grid_selector = "#grid-table";
			var pager_selector = "#grid-pager";

			jQuery(grid_selector).jqGrid({
				url:"admin/user/list",
				datatype:"json",
				jsonReader:{
					root:"list",
					total:"pages"
				},
				height : 450,
				colNames : [ 'ID', '姓名', '创建者', '最后修改者', '创建时间', '最后修改时间' ],
				colModel : [
					{ name : 'id', index : "list.id", width : 60, sorttype : "int"}, 
					{ name : 'name', index : 'list.name', width : 90 }, 
					{ name : 'createBy', index : '${list.createBy}', width : 90 }, 
					{ name : 'lastModifyBy', index : '${list.lastModifyBy}', width : 90 }, 
					{ name : 'createTime', index : '${list.createTime}', width : 150 }, 
					{ name : 'lastModifyTime', index : '${list.lastModifyTime}', width : 150} ],

				viewrecords : true,
				rowNum : 10,
				rowList : [ 10, 20, 30 ],
				pager : pager_selector,
				altRows : true,
				//toppager: true,

				multiselect : true,
				//multikey: "ctrlKey",
				multiboxonly : true,
				//editurl : "admin/user/save",
				autowidth : true
			});
		});
		//navButtons
		jQuery(grid_selector).jqGrid('navGrid',pager_selector,
			{ 	//navbar options
				edit: true,
				editicon : 'icon-pencil blue',
				add: true,
				addicon : 'icon-plus-sign purple',
				del: true,
				delicon : 'icon-trash red',
				search: true,
				searchicon : 'icon-search orange',
				refresh: true,
				refreshicon : 'icon-refresh green',
				view: true,
				viewicon : 'icon-zoom-in grey',
			},
			{
				//edit record form
				//closeAfterEdit: true,
				recreateForm: true,
				beforeShowForm : function(e) {
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
					style_edit_form(form);
				}
			},
			{
				//new record form
				closeAfterAdd: true,
				recreateForm: true,
				viewPagerButtons: false,
				beforeShowForm : function(e) {
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
					style_edit_form(form);
				}
			},
			{
				//delete record form
				recreateForm: true,
				beforeShowForm : function(e) {
					var form = $(e[0]);
					if(form.data('styled')) return false;
					
					form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
					style_delete_form(form);
					
					form.data('styled', true);
				},
				onClick : function(e) {
					alert(1);
				}
			},
			{
				//search form
				recreateForm: true,
				afterShowSearch: function(e){
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
					style_search_form(form);
				},
				afterRedraw: function(){
					style_search_filters($(this));
				}
				,
				multipleSearch: true,
				/**
				multipleGroup:true,
				showQuery: true
				*/
			},
			{
				//view record form
				recreateForm: true,
				beforeShowForm: function(e){
					var form = $(e[0]);
					form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
				}
			}
		)
	</script>
</body>
</html>
