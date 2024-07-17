# AppMeteorologia

Aplicativo de meteorologia desenvolvido em Kotlin para Android, utilizando Dagger Hilt para injeção de dependências e Ktor para requisições HTTP.

## Estrutura do Projeto

- **data**: Contém as classes relacionadas ao gerenciamento de dados, incluindo repositórios, fontes de dados remotas e modelos de dados.
  - **di**: Módulos de injeção de dependências.
  - **remote**: Implementação das fontes de dados remotas usando Ktor.
  - **Model**: Modelos de dados.
  - **Repository**: Implementação dos repositórios.
- **ui**: Contém as classes relacionadas à interface do usuário.
  - **feature**: Implementações das features principais, incluindo ViewModel e estados.
  - **theme**: Definições de tema e estilo.
- **res**: Recursos do projeto (imagens, layouts, etc.).
- **.idea**: Configurações do projeto para o IntelliJ IDEA/Android Studio.
- **.gradle**: Arquivos de configuração do Gradle.
- **build**: Diretório de build do projeto.

## Configuração do Ambiente

1. Clone o repositório:
   ```bash
   git clone https://github.com/MarcuusCorrea/AppMeteorologia.git
   cd AppMeteorologia
Abra o projeto no Android Studio.

Certifique-se de ter o Android SDK e o Kotlin configurados no seu ambiente de desenvolvimento.

# Dependências
As principais dependências utilizadas neste projeto são:

 - Dagger Hilt: Injeção de dependências.
 - Ktor: Cliente HTTP.
 - Kotlinx Serialization: Serialização de JSON.
 - Compose: Interface de usuário declarativa.

# Estrutura de Classes

data
 - di/DataSourceModule.kt: Módulo de injeção para fontes de dados.
 - di/RepositoryModule.kt: Módulo de injeção para repositórios.
 - Model/WeatherInfo.kt: Modelo de dados para informações meteorológicas.
 - remote/KtorRemoteDataSource.kt: Implementação da fonte de dados remota usando Ktor.
 - Repository/WeatherRepository.kt: Interface do repositório de dados meteorológicos.
 - Repository/WeatherRepositoryImpi.kt: Implementação do repositório de dados meteorológicos.

# ui

 - feature/WeatherInfoState.kt: Estado das informações meteorológicas.
 - feature/WeatherScream.kt: Tela de exibição das informações meteorológicas.
 - feature/WeatherViewModel.kt: ViewModel para gerenciar a lógica de obtenção das informações meteorológicas.
 - theme/Color.kt: Definições de cores do tema.
 - theme/Theme.kt: Definições do tema do aplicativo.
 - theme/Type.kt: Definições de tipografia do tema.
 - CustomApplication.kt: Classe de aplicação personalizada.
 - MainActivity.kt: Atividade principal do aplicativo.

# Uso

O aplicativo faz requisições à API do OpenWeatherMap para obter dados meteorológicos com base em coordenadas geográficas. As informações são exibidas na tela principal do aplicativo usando Jetpack Compose.

# Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
