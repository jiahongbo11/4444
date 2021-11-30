package com.example.andriod_exp_4_graphics_master;

public class ExpressionWithVars extends Expression {
    private String m_strExp;
    private String m_strVar;

    public ExpressionWithVars(String strExp, String var) {
        m_strExp = strExp;
        m_strVar = var;
    }

    public double evalf(double dVarVal) {

        String str = m_strExp.replace(m_strVar, dVarVal + "");

        double d = super.evalf(str);
        return d;

    }


}