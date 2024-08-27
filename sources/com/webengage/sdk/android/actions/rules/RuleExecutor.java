package com.webengage.sdk.android.actions.rules;

import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class RuleExecutor {
    public abstract Object evaluateInfixRule(String str);

    public abstract Object evaluatePostfixRule(List<String> list);

    public abstract boolean evaluateRule(e eVar, WebEngageConstant.c cVar);

    public abstract boolean evaluateRule(String str, WebEngageConstant.c cVar);

    public abstract List<String> evaluateRulesByCategory(WebEngageConstant.c cVar);

    public abstract List<String> filterRenderingIds(List<String> list, WebEngageConstant.c cVar);

    public abstract List<d> getEventCriteriasForEvent(String str);

    public abstract com.webengage.sdk.android.actions.rules.k.e getFunction(String str);

    public abstract com.webengage.sdk.android.actions.rules.k.g getOperator(String str);

    public abstract void reset();

    public abstract void setCompetingIds(List<String> list);

    public abstract void setEventCriteriaMap(Map<String, List<d>> map);

    public abstract void setRuleMap(Map<String, e> map);
}
