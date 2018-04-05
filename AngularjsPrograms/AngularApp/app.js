var app=angular.module("myApp", ['ui.router','ngMaterial','ngAnimate','ngAria','ngMessages']);
app.config(['$stateProvider' , '$urlRouterProvider', function($stateProvider, $urlRouterProvider)
{
$stateProvider
.state('login',
{
url : '/login',
templateUrl : 'templets/login.html',
controller : 'logCtrl'
});
$urlRouterProvider.otherwise('/login');

}]);
