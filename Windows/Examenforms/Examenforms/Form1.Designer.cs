namespace Examenforms
{
    partial class Form1
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
            this.button1 = new System.Windows.Forms.Button();
            this.MandarTXT = new System.Windows.Forms.Button();
            this.Ncantidad = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtPalabra = new System.Windows.Forms.TextBox();
            this.txtImpresion = new System.Windows.Forms.TextBox();
            this.Nrepetidas = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(692, 67);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 0;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // MandarTXT
            // 
            this.MandarTXT.Location = new System.Drawing.Point(659, 283);
            this.MandarTXT.Name = "MandarTXT";
            this.MandarTXT.Size = new System.Drawing.Size(108, 23);
            this.MandarTXT.TabIndex = 1;
            this.MandarTXT.Text = "A txt";
            this.MandarTXT.UseVisualStyleBackColor = true;
            this.MandarTXT.Click += new System.EventHandler(this.MandarTXT_Click);
            // 
            // Ncantidad
            // 
            this.Ncantidad.AutoSize = true;
            this.Ncantidad.Location = new System.Drawing.Point(695, 203);
            this.Ncantidad.Name = "Ncantidad";
            this.Ncantidad.Size = new System.Drawing.Size(35, 13);
            this.Ncantidad.TabIndex = 2;
            this.Ncantidad.Text = "label1";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(692, 111);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(55, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Repetidas";
            // 
            // txtPalabra
            // 
            this.txtPalabra.Location = new System.Drawing.Point(155, 67);
            this.txtPalabra.Name = "txtPalabra";
            this.txtPalabra.Size = new System.Drawing.Size(392, 20);
            this.txtPalabra.TabIndex = 4;
            this.txtPalabra.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // txtImpresion
            // 
            this.txtImpresion.Location = new System.Drawing.Point(155, 149);
            this.txtImpresion.Multiline = true;
            this.txtImpresion.Name = "txtImpresion";
            this.txtImpresion.Size = new System.Drawing.Size(392, 172);
            this.txtImpresion.TabIndex = 5;
            // 
            // Nrepetidas
            // 
            this.Nrepetidas.AutoSize = true;
            this.Nrepetidas.Location = new System.Drawing.Point(692, 138);
            this.Nrepetidas.Name = "Nrepetidas";
            this.Nrepetidas.Size = new System.Drawing.Size(35, 13);
            this.Nrepetidas.TabIndex = 6;
            this.Nrepetidas.Text = "label3";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(692, 173);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(49, 13);
            this.label4.TabIndex = 7;
            this.label4.Text = "Cantidad";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.Nrepetidas);
            this.Controls.Add(this.txtImpresion);
            this.Controls.Add(this.txtPalabra);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.Ncantidad);
            this.Controls.Add(this.MandarTXT);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label4;
        public System.Windows.Forms.TextBox txtPalabra;
        public System.Windows.Forms.Button MandarTXT;
        public System.Windows.Forms.TextBox txtImpresion;
        public System.Windows.Forms.Label Nrepetidas;
        public System.Windows.Forms.Label Ncantidad;
    }
}

