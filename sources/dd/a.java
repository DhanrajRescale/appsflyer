package dd;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.s;
import t0.n;
import t0.t;
import yk.j;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f14296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f14301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, int i10, String str, long j11, long j12, s sVar, int i11) {
        super(2);
        this.f14296a = j10;
        this.f14297b = i10;
        this.f14298c = str;
        this.f14299d = j11;
        this.f14300e = j12;
        this.f14301f = sVar;
        this.f14302g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j.K(this.f14296a, this.f14297b, this.f14298c, this.f14299d, this.f14300e, this.f14301f, (n) obj, t.H0(this.f14302g | 1));
        return Unit.f23355a;
    }
}
