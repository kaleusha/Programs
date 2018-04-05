
app.controller('mobileCtrl', function ($scope, readjson)
{
        $scope.information = readjson.getJson();
        $scope.information.then(function(response){
          $scope.jsonRecord = response;
          console.log($scope.information);
        })

});
