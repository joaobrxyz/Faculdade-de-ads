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
            ((System.ComponentModel.ISupportInitialize)numEstoque).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(103, 95);
            label1.Name = "label1";
            label1.Size = new Size(49, 15);
            label1.TabIndex = 0;
            label1.Text = "Código:";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(103, 142);
            label2.Name = "label2";
            label2.Size = new Size(61, 15);
            label2.TabIndex = 1;
            label2.Text = "Descrição:";
            // 
            // txtCodigo
            // 
            txtCodigo.Enabled = false;
            txtCodigo.Location = new Point(177, 92);
            txtCodigo.Name = "txtCodigo";
            txtCodigo.Size = new Size(69, 23);
            txtCodigo.TabIndex = 2;
            // 
            // txtDescricao
            // 
            txtDescricao.Location = new Point(177, 139);
            txtDescricao.Multiline = true;
            txtDescricao.Name = "txtDescricao";
            txtDescricao.ScrollBars = ScrollBars.Vertical;
            txtDescricao.Size = new Size(490, 81);
            txtDescricao.TabIndex = 3;
            txtDescricao.TextChanged += textBox2_TextChanged;
            // 
            // txtNome
            // 
            txtNome.Location = new Point(351, 92);
            txtNome.MaxLength = 100;
            txtNome.Name = "txtNome";
            txtNome.Size = new Size(316, 23);
            txtNome.TabIndex = 5;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(283, 95);
            label3.Name = "label3";
            label3.Size = new Size(43, 15);
            label3.TabIndex = 4;
            label3.Text = "Nome:";
            label3.Click += label3_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(103, 246);
            label4.Name = "label4";
            label4.Size = new Size(54, 15);
            label4.TabIndex = 6;
            label4.Text = "Unidade:";
            // 
            // cboUnidade
            // 
            cboUnidade.DropDownStyle = ComboBoxStyle.DropDownList;
            cboUnidade.FormattingEnabled = true;
            cboUnidade.Items.AddRange(new object[] { "KG", "UN", "LITRO" });
            cboUnidade.Location = new Point(177, 243);
            cboUnidade.Name = "cboUnidade";
            cboUnidade.Size = new Size(69, 23);
            cboUnidade.TabIndex = 7;
            // 
            // txtPreco
            // 
            txtPreco.Location = new Point(342, 243);
            txtPreco.Name = "txtPreco";
            txtPreco.Size = new Size(100, 23);
            txtPreco.TabIndex = 9;
            txtPreco.TextAlign = HorizontalAlignment.Right;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(283, 246);
            label5.Name = "label5";
            label5.Size = new Size(40, 15);
            label5.TabIndex = 8;
            label5.Text = "Preço:";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(478, 295);
            label6.Name = "label6";
            label6.Size = new Size(52, 15);
            label6.TabIndex = 10;
            label6.Text = "Estoque:";
            // 
            // numEstoque
            // 
            numEstoque.Location = new Point(547, 293);
            numEstoque.Maximum = new decimal(new int[] { 10000, 0, 0, 0 });
            numEstoque.Name = "numEstoque";
            numEstoque.Size = new Size(120, 23);
            numEstoque.TabIndex = 11;
            numEstoque.ValueChanged += numericUpDown1_ValueChanged;
            // 
            // btNovo
            // 
            btNovo.Image = Properties.Resources.imgNovo;
            btNovo.ImageAlign = ContentAlignment.TopCenter;
            btNovo.Location = new Point(103, 334);
            btNovo.Name = "btNovo";
            btNovo.Size = new Size(114, 55);
            btNovo.TabIndex = 12;
            btNovo.Text = "Novo produto";
            btNovo.TextAlign = ContentAlignment.BottomCenter;
            btNovo.UseVisualStyleBackColor = true;
            // 
            // btSalvar
            // 
            btSalvar.Image = (Image)resources.GetObject("btSalvar.Image");
            btSalvar.ImageAlign = ContentAlignment.TopCenter;
            btSalvar.Location = new Point(253, 334);
            btSalvar.Name = "btSalvar";
            btSalvar.Size = new Size(114, 55);
            btSalvar.TabIndex = 13;
            btSalvar.Text = "Salvar";
            btSalvar.TextAlign = ContentAlignment.BottomCenter;
            btSalvar.UseVisualStyleBackColor = true;
            // 
            // btExcluir
            // 
            btExcluir.Image = (Image)resources.GetObject("btExcluir.Image");
            btExcluir.ImageAlign = ContentAlignment.TopCenter;
            btExcluir.Location = new Point(402, 334);
            btExcluir.Name = "btExcluir";
            btExcluir.Size = new Size(114, 55);
            btExcluir.TabIndex = 14;
            btExcluir.Text = "Excluír";
            btExcluir.TextAlign = ContentAlignment.BottomCenter;
            btExcluir.UseVisualStyleBackColor = true;
            // 
            // cadastroProduto
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(704, 450);
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
    }
}