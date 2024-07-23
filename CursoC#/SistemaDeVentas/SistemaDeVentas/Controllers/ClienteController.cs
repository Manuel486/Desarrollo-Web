using AutoMapper;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using SistemaDeVentas.Modelos;
using SistemaDeVentas.Modelos.Dto;
using SistemaDeVentas.Repositorio.IRepositorio;

namespace SistemaDeVentas.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClienteController : ControllerBase
    {
        private readonly IClienteRepositorio _clienteRepo;
        private readonly IMapper _mapper;


        public ClienteController(IClienteRepositorio clienteRepositorio, IMapper mapper)
        {
            _clienteRepo = clienteRepositorio;
            _mapper = mapper;
        }

        [HttpGet]
        [ProducesResponseType(StatusCodes.Status200OK)]
        public async Task<ActionResult<Cliente>> getClientes()
        {
            IEnumerable<Cliente> clienteList = await _clienteRepo.ObtenerTodos();

            return Ok(_mapper.Map<IEnumerable<ClienteDto>>(clienteList));
        }
    }
}
