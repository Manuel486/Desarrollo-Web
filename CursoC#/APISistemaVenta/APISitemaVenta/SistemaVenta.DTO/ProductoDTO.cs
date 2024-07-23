using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaVenta.DTO
{
    public class ProductoDTO
    {
        public int IdProducto { get; set; }

        public string? Nombre { get; set; }

        public int? IdCategoria { get; set; }
        public string? DescripcionCategoria { get; set; }

        public int? Stock { get; set; }

        // Recibiremos un texto y antes de pasarlo a la base de datos lo pasaremos a decimal
        public string? Precio { get; set; }
        // Cambiar a int para poner 0 y 1
        public int? EsActivo { get; set; }
    }
}
