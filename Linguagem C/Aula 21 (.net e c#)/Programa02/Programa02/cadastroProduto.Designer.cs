namespace Programa02
{
    partial class cadastroProduto
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(cadastroProduto));
            label1 = new Label();
            label2 = new Label();
            txtCodigo = new TextBox();
            txtDescricao = new TextBox();
            txtNome = new TextBox();
            label3 = new Label();
            label4 = new Label();
            cboUnidade = new ComboBox();
            txtPreco = new TextBox();
            label5 = new Label();
            label6 = new Label();
            numEstoque = new NumericUpDown();
            btNovo = new Button();
            btSalvar = new Button();
            btExcluir = new Button();
            btConsultar = new Button();
            btAlterar = new Button();
            ((System.ComponentModel.ISupportInitialize)numEstoque).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(118, 127);
            label1.Name = "label1";
            label1.Size = new Size(61, 20);
            label1.TabIndex = 0;
            label1.Text = "Código:";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(118, 189);
            label2.Name = "label2";
            label2.Size = new Size(77, 20);
            label2.TabIndex = 1;
            label2.Text = "Descrição:";
            // 
            // txtCodigo
            // 
            txtCodigo.Location = new Point(202, 123);
            txtCodigo.Margin = new Padding(3, 4, 3, 4);
            txtCodigo.Name = "txtCodigo";
            txtCodigo.Size = new Size(78, 27);
            txtCodigo.TabIndex = 2;
            // 
            // txtDescricao
            // 
            txtDescricao.Location = new Point(202, 185);
            txtDescricao.Margin = new Padding(3, 4, 3, 4);
            txtDescricao.Multiline = true;
            txtDescricao.Name = "txtDescricao";
            txtDescricao.ScrollBars = ScrollBars.Vertical;
            txtDescricao.Size = new Size(559, 107);
            txtDescricao.TabIndex = 3;
            // 
            // txtNome
            // 
            txtNome.Location = new Point(401, 123);
            txtNome.Margin = new Padding(3, 4, 3, 4);
            txtNome.MaxLength = 100;
            txtNome.Name = "txtNome";
            txtNome.Size = new Size(361, 27);
            txtNome.TabIndex = 5;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(323, 127);
            label3.Name = "label3";
            label3.Size = new Size(53, 20);
            label3.TabIndex = 4;
            label3.Text = "Nome:";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(118, 328);
            label4.Name = "label4";
            label4.Size = new Size(68, 20);
            label4.TabIndex = 6;
            label4.Text = "Unidade:";
            // 
            // cboUnidade
            // 
            cboUnidade.DropDownStyle = ComboBoxStyle.DropDownList;
            cboUnidade.FormattingEnabled = true;
            cboUnidade.Items.AddRange(new object[] { "--", "KG", "UN", "LITRO" });
            cboUnidade.Location = new Point(202, 324);
            cboUnidade.Margin = new Padding(3, 4, 3, 4);
            cboUnidade.Name = "cboUnidade";
            cboUnidade.Size = new Size(78, 28);
            cboUnidade.TabIndex = 7;
            // 
            // txtPreco
            // 
            txtPreco.Location = new Point(391, 324);
            txtPreco.Margin = new Padding(3, 4, 3, 4);
            txtPreco.Name = "txtPreco";
            txtPreco.Size = new Size(114, 27);
            txtPreco.TabIndex = 9;
            txtPreco.TextAlign = HorizontalAlignment.Right;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(323, 328);
            label5.Name = "label5";
            label5.Size = new Size(49, 20);
            label5.TabIndex = 8;
            label5.Text = "Preço:";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(546, 393);
            label6.Name = "label6";
            label6.Size = new Size(65, 20);
            label6.TabIndex = 10;
            label6.Text = "Estoque:";
            // 
            // numEstoque
            // 
            numEstoque.Location = new Point(625, 391);
            numEstoque.Margin = new Padding(3, 4, 3, 4);
            numEstoque.Maximum = new decimal(new int[] { 10000, 0, 0, 0 });
            numEstoque.Name = "numEstoque";
            numEstoque.Size = new Size(137, 27);
            numEstoque.TabIndex = 11;
            // 
            // btNovo
            // 
            btNovo.Image = Properties.Resources.imgNovo;
            btNovo.ImageAlign = ContentAlignment.TopCenter;
            btNovo.Location = new Point(118, 445);
            btNovo.Margin = new Padding(3, 4, 3, 4);
            btNovo.Name = "btNovo";
            btNovo.Size = new Size(130, 73);
            btNovo.TabIndex = 12;
            btNovo.Text = "Novo produto";
            btNovo.TextAlign = ContentAlignment.BottomCenter;
            btNovo.UseVisualStyleBackColor = true;
            btNovo.Click += btNovo_Click;
            // 
            // btSalvar
            // 
            btSalvar.Enabled = false;
            btSalvar.Image = (Image)resources.GetObject("btSalvar.Image");
            btSalvar.ImageAlign = ContentAlignment.TopCenter;
            btSalvar.Location = new Point(289, 445);
            btSalvar.Margin = new Padding(3, 4, 3, 4);
            btSalvar.Name = "btSalvar";
            btSalvar.Size = new Size(130, 73);
            btSalvar.TabIndex = 13;
            btSalvar.Text = "Salvar";
            btSalvar.TextAlign = ContentAlignment.BottomCenter;
            btSalvar.UseVisualStyleBackColor = true;
            btSalvar.Click += btSalvar_Click;
            // 
            // btExcluir
            // 
            btExcluir.Enabled = false;
            btExcluir.Image = (Image)resources.GetObject("btExcluir.Image");
            btExcluir.ImageAlign = ContentAlignment.TopCenter;
            btExcluir.Location = new Point(459, 445);
            btExcluir.Margin = new Padding(3, 4, 3, 4);
            btExcluir.Name = "btExcluir";
            btExcluir.Size = new Size(130, 73);
            btExcluir.TabIndex = 14;
            btExcluir.Text = "Excluír";
            btExcluir.TextAlign = ContentAlignment.BottomCenter;
            btExcluir.UseVisualStyleBackColor = true;
            btExcluir.Click += btExcluir_Click;
            // 
            // btConsultar
            // 
            btConsultar.ImageAlign = ContentAlignment.TopCenter;
            btConsultar.Location = new Point(118, 380);
            btConsultar.Margin = new Padding(3, 4, 3, 4);
            btConsultar.Name = "btConsultar";
            btConsultar.Size = new Size(130, 46);
            btConsultar.TabIndex = 15;
            btConsultar.Text = "Consultar";
            btConsultar.UseVisualStyleBackColor = true;
            btConsultar.Click += btConsultar_Click;
            // 
            // btAlterar
            // 
            btAlterar.Enabled = false;
            btAlterar.ImageAlign = ContentAlignment.TopCenter;
            btAlterar.Location = new Point(289, 380);
            btAlterar.Margin = new Padding(3, 4, 3, 4);
            btAlterar.Name = "btAlterar";
            btAlterar.Size = new Size(130, 46);
            btAlterar.TabIndex = 17;
            btAlterar.Text = "Alterar";
            btAlterar.UseVisualStyleBackColor = true;
            btAlterar.Click += btAlterar_Click;
            // 
            // cadastroProduto
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(805, 600);
            Controls.Add(btAlterar);
            Controls.Add(btConsultar);
            Controls.Add(btExcluir);
            Controls.Add(btSalvar);
            Controls.Add(btNovo);
            Controls.Add(numEstoque);
            Controls.Add(label6);
            Controls.Add(txtPreco);
            Controls.Add(label5);
            Controls.Add(cboUnidade);
            Controls.Add(label4);
            Controls.Add(txtNome);
            Controls.Add(label3);
            Controls.Add(txtDescricao);
            Controls.Add(txtCodigo);
            Controls.Add(label2);
            Controls.Add(label1);
            Margin = new Padding(3, 4, 3, 4);
            Name = "cadastroProduto";
            Text = "cadastroProduto";
            ((System.ComponentModel.ISupportInitialize)numEstoque).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private TextBox txtCodigo;
        private TextBox txtDescricao;
        private TextBox txtNome;
        private Label label3;
        private Label label4;
        private ComboBox cboUnidade;
        private TextBox txtPreco;
        private Label label5;
        private Label label6;
        private NumericUpDown numEstoque;
        private Button btNovo;
        private Button btSalvar;
        private Button btExcluir;
        private Button btConsultar;
        private Button btAlterar;
    }
}