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
    <h1>Произошла ошибка
        <#if statusCode??>
            ${statusCode}
        </#if>
    </h1>
    <p>
        <#if exception??>
            ${exception}
        </#if>
    </p>
    <p>
        <#if message??>
            ${message}
        </#if>
    </p>
</div>
</body>
</html>
