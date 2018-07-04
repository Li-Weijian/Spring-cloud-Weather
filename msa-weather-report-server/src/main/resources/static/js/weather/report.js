$(function () {
    $("#selectCityId").change(function () {
        var cityId = $("#selectCityId").val();
        var url = "/report/cityId/"+cityId;
        location.href = url;
    });
    
})