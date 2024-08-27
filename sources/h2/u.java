package h2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f17909a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f17910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17911c;

    public /* synthetic */ u(String str) {
        this(str, q.f17879n);
    }

    public final void a(v vVar, Object obj) {
        ((j) vVar).h(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f17909a;
    }

    public u(String str, Function2 function2) {
        this.f17909a = str;
        this.f17910b = function2;
    }

    public u(String str, boolean z10, q qVar) {
        this(str, qVar);
        this.f17911c = z10;
    }
}
