package com.example.demo.services;

import com.example.demo.entities.Lanche;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class LancheService {

    public Lanche getById(int id) {
        return null;
    }

    public boolean exists(int id) {
        return true;
    }

    private static String getFileExtension(Path path) {
        String filename = path.getFileName().toString();
        int lastDotIndex = filename.lastIndexOf('.');

        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return "";
        }

        return filename.substring(lastDotIndex + 1);
    }

    public static boolean salvar(Lanche lanche, Path origem, Path pastaDestino) {
        try {
            if (!Files.exists(pastaDestino)) {
                Files.createDirectories(pastaDestino);
            }


            String extensao = getFileExtension(origem);

            if (extensao.isEmpty()) {
                return false;
            }

            String novoNomeArquivo = lanche.getCodigo() + "." + extensao;

            Path destino = pastaDestino.resolve(novoNomeArquivo);

            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean excluirArquivo(String destino, String nomeArquivo) {
        // Criando o caminho completo para o arquivo
        Path caminhoArquivo = Path.of(destino, nomeArquivo);

        // Verificando se o arquivo existe
        if (!Files.exists(caminhoArquivo)) {
            System.out.println("Erro: O arquivo não existe em " + caminhoArquivo);
            return false;
        }

        try {
            // Tentando excluir o arquivo
            return Files.deleteIfExists(caminhoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void atualizar(int id, Lanche lanche, String destino) {
        this.salvar(lanche, Paths.get(lanche.getImagem()), Paths.get(destino));
    }
}
