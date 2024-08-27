package in;

import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;

/* loaded from: classes2.dex */
public final class b implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20124a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f20125b = fq.c.b(PaymentConstants.SDK_VERSION);

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f20126c = fq.c.b("model");

    /* renamed from: d, reason: collision with root package name */
    public static final fq.c f20127d = fq.c.b("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final fq.c f20128e = fq.c.b(LogSubCategory.Context.DEVICE);

    /* renamed from: f, reason: collision with root package name */
    public static final fq.c f20129f = fq.c.b("product");

    /* renamed from: g, reason: collision with root package name */
    public static final fq.c f20130g = fq.c.b("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final fq.c f20131h = fq.c.b("manufacturer");

    /* renamed from: i, reason: collision with root package name */
    public static final fq.c f20132i = fq.c.b("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final fq.c f20133j = fq.c.b("locale");

    /* renamed from: k, reason: collision with root package name */
    public static final fq.c f20134k = fq.c.b("country");

    /* renamed from: l, reason: collision with root package name */
    public static final fq.c f20135l = fq.c.b("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final fq.c f20136m = fq.c.b("applicationBuild");

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        fq.e eVar = (fq.e) obj2;
        j jVar = (j) ((a) obj);
        eVar.d(f20125b, jVar.f20174a);
        eVar.d(f20126c, jVar.f20175b);
        eVar.d(f20127d, jVar.f20176c);
        eVar.d(f20128e, jVar.f20177d);
        eVar.d(f20129f, jVar.f20178e);
        eVar.d(f20130g, jVar.f20179f);
        eVar.d(f20131h, jVar.f20180g);
        eVar.d(f20132i, jVar.f20181h);
        eVar.d(f20133j, jVar.f20182i);
        eVar.d(f20134k, jVar.f20183j);
        eVar.d(f20135l, jVar.f20184k);
        eVar.d(f20136m, jVar.f20185l);
    }
}
