const tableRows = document.querySelectorAll('.table tr');

for(let row of tableRows) {
    if(row.getAttribute('data-id') != null) {
        row.addEventListener('click', function() {
            window.location.href = '/vehicle/info/' + this.getAttribute('data-id');
        });
    }
}