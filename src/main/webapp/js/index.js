ymaps.ready(init);
var map;
function init() {
    map = new ymaps.Map("ymap", {
        center: [55.76, 37.64],
        zoom: 10
    });
};

$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

$(function() {
    $('#add-form').on('submit', function(e) {
        e.preventDefault();
        $.ajax({
            url: 'mappoints/addpoint',
            type: 'POST',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify($("#add-form").serializeObject()),
            success: function(data) {
                alert('AZZAZZA');
            }
        });
    });
});
