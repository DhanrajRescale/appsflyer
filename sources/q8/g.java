package q8;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f31843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, yt.a aVar) {
        super(2, aVar);
        this.f31843a = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f31843a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, bv.i0] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        h hVar = this.f31843a;
        synchronized (hVar) {
            if (hVar.f31856l && !hVar.f31857m) {
                try {
                    hVar.z();
                } catch (IOException unused) {
                    hVar.f31858n = true;
                }
                try {
                    if (hVar.f31853i >= 2000) {
                        hVar.I();
                    }
                } catch (IOException unused2) {
                    hVar.f31859o = true;
                    hVar.f31854j = hl.f.u(new Object());
                }
                return Unit.f23355a;
            }
            return Unit.f23355a;
        }
    }
}
