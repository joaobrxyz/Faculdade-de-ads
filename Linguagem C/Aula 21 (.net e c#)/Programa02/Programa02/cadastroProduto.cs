using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Programa02
{
    public partial class cadastroProduto : Form
    {
        public MySqlConnection conexao; // Variável global para a conexão com o banco de dados
        public cadastroProduto()
        {
            InitializeComponent();
        }

        // Método para limpar os campos do formulário
        public void LimparCampos()
        {
            txtCodigo.Clear();
            txtDescricao.Clear();
            txtNome.Clear();
            txtPreco.Clear();
            cboUnidade.Text = "--";
            numEstoque.Text = "";
        }

        public void ConsultarCodigo(int codigo)
        {
            try
            {
                // Obter a instância da conexão com o banco de dados
                conexao = Banco.Conexao.getConexao();
                // Abrir a conexão
                conexao.Open();

                // Cria o objeto para executar o comando SQL
                MySqlCommand comando = new MySqlCommand();
                comando.Connection = conexao;

                // Define o comando SQL para consultar um produto pelo código
                comando.CommandText = "SELECT * FROM produtos WHERE codigo = @codigo";
                comando.Parameters.AddWithValue("@codigo", codigo);

                // Preparar e executar o comando SQL
                comando.Prepare();
                MySqlDataReader dados = comando.ExecuteReader();

                // Se o produto for encontrado, devolve como true
                if (dados.Read())
                {
                    // Preencher os campos do formulário com os dados do produto encontrado
                    txtNome.Text = dados["nome"].ToString();
                    txtDescricao.Text = dados["descricao"].ToString();
                    txtPreco.Text = dados["preco"].ToString();
                    cboUnidade.Text = dados["unidade"].ToString();
                    numEstoque.Value = Convert.ToInt32(dados["quantidade_estoque"]);

                    // Habilitar os botões de excluir e alterar
                    btExcluir.Enabled = true;
                    btAlterar.Enabled = true;
                }
                else
                {
                    // Se o produto não for encontrado, exibir uma mensagem de erro
                    MessageBox.Show("Produto não encontrado.");
                    LimparCampos();
                    txtCodigo.Focus();
                }
            }
            catch (Exception ex)
            {
                // Exibir uma mensagem de erro caso ocorra uma exceção
                MessageBox.Show("Erro ao consultar o produto: " + ex.Message);
                LimparCampos();
                txtCodigo.Focus();
            }
            finally
            {
                conexao.Close();
            }
        }

        private void btConsultar_Click(object sender, EventArgs e)
        {
            // Verificar se o campo de código do produto está vazio antes de tentar consultar
            if (string.IsNullOrEmpty(txtCodigo.Text))
            {
                MessageBox.Show("Por favor, insira o código do produto para consulta.");
                txtCodigo.Focus();
            }
            else
            {
                try
                {
                    // Converter o código do produto para um número inteiro
                    int codigo = Convert.ToInt16(txtCodigo.Text);

                    // Chamar o método para consultar o produto no banco de dados
                    ConsultarCodigo(codigo);

                    // Obter a instância da conexão com o banco de dados
                    conexao = Banco.Conexao.getConexao();
                    // Abrir a conexão
                    conexao.Open();

                    // Cria o objeto para executar o comando SQL
                    MySqlCommand comando = new MySqlCommand();
                    comando.Connection = conexao;

                    // Define o comando SQL para consultar um produto pelo código
                    comando.CommandText = "SELECT * FROM produtos WHERE id = @codigo";
                    comando.Parameters.AddWithValue("@codigo", txtCodigo.Text);


                }
                catch (Exception ex)
                {
                    // Exibir uma mensagem de erro caso ocorra uma exceção
                    MessageBox.Show("Erro ao consultar o produto: " + ex.Message);
                    LimparCampos();
                    txtCodigo.Focus();
                }
                finally
                {
                    // Garantir que a conexão seja fechada mesmo em caso de erro
                    if (conexao != null && conexao.State == ConnectionState.Open)
                    {
                        conexao.Close();
                    }
                }
            }

        }

        private void btNovo_Click(object sender, EventArgs e)
        {
            // Verificar o estado do botão "Novo produto" para alternar entre os modos de cadastro e cancelamento
            if (btNovo.Text == "Novo produto")
            {
                btSalvar.Enabled = true;
                btNovo.Text = "Cancelar";
                txtCodigo.Enabled = false;
                btConsultar.Enabled = false;
                btExcluir.Enabled = false;
                btAlterar.Enabled = false;
                LimparCampos();
            }
            else
            {
                btSalvar.Enabled = false;
                btNovo.Text = "Novo produto";
                txtCodigo.Enabled = true;
                btConsultar.Enabled = true;
                LimparCampos();
            }
        }

        private void btSalvar_Click(object sender, EventArgs e)
        {
            try
            {
                // Obter a instância da conexão com o banco de dados
                conexao = Banco.Conexao.getConexao();
                // Abrir a conexão
                conexao.Open();

                // Cria o objeto para executar o comando SQL
                MySqlCommand comando = new MySqlCommand();
                comando.Connection = conexao;

                // Define o comando SQL para inserir um novo produto
                comando.CommandText = "INSERT INTO produtos (nome, descricao, unidade, preco, quantidade_estoque)" +
                    " VALUES (@nome, @descricao, @unidade, @preco, @estoque)";

                // Adicionar os parâmetros ao comando
                comando.Parameters.AddWithValue("@nome", txtNome.Text);
                comando.Parameters.AddWithValue("@descricao", txtDescricao.Text);
                comando.Parameters.AddWithValue("@unidade", cboUnidade.Text);
                comando.Parameters.AddWithValue("@preco", decimal.Parse(txtPreco.Text));
                comando.Parameters.AddWithValue("@estoque", numEstoque.Value);

                // Preparar e executar o comando SQL
                comando.Prepare();
                comando.ExecuteNonQuery();

                // Fechar a conexão
                conexao.Close();

                // Limpar os campos do formulário e exibir uma mensagem de sucesso
                LimparCampos();
                MessageBox.Show("Produto cadastrado com sucesso!");
            }
            catch (Exception ex)
            {
                // Exibir uma mensagem de erro caso ocorra uma exceção
                MessageBox.Show("Erro ao cadastrar o produto: " + ex.Message);
            }
            finally
            {
                // Garantir que a conexão seja fechada mesmo em caso de erro
                if (conexao != null && conexao.State == ConnectionState.Open)
                {
                    conexao.Close();
                }
            }
        }

        private void btAlterar_Click(object sender, EventArgs e)
        {
            try
            {
                // Coleta de dados do formulário e conversão para os tipos adequados
                int codigo = Convert.ToInt16(txtCodigo.Text);
                string nome = txtNome.Text;
                string descricao = txtDescricao.Text;
                string unidade = cboUnidade.Text;
                decimal preco = decimal.Parse(txtPreco.Text);
                int estoque = Convert.ToInt32(numEstoque.Value);

                // Obter a instância da conexão com o banco de dados
                conexao = Banco.Conexao.getConexao();
                // Abrir a conexão
                conexao.Open();

                // Cria o objeto para executar o comando SQL
                MySqlCommand comando = new MySqlCommand();
                comando.Connection = conexao;

                // Define o comando SQL para atualizar um produto existente
                comando.CommandText = "UPDATE produtos SET nome = @nome, descricao = @descricao, unidade = @unidade, preco = @preco, quantidade_estoque = @estoque WHERE codigo = @codigo";

                // Adicionar os parâmetros ao comando
                comando.Parameters.AddWithValue("@nome", nome);
                comando.Parameters.AddWithValue("@descricao", descricao);
                comando.Parameters.AddWithValue("@unidade", unidade);
                comando.Parameters.AddWithValue("@preco", preco);
                comando.Parameters.AddWithValue("@estoque", estoque);
                comando.Parameters.AddWithValue("@codigo", codigo);

                // Preparar e executar o comando SQL
                comando.Prepare();
                comando.ExecuteNonQuery();

                MessageBox.Show("Produto atualizado com sucesso!");
            }
            catch (Exception ex)
            {
                // Exibir uma mensagem de erro caso ocorra uma exceção
                MessageBox.Show("Erro ao atualizar o produto: " + ex.Message);
            }
            finally
            {
                conexao.Close();
            }
        }

        private void btExcluir_Click(object sender, EventArgs e)
        {
            // Verificar se o campo de código do produto está vazio antes de tentar excluir
            if (string.IsNullOrEmpty(txtCodigo.Text))
            {
                MessageBox.Show("Por favor, insira o código do produto para excluir.");
                txtCodigo.Focus();
            } 
            else
            {
                try
                {
                    // Obter a instância da conexão com o banco de dados
                    conexao = Banco.Conexao.getConexao();
                    // Abrir a conexão
                    conexao.Open();

                    // Cria o objeto para executar o comando SQL
                    MySqlCommand comando = new MySqlCommand();
                    comando.Connection = conexao;

                    // Define o comando SQL para excluir um produto pelo código
                    comando.CommandText = "DELETE FROM produtos WHERE codigo = @codigo";
                    comando.Parameters.AddWithValue("@codigo", Convert.ToInt16(txtCodigo.Text));

                    // Preparar e executar o comando SQL
                    comando.Prepare();
                    comando.ExecuteNonQuery();

                    // Limpar os campos do formulário e exibir uma mensagem de sucesso
                    LimparCampos();
                    MessageBox.Show("Produto excluído com sucesso!");
                }
                catch (Exception ex)
                {
                    // Exibir uma mensagem de erro caso ocorra uma exceção
                    MessageBox.Show("Erro ao excluir o produto: " + ex.Message);
                }
                finally
                {

                    conexao.Close();
                }
            }
        }
    }
}
