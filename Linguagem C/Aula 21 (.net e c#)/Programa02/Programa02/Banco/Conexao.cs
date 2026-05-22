using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programa02.Banco
{
    internal class Conexao
    {
        public static MySqlConnection getConexao()
        {
            // Iniciar um bloco try/catch para tratar erros de conexão
            try
            {
                // Definir os parâmetros de conexão
                MySqlConnection con = new MySqlConnection("datasource=localhost; port=3306; database=cad20261m; username=root; password='';");
                // Retorna o objeto de conexão criada
                return con;
            }
            // Captura qualquer erro que ocorrer dentro do bloco try 
            catch (Exception ex)
            {
                // Em caso de erro, retorna null
                return null;
            }
        }
    }
}
