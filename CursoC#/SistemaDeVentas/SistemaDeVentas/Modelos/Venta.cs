using System.ComponentModel.DataAnnotations;

namespace SistemaDeVentas.Modelos
{
    public class Venta
    {
        [Key]
        public int Id { get; set; }
        public int ClienteId { get; set; }
        public Cliente Cliente { get; set; }
        public DateTime Fecha { get; set; }
        public float Total { get; set; }
        public List<DetalleVenta> DetalleVentas { get; set; }
    }
}
