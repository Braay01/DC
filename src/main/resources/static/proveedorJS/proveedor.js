$(document).ready(function () {
    $('#example').DataTable({
		dom: 'Bfrtilp',
		buttons: [
			{
				extend: 'excelHtml5',
				text: '<i class="fa-solid fa-file-excel"></i>',
				titleAttr: 'Exportar a Excel',
				className: 'btn btn-success'
			},
			{
				extend: 'pdfHtml5',
				text: '<i class="fa-solid fa-file-pdf"></i>',
				titleAttr: 'Exportar a PDF',
				className: 'btn btn-danger'
			}
		]
	});
});


function eliminar(){

	var idProveedor = document.getElementById("txt_id").value;
	location.href="/admin/proveedor/eliminar/" + idProveedor;
	
}

function confirmar(idProveedor){
	document.getElementById("txt_id").value=idProveedor;

}