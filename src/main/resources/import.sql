INSERT INTO posts(content,title) VALUES ('No domingo, presidente revelou ter feito compromisso de indicar o nome do ministro da Justiça para a ''primeira vaga'' que for aberta no Supremo.','''Não estabeleci nenhuma condição'', afirma Moro após Bolsonaro dizer que o indicará ao STF');
INSERT INTO posts(content,title) VALUES ('O reajuste da tabela de Imposto de Renda pela inflação, cogitado pelo presidente Jair Bolsonaro neste domingo, elevaria em R$ 76,92 o teto da faixa salarial ...','Saiba como ficará o Imposto de Renda se a tabela for corrigida pela inflação');
INSERT INTO posts(content,title) VALUES ('Ministério das Finanças disse que vai impor taxas adicionais sobre US$ 60 bilhões em produtos norte-americanos a partir de 1º de junho, em retaliação a alta ...','China anuncia que também vai elevar tarifas sobre produtos dos EUA');
INSERT INTO posts(content,title) VALUES ('Uma briga entre facções no Centro de Recuperação de Redenção, sudeste do Pará, deixou três mortos e três feridos na manhã deste domingo (12) Diário da Amazônia','Presos se rebelam, esquartejam e queimam rivais');
INSERT INTO posts(content,title) VALUES ('A União Nacional dos Juízes Federais do Brasil, que representa magistrados de primeira instância da Justiça Federal, apontou inconstitucionalidade na .. O Antagonista','Juízes apontam inconstitucionalidade na votação que tirou Coaf de Moro');
INSERT INTO posts(content,title) VALUES ('O cartão Bradesco Neo Visa Internacional oferece possibilidade e isenção da taxa de anuidade, além de contar com diversos benefícios. Confira como adquirir!','Bradesco lança novo cartão com possibilidade de isenção da anuidade');

INSERT INTO comments(author, content, post_id) VALUES ('James Brown','My 22 year old son rates this spaces very sublime, friend.',1);
INSERT INTO comments(author, content, post_id) VALUES ('Michael Douglas','Super excellent shot m8, .',1);
INSERT INTO comments(author, content, post_id) VALUES ('Elvira','I approve your notification!!',2);
INSERT INTO comments(author, content, post_id) VALUES ('Raj','Wow love it!, friend.',2);
INSERT INTO comments(author, content, post_id) VALUES ('Travis','Mission accomplished. Its incredible.',2);
INSERT INTO comments(author, content, post_id) VALUES ('Ozzy','My 22 year old son rates this spaces very sublime, friend.',3);

INSERT INTO users(active, email, password, verifier_code) VALUES (1,'teste@teste.com', '$2a$10$QucZzGEuPznCI0YBIjitZeda4wWyiARqKrOWFqzidz4VSRRTLADve','123456' );
