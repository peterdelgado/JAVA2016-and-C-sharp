using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using Visor;
namespace InterfazVisor
{
    public partial class Form1 : Form
    {
        Boolean arrastrando;
        Visor.VisorFoto v = new VisorFoto(400, 300);
        Point offset;
        public Form1()
        {
            InitializeComponent();
            arrastrando = false;
        }

        private void Form1_Shown(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            openFileDialog1.ShowDialog();
            foreach  (String nom in openFileDialog1.FileNames) {
                v.Agregar_Foto((Bitmap)Bitmap.FromFile(nom));
            }
            pictureBox1.Image = v.Foto_Actual();
            this.Focus();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            v.Resize(50, 50);
            int ancho = pictureBox1.Width;
            v.Resize(ancho, 300);
            pictureBox1.Image = v.Next_Foto();
            


            this.Focus();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = v.Prev_Foto();
        }

        private void button1_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Right)
                pasa_foto();
            if (e.KeyCode == Keys.Left)
                pictureBox1.Image = v.Prev_Foto();
        }

        private void pasa_foto()
        {
                pictureBox1.Image = v.Next_Foto();
        }

        private void Form1_PreviewKeyDown(object sender, PreviewKeyDownEventArgs e)
        {
            if (e.KeyCode != Keys.Tab )
                    e.IsInputKey = true;
        }


        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {

            if (arrastrando)
            {
                int x = pictureBox1.Location.X + e.X - offset.X;
                int y = pictureBox1.Location.Y + e.Y - offset.Y;
                pictureBox1.Location = new Point(x, y);

            }
            

        }

        private void pictureBox1_MouseUp(object sender, MouseEventArgs e)
        {
            arrastrando = false;
            offset = e.Location;
        }

        private void pictureBox1_MouseDown(object sender, MouseEventArgs e)
        {
            arrastrando = true;
            offset = e.Location;
        }

        private void pictureBox1_DoubleClick(object sender, EventArgs e)
        {
            arrastrando = false;
        }

        private void Rotar_Click_1(object sender, EventArgs e)
        {
            pictureBox1.Image = v.rotar_hor();
        }

        private void Zoom_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = v.Zoom(1.1f);
        }

        private void Desplazar_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = v.Despl(10, 0);
        }

        private void Zoom_out_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = v.Zoom(-1.1f);
        }

        private void RotarAntiHora_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = v.rotar_antihor();
        }
        
        
    }
}
