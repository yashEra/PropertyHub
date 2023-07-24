const registrationForm = document.getElementById('registrationForm');
const roleSelect = document.getElementById('role');

const buyerFields = document.getElementById('buyerFields');
const sellerFields = document.getElementById('sellerFields');
const sellerFields2 = document.getElementById('sellerFields2');
const sellerFields3 = document.getElementById('sellerFields3');
const sellerFields4 = document.getElementById('sellerFields4');
const sellerFields5 = document.getElementById('sellerFields5');

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
  const selectedRole = roleSelect.value;

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

registrationForm.addEventListener('submit', function(event) {
  event.preventDefault();

  const formData = new FormData(registrationForm);

  for (let [key, value] of formData.entries()) {
    console.log(`${key}: ${value}`);
  }
});
