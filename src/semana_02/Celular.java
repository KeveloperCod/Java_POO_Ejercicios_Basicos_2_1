package semana_02;

public class Celular {
	
	
	private int num , segConsu ;
	private String usuario;
	private double preciosSeg;
	//UN CONSTRUCTOR QUE INICIALIZE LOS 
	public Celular(int num, int segConsu, String usuario, double preciosSeg) {
		this.num = num;
		this.segConsu = segConsu;
		this.usuario = usuario;
		this.preciosSeg = preciosSeg;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSegConsu() {
		return segConsu;
	}
	public void setSegConsu(int segConsu) {
		this.segConsu = segConsu;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getPreciosSeg() {
		return preciosSeg;
	}
	public void setPreciosSeg(double preciosSeg) {
		this.preciosSeg = preciosSeg;
	}
	
	//UN METO}DO QUE RETORNE EL COSTO POR CONSUMO (SEGUNDOS * PRECIO) 
	public double costoConsum() {
		return (preciosSeg * segConsu);
	}
	//UN METO}DO QUE RETORNE EL IMPUESTO IGV  (18 % DEL COSTO POR CONSUMO)
	public double impuestoIGV() {
		return 0.18 * costoConsum();
	}
	// UN METODO QUE RETORNE EL TOTAL A PAGAR (COSTO POR CONSUMO + IMPUESTO POR IGV)
	public double totalP(){
		return costoConsum() - impuestoIGV();
		
	}
	
}
