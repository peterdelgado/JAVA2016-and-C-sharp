using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Visor;
using System.Windows.Forms;



namespace InterfazVisor

    

{
    public partial class Form1 : Form
    {
        Boolean arrastrando;
        VisorFoto A = new VisorFoto(486,256);
        Point offset;
        public Form1()

        {
            InitializeComponent();
            arrastrando = false;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

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

        private void pictureBox1_MouseDown(object sender, MouseEventArgs e)
        {

            arrastrando = true;
            offset = e.Location;

        }

        private void pictureBox1_MouseUp(object sender, MouseEventArgs e)
        {
            arrastrando = true;
            offset = e.Location;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            openFileDialog1.ShowDialog();

            foreach(String nombre in openFileDialog1.FileNames)
            {

                A.Agregar_Foto((Bitmap)Bitmap.FromFile(nombre));
                
            
             }
            pictureBox1.Image = A.Foto_Actual();



           
        }

        private void button2_Click(object sender, EventArgs e)
        {

            A.Next_Foto();
            pictureBox1.Image = A.Next_Foto();

        }
    }
}
            // String nombre = openFileDialog1.FileName
            // Image b = Bitmap.FromFile(nombre);
            // pictureBox1.Image = b;