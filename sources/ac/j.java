package ac;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class j extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, boolean z10, boolean z11, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f341a = i12;
        this.f346f = obj;
        this.f342b = z10;
        this.f343c = z11;
        this.f347g = dVar;
        this.f344d = i10;
        this.f345e = i11;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f341a;
        int i12 = this.f344d;
        Object obj = this.f347g;
        Object obj2 = this.f346f;
        switch (i11) {
            case 0:
                kp.j.v((String) obj2, this.f342b, this.f343c, (Function1) obj, nVar, t.H0(i12 | 1), this.f345e);
                return;
            case 1:
                yk.j.Q((o) obj2, this.f342b, this.f343c, (hu.c) obj, nVar, t.H0(i12 | 1), this.f345e);
                return;
            case 2:
                yk.j.a0((o) obj2, this.f342b, this.f343c, (Function0) obj, nVar, t.H0(i12 | 1), this.f345e);
                return;
            case 3:
                kp.j.l((CreateGroupUser) obj2, this.f342b, this.f343c, (Function2) obj, nVar, t.H0(i12 | 1), this.f345e);
                return;
            default:
                zq.f.a((String) obj2, (String) obj, this.f342b, this.f343c, nVar, t.H0(i12 | 1), this.f345e);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f341a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, int i10, int i11, String str2, boolean z10, boolean z11) {
        super(2);
        this.f341a = 4;
        this.f346f = str;
        this.f347g = str2;
        this.f342b = z10;
        this.f343c = z11;
        this.f344d = i10;
        this.f345e = i11;
    }
}
