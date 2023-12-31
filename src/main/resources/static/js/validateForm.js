let form = document.querySelector('.content_create-form');
let allInputs = form.querySelectorAll('input');
let textInputs = form.querySelectorAll('[type="text"]');
let yearInput = form.querySelector('[name="yearOfManufacture"]');
let currYear = new Date().getFullYear();
let submitButton = document.querySelector('.search-form_button');

let warning = document.createElement('div');
warning.className = 'form_warning';
warning.style.opacity = '0';
form.appendChild(warning);

for(let inp of allInputs) {
    inp.addEventListener('focus', hideWarningText);
}

submitButton.addEventListener('click', (event) => {
    for(let inp of textInputs) {
        if(inp.value == null || inp.value == '') {
            event.preventDefault();
            addWarningText(inp.getAttribute('name'));
            console.log(`Поле: ${inp.getAttribute('name')} пустое: ${inp.value}`);
        }
    }
    
    if(yearInput.value == null || yearInput.value == '' ||
            Number(yearInput.value) < 1900 || Number(yearInput.value) > currYear) {
        event.preventDefault();
        addWarningText('Год: от 1900 до текущего');
        console.log(`Поле: ${yearInput.getAttribute('name')} недопустимое: ${yearInput.value}`);
    }
    
});

function addWarningText(field) {
    warning.innerHTML = `Ошибка в поле: ${field}`;
    warning.style.opacity = '1';
}

function hideWarningText() {    
    warning.style.opacity = '0';
}

