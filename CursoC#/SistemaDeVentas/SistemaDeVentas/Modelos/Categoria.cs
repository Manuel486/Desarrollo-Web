using System.ComponentModel.DataAnnotations;

namespace SistemaDeVentas.Modelos
{
    public class Categoria
    {
        [Key]
        public int Id { get; set; }
        public string Nombre { get; set; }
        public string Descripcion { get; set; }
        public List<ProductoCategoria> ProductoCategorias { get; set; }
    }
}
