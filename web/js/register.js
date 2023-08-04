var registrationForm = document.getElementById('registrationForm');
var roleSelect = document.getElementById('role');

var buyerFields = document.getElementById('buyerFields');
var sellerFields = document.getElementById('sellerFields');
var sellerFields2 = document.getElementById('sellerFields2');
var sellerFields3 = document.getElementById('sellerFields3');
var sellerFields4 = document.getElementById('sellerFields4');
var sellerFields5 = document.getElementById('sellerFields5');

//  show buyer fields and hide seller fields
function showBuyerFields() {
  buyerFields.classList.remove('hidden');
  sellerFields.classList.add('hidden');
  sellerFields2.classList.add('hidden');
  sellerFields3.classList.add('hidden');
  sellerFields4.classList.add('hidden');
  sellerFields5.classList.add('hidden');
}

// show seller fields and hide buyer fields
function showSellerFields() {
  buyerFields.classList.add('hidden');
  sellerFields.classList.remove('hidden');
  sellerFields2.classList.remove('hidden');
  sellerFields3.classList.remove('hidden');
  sellerFields4.classList.remove('hidden');
  sellerFields5.classList.remove('hidden');
}

roleSelect.addEventListener('change', function() {
  var selectedRole = roleSelect.value;

  if (selectedRole === 'buyer') {
    showBuyerFields();
  } else if (selectedRole === 'seller') {
    showSellerFields();
  }
});

if (roleSelect.value === 'buyer') {
  showBuyerFields();
} else if (roleSelect.value === 'seller') {
  showSellerFields();
}

/*registrationForm.addEventListener('submit', function(event) {
  event.preventDefault();

  var formData = new FormData(registrationForm);

  for (var [key, value] of formData.entries()) {
    console.log(`${key}: ${value}`);
  }
});*/
