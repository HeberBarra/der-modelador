package org.modelador.base.componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JPanel;
import org.jetbrains.annotations.NotNull;

public class Componente extends JPanel implements ConversorXml {

    protected Color corFundo;
    protected int largura;
    protected int altura;
    protected int x;
    protected int y;

    public Componente() {
        super();
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (corFundo == null) return;

        graphics.setColor(corFundo);
        graphics.fillRect(0, 0, largura, altura);
    }

    @Override
    public void setBackground(@NotNull Color corFundo) {
        super.setBackground(new Color(0, 0, 0, 0));
        this.corFundo = corFundo;
        repaint();
    }

    @Override
    public void setSize(int largura, int altura) {
        super.setSize(largura, altura);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void setSize(@NotNull Dimension tamanho) {
        this.setSize(tamanho.width, tamanho.height);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setLocation(@NotNull Point posicao) {
        this.setLocation(posicao.x, posicao.y);
    }

    @Override
    public void setBounds(int x, int y, int largura, int altura) {
        super.setBounds(x, y, largura, altura);
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void setBounds(@NotNull Rectangle retangulo) {
        this.setBounds(retangulo.x, retangulo.y, retangulo.width, retangulo.height);
    }

    public Color getCorFundo() {
        return corFundo;
    }

    public void setCorFundo(Color corFundo) {
        this.corFundo = corFundo;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
