package h2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f17822a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f17823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17824c;

    public h(Function0 function0, Function0 function02, boolean z10) {
        this.f17822a = function0;
        this.f17823b = function02;
        this.f17824c = z10;
    }

    public final Function0 a() {
        return this.f17823b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f17822a.mo2invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f17823b.mo2invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return v.e.k(sb2, this.f17824c, ')');
    }
}
