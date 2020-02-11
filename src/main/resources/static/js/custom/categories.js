function createCategory(){
    var data = {}
    data["name"]= $('#inputName').val();
    data["memo"]= $('#inputDescr').val();
    $.ajax({
        url: "/api/category/add",
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data),
        timeout : 100000,
        success: function(jsonData){
            $('#content_p').html(jsonData)
        }
    })
}
