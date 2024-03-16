package org.Observer;

public class ConditionDenier implements ICondition{
    ICondition _conditionOriginal;
    public ConditionDenier(ICondition original){
        this._conditionOriginal = original;
    }
    @Override
    public boolean evaluate(int x) {
        return !_conditionOriginal.evaluate(x);
    }
}
