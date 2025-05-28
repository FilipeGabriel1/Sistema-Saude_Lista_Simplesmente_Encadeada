import java.util.ArrayList;
import java.util.List;

public class ListaEncadeadaSimples<T> {
    private No<T> cabeca;

    private static class No<T> {
        T dado;
        No<T> proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public ListaEncadeadaSimples() {
        this.cabeca = null;
    }

    public void adicionar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No<T> atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

   
    public List<T> listar() {
        List<T> lista = new ArrayList<>();
        No<T> atual = cabeca;
        while (atual != null) {
            lista.add(atual.dado);
            atual = atual.proximo;
        }
        return lista;
    }

  
    public T buscarPorId(int id) {
        No<T> atual = cabeca;
        while (atual != null) {
            try {
                var metodo = atual.dado.getClass().getMethod("getId");
                Object valorId = metodo.invoke(atual.dado);
                if (valorId instanceof Integer && ((Integer) valorId) == id) {
                    return atual.dado;
                }
            } catch (Exception e) {
                
            }
            atual = atual.proximo;
        }
        return null;
    }

    public boolean editar(T dadoEditado) {
        No<T> atual = cabeca;
        try {
            var metodo = dadoEditado.getClass().getMethod("getId");
            Object idEditado = metodo.invoke(dadoEditado);
            while (atual != null) {
                Object idAtual = atual.dado.getClass().getMethod("getId").invoke(atual.dado);
                if (idAtual.equals(idEditado)) {
                    atual.dado = dadoEditado;
                    return true;
                }
                atual = atual.proximo;
            }
        } catch (Exception e) {
            
        }
        return false;
    }

   
    public boolean removerPorId(int id) {
        if (cabeca == null) return false;
        try {
            Object idCabeca = cabeca.dado.getClass().getMethod("getId").invoke(cabeca.dado);
            if (idCabeca instanceof Integer && ((Integer) idCabeca) == id) {
                cabeca = cabeca.proximo;
                return true;
            }
            No<T> atual = cabeca;
            while (atual.proximo != null) {
                Object idProximo = atual.proximo.dado.getClass().getMethod("getId").invoke(atual.proximo.dado);
                if (idProximo instanceof Integer && ((Integer) idProximo) == id) {
                    atual.proximo = atual.proximo.proximo;
                    return true;
                }
                atual = atual.proximo;
            }
        } catch (Exception e) {
            
        }
        return false;
    }
}
