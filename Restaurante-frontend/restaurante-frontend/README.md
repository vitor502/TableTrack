# Restaurante Frontend

Este é o projeto frontend da aplicação web do Restaurante, desenvolvido em React.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

- **public/index.html**: Ponto de entrada da aplicação web.
- **src/main.tsx**: Ponto de entrada do React, renderiza o componente `App`.
- **src/App.tsx**: Componente principal que gerencia a estrutura da aplicação.
- **src/components/Header.tsx**: Componente responsável pelo cabeçalho da aplicação.
- **src/pages/Home.tsx**: Página inicial da aplicação.
- **src/pages/Clientes.tsx**: Página para gerenciamento de clientes.
- **src/services/api.ts**: Funções para interagir com a API do backend.
- **src/hooks/useFetch.ts**: Hook personalizado para requisições HTTP.
- **src/styles/globals.css**: Estilos globais da aplicação.
- **src/types/index.ts**: Tipos TypeScript utilizados na aplicação.
- **tsconfig.json**: Configuração do TypeScript.
- **package.json**: Configuração do npm, incluindo dependências.
- **vite.config.ts**: Configuração do Vite, o bundler utilizado.
- **.gitignore**: Arquivos e pastas a serem ignorados pelo Git.

## Instalação

Para instalar as dependências do projeto, execute:

```
npm install
```

## Execução

Para iniciar a aplicação em modo de desenvolvimento, execute:

```
npm run dev
```

A aplicação estará disponível em `http://localhost:3000`.

## Construção

Para construir a aplicação para produção, execute:

```
npm run build
```

Os arquivos de build serão gerados na pasta `dist`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto está licenciado sob a MIT License.