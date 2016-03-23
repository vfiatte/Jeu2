function init(){
    $('.menu').load('blocs/_menuHorsLigne.jsp');
    $('.contenu').load('blocs/_contenuAcceuil.jsp');
}

function pageInscription(){
    $('.contenu').load('blocs/_inscription.jsp');
}

function inscription(){
    $('.contenu').load("inscriptionservlet", 
        {
            login: $('[name=login]').val(), 
            mdpinsc: $('[name=mdpinsc]').val(),
            mdpinsc2: $('[name=mdpinsc2]').val() 
        });
}

function login(){
    $('.menu').load("loginservlet", 
        {
            login: $('[name=login]').val(), 
            mdp: $('[name=mdp]').val()
            
        });
}

