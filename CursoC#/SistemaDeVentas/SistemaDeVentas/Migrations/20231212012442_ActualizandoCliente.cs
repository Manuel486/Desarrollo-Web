using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace SistemaDeVentas.Migrations
{
    /// <inheritdoc />
    public partial class ActualizandoCliente : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "Docuento",
                table: "Clientes",
                newName: "Documento");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "Documento",
                table: "Clientes",
                newName: "Docuento");
        }
    }
}
