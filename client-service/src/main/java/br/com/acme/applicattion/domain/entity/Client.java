package br.com.acme.applicattion.domain.entity;

import br.com.acme.application.domain.entity.Card;
import br.com.acme.applicattion.domain.vo.Document;
import br.com.acme.applicattion.domain.vo.Email;
import br.com.acme.applicattion.domain.vo.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Client {

    private Long id;
    private String name;
    private Email email;
    private Document document;
    private Phone phone;
    private List<Card> card;

    // TODO 1 CREATE CARD, 2 LIST CARDS TO CLIENT, 3 UPDATE CARD

}
