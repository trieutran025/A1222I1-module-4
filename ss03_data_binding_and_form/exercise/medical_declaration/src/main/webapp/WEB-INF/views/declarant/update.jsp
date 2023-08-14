<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT DECLARANT</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .content{
            color: red;
        }
        .error{
            color: red;
        }

    </style>
</head>
<body>
<center>
    <h1>TỜ KHAI Y TẾ</h1>
    <h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỀ PHÒNG CHỐNG
        DỊCH BỆNH TRUYỀN NHIỄM</h5>
    <h5 class="content">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h5>
</center>
<form:form method="post" action="/update" modelAttribute="declarants">
    <form:hidden path="idDeclarant"/>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputFullName">Họ tên(ghi chữ IN HOA)<span class="error">(*)</span></label>
            <form:input path="information.fullName" id="inputFullName" cssClass="form-control"/>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-4">
            <label for="inputBirthYear">Năm sinh<span class="error">(*)</span></label>
            <form:select path="information.birthYear" items="${birthYears}" id="inputBirthYear"
                         cssClass="form-control"/>
        </div>
        <div class="form-group col-md-4">
            <label for="inputGender"> Giới tính<span class="error">(*)</span></label>
            <form:select path="information.gender" items="${genders}" id="inputGender" cssClass="form-control"/>
        </div>
        <div class="form-group col-md-4">
            <label for="inputNationality"> Quốc tịch<span class="error">(*)</span></label>
            <form:select path="information.nationality" items="${nationality}" id="inputNationality"
                         cssClass="form-control"/>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputFullName">Số CMND/Số hộ chiếu<span class="error">(*)</span></label>
            <form:input path="information.idCard" id="inputFullName" cssClass="form-control"/>
        </div>
    </div>

    <span> Thông tin đi lại <span class="error">(*)</span></span>
    <form:radiobuttons path="information.travel.infoTravel" items="${travels}"/>

    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputVehicleNumber">Số hiệu phương tiện</label>
            <form:input path="information.travel.vehicleNumber" id="inputVehicleNumber" cssClass="form-control"/>
        </div>
        <div class="form-group col-md-6">
            <label for="inputVehicleNumber">Số ghế</label>
            <form:input path="information.travel.numberSeat" id="inputVehicleNumber" cssClass="form-control"/>
        </div>

    </div>
    <div class="form-row">

        <div class="form-group col-md-5">
            <label for="inputDate"> Ngày khởi hành <span class="error">(*)</span></label>
            <div class="design">
            <form:select path="information.starDay.day" items="${days}" id="inputDate"
                         cssClass="js-example-basic-single form-control"/>
            <form:select path="information.starDay.month" items="${months}"
                         cssClass="js-example-basic-single form-control"/>
            <form:select path="information.starDay.year" items="${years}"
                         cssClass="js-example-basic-single form-control"/>
            </div>
        </div>

        <div class="form-group col-md-5">
            <label for="inputDate"> Ngày kết thúc <span class="error">(*)</span> </label>
            <form:select path="information.endDay.day" items="${days}" id="inputDate"
                         cssClass="js-example-basic-single form-control"/>
            <form:select path="information.endDay.month" items="${months}"
                         cssClass="js-example-basic-single form-control"/>
            <form:select path="information.endDay.year" items="${years}"
                         cssClass="js-example-basic-single form-control"/>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputDetination"> Trong vòng 14 ngày qua, anh chị có đến thành phố nào ? <span class="error">(*)</span></label>
            <form:textarea path="information.destination" id="inputDetination" cssClass="form-control"/>
        </div>
    </div>
    <span> <h5>Địa chỉ liên lạc </h5> </span>
    <div class="form-row">
        <div class="form-group col-md-4">
            <label for="inputTown"> Tỉnh/thành <span class="error">(*)</span> </label>
            <form:select path="contact.town" items="${towns}" id="inputTown" cssClass="form-control"/>
        </div>
        <div class="form-group col-md-4">
            <label for="inputCountry">Quận/huyện <span class="error">(*)</span></label>
            <form:select path="contact.county" items="${country}" id="inputCountry" cssClass="form-control"/>
        </div>
        <div>
            <label for="inputWard">Phường/xã<span class="error">(*)</span> </label>
            <form:select path="contact.ward" items="${wards}" id="inputWard" cssClass="form-control"/></div>
    </div>

    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputAddress">Địa chỉ nơi ở <span class="error">(*)</span></label>
            <form:input path="contact.address" id="inputAddress" cssClass="form-control"/>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputPhone"> Điện thoại <span class="error">(*)</span></label>
            <form:input path="contact.phone" id="inputPhone" cssClass="form-control"/>
        </div>
        <div class="form-group col-md-6">
            <label for="inputEmail">Email</label>
            <form:input path="contact.email" id="inputEmail" cssClass="form-control"/>
        </div>
    </div>

    <span><h5>Trong vòng 14 ngày qua, anh/chị có xuất hiện dấu hiệu sau đây không? <span class="error">(*)</span></h5></span>
    </tr>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="colgroup">Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
            <th scope="colgroup">Triệu chứng</th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        </thead>
        <tr>
            <td>Sốt <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.fever" value="1"/></td>
            <td><form:radiobutton path="disease.fever" value="0"/></td>
            <td>Nôn <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.vomit" value="1"/></td>
            <td><form:radiobutton path="disease.vomit" value="0"/></td>
        </tr>
        <tr>
            <td>Ho <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.cough" value="0"/></td>
            <td><form:radiobutton path="disease.cough" value="0"/></td>
            <td>Tiêu chảy <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.diarrhea" value="0"/></td>
            <td><form:radiobutton path="disease.diarrhea" value="0"/></td>
        </tr>
        <tr>
            <td>Khó thở <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.shortNess" value="1"/></td>
            <td><form:radiobutton path="disease.shortNess" value="0"/></td>
            <td>Xuất huyết <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.hemorrhage" value="1"/></td>
            <td><form:radiobutton path="disease.hemorrhage" value="0"/></td>
        </tr>
        <tr>
            <td>Đau họng <span class="error">(*)</span></td>
            <td><form:radiobutton path="disease.soreThroat" value="0"/></td>
            <td><form:radiobutton path="disease.soreThroat" value="1"/></td>
            <td>Nổi ban <span class="error"> (*) </span></td>
            <td><form:radiobutton path="disease.rash" value="0"/></td>
            <td><form:radiobutton path="disease.rash" value="0"/></td>
        </tr>
    </table>
    <h5>Lịch sử phơi nhiễm : Trong vong 14 ngày qua, Anh/Chị có <span class="error">(*)</span> </h5>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th></th>
            <th> Có</th>
            <th>Không</th>
        </tr>
        </thead>
        <tr>
            <td>Đến trang trại nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật <span
                    class="error">(*)</span>
            </td>
            <td><form:radiobutton path="historyInfection.animalContact" value="1"/></td>
            <td><form:radiobutton path="historyInfection.animalContact" value="0"/></td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp nCov <span class="error">(*)</span></td>
            <td><form:radiobutton path="historyInfection.nCovContact" value="1"/></td>
            <td><form:radiobutton path="historyInfection.nCovContact" value="0"/></td>
        </tr>
    </table>
</form:form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Speech4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
