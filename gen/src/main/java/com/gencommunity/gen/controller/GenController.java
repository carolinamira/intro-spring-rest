package com.gencommunity.gen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/gen")

public class GenController {
	
	@GetMapping 
	public String gen() {
		return "Um dos anos mais importantes da minha vida foi 2016, quando morei na comunidade Missão Belém em São Paulo; minha participação começou no grupo de jovens da paróquia que frequentava, mas eu tinha no coração o desejo de viver uma entrega mais intensa. Fui então aceita para fazer parte da Escola de Missão, que é uma divisão de 20 jovens dentro da comunidade, que se dedicam a cuidar dos moradores e crianças de rua, especialmente na região da Sé e da Cracolândia. Os jovens que se idenficam com o modo de vida após o ano de experiência podem seguir para os próximos anos de formação para se tornarem padres ou freiras (postulantado). Nos meu ano aprendi tantas coisas que fica difícil resumir, mas especialmente que o coração do ser humano é lindo e sempre pode ser recuperado, e que a maior alegria está em amar e servir o próximo. Ao final do ano eu entendi que o meu caminho era voltar para casa e viver na sociedade com o meu trabalho e família, mas levarei para sempre no coração tudo o que vivi e aprendi e não deixo de ajudar como voluntária quando existe a possibilidade.";
	}

}
