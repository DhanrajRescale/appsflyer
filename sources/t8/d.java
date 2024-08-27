package t8;

import iu.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;
import y8.m;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f35569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f35570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f35571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y8.j f35572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f35573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f35574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n8.e f35575h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, z zVar, z zVar2, y8.j jVar, Object obj, z zVar3, n8.e eVar, yt.a aVar) {
        super(2, aVar);
        this.f35569b = iVar;
        this.f35570c = zVar;
        this.f35571d = zVar2;
        this.f35572e = jVar;
        this.f35573f = obj;
        this.f35574g = zVar3;
        this.f35575h = eVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f35569b, this.f35570c, this.f35571d, this.f35572e, this.f35573f, this.f35574g, this.f35575h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35568a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            i iVar = this.f35569b;
            s8.n nVar = (s8.n) this.f35570c.f20560a;
            n8.c cVar = (n8.c) this.f35571d.f20560a;
            y8.j jVar = this.f35572e;
            Object obj2 = this.f35573f;
            m mVar = (m) this.f35574g.f20560a;
            n8.e eVar = this.f35575h;
            this.f35568a = 1;
            obj = i.a(iVar, nVar, cVar, jVar, obj2, mVar, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
