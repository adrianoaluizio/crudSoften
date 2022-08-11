package br.com.soften.crud.models.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum States {
	AMAZONAS("Amazonas", "AM", "Manaus"),
	ALAGOAS("Alagoas", "AL", "Maceió"),
	ACRE("Acre", "AC", "Rio Branco"),
	AMAPA("Amapá", "AP", "Macapá"),
	BAHIA("Bahia", "BA", "Salvador"),
	PARA("Pará", "PA", "Belém"),
	MATO_GROSSO("Mato Grosso", "MT", "Cuiabá"),
	MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", "Campo Grande"),
	GOIAS("Goiás", "GO", "Goiânia"),
	MARANHAO("Maranhão", "MA", "São Luís"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	TOCANTINS("Tocantins", "TO", "Palmas"),
	PIAUI("Piauí", "PI", "Teresina"),
	SAO_PAULO("São Paulo", "SP", "São Paulo"),
	RONDONIA("Rondônia", "RO", "Porto Velho"),
	RORAIMA("Roraima", "RR", "Boa Vista"),
	PARANA("Paraná", "PR", "Curitiba"),
	CEARA("Ceará", "CE", "Fortaleza"),
	PERNAMBUCO("Pernambuco", "PE", "Recife"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
	PARAIBA("Paraíba", "PB", "João Pessoa"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", "Natal"),
	ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	SERGIPE("Sergipe", "SE", "Aracaju"),
	DISTRITO_FEDERAL("Distrito Federal", "DF", "Brasília");

	private final String name;
	private final String abr;
	private final String capital;
}
