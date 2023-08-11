/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

document.addEventListener("DOMContentLoaded", function () {
    const seeMoreButtons = document.querySelectorAll(".see-more-btn");
  
    seeMoreButtons.forEach((button) => {
      button.addEventListener("click", function () {
        const card = button.closest(".card");
        const hiddenContent = card.querySelector(".hidden-content");
  
        hiddenContent.style.display = "block";
        card.style.height = "auto"; /* Allow the card to expand */
        button.style.display = "none"; /* Hide the "See More" button */
      });
    });
  });
  
