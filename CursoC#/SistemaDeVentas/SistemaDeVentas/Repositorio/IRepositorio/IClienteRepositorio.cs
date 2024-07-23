using SistemaDeVentas.Modelos;

namespace SistemaDeVentas.Repositorio.IRepositorio
{
    public interface IClienteRepositorio : IRepositorio<Cliente>
    {
        Task<Cliente> Actualizar(Cliente entidad);
    }
}
