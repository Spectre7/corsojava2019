var enemies = [];
var t=0;
var l=0;

function move(){
	var el = document.getElementById("d");
	
	el.style.left = 0 + 'px';
	el.style.top = t + 'px';
	
	t++;
}

function start(){
	alert("start");
	
	window.setInterval(move, 50);
}

function sposta(env){
	if(env.keyCode==37){
		if(l==0){
			return;
		}
		l-=5;
		var spostamento = l + 'px';
		document.getElementById("astro").style.left=spostamento;
	}
	
	if(env.keyCode==39){
		if(l>1000){
			return;
		}
		l+=5;
		var spostamento = l + 'px';
		document.getElementById("astro").style.left=spostamento;
	}
}

function createEnemy(){
	var e = document.createElement("div");
	e.setAttribute("class", "enemy");
	document.body.appendChild(e);
}