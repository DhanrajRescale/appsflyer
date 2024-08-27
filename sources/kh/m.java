package kh;

import com.assetgro.stockgro.prod.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f23151d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f23152e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f23153f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f23154g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f23155h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m[] f23156i;

    /* renamed from: a, reason: collision with root package name */
    public final String f23157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23159c;

    static {
        m mVar = new m("FifteenDays", 0, "15D", R.string.in_last_15_days, R.string.last_15_days);
        f23151d = mVar;
        m mVar2 = new m("ThirtyDays", 1, "30D", R.string.in_last_30_days, R.string.last_30_days);
        f23152e = mVar2;
        m mVar3 = new m("SixtyDays", 2, "60D", R.string.in_last_60_days, R.string.last_60_days);
        f23153f = mVar3;
        m mVar4 = new m("NinetyDays", 3, "90D", R.string.in_last_90_days, R.string.last_90_days);
        f23154g = mVar4;
        m mVar5 = new m("Lifetime", 4, "LIFETIME", R.string.in_lifetime, R.string.lifetime);
        f23155h = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f23156i = mVarArr;
        zq.f.E(mVarArr);
    }

    public m(String str, int i10, String str2, int i11, int i12) {
        this.f23157a = str2;
        this.f23158b = i11;
        this.f23159c = i12;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f23156i.clone();
    }
}
