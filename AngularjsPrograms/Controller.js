var app=angular.module("mainApp", ["$ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "login.html"
    })
    .when("/dashbord", {
        templateUrl : "dashbord.html"

    });
});

app.controller("loginCtrl",function($scope, $location){
  $scope.submit=function(){
    var uname=$scope.userName;
    var passw=$scope.pass;
    if($scope.uname=="admin" && $scope.passw=="admin" ){
      $location.path("/dashbord");
    }else {
      alert("wrong stuff");
    }
  }
});
