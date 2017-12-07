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
							<a href="#">用户管理</a>
						</li>
						<li class="active">新增</li>
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
							Form Elements
							<small>
								<i class="icon-double-angle-right"></i>
								Common form elements and layouts
							</small>
						</h1>
					</div>

					<div class="row">
						<div class="col-xs-12">
							<form class="form-horizontal" role="form" action="admin/user/save">
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" for="form-field-1">姓名</label>
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="姓名" name="name" class="col-xs-10 col-sm-5"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" for="id-date-picker-1">生日</label>
									<div class="col-sm-9">
										<input id="id-date-picker-1" type="text" data-date-format="yyyy-mm-dd" name="birthday" class="col-xs-10 col-sm-5 date-picker"/>
									</div>
								</div>
								<div class="clearfix form-actions">
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" type="button">
											<i class="icon-ok bigger-110"></i>
											Submit
										</button>

										&nbsp; &nbsp; &nbsp;
										<button class="btn" type="reset">
											<i class="icon-undo bigger-110"></i>
											Reset
										</button>
									</div>
								</div>
							</form>
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
		$(function(){			
			$('.date-picker').datepicker({autoclose:true}).next().on(ace.click_event, function(){
				$(this).prev().focus();
			});
		});
	</script>
</body>
</html>
