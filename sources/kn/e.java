package kn;

import android.content.Context;
import javax.inject.Provider;
import pn.m;

/* loaded from: classes2.dex */
public final class e implements ln.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23274a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f23275b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f23276c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f23277d;

    public /* synthetic */ e(Provider provider, ll.a aVar, ll.e eVar, int i10) {
        this.f23274a = i10;
        this.f23275b = provider;
        this.f23276c = aVar;
        this.f23277d = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f23274a;
        Provider provider = this.f23277d;
        Provider provider2 = this.f23276c;
        Provider provider3 = this.f23275b;
        switch (i10) {
            case 0:
                return new d((Context) provider3.get(), (rn.a) provider2.get(), (rn.a) provider.get());
            default:
                return new m((Context) provider3.get(), (String) provider2.get(), ((Integer) provider.get()).intValue());
        }
    }
}
