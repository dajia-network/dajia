angular.module('starter.services', [])

.factory('Mocks', function() {
	// Might use a resource here that returns a JSON array

	// Some fake testing data
	var products = [ {
		pid : 1,
		name : '迪奥魅惑唇膏玩色狂想系列',
		desc : '一款全新风格，一个颠覆性时尚解码：全新Dior迪奥魅惑唇膏玩色狂想系列，采用晶炫酷黑包装，尽显谜漾深邃、晶透纯粹及闪耀光芒。',
		img : '/img/dajia-sample-1.jpg',
		vendorImg : '/img/dajia-company-1.jpg',
		oriPrice : 480,
		price : 247,
		priceOff : 132,
		order : 55,
		long_desc : '...',
		spec : '...'
	}, {
		pid : 2,
		name : '倩碧润肤乳-啫喱配方',
		desc : '皮肤科医生研发无油保湿配方，与肌肤自然滋润成分如出一辙。',
		img : '/img/dajia-sample-2.jpg',
		vendorImg : '/img/dajia-company-2.jpg',
		oriPrice : 295,
		price : 205,
		priceOff : 90,
		order : 28,
		long_desc : '...',
		spec : '...'
	}, {
		pid : 3,
		name : '香奈儿邂逅活力淡香水50ml',
		desc : '这款全新的活力淡香水给人以动力，犹如幸运之神赐予的强大能量，不是乍现的灵光，而是无尽活力的源泉，怡人的葡萄柚-血橙复合香调跟随脉搏一起跳动，激发无穷的蓬勃的活力。',
		img : '/img/dajia-sample-3.jpg',
		vendorImg : '/img/dajia-company-3.jpg',
		oriPrice : 550,
		price : 482,
		priceOff : 68,
		order : 19,
		long_desc : '...',
		spec : '...'
	} ];

	return {
		getProducts : function() {
			return products;
		},
		// remove: function(chat) {
		// chats.splice(chats.indexOf(chat), 1);
		// },
		getProduct : function(pid) {
			for (var i = 0; i < products.length; i++) {
				if (products[i].pid === parseInt(pid)) {
					return products[i];
				}
			}
			return null;
		}
	};
});
