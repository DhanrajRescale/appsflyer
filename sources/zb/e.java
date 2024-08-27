package zb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42254a;

    /* renamed from: b, reason: collision with root package name */
    public final c f42255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42257d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42259f;

    /* renamed from: g, reason: collision with root package name */
    public final d f42260g;

    public e(boolean z10, c indicator, int i10, int i11, int i12, int i13, d template) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(template, "template");
        this.f42254a = z10;
        this.f42255b = indicator;
        this.f42256c = i10;
        this.f42257d = i11;
        this.f42258e = i12;
        this.f42259f = i13;
        this.f42260g = template;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f42254a == eVar.f42254a && this.f42255b == eVar.f42255b && this.f42256c == eVar.f42256c && this.f42257d == eVar.f42257d && this.f42258e == eVar.f42258e && this.f42259f == eVar.f42259f && this.f42260g == eVar.f42260g;
    }

    public final int hashCode() {
        return this.f42260g.hashCode() + da.e.f(this.f42259f, da.e.f(this.f42258e, da.e.f(this.f42257d, da.e.f(this.f42256c, (this.f42255b.hashCode() + (Boolean.hashCode(this.f42254a) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "StyleTradeViewGraphWidget(showGraph=" + this.f42254a + ", indicator=" + this.f42255b + ", entryPriceLabelTextSize=" + this.f42256c + ", targetPriceLabelTextSize=" + this.f42257d + ", entryPriceValueTextSize=" + this.f42258e + ", targetPriceValueTextSize=" + this.f42259f + ", template=" + this.f42260g + ")";
    }
}
