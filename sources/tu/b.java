package tu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class b extends uu.f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36407f = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final su.o f36408d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36409e;

    public /* synthetic */ b(su.o oVar, boolean z10) {
        this(oVar, z10, kotlin.coroutines.k.f23369a, -3, su.a.f34776a);
    }

    @Override // uu.f, tu.f
    public final Object c(g gVar, yt.a aVar) {
        if (this.f37432b == -3) {
            boolean z10 = this.f36409e;
            if (z10 && f36407f.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
            Object O = el.l.O(gVar, this.f36408d, z10, aVar);
            if (O == zt.a.f42823a) {
                return O;
            }
            return Unit.f23355a;
        }
        Object c10 = super.c(gVar, aVar);
        if (c10 == zt.a.f42823a) {
            return c10;
        }
        return Unit.f23355a;
    }

    @Override // uu.f
    public final String g() {
        return "channel=" + this.f36408d;
    }

    @Override // uu.f
    public final Object h(su.n nVar, yt.a aVar) {
        Object O = el.l.O(new uu.a0(nVar), this.f36408d, this.f36409e, aVar);
        if (O == zt.a.f42823a) {
            return O;
        }
        return Unit.f23355a;
    }

    @Override // uu.f
    public final uu.f i(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return new b(this.f36408d, this.f36409e, coroutineContext, i10, aVar);
    }

    @Override // uu.f
    public final f j() {
        return new b(this.f36408d, this.f36409e);
    }

    @Override // uu.f
    public final su.o k(qu.f0 f0Var) {
        if (this.f36409e && f36407f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        if (this.f37432b == -3) {
            return this.f36408d;
        }
        return super.k(f0Var);
    }

    public b(su.o oVar, boolean z10, CoroutineContext coroutineContext, int i10, su.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f36408d = oVar;
        this.f36409e = z10;
        this.consumed$volatile = 0;
    }
}
