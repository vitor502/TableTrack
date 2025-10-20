import React, { useEffect, useState } from 'react';
import { Cliente } from '../types';
import { fetchClientes } from '../services/api';

const Clientes: React.FC = () => {
    const [clientes, setClientes] = useState<Cliente[]>([]);
    const [loading, setLoading] = useState<boolean>(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        const loadClientes = async () => {
            try {
                const data = await fetchClientes();
                setClientes(data);
            } catch (err) {
                setError('Erro ao carregar clientes');
            } finally {
                setLoading(false);
            }
        };

        loadClientes();
    }, []);

    if (loading) {
        return <div>Carregando...</div>;
    }

    if (error) {
        return <div>{error}</div>;
    }

    return (
        <div>
            <h1>Lista de Clientes</h1>
            <ul>
                {clientes.map(cliente => (
                    <li key={cliente.id}>
                        {cliente.nome} - {cliente.email} - {cliente.telefone}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default Clientes;