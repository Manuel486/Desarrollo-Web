using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace SistemaDeVentas.Modelos
{
    public class Producto
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int Id { get; set; }
        public string Nombre { get; set; }
        public string Descripcion { get; set; }
        public float Precio { get; set; }
        public int Stock { get; set; }
        public List<DetalleVenta> DetalleVentas { get; set; }
        public List<ProductoCategoria> ProductoCategorias { get; set; }
    }
}
