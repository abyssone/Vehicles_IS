<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transport</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="content">
    <div class="content_header">
        <a href="/" class="header_link-button link-button">Вернуться</a>
    </div>
    <form action="/change/${vehicle.id}" method="post">
        <input type="text" value="${vehicle.make}" name="make">
        <input type="text" value="${vehicle.model}" name="model">
        <input type="text" value="${vehicle.category}" name="category">
        <input type="text" value="${vehicle.licensePlate}" name="licensePlate">
        <input type="text" value="${vehicle.type}" name="type">
        <input type="number" value="${vehicle.yearOfManufacture}" name="yearOfManufacture">
        <#if vehicle.hasTrailer>
        <input type="checkbox" checked name="hasTrailer">
        <#else>
        <input type="checkbox" name="hasTrailer">
    </#if>
    <input type="submit" value="Изменить">
    </form>
</div>
</body>
</html>
