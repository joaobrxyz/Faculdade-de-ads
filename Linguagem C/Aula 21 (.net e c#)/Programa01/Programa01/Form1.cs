namespace Programa01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btMostrar_Click(object sender, EventArgs e)
        {
            // Declarar (criar) uma variável do tipo texto
            string nome;
            // Atribuir um valor a variável
            nome = txtNome.Text;

            // Exibir uma mensagem
            MessageBox.Show("Bom dia, " + nome + ". Sextooou!!!", "Atenção");
        }
    }
}
