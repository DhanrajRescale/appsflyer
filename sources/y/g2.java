package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public j2 f40726a;

    /* renamed from: b, reason: collision with root package name */
    public iu.y f40727b;

    /* renamed from: c, reason: collision with root package name */
    public long f40728c;

    /* renamed from: d, reason: collision with root package name */
    public int f40729d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2 f40731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu.y f40732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f40733h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(j2 j2Var, iu.y yVar, long j10, yt.a aVar) {
        super(2, aVar);
        this.f40731f = j2Var;
        this.f40732g = yVar;
        this.f40733h = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g2 g2Var = new g2(this.f40731f, this.f40732g, this.f40733h, aVar);
        g2Var.f40730e = obj;
        return g2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        j2 j2Var;
        iu.y yVar;
        float c10;
        long j10;
        j2 j2Var2;
        long a10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40729d;
        g1 g1Var = g1.f40724b;
        if (i10 != 0) {
            if (i10 == 1) {
                j10 = this.f40728c;
                yVar = this.f40727b;
                j2Var = this.f40726a;
                j2Var2 = (j2) this.f40730e;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            q1 q1Var = (q1) this.f40730e;
            j2Var = this.f40731f;
            f2 f2Var = new f2(j2Var, new x.z(5, j2Var, q1Var));
            x0 x0Var = j2Var.f40800e;
            yVar = this.f40732g;
            long j11 = yVar.f20559a;
            g1 g1Var2 = j2Var.f40797b;
            long j12 = this.f40733h;
            if (g1Var2 == g1Var) {
                c10 = w2.o.b(j12);
            } else {
                c10 = w2.o.c(j12);
            }
            if (j2Var.f40799d) {
                c10 *= -1;
            }
            this.f40730e = j2Var;
            this.f40726a = j2Var;
            this.f40727b = yVar;
            this.f40728c = j11;
            this.f40729d = 1;
            obj = x0Var.a(f2Var, c10, this);
            if (obj == aVar) {
                return aVar;
            }
            j10 = j11;
            j2Var2 = j2Var;
        }
        float floatValue = ((Number) obj).floatValue();
        if (j2Var2.f40799d) {
            floatValue *= -1;
        }
        if (j2Var.f40797b == g1Var) {
            a10 = w2.o.a(j10, floatValue, s0.g.f34069a, 2);
        } else {
            a10 = w2.o.a(j10, s0.g.f34069a, floatValue, 1);
        }
        yVar.f20559a = a10;
        return Unit.f23355a;
    }
}
