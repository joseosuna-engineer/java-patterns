
var app = angular.module("agularRESTApp", []);
var url = "http://jsonplaceholder.typicode.com/posts";

app.controller("containerController", function ($scope, $http) {

    // models
    $scope.posts = [];
    $scope.newPost = [];

    // Read
    var get = $http.get(url);

    get.success(function (data) {
        $scope.posts = data;
    });

    get.error(function (err) {

    });

    // methods
    // Create
    $scope.addPost = function () {
        var post = $http.post(url, {
            title: $scope.newPost.title,
            body: $scope.newPost.body,
            userId: 1
        });

        post.success(function (data, status, headers, config) {
            $scope.posts.push($scope.newPost);
            $scope.newPost = {};
        });

        post.error(function (err, status, headers, config) {
            console.log(err);
        });

    };
});
