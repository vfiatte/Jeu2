<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table>
    <tr>
        <td>
            <button type="submit">Nouvelle partie</button>
        </td>
        <td>
            <button type="submit">Parties en cours</button>
        </td>

        <td>
            <table>
                <tr>
                    ${sessionScope.user}
                </tr>
                <tr>
                <button onclick="logout()">Deconnexion</button>
    </tr>
</table>
</td>
</tr>
</table>
