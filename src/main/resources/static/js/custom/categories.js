function createCategory(){
    var data = {}
    data["name"]= $('#inputName').val();
    data["memo"]= $('#inputDescr').val();
    $.ajax({
        url: "/api/category/add",
        type: "POST",
        headers: {
            'Content-Type':'application/json'
        },
        dataType: "json",
        data: JSON.stringify(data),

        timeout : 100000,
        success: function(jsonData){
            $('#content_p').text(JSON.stringify(jsonData));
        }
    })
}
