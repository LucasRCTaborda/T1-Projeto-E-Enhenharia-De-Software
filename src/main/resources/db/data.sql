-- Corrigindo os IDs das inserções para usuários
INSERT INTO Usuario (codigo, usuario, senha) VALUES
                                                 (1, 'Lucas', 'senha0'),
                                                 (2, 'Maria', 'senha1'),
                                                 (3, 'Pedro', 'senha2'),
                                                 (4, 'Ana', 'senha3'),
                                                 (5, 'Lucas', 'senha4'),
                                                 (6, 'Julia', 'senha5'),
                                                 (7, 'Mateus', 'senha6'),
                                                 (8, 'Carla', 'senha7'),
                                                 (9, 'Fernanda', 'senha8'),
                                                 (10, 'Rafael', 'senha9'),
                                                 (11, 'Mariana', 'senha10');

-- Inserindo um novo aplicativo com ID 1
INSERT INTO aplicativo (ID, nome, custo_mensal) VALUES
                                                    (1, 'Aplicativo D', 3.3),
                                                    (2, 'Aplicativo D', 3.3),
                                                    (3, 'Aplicativo D', 3.3),
                                                    (4, 'Aplicativo D', 3.3),
                                                    (5, 'Aplicativo D', 3.3),
                                                    (6, 'Aplicativo D', 3.3),
                                                    (7, 'Aplicativo D', 3.3),
                                                    (8, 'Aplicativo D', 3.3),
                                                    (9, 'Aplicativo D', 3.3),
                                                    (10, 'Aplicativo D', 3.3),
                                                    (11, 'Aplicativo D', 3.3);

-- Corrigindo os IDs das inserções de clientes
INSERT INTO Cliente (ID, nome, email) VALUES
                                          (1, 'Empresa A', 'empresa_a@example.com'),
                                          (2, 'Empresa B', 'empresa_b@example.com'),
                                          (3, 'Empresa C', 'empresa_c@example.com'),
                                          (4, 'Empresa D', 'empresa_d@example.com'),
                                          (5, 'Empresa E', 'empresa_e@example.com'),
                                          (6, 'Empresa F', 'empresa_f@example.com'),
                                          (7, 'Empresa G', 'empresa_g@example.com'),
                                          (8, 'Empresa H', 'empresa_h@example.com'),
                                          (9, 'Empresa I', 'empresa_i@example.com'),
                                          (10, 'Empresa J', 'empresa_j@example.com');

-- Corrigindo os IDs das inserções de assinaturas
INSERT INTO Assinatura (codigo, inicio_vigencia, fim_vigencia, aplicativo_id, cliente_id)
VALUES
    (1, '2024-05-01', '2024-06-01', 1, 1),
    (2, '2024-05-01', '2024-06-01', 1, 2),
    (3, '2024-05-01', '2024-06-01', 1, 3),
    (4, '2024-05-01', '2024-06-01', 1, 4),
    (5, '2024-05-01', '2024-06-01', 1, 5),
    (6, '2024-05-01', '2024-06-01', 1, 6),
    (7, '2024-05-01', '2024-06-01', 1, 7),
    (8, '2024-05-01', '2024-06-01', 1, 8),
    (9, '2024-05-01', '2024-06-01', 1, 9),
    (10, '2024-05-01', '2024-06-01', 1, 10);

-- Corrigindo os IDs das inserções de pagamentos
INSERT INTO Pagamento (codigo, assinatura_codigo, valor_pago, promocao)
VALUES
    (1, 1, 140.00, 'Promoção 10'),
    (2, 2, 60.00, 'Promoção 2'),
    (3, 3, 70.00, 'Promoção 3'),
    (4, 4, 80.00, 'Promoção 4'),
    (5, 5, 90.00, 'Promoção 5'),
    (6, 6, 100.00, 'Promoção 6'),
    (7, 7, 110.00, 'Promoção 7'),
    (8, 8, 120.00, 'Promoção 8'),
    (9, 9, 130.00, 'Promoção 9'),
    (10, 10, 140.00, 'Promoção 10');
