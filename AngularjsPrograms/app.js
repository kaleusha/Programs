var app=angular.module("myApp", ["ui.router"]);
app.config(['$stateProvider' , '$urlRouterProvider', function($stateProvider, $urlRouterProvider)
{
  $stateProvider
  .state('register1',
{
  url : '/register1',
  templateUrl : 'templets/register1.html',
  controller : 'regCtrl'
})
.state('login1',
{
url : '/login1',
templateUrl : 'templets/login1.html',
controller : 'loginCtrl'
});

$urlRouterProvider.otherwise('/register1')
}]);
