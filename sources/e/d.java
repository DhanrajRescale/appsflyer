package e;

import android.os.Bundle;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f14613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f14614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f14615d;

    public d(h hVar, String str, b bVar, f.a aVar) {
        this.f14615d = hVar;
        this.f14612a = str;
        this.f14613b = bVar;
        this.f14614c = aVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, androidx.lifecycle.m mVar) {
        boolean equals = androidx.lifecycle.m.ON_START.equals(mVar);
        String str = this.f14612a;
        h hVar = this.f14615d;
        if (equals) {
            HashMap hashMap = hVar.f14629f;
            f.a aVar = this.f14614c;
            b bVar = this.f14613b;
            hashMap.put(str, new f(aVar, bVar));
            HashMap hashMap2 = hVar.f14630g;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar.d(obj);
            }
            Bundle bundle = hVar.f14631h;
            a aVar2 = (a) bundle.getParcelable(str);
            if (aVar2 != null) {
                bundle.remove(str);
                bVar.d(aVar.c(aVar2.f14610a, aVar2.f14611b));
                return;
            }
            return;
        }
        if (androidx.lifecycle.m.ON_STOP.equals(mVar)) {
            hVar.f14629f.remove(str);
        } else if (androidx.lifecycle.m.ON_DESTROY.equals(mVar)) {
            hVar.f(str);
        }
    }
}
