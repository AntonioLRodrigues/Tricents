package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class Test {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();	
	
	@Dado("que eu esteja no site {string}")
	public void queEuEstejaNoSite(String site) {
		metodos.abrirNavegador(site);
	}

	@Dado("preencher todos os formularios")
	public void preencherTodosOsFormularios() throws InterruptedException, AWTException {
		metodos.clicar(el.getMake());
		metodos.clicar(el.getMercedes());
		metodos.clicar(el.getModel());
		metodos.clicar(el.getMoto());
		metodos.escrever("1200", el.getCylinder());
		metodos.escrever("1000", el.getEngine());
		metodos.escrever("05/20/2022", el.getDateOfManu());
		metodos.clicar(el.getNumberOfSeats());
		metodos.clicar(el.getNumber());
		metodos.clicar(el.getRightHandDrive());
		metodos.clicar(el.getNumberOfSeats2());
		metodos.clicar(el.getNumber2());
		metodos.clicar(el.getFuelType());
		metodos.clicar(el.getDiesel());
		metodos.escrever("200", el.getPayload());
		metodos.escrever("200", el.getTotalWeight());
		metodos.escrever("30000", el.getListPrice() );
		metodos.escrever("21052154", el.getLicensePlateNumber() );
		metodos.escrever("30000", el.getAnnualMileage());
		metodos.clicar(el.getNext1());
		metodos.escrever("Leonardo", el.getFistName());
		metodos.escrever("Leonel", el.getLastName());
		metodos.escrever("08/21/2000", el.getDateofBirth());
		metodos.clicar(el.getGender());
		metodos.escrever("João de Oliveira Rosa", el.getStreetAddress());
		metodos.clicar(el.getCountry());
		metodos.clicar(el.getBrazil());
		metodos.escrever("11991000", el.getZipCode());
		metodos.escrever("Penha", el.getCity());
		metodos.clicar(el.getOccupation());
		metodos.clicar(el.getUnemployed());
		metodos.clicar(el.getHobbies());
		metodos.escrever("http://sampleapp.tricentis.com/101/app.php", el.getWebsite());
		metodos.clicar(el.getOpen());
		metodos.anexarArquivo();
		metodos.clicar(el.getNext2());
		metodos.escrever("05/04/2025", el.getStartDate());
		metodos.clicar(el.getInsuranceSum());
		metodos.clicar(el.getValor());
		metodos.clicar(el.getMeritRating());
		metodos.clicar(el.getBonus());
		metodos.clicar(el.getDamageInsurance());
		metodos.clicar(el.getFullCoverage());
		metodos.clicar(el.getOptionalProducts());
		metodos.clicar(el.getCourtesyCar());
		metodos.clicar(el.getYes());
		metodos.clicar(el.getNext3());
		metodos.clicar(el.getSelectOption());
		metodos.esperar(3000);
		metodos.clicar(el.getNext4());
		metodos.escrever("dana4264@uorak.com", el.getEmail());
		metodos.escrever("84848484848", el.getPhone());
		metodos.escrever("Leonardo321", el.getUsername());
		metodos.escrever("Leonel123456", el.getPassword());
		metodos.escrever("Leonel123456", el.getConfirmePass());
		metodos.escrever("mercedes c63 amg", el.getComments());	
	}

	@Quando("pressionar next")
	public void pressionarNext() {
		metodos.clicar(el.getSend());
	}
	
	@Entao("valido se o cadastro foi enviado com sucesso")
	public void validoSeOCadastroFoiEnviadoComSucesso() throws InterruptedException {
		metodos.esperar(10000);
		metodos.validarTexto("Sending e-mail success!", el.getValidaText());
		metodos.clicar(el.getOk());
		metodos.fecharNavegador();
	}

}
