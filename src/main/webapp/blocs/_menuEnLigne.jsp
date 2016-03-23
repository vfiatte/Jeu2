<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table>
    <tr>
        <td>
            <form method="get" action="nouvellepartieservlet">
                NOUVELLE PARTIE 
            </form>
        </td>
        <td>
            <form method="get" action="listepartiesservlet">
                PARTIES EN COURS
            </form>
        </td>

        <td>
            <table>
                <tr>
                    ${sessionScope.login}
                </tr>
                <tr>
                <form method="get" action="">
                    <button type="submit">Deconnexion</button>
                </form>
    </tr>
</table>
</td>
</tr>
</table>
