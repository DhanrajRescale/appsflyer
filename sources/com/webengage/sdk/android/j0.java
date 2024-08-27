package com.webengage.sdk.android;

import com.webengage.sdk.android.f0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f12597a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f12598b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f12599c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f12600d;

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f12601e;

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f12602f;

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f12603g;

    /* renamed from: h, reason: collision with root package name */
    public static final j0 f12604h;

    /* renamed from: i, reason: collision with root package name */
    public static final j0 f12605i;

    /* renamed from: j, reason: collision with root package name */
    public static final j0 f12606j;

    /* renamed from: k, reason: collision with root package name */
    public static final j0 f12607k;

    /* renamed from: l, reason: collision with root package name */
    public static final j0 f12608l;

    /* renamed from: m, reason: collision with root package name */
    public static final j0 f12609m;

    /* renamed from: n, reason: collision with root package name */
    public static final j0 f12610n;

    /* renamed from: o, reason: collision with root package name */
    public static final j0 f12611o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ j0[] f12612p;

    /* renamed from: q, reason: collision with root package name */
    f0.a[] f12613q;

    static {
        f0.a aVar = com.webengage.sdk.android.actions.rules.b.f12434b;
        f0.a aVar2 = com.webengage.sdk.android.z0.b.b.f13027c;
        j0 j0Var = new j0("BOOT_UP", 0, new f0.a[]{com.webengage.sdk.android.actions.database.b.f12244b, aVar, aVar2});
        f12597a = j0Var;
        f0.a aVar3 = com.webengage.sdk.android.actions.render.o.f12415b;
        f0.a aVar4 = com.webengage.sdk.android.actions.database.g.f12265b;
        f0.a aVar5 = com.webengage.sdk.android.actions.rules.g.f12459b;
        f0.a aVar6 = com.webengage.sdk.android.actions.database.q.f12289c;
        j0 j0Var2 = new j0("EVENT", 1, new f0.a[]{aVar3, aVar4, aVar5, aVar2, aVar6});
        f12598b = j0Var2;
        j0 j0Var3 = new j0("GCM_MESSAGE", 2, new f0.a[]{aVar4, aVar3});
        f12599c = j0Var3;
        j0 j0Var4 = new j0("CONFIG_REFRESH", 3, new f0.a[]{aVar});
        f12600d = j0Var4;
        j0 j0Var5 = new j0("SYNC_TO_SERVER", 4, new f0.a[]{com.webengage.sdk.android.actions.database.v.f12305b});
        f12601e = j0Var5;
        j0 j0Var6 = new j0("DEEPLINK", 5, new f0.a[]{com.webengage.sdk.android.z0.a.b.f13022b});
        f12602f = j0Var6;
        j0 j0Var7 = new j0("EXCEPTION", 6, new f0.a[]{com.webengage.sdk.android.actions.exception.b.f12316b});
        f12603g = j0Var7;
        j0 j0Var8 = new j0("INTERNAL_EVENT", 7, new f0.a[]{aVar3, aVar4, aVar5});
        f12604h = j0Var8;
        j0 j0Var9 = new j0("DATA", 8, new f0.a[]{aVar4});
        f12605i = j0Var9;
        j0 j0Var10 = new j0("RENDER", 9, new f0.a[]{aVar3});
        f12606j = j0Var10;
        j0 j0Var11 = new j0("RULE_EXECUTION", 10, new f0.a[]{aVar5});
        f12607k = j0Var11;
        j0 j0Var12 = new j0("FETCH_PROFILE", 11, new f0.a[]{com.webengage.sdk.android.actions.database.a0.f12241b});
        f12608l = j0Var12;
        j0 j0Var13 = new j0("JOURNEY_CONTEXT", 12, new f0.a[]{com.webengage.sdk.android.actions.database.l.f12279b});
        f12609m = j0Var13;
        j0 j0Var14 = new j0("REPORT", 13, new f0.a[]{aVar6});
        f12610n = j0Var14;
        j0 j0Var15 = new j0("AMPLIFY", 14, new f0.a[]{b.f12530b});
        f12611o = j0Var15;
        f12612p = new j0[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8, j0Var9, j0Var10, j0Var11, j0Var12, j0Var13, j0Var14, j0Var15};
    }

    private j0(String str, int i10, f0.a[] aVarArr) {
        this.f12613q = aVarArr;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f12612p.clone();
    }

    public f0.a[] a() {
        return this.f12613q;
    }
}
