$(document).ready(function(){
    //$('p').fadeOut({duration:400});

    $('p').addClass('cl1');


    $('p').dblclick(function(env){
        alert("paragrafo clicked " + this.innerHTML);
    });

    //$('li').css('background-color','red');

    $( ".p" ).filter( "p" ).css( "background-color", "red" );
});

