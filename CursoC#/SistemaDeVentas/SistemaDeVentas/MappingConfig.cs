using AutoMapper;
using SistemaDeVentas.Modelos;
using SistemaDeVentas.Modelos.Dto;

namespace SistemaDeVentas
{
    public class MappingConfig : Profile
    {
        public MappingConfig()
        {
            CreateMap<Cliente, ClienteDto>().ReverseMap();
        }
    }
}
