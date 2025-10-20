import React from 'react';

declare global {
    namespace JSX {
        interface IntrinsicElements {
            [elemName: string]: any;
        }
    }
}

const Header: React.FC = () => {
    return (
        <header>
            <h1>Restaurante</h1>
            <nav>
                <ul>
                    <li><a href="/">Home</a></li>
                    <li><a href="/clientes">Clientes</a></li>
                    <li><a href="/funcionarios">Funcionários</a></li>
                    <li><a href="/pedidos">Pedidos</a></li>
                </ul>
            </nav>
        </header>
    );
};

export default Header;