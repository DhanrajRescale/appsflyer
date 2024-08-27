package jn;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class s implements ln.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21526a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f21527b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f21528c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f21529d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f21530e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f21531f;

    public /* synthetic */ s(Provider provider, Provider provider2, ln.b bVar, Provider provider3, Provider provider4, int i10) {
        this.f21526a = i10;
        this.f21527b = provider;
        this.f21528c = provider2;
        this.f21529d = bVar;
        this.f21530e = provider3;
        this.f21531f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f21526a;
        Provider provider = this.f21531f;
        Provider provider2 = this.f21530e;
        Provider provider3 = this.f21529d;
        Provider provider4 = this.f21528c;
        Provider provider5 = this.f21527b;
        switch (i10) {
            case 0:
                return new r((rn.a) provider5.get(), (rn.a) provider4.get(), (nn.b) provider3.get(), (on.h) provider2.get(), (on.i) provider.get());
            case 1:
                return new nn.a((Executor) provider5.get(), (kn.f) provider4.get(), (on.j) provider3.get(), (pn.d) provider2.get(), (qn.b) provider.get());
            default:
                rn.a aVar = (rn.a) provider5.get();
                rn.a aVar2 = (rn.a) provider4.get();
                Object obj = provider3.get();
                return new pn.j(aVar, aVar2, (pn.a) obj, (pn.m) provider2.get(), this.f21531f);
        }
    }
}
