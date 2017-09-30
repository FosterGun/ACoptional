package simulator;

public class Table {
	
	public final int MAX_TPAL = 8;
	public final int MAX_TBL = 64;
	public final int MAX_TC = 8;
	
	private int[][] mc = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
	private int tpal;
	private int tbl;
	private int tc;
	
	private PoliticaRemplazo politicaRemplazo;
	
	/**
	 * Politica de reemplazo de la memoria cache.
	 */
	public enum PoliticaRemplazo {
	    FIFO, LRU
	}
	
	public Table(int[][] mc, int tpal, int tbl, int tc) {
		mc = this.mc;
		tpal = this.tpal;
		tbl = this.tbl;
		tc = this.tc;
	}

	public PoliticaRemplazo getPoliticaRemplazo() {
		return politicaRemplazo;
	}

	public void setPoliticaReemplazo(PoliticaRemplazo pr) {
		this.politicaRemplazo = pr;
	}
	
	
}
