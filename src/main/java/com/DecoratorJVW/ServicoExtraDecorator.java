package com.DecoratorJVW;

public abstract class ServicoExtraDecorator implements IFesta {
    protected IFesta festaDecorada;

    public ServicoExtraDecorator(IFesta festa) {
        this.festaDecorada = festa;
    }

}
