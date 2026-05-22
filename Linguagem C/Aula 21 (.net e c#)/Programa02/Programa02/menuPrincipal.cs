namespace Programa02
{
    public partial class menuPrincipal : Form
    {
        public menuPrincipal()
        {
            InitializeComponent();
        }

        private void novoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cadastroProduto telaCad = new cadastroProduto();
            telaCad.ShowDialog();
        }

        private void mnuCadSair_Click(object sender, EventArgs e)
        {
            // Sair do programa
            Application.Exit();
        }

        private void mnuFerCalc_Click(object sender, EventArgs e)
        {
            // Criar um objeto para carregar a outra janela gráfica
            calculadora telaCalc = new calculadora();
            telaCalc.ShowDialog();
        }
    }
}
