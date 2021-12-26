let btn = document.getElementById('btn');
let output = document.getElementById('outputtext');
let number = [Math.floor(Math.random() * 100)]

btn.addEventListener('click', function()){
	let input = document.getElementById('userInput').value;
	if (input == number){
		output.innerHTML = "You guessed the correct number!"
	}
	else if(input < number){
		output.innerHTML = "You guessed too low, try again!"
	};
	if(input > number){
		output.innerHTML = "You guessed too high, try again!"
	}
}