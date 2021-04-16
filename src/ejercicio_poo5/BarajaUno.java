package ejercicio_poo5;

public class BarajaUno extends Mazo<ColoresBarajaUno>{
	
	public BarajaUno() {
		super.setNumCartas(108);
		super.setCartasPorPalo(13);
		
		Crearmazo();
	}
	

	
	public void Crearmazo() {
		
		ColoresBarajaUno[] colores = ColoresBarajaUno.values();
		
		CartaUno[] cartas =  new CartaUno [super.getNumCartas()];
		
		for(int i=0;i<colores.length;i++) {
			for(int j=0;j<((super.getCartasPorPalo())*2)-1;j++) {
				if(colores[i]!=ColoresBarajaUno.NEGRO) {
					switch(j) {
					case 10,22:
						cartas[(i*((getCartasPorPalo()*2)-1))+j]= new CartaUno(colores[i],EfectosBarajaUno.MASDOS);
						break;
					case 11,23:
						cartas[(i*((getCartasPorPalo()*2)-1))+j]= new CartaUno(colores[i],EfectosBarajaUno.SALTO);
						break;
					case 12,24:
						cartas[(i*((getCartasPorPalo()*2)-1))+j]= new CartaUno(colores[i],EfectosBarajaUno.REVERSO);
						break;
					}
					if(j>=13 && j<22){
						cartas[(i*((getCartasPorPalo()*2)-1))+j]= new CartaUno(j-12,colores[i]);
					}else if(j<=9){
						cartas[(i*((getCartasPorPalo()*2)-1))+j]= new CartaUno(j,colores[i]);
					}
				}
				else {
					for(int k=0;k<8;k+=2) {
						cartas[(4*((getCartasPorPalo()*2)-1))+k]= new CartaUno(colores[i],EfectosBarajaUno.MASCUATRO);
						cartas[(4*((getCartasPorPalo()*2)-1))+(k+1)]= new CartaUno(colores[i],EfectosBarajaUno.CAMBIOCOLOR);
					}
				}
			}
		}
		
		super.setCartas(cartas);
			
		}
		
	}
