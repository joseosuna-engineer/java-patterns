
var app = angular.module("agularRESTApp",[]);
var url = "http://jsonplaceholder.typicode.com/posts";

app.controller("containerController",function($scope,$http){
	
	// models
	$scope.posts = [];
	
	var get = $http.get(url);
	
	get.success(function(data){
		$scope.posts = data;
	});
	
	get.error(function(err){
	
	});
});
