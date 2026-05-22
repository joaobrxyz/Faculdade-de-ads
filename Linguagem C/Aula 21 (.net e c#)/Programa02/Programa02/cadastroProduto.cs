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

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void cadastroProduto_Load(object sender, EventArgs e)
        {

        }

        private void btConsultar_Click(object sender, EventArgs e)
        {

        }

        private void btNovo_Click(object sender, EventArgs e)
        {
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
    }
}
