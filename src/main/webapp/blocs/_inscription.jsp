<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>INSCRIPTION</h2>
    <table>
        <tr>
            <td>
                <label>Login</label>  
            </td>
            <td>
                <input type="text" name="login"/> 
            </td>
        </tr>
        <tr>
            <td>
                <label>Mot de passe</label>  
            </td>
            <td>
                <input type="password" name="mdpinsc"/> 
            </td>
        </tr>
        <tr>
            <td>
                <label>Confirmation</label>  
            </td>
            <td>
                <input type="password" name="mdpinsc2"/> 
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" onclick="inscription()" value="Valider"/>
            </td>
            
        </tr>
        <tr>
            ${mdpdifferent}
            ${loginExistant}
            
        </tr>
    </table>
