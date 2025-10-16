package com.DecoratorJVW;

public class DJOutsiderDec extends ServicoExtraDecorator {
    public DJOutsiderDec(IFesta festa) {
        super(festa);
    }

    @Override
    public String getDescricao() {
        return festaDecorada.getDescricao() + ", DJ LoweZera";
    }

    @Override
    public double getCusto() {
        return festaDecorada.getCusto() + 1000.00;
    }
}
