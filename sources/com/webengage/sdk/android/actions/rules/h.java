package com.webengage.sdk.android.actions.rules;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    static RuleExecutor f12461a;

    /* renamed from: b, reason: collision with root package name */
    static RuleExecutor f12462b;

    public static RuleExecutor a() {
        if (f12462b == null) {
            f12462b = new j();
        }
        return f12462b;
    }

    public static RuleExecutor b() {
        if (f12461a == null) {
            synchronized (h.class) {
                try {
                    if (f12461a == null) {
                        f12461a = new i();
                    }
                } finally {
                }
            }
        }
        return f12461a;
    }
}
