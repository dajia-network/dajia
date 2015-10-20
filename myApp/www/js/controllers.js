angular.module('starter.controllers', [])

.controller('ProdCtrl', function($scope, Mocks) {
	console.log('ProdCtrl...');
	$scope.products = Mocks.getProducts();
})

.controller('ProdDetailCtrl', function($scope, $stateParams, Mocks) {
	console.log('ProdDetailCtrl...')
	$scope.product = Mocks.getProduct($stateParams.pid);
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
});
