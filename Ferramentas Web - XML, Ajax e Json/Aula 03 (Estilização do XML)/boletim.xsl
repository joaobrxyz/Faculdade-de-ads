<?xml version="1.0" encoding="UTF-8"?>
<!-- Estilo do arquivo (a componente xslt)-->
<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 <!-- Mapear com o arquivo boletim.xml -->
 <?xml-stylesheet type='text/xsl' href='boletim'?>
 <!-- Conteúdo para fazer a transformação -->
 <xsl:template match = "notas">
 <html> 
 <head> 
    <title>Notas de Alunos</title>
 </head>
 <body bgcolor="#ffffff">
    <table border="1" cellpadding="5">
        <tr>
            <td>Nome</td>            
            <td>Português</td>
            <td>Matemática</td>
            <td>Ciências</td>
        </tr>
        <!-- Uma estrutura de repetição: for-each -->
        <xsl:for-each select="aluno">
        <tr>
            <td><xsl:value-of select="nome"/></td>
            <td><xsl:value-of select="portugues"/></td>
            <td><xsl:value-of select="matematica"/></td>
            <td><xsl:value-of select="ciencias"/></td>
        </tr>
        </xsl:for-each>
    </table>
 </body>
 </html>
 </xsl:template>
</xsl:stylesheet>
