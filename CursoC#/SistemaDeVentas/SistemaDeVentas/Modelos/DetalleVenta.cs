using System.ComponentModel.DataAnnotations;

namespace SistemaDeVentas.Modelos
{
    public class DetalleVenta
    {
        [Key]
        public int Id { get; set; }
        public int VentaId { get; set; }
        public Venta Venta { get; set; }
        public int ProductoId { get; set; }
        public Producto Producto { get; set; }
        public int Unidades { get; set; }
        public float PrecioUnitario { get; set; }
        public float SubTotal { get; set; }
    }
}
