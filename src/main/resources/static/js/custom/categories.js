function createCategory(){
    var data = {}
    data["name"]= $('#inputName').val();
    data["memo"]= $('#inputDescr').val();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    console.log("header: " + header + ", token: " + token);
    $.ajax({
        url: "/api/category/add",
        type: "POST",
        headers: {
            'header': header,
            'token':token,
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
