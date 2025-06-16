
# Prova‑PA‑UnoDevs

**Prova de Programação Avançada** — projeto da equipe UnoDevs.

## 👥 Integrantes

- Jonas Carvalho Brito RA: 23272171-2

- Anderson Gomes Efrens RA: 23130585-2

- Cáriton Vilasanti RA: 23094807-2

- Filipe Ariel Fricati Filadoro RA: 23120339-2

- Felipe Dos Santos Maniezo de Freitas RA: 24224651-2

- João Pedro Lima Gomes RA:230109902

## 🧰 Tecnologias e Ferramentas

- **Java** (100%)
- **Maven** (gerenciamento de dependências e build)
- Scripts: `.mvn/wrapper`, `mvnw`, `mvnw.cmd`

## 🎯 Estrutura do Projeto

```
Prova‑PA‑UnoDevs/
├─ .mvn/wrapper/         # arquivos do Maven Wrapper
├─ src/                  # código‑fonte Java
├─ pom.xml               # configuração do Maven
├─ mvnw, mvnw.cmd        # executáveis para execução cross‑platform
├─ .gitignore
└─ .gitattributes
```

- O diretório `src/` contém sua lógica de aplicação (presumivelmente `src/main/java`).
- O arquivo `pom.xml` define dependências e plugins.
- Os wrappers permitem executar comandos Maven sem exigir Maven instalado.

## 🚀 Como usar

### Pré‑requisitos

- JDK (Java Development Kit) 8 ou superior

### Comandos úteis

```bash
# Rodar testes (se houver)
./mvnw test

# Gerar build JAR
./mvnw package

# Executar a aplicação
./mvnw exec:java
```

Ajuste conforme os plugins configurados no `pom.xml`.


