package qf;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f31927b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f31928c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f31929d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f31930e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f31931f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f31932g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f31933h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f31934i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f31935j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f31936k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f31937l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f31938m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f31939n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f31940o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f31941p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b[] f31942q;

    /* renamed from: a, reason: collision with root package name */
    public final String f31943a;

    static {
        b bVar = new b("GLOBAL", 0, "global");
        f31927b = bVar;
        b bVar2 = new b("GAMES", 1, "games");
        f31928c = bVar2;
        b bVar3 = new b("SOCIAL", 2, "social");
        f31929d = bVar3;
        b bVar4 = new b("SOCIAL_FEED", 3, "social_feed");
        f31930e = bVar4;
        b bVar5 = new b("SOCIAL_CHAT", 4, "social_chat");
        f31931f = bVar5;
        b bVar6 = new b("WALLET", 5, "wallet");
        f31932g = bVar6;
        b bVar7 = new b("WALLET_WITHDRAW", 6, "wallet_withdraw");
        f31933h = bVar7;
        b bVar8 = new b("WALLET_DEPOSIT", 7, "wallet_deposit");
        f31934i = bVar8;
        b bVar9 = new b("KYC", 8, "kyc");
        f31935j = bVar9;
        b bVar10 = new b("STOCKGYAN", 9, "stockgyan");
        f31936k = bVar10;
        b bVar11 = new b("SUBSCRIPTION", 10, "subscription");
        f31937l = bVar11;
        b bVar12 = new b("MARKETS", 11, "markets");
        f31938m = bVar12;
        b bVar13 = new b("MARKETS_STOCKS", 12, "markets_stocks");
        f31939n = bVar13;
        b bVar14 = new b("MARKETS_FNO", 13, "markets_options");
        f31940o = bVar14;
        b bVar15 = new b("PORTFOLIO", 14, "portfolio");
        f31941p = bVar15;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        f31942q = bVarArr;
        f.E(bVarArr);
    }

    public b(String str, int i10, String str2) {
        this.f31943a = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f31942q.clone();
    }
}
