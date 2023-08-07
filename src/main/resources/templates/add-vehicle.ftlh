<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transport</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<div class="content">
    <form action="/vehicle/add" method="post" class="content_search-form" class="content_search-form">
        <div class="search-form_params">
            <p>Марка<input type="text" name="make"></p>
            <p>Модель<input type="text" name="model"></p>
            <p>Категория<input type="text" name="category"></p>
            <p>Гос номер<input type="text" name="licensePlate"></p>
            <p>Тип ТС<input type="text" name="type"></p>
            <p>Год выпуска<input type="number" name="yearOfManufacture"></p>
            <p>Прицеп<input type="checkbox" name="hasTrailer"></p>
        </div>
        <input type="submit" value="Добавить" class="input-button search-form_button">
    </form>
</div>
</body>
</html>
