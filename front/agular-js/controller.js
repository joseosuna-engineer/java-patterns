var app = angular.module("MyApp", []);

app.controller("myController", function($scope){
		
	$scope.newComment = {};
	$scope.comments = [
		{
			comment: "Good job!",
			username: "Giorgina"
		},
		{
			comment: "I like it!",
			username: "Katy"
		}
	];
	
	$scope.addComment = function(){
		$scope.comments.push($scope.newComment);
		$scope.newComment = {};
	};
});
