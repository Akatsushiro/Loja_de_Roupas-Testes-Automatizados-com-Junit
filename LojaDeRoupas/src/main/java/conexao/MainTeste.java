package conexao;

import org.junit.Test;

public class MainTeste extends QaDriver{
	
	@Test
	public void main() {

		telas.Home.selecionarProduto();
		telas.AddCar.adicionarAoCarrinho();
		telas.ShoppingCartSummary.carrinhoComprar();
		telas.Authentication.autenticar();
		telas.CreateAccount.formularioCadastro();
		telas.Address.confirmarEndereco();
		telas.Shipping.entrega();
		telas.Payment.pagamento();
		telas.CheckPayment.checarPagamento();
		telas.OrderConfirmation.confirmarPedido();
	}
}
