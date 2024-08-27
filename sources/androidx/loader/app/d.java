package androidx.loader.app;

import androidx.lifecycle.f0;

/* loaded from: classes.dex */
public final class d implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.loader.content.e f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2015b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2016c = false;

    public d(androidx.loader.content.e eVar, a aVar) {
        this.f2014a = eVar;
        this.f2015b = aVar;
    }

    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        this.f2015b.onLoadFinished(this.f2014a, obj);
        this.f2016c = true;
    }

    public final String toString() {
        return this.f2015b.toString();
    }
}
