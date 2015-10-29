angular.module('starter.controllers', ["ui.bootstrap","countTo"])
.controller('ProdCtrl', function($scope, Mocks) {
	console.log('ProdCtrl...');
	$scope.products = Mocks.getProducts();
})

.controller('ProdDetailCtrl', function($scope, $stateParams, $state, $window, $timeout, Mocks) {
	console.log('ProdDetailCtrl...')
	var product = Mocks.getProduct($stateParams.pid);
	$scope.product = product;
	$scope.buyNow = function() {
		// $state.go('tab.prod-order');
		$window.location.href = '#/tab/prod/' + $stateParams.pid + '/order';
	}
	var amt = product.price/product.oriPrice*100;
	$scope.countTo = product.price;
	$scope.countFrom = product.oriPrice;
	$scope.progressValue = 0;
	$timeout(function() {
		$scope.progressValue = amt;
	}, 1000);
})

.controller('ProgCtrl', function($scope, Chats) {
	console.log('ProgCtrl...');
	// With the new view caching in Ionic, Controllers are only called
	// when they are recreated or on app start, instead of every page change.
	// To listen for when this page is active (for example, to refresh data),
	// listen for the $ionicView.enter event:
	//
	// $scope.$on('$ionicView.enter', function(e) {
	// });

	// $scope.chats = Chats.all();
	// $scope.remove = function(chat) {
	// Chats.remove(chat);
	// };
})

.controller('ProgDetailCtrl', function($scope, $stateParams, Chats) {
	console.log('ProgDetailCtrl...')
	console.log($scope);
	console.log($stateParams);
	$scope.chat = Chats.get($stateParams.chatId);
})

.controller('MineCtrl', function($scope) {
	console.log('MineCtrl init...');
	$scope.settings = {
		enableFriends : true
	};
})

.controller('OrderCtrl', function($scope, $stateParams, Mocks) {
	console.log('OrderCtrl...')
	var product = Mocks.getProduct($stateParams.pid);
	var orderItems = [];
	orderItems.push(product);
	$scope.orderItems = orderItems;
	$scope.totalPrice = product.price;
});
