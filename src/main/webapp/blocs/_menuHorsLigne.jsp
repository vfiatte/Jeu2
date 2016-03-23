<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="menu">


    <table>
        <tr>
            <td>
                <button onclick="pageInscription()">INSCRIPTION</button>
            </td>
            <td>
                    <label>LOGIN : </label>
                    <input type="text" name="login"/>
                    <label>Mot de Passse : </label>
                    <input type="password" name="mdp"/>
                    <input type="button" onclick="login()" value="Connexion"/>
            </td>
        </tr>
    </table>

</div>