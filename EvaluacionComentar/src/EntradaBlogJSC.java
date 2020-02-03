/**
 * 
 * @author Jesus 
 * "27/01/2020"
 *		Separador es el carácter que separa ENTRADA del
		nombre del autor
		
 */

	public class EntradaBlogJSC {

		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * 
		 * @param i es igual a la id
		 * @param string es igual a texto
		 * @param string2 es igual a autor
		 */
		public EntradaBlogJSC(int i, String string, String string2) {
			id=i;
			texto=string;
			autor=string2;
		}
		
		/**
		 * 
		 * Constructor de la clase. recibe el número de entrada, el nombre del autor
		 * de la entrada y el texto que contiene la entrada. Si el número de entrada
		 * es negativo, lanza una excepción.
		 *
		 */
		
		public void EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		/**
		 * 
		 * @return Devuelve el número de la entrada
		 */
		public int getId(){
			return this.id;
		}
		/**
		 * 
		 * @return Devuelve el texto completo de la entrada
		 */
		public String getTexto(){
			return this.texto;
		}
		/**
		 * 
		 * @return Devuelve el nombre del autor de la entrada en mayúsculas
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		/**
		 * 
		 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		/**
		 * 
		 * @param args No tiene porqué tener argumentos.
		 */
		public static void main(String[] args) {
			EntradaBlogJSC e1=new EntradaBlogJSC (112412,"jesus","Ultimas noticias, esta disponible BixBy 2.0");
			System.out.println(e1);
		}
	}

