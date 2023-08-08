let yearField = document.querySelector('input[name="yearOfManufacture"]');
let form = document.querySelector('.content_search-form');

form.addEventListener('submit', () => {
    if(yearField.value == null || yearField.value == '') yearField.value = 0;
})