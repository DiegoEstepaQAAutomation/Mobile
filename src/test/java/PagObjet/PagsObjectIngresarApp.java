package PagObjet;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import MapsObjet.MapsObjetIngresarApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PagsObjectIngresarApp extends MapsObjetIngresarApp {
	
	//INSTANCIA DE APPIUM DRIVER, SE  INSTANCIA EL DRIVER PERO EN VERSION MOBILE
	public PagsObjectIngresarApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Metodo de login  
	
	public void ingresoexitoso_572160(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta,String Usuario1) throws Exception {
			
		
		
			//tocarPantalla(550, 934);
			//click2(btnAceptar, 10, rutaCarpeta, Evidencia);
			
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			
			//sendkey2(Usuario, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			tiempoEspera(6000);
			
			click2(btnMenuGeneral, 5, rutaCarpeta, Evidencia);
			
			
			
			
			tocarPantalla(168, 1267);
			click2(btnSalirSeguro, 5, rutaCarpeta, Evidencia);
			
			click2(btnAceptarSalir, 5, rutaCarpeta, Evidencia);
			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			sendkey2(Usuario1, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			tiempoEspera(6000);
			
			//Enviar a una variable de tipo booleano los botones para certificar que ya ingresa a certificados(botones aun no tienen desarrollada la funcionalidad)
			boolean afiliacion = validarElemento(btnAceptar, 5);
			ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnAceptar);
			
			tiempoEspera(300000);
			
			click2(btnAceptar, 1, rutaCarpeta, "click en aceptar");
			
			//btnAceptar
			
     }	
	
	
	//Metodo de login con validaciones 
	
		public void ValidacionesLogueado_587966(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta) throws Exception 
		
		{
			
			
			
			tocarPantalla(660, 318);
			
			//Validacion de campo detalle saldo
			boolean afiliacion = validarElemento(btnDetalleSaldo, 5);
			ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnDetalleSaldo);
			
			tocarPantalla(443, 443);
			
			tocarPantalla(660, 361);
			
			tiempoEspera(10000);
			
			//Validaciones de campos de caso
			boolean ContratoIdentifier = validarElemento(ContratoId, 5);
			ValidacionObjeto(ContratoIdentifier, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ContratoId);
			
			boolean ContratoEncabezado = validarElemento(ContratoCampo, 5);
			ValidacionObjeto(ContratoEncabezado, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ContratoCampo);
			
			boolean EncabezadoInformacion = validarElemento(InformacionContrato, 5);
			ValidacionObjeto(EncabezadoInformacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, InformacionContrato);
			
			boolean EncabezadoResumen = validarElemento(ResumenSaldo, 5);
			ValidacionObjeto(EncabezadoResumen, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ResumenSaldo);
			
			click2(btnInformacionPortafolio, 2, rutaCarpeta, "click en extender informacion");
			
			boolean EncabezadoPortafolio = validarElemento(ResumenSaldo, 5);
			ValidacionObjeto(EncabezadoPortafolio, "Caso certificados de afiliacion,caso exitoso 587966,587967,587968,587969", rutaCarpeta, Evidencia, ResumenSaldo);
			
			//nos devolvemos y cerramos sesion
			click2(btnGoback, 1, rutaCarpeta, "click en devolverse");
			
			click2(btnGoback, 1, rutaCarpeta, "click en devolverse");
	
		
			
			
		}
		
		
		//Metodo de login con validaciones 
		
			public void ValidacionesCertificado_588065(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				boolean Extractos = validarElemento(ExtractosSeccion, 5);
				ValidacionObjeto(Extractos, "Caso Extractos", rutaCarpeta, Evidencia, ExtractosSeccion);
			
				tocarPantalla(454, 1430);
				
				tiempoEspera(2000);
				
				boolean Pdf1 = validarElemento(UltimoPdf, 5);
				ValidacionObjeto(Pdf1, "Caso Extractos, Caso exitoso 588064,588065", rutaCarpeta, Evidencia, UltimoPdf);
				
				tocarPantalla(57, 356);
				
				tiempoEspera(14000);
				
				escape();
				//tocarPantalla(155, 1546);
				
				//tiempoEspera(6000);
				
				//tocarPantalla(57, 356);
				
				//155,1546
			}
			
			
			
			//Metodo de login con validaciones 
			
			public void ValidacionesSimuladores_588077(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				
				//Validaciones rapidas de menu general
				
				click2(btnMenuGeneral, 5, rutaCarpeta, Evidencia);
				
				
				//Conversion de localizador a una variable booleana y validacion posterior
				boolean Simuladores = validarElemento(btnSimuladores, 5);
				ValidacionObjeto(Simuladores, "Caso Exitoso 588077", rutaCarpeta, Evidencia, btnSimuladores);
				
				
				boolean Rentabilidades = validarElemento(btnRentabilidad, 5);
				ValidacionObjeto(Rentabilidades, "Caso Exitoso 588075", rutaCarpeta, Evidencia, btnRentabilidad);
				
				boolean CanalesContactoLoguin = validarElemento(btnCanalesContactoLoguin, 5);
				ValidacionObjeto(CanalesContactoLoguin, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, btnCanalesContactoLoguin);
				
				tocarPantalla(679, 735);
				
				
				
				
				
			}
			
			
			
//Metodo de login con validaciones 
			
			public void ValidacionesCertificados_589706(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				
				
				//Validaciones rapidas de menu general
				
				
				
				boolean CertificadosTributarios = validarElemento(CertificadosTributariosLoguin, 5);
				ValidacionObjeto(CertificadosTributarios, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, CertificadosTributariosLoguin);
				
				tocarPantalla(268, 1430);
				
				tiempoEspera(10000);
				
				boolean UltimoCertificado = validarElemento(UltimoCertificadoTributario, 5);
				ValidacionObjeto(UltimoCertificado, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, UltimoCertificadoTributario);

				tocarPantalla(57, 436);
				
				tiempoEspera(18000);
				
				
				escape();
				
				
				//intro(FramePantalla, rutaCarpeta, Evidencia);
				
				//tocarPantalla(160, 1546);
				
				//tocarPantalla(137, 1474);
				
				//tiempoEspera(5000);
				
				//tocarPantalla(330, 785);
				
				
				
				
			}
		
		
		public void CerrarSesion(File rutaCarpeta,String Evidencia) throws Exception 
		{
			
			click2(btnMenuGeneral, 5, rutaCarpeta, "click en menu general");
			
			tocarPantalla(168, 1267);
			
			
			click2(btnAceptarSalir, 5, rutaCarpeta, "Caso 587287 exitoso");
			
			
			
		}
		
		
		
		//Metodo de login  
		
		public void LoguinUsuario(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta) throws Exception {
				
			
			
				
						
				
				click2(campollenar, 5, rutaCarpeta, Evidencia);
				sendkey2(Usuario, campollenar, 5, rutaCarpeta, Evidencia);
				//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
				
				click2(contrasena, 5, rutaCarpeta, Evidencia);
				
				sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
				//click en iniciar sesion
				click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
				
				tiempoEspera(6000);
				
				
				
				
				
				
	     }	
		
}
