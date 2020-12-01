using Microsoft.AspNetCore.Mvc.Formatters;
using Microsoft.EntityFrameworkCore;
using System;
using System.Threading.Tasks;

namespace MyTunes.Models
{
    public class MyTunesContext : DbContext//, IMyTunesContext
    {
        public MyTunesContext(DbContextOptions<MyTunesContext> options)
            : base(options)
        {
        }

        //Les DbSet sont en virtual pour pouvoir de mocker (simuler/imiter) le framework et mettre en place une implementation mocker
        
        public virtual DbSet<Artiste> ARTISTE { get; set; }
    

        //On ne peut utiliser les Annontations pour les tables avec plusieurs clés primaires et pour les relations many-to-many, on doit le faire en Fluent API
        protected override void OnModelCreating(ModelBuilder builder)
        {
            
        }
    }
}