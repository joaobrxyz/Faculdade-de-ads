using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;

namespace Programa02
{
    public partial class calculadora : Form
    {
        public calculadora()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btSomar_Click(object sender, EventArgs e)
        {
            // Criar variáveis
            float num1, num2, res = 0;

            // Atribuir valores digitados para as variáveis
            if (float.TryParse(txtNum1.Text, out num1) && float.TryParse(txtNum2.Text, out num2))
            {
                // Calculo somar
                res = num1 + num2;

                // Exibir o resultado na tela
                txtRes.Text = res.ToString();
            }
            else
            {
                MessageBox.Show("Você digitou um valor inválido, digite apenas números!", "Atenção");
                txtNum1.Text = "";
                txtNum2.Text = "";
                txtRes.Text = "";
            }
        }

        private void btMultiplicar_Click(object sender, EventArgs e)
        {
            // Criar variáveis
            float num1, num2, res = 0;

            // Atribuir valores digitados para as variáveis
            if (float.TryParse(txtNum1.Text, out num1) && float.TryParse(txtNum2.Text, out num2))
            {
                // Calculo multiplicar
                res = num1 * num2;

                // Exibir o resultado na tela
                txtRes.Text = res.ToString();
            }
            else
            {
                MessageBox.Show("Você digitou um valor inválido, digite apenas números!", "Atenção");
                txtNum1.Text = "";
                txtNum2.Text = "";
                txtRes.Text = "";
            }
        }

        private void btSubtrair_Click(object sender, EventArgs e)
        {
            // Criar variáveis
            float num1, num2, res = 0;

            // Atribuir valores digitados para as variáveis
            if (float.TryParse(txtNum1.Text, out num1) && float.TryParse(txtNum2.Text, out num2))
            {
                // Calculo subtrair
                res = num1 - num2;

                // Exibir o resultado na tela
                txtRes.Text = res.ToString();
            }
            else
            {
                MessageBox.Show("Você digitou um valor inválido, digite apenas números!", "Atenção");
                txtNum1.Text = "";
                txtNum2.Text = "";
                txtRes.Text = "";
            }
        }

        private void btDividir_Click(object sender, EventArgs e)
        {
            // Criar variáveis
            float num1, num2, res = 0;

            // Atribuir valores digitados para as variáveis
            if (float.TryParse(txtNum1.Text, out num1) && float.TryParse(txtNum2.Text, out num2))
            {
                // Calculo dividir
                res = num1 / num2;

                // Exibir o resultado na tela
                txtRes.Text = res.ToString();
            }
            else
            {
                MessageBox.Show("Você digitou um valor inválido, digite apenas números!", "Atenção");
                txtNum1.Text = "";
                txtNum2.Text = "";
                txtRes.Text = "";
            }
        }

        private void btLimpar_Click(object sender, EventArgs e)
        {
            txtNum1.Text = "";
            txtNum2.Text = "";
            txtRes.Text = "";
        }
    }
}
