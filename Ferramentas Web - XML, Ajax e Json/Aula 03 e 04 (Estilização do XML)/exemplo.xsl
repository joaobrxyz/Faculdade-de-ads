<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!-- Mapeamento -->
<?xml-stylesheet type="text/xsl" href="exer_fixcao_xsl"?>
    <!-- trecho de código faltante -->
    <xsl:template match="/">
        Artigo: <xsl:value-of select="/Artigo/Titulo"/> <br/>
        Autores:
        <xsl:for-each select="/Artigo/Autores/Autor">
        <br/> - <xsl:value-of select="." />
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>