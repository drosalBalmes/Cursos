ControllerEstudiants:

declaramos @RequestMapping ("api") para que lo primero que tengamos que poner en la ruta sea /api
declarem un estudiantRepository per poder fer Autowired per injectar el estudiantservice i poder fer servir els metodes del servei


hi han diferents mappings que retornen diferents pagines que accedeixen a la base de dades per fer o read o inserts

les clases curs i estudiants estan relacionades amb un OneToMany de la clase curs que es la propietaria de la relacio

Hi han dos repositoris que fan extends de JpaRepository per poder fer el crud
<Clase,tipus de la ID de la clase>

al servei trobem metodes per interactuar amb la base de dades