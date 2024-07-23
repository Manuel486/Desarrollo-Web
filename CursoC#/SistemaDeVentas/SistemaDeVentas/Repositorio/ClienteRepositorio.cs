using SistemaDeVentas.Datos;
using SistemaDeVentas.Modelos;
using SistemaDeVentas.Repositorio.IRepositorio;

namespace SistemaDeVentas.Repositorio
{
    public class ClienteRepositorio : Repositorio<Cliente>, IClienteRepositorio
    {
        private readonly ApplicationDbContext _db;
        public ClienteRepositorio(ApplicationDbContext db) : base(db)
        {
            _db = db;
        }

        public async Task<Cliente> Actualizar(Cliente entidad)
        {
           _db.Clientes.Update(entidad);
            await _db.SaveChangesAsync();
            return entidad;
        }
    }
}
