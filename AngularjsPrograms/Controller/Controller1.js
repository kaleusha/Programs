
app.controller("loginCtrl",function($scope){

  $scope.submit=function()
  {
    console.log("userName: "+$scope.userName);
    console.log("password: "+$scope.password);

  }

});
