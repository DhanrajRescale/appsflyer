package i0;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import d2.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(CreateGroupUser createGroupUser, boolean z10, Function2 function2) {
        super(0);
        this.f19098a = 4;
        this.f19100c = createGroupUser;
        this.f19099b = z10;
        this.f19101d = function2;
    }

    public final void a() {
        int i10 = this.f19098a;
        Object obj = this.f19101d;
        boolean z10 = this.f19099b;
        Object obj2 = this.f19100c;
        switch (i10) {
            case 1:
                if (z10) {
                    m0.p2 p2Var = (m0.p2) obj2;
                    if (((Boolean) p2Var.f26627a.f27117d.invoke(m0.q2.f26666a)).booleanValue()) {
                        yk.g.H((qu.f0) obj, null, null, new m0.a2(p2Var, null), 3);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (z10) {
                    o7.d dVar = (o7.d) obj2;
                    String key = (String) obj;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    dVar.f29759a.g(key);
                    return;
                }
                return;
            case 3:
                ((androidx.navigation.q) obj2).e((androidx.navigation.n) obj);
                return;
            default:
                CreateGroupUser createGroupUser = (CreateGroupUser) obj2;
                if (!createGroupUser.getIsPartOfGroup()) {
                    if (z10) {
                        ((Function2) obj).invoke(createGroupUser, Boolean.FALSE);
                        return;
                    } else {
                        ((Function2) obj).invoke(createGroupUser, Boolean.TRUE);
                        return;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        d3 d3Var;
        switch (this.f19098a) {
            case 0:
                q1 q1Var = (q1) this.f19100c;
                l1.o oVar = (l1.o) this.f19101d;
                boolean z10 = !this.f19099b;
                if (!q1Var.b()) {
                    oVar.a(l1.h.f23896e);
                } else if (z10 && (d3Var = q1Var.f19136c) != null) {
                    ((d2.u1) d3Var).b();
                }
                return Boolean.TRUE;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, boolean z10, int i10) {
        super(0);
        this.f19098a = i10;
        this.f19100c = obj;
        this.f19101d = obj2;
        this.f19099b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(boolean z10, Object obj, Object obj2, int i10) {
        super(0);
        this.f19098a = i10;
        this.f19099b = z10;
        this.f19100c = obj;
        this.f19101d = obj2;
    }
}
