namespace Programa02
{
    partial class calculadora
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
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            txtNum1 = new TextBox();
            txtNum2 = new TextBox();
            txtRes = new TextBox();
            btSomar = new Button();
            btSubtrair = new Button();
            btMultiplicar = new Button();
            btDividir = new Button();
            btLimpar = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Consolas", 14.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(308, 69);
            label1.Name = "label1";
            label1.Size = new Size(120, 22);
            label1.TabIndex = 0;
            label1.Text = "Calculadora";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(12, 136);
            label2.Name = "label2";
            label2.Size = new Size(180, 22);
            label2.TabIndex = 1;
            label2.Text = "Digite um número:";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(12, 190);
            label3.Name = "label3";
            label3.Size = new Size(220, 22);
            label3.TabIndex = 2;
            label3.Text = "Digite outro número: ";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(12, 238);
            label4.Name = "label4";
            label4.Size = new Size(110, 22);
            label4.TabIndex = 3;
            label4.Text = "Resultado:";
            // 
            // txtNum1
            // 
            txtNum1.Location = new Point(236, 133);
            txtNum1.Name = "txtNum1";
            txtNum1.Size = new Size(100, 30);
            txtNum1.TabIndex = 4;
            // 
            // txtNum2
            // 
            txtNum2.Location = new Point(236, 187);
            txtNum2.Name = "txtNum2";
            txtNum2.Size = new Size(100, 30);
            txtNum2.TabIndex = 5;
            // 
            // txtRes
            // 
            txtRes.BackColor = SystemColors.ScrollBar;
            txtRes.Enabled = false;
            txtRes.Location = new Point(236, 234);
            txtRes.Name = "txtRes";
            txtRes.Size = new Size(100, 30);
            txtRes.TabIndex = 6;
            // 
            // btSomar
            // 
            btSomar.Font = new Font("Consolas", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btSomar.Location = new Point(399, 130);
            btSomar.Name = "btSomar";
            btSomar.Size = new Size(50, 50);
            btSomar.TabIndex = 7;
            btSomar.Text = "+";
            btSomar.UseVisualStyleBackColor = true;
            btSomar.Click += btSomar_Click;
            // 
            // btSubtrair
            // 
            btSubtrair.Font = new Font("Consolas", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btSubtrair.Location = new Point(399, 201);
            btSubtrair.Name = "btSubtrair";
            btSubtrair.Size = new Size(50, 50);
            btSubtrair.TabIndex = 12;
            btSubtrair.Text = "-";
            btSubtrair.UseVisualStyleBackColor = true;
            btSubtrair.Click += btSubtrair_Click;
            // 
            // btMultiplicar
            // 
            btMultiplicar.Font = new Font("Consolas", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btMultiplicar.Location = new Point(479, 130);
            btMultiplicar.Name = "btMultiplicar";
            btMultiplicar.Size = new Size(50, 50);
            btMultiplicar.TabIndex = 13;
            btMultiplicar.Text = "x";
            btMultiplicar.UseVisualStyleBackColor = true;
            btMultiplicar.Click += btMultiplicar_Click;
            // 
            // btDividir
            // 
            btDividir.Font = new Font("Consolas", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btDividir.Location = new Point(479, 201);
            btDividir.Name = "btDividir";
            btDividir.Size = new Size(50, 50);
            btDividir.TabIndex = 14;
            btDividir.Text = "÷";
            btDividir.UseVisualStyleBackColor = true;
            btDividir.Click += btDividir_Click;
            // 
            // btLimpar
            // 
            btLimpar.Font = new Font("Consolas", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btLimpar.Location = new Point(567, 162);
            btLimpar.Name = "btLimpar";
            btLimpar.Size = new Size(121, 50);
            btLimpar.TabIndex = 15;
            btLimpar.Text = "Limpar";
            btLimpar.UseVisualStyleBackColor = true;
            btLimpar.Click += btLimpar_Click;
            // 
            // calculadora
            // 
            AutoScaleDimensions = new SizeF(10F, 22F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(721, 360);
            Controls.Add(btLimpar);
            Controls.Add(btDividir);
            Controls.Add(btMultiplicar);
            Controls.Add(btSubtrair);
            Controls.Add(btSomar);
            Controls.Add(txtRes);
            Controls.Add(txtNum2);
            Controls.Add(txtNum1);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Font = new Font("Consolas", 14.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(4);
            Name = "calculadora";
            Text = "Calculadora";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private TextBox txtNum1;
        private TextBox txtNum2;
        private TextBox txtRes;
        private Button btSomar;
        private Button btSubtrair;
        private Button btMultiplicar;
        private Button btDividir;
        private Button btLimpar;
    }
}