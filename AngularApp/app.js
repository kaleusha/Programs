var app=angular.module("myApp", ['ui.router','ngMaterial','ngAnimate','ngAria','ngMessages']);
app.config(['$stateProvider' , '$urlRouterProvider', function($stateProvider, $urlRouterProvider)
{
$stateProvider
.state('login',
{
url : '/login',
templateUrl : 'templets/login.html',
controller : 'logCtrl'
})

.state('readFile',
{
url : '/readFile',
templateUrl : 'templets/readFile.html',
controller : 'mobileCtrl'
});
$urlRouterProvider.otherwise('/login');

}]);
