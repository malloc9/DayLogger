
// const angular = require('angular');
const angular = require('angular');
const uigrid = require('angular-ui-grid');


var app = angular.module('daylogger', [uigrid]);

app.controller('mainController', function ($scope, $http) {
    $scope.testdata = 'Test data!';


    $scope.initData = function initData() {
        $http.get('/init').then(function(){
            console.debug('init successful');
        },
        function (data) {
            console.debug('error' + data);
        });
    };

    $scope.listData = function listData() {
        $http.get('/list')
            .then(function(response){
                $scope.testdata = response.data;
                console.debug('list result ' + response.data);
            },
            function (response) {
                console.debug('error at listing ' +  response.data);
            });
    };
});