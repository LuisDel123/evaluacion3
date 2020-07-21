function eliminarCategoria(id){
swal({
  title: "Estas seguro de Eliminar?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminarCategoria/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((ok)=>{
    	if(ok){
    		location.href="/listarCategoria";
    	}
    });
  } else {
    swal("Your imaginary file is safe!");
  }
});
}

function eliminarProducto(id){
	swal({
	  title: "Estas seguro de Eliminar?",
	  text: "Once deleted, you will not be able to recover this imaginary file!",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		  $.ajax({
			  url:"/eliminarProducto/"+id,
			  success: function(res){
				  console.log(res);
			  }
		  });
	    swal("Poof! Your imaginary file has been deleted!", {
	      icon: "success",
	    }).then((ok)=>{
	    	if(ok){
	    		location.href="/listarProducto";
	    	}
	    });
	  } else {
	    swal("Your imaginary file is safe!");
	  }
	});
	}