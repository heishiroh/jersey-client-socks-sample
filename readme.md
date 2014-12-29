Sample of using jersey-client via SOCKS proxy
=============================================

jersey version: 2.14

1. Create custom `HttpUrlConnectorProvider.ConnectionFactory` to apply your socks setting
2. Register the ConnectionFactory to jersey `HttpUrlConnectorProvider`
3. Manipulate jersey `ClientConfig` directly to register custom `ConnectorProvider`
4. Then you can be back on rails of jax-rs client API

