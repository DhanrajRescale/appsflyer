package b1;

import com.assetgro.stockgro.data.model.Media;
import iu.k;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;
import yk.j;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3073g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        super(2);
        this.f3067a = i11;
        this.f3069c = obj;
        this.f3070d = obj2;
        this.f3071e = obj3;
        this.f3072f = obj4;
        this.f3073g = obj5;
        this.f3068b = i10;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f3067a;
        int i12 = this.f3068b;
        Object obj = this.f3069c;
        switch (i11) {
            case 0:
                ((c) obj).a(this.f3070d, this.f3071e, this.f3072f, this.f3073g, nVar, t.H0(i12) | 1);
                return;
            default:
                j.g((Media) obj, (ArrayList) this.f3070d, (Function0) this.f3071e, (Function1) this.f3072f, (Function2) this.f3073g, nVar, t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f3067a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
