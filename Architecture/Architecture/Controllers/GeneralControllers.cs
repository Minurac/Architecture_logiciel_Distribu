using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using MyTunes.Models;



namespace MyTunes.Controllers
{
    public class GeneralControllers : ControllerBase
    {
        protected readonly MyTunesContext _context;

        protected GeneralControllers(MyTunesContext context)
        {
            _context = context;
        }

        protected bool ArtisteExists(int id)
        {
            return _context.ARTISTE.Any(e => e.id_artiste == id);
        }
    }
}
