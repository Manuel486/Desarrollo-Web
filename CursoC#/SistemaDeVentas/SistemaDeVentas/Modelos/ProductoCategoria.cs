using System.ComponentModel.DataAnnotations;

namespace SistemaDeVentas.Modelos
{
    public class ProductoCategoria
    {
        [Key]
        public int Id { get; set; }
        public int ProductoId { get; set; }
        public Producto Producto { get; set; }
        public int CategoriaId { get; set; }
        public Categoria Categoria { get; set; }
    }
}
