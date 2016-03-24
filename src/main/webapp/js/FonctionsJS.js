function init() {
    $('.menu').load('blocs/_menuHorsLigne.jsp');
    $('.contenu').load('blocs/_contenuAcceuil.jsp');
}

function pageInscription() {
    $('.contenu').load('blocs/_inscription.jsp');
}

function inscription() {
    $('.contenu').load("inscriptionservlet",
            {
                login: $('[name=login]').val(),
                mdpinsc: $('[name=mdpinsc]').val(),
                mdpinsc2: $('[name=mdpinsc2]').val()
            });
}

function login() {
    $('.menu').load("loginservlet",
            {
                loginco: $('[name=loginco]').val(),
                mdp: $('[name=mdp]').val()

            });
}

function logout() {
    $('.menu').load("logoutservlet");
}

