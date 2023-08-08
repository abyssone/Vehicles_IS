<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transport</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<script defer src="/js/validateForm.js"></script>
<div class="content">
    <div class="content_header">
        <a href="/" class="header_link-button link-button">Вернуться</a>
    </div>
    <form action="/change/${vehicle.id}" method="post" class="content_search-form content_create-form">
        <div class="search-form_params">
            <p>Марка<input type="text" value="${vehicle.make}" name="make"></p>
            <p>Модель<input type="text" value="${vehicle.model}" name="model"></p>
            <p>Категория<input type="text" value="${vehicle.category}" name="category"></p>
            <p>Гос. номер<input type="text" value="${vehicle.licensePlate}" name="licensePlate"></p>
            <p>Тип
                <select name="type">
                    <#list vehicleTypes as type>
                    <option value="${type}" <#if type == vehicle.type> selected="selected" </#if>>

                        ${type.getName()}

                    </option>
                </#list>
                </select>
            </p>
            <p>Год выпуска<input type="number" value="${vehicle.yearOfManufacture?c}" name="yearOfManufacture"></p>
            <p>Прицеп
                <#if vehicle.hasTrailer>
                    <input type="checkbox" checked name="hasTrailer">
                <#else>
                    <input type="checkbox" name="hasTrailer">
                </#if>
            </p>
        </div>
    <input type="submit" value="Изменить" class="input-button search-form_button">
    </form>
</div>
</body>
</html>
