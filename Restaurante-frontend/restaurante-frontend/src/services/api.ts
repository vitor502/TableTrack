import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080/api', // Altere para a URL da sua API
    headers: {
        'Content-Type': 'application/json',
    },
});

export const getClientes = async () => {
    const response = await api.get('/clientes');
    return response.data;
};

export const addCliente = async (cliente) => {
    const response = await api.post('/clientes', cliente);
    return response.data;
};

export const updateCliente = async (id, cliente) => {
    const response = await api.put(`/clientes/${id}`, cliente);
    return response.data;
};

export const deleteCliente = async (id) => {
    await api.delete(`/clientes/${id}`);
};