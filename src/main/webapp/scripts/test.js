$(function(){
	var template1 = Handlebars.compile( $('#table-template-f4').html() );
	var json =[
                {
            'cards':             [
                                {
                    'no': 'A-1',
                    'desc': 'bank-A-1'
                },
                                {
                    'no': 'A-2',
                    'desc': 'bank-A-2'
                }
            ],
            'name': 'jack',
            'age': '22'
        },
                {
            'cards':             [
                                {
                    'no': 'B-1',
                    'desc': 'bank-B-1'
                },
                                {
                    'no': 'B-2',
                    'desc': 'bank-B-2'
                }
            ],
            'name': 'rose',
            'age': '18'
        }
    ];
	$('.f4>div').html(template1(json));
});