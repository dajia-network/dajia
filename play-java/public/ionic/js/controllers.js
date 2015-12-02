angular.module('starter.controllers', [ "ui.bootstrap", "countTo" ]).controller('ProdCtrl', function($scope, ProductService) {
	console.log('产品列表...');
	$scope.products = ProductService.getProducts();
})

.controller('ProdDetailCtrl', function($scope, $stateParams, $state, $window, $timeout, Mocks) {
	console.log('产品详情...')
	var product = Mocks.getProduct($stateParams.pid);
	$scope.product = product;
	$scope.orderNeeded = product.targetOrderNum - product.orderNum;
	$scope.nextPriceOff = (product.oriPrice - product.targetPrice) / product.targetOrderNum;
	$scope.buyNow = function() {
		$window.location.href = '#/tab/prod/' + $stateParams.pid + '/order';
	}
	var amt = product.priceOff / (product.oriPrice - product.targetPrice) * 100;
	$scope.countTo = product.price;
	$scope.countFrom = product.oriPrice;
	$scope.progressValue = 0;
	$timeout(function() {
		$scope.progressValue = amt;
	}, 1000);
})

.controller('ProgCtrl', function($scope, Mocks) {
	console.log('进度列表...');
	// $scope.$on('$ionicView.enter', function(e) {
	// });
	var orders = Mocks.getMyOrders();
	orders.forEach(function(o) {
		o.product = Mocks.getProduct(o.pid);
		o.progressValue = o.product.priceOff / (o.product.oriPrice - o.product.targetPrice) * 100;
	});
	$scope.myOrders = orders;
})

.controller('ProgDetailCtrl', function($scope, $stateParams, Mocks) {
	console.log('进度详情...')
	var order = Mocks.getOrder($stateParams.orderId);
	order.product = Mocks.getProduct(order.pid);
	order.contactInfo = Mocks.getContact(order.contactId);
	order.progressValue = order.product.priceOff / (order.product.oriPrice - order.product.targetPrice) * 100;
	$scope.order = order;
})

.controller('MineCtrl', function($scope) {
	console.log('我的打价...');
	$scope.settings = {
		enableFriends : true
	};
})

.controller('OrderCtrl', function($scope, $stateParams, Mocks) {
	console.log('订单页面...')
	var product = Mocks.getProduct($stateParams.pid);
	var orderItems = [];
	orderItems.push(product);
	$scope.orderItems = orderItems;
	$scope.totalPrice = product.price;
});
