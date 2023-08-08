<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transport</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<script defer src="js/script.js"></script>
<script defer src="js/validateSearchForm.js"></script>
<div class="content">
    <div class="content_header">
        <a href="/vehicle/add" class="header_link-button link-button">Добавить</a>
    </div>
    <#if vehicles??>
    <table class="content_table table">
        <tr align="center" class="table_first-row">
            <th>Марка</th>
            <th>Модель</th>
            <th>Категория</th>
            <th>Гос номер</th>
            <th>Тип ТС</th>
            <th>Год выпуска</th>
            <th>Наличие прицепа</th>
        </tr>
        <#list vehicles as vehicle>
        <tr data-id="${vehicle.id}">
            <td>${vehicle.make}</td>
            <td>${vehicle.model}</td>
            <td>${vehicle.category}</td>
            <td>${vehicle.licensePlate}</td>
            <td>${vehicle.type.getName()}</td>
            <td>${vehicle.yearOfManufacture}</td>
            <td>
                <#if vehicle.hasTrailer>Есть
                <#else>Нет
                </#if>
            </td>
        </tr>
    </#list>
    </table>
    <form action="/" method="get" class="content_search-form">
        <div class="search-form_params">
            <p>Марка<input type="text" name="make"></p>
            <p>Модель<input type="text" name="model"></p>
            <p>Категория<input type="text" name="category"></p>
            <p>Гос. Номер<input type="text" name="licensePlate"></p>
            <p>Тип ТС<input type="text" name="type"></p>
            <p>Год Выпуска<input type="number" name="yearOfManufacture" min="0"></p>
            <p>Прицеп<input type="checkbox" name="hasTrailer"></p>
        </div>
        <input type="submit" value="Поиск" class="input-button search-form_button">
    </form>
    <#else>
    <h1>Машин нет!</h1>
</#if>
</div>
</body>
</html>
