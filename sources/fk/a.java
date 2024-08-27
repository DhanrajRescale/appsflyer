package fk;

import ek.l;
import ek.t;
import ek.u;
import ek.v;
import ek.w;
import java.util.ArrayDeque;
import rk.g;
import xj.j;
import xj.k;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final j f16143b = j.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final u f16144a;

    public a(u uVar) {
        this.f16144a = uVar;
    }

    @Override // ek.w
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, k kVar) {
        l lVar = (l) obj;
        u uVar = this.f16144a;
        if (uVar != null) {
            t a10 = t.a(lVar);
            Object a11 = ((g) uVar.f15627b).a(a10);
            ArrayDeque arrayDeque = t.f15622d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            l lVar2 = (l) a11;
            if (lVar2 == null) {
                ((g) uVar.f15627b).d(t.a(lVar), lVar);
            } else {
                lVar = lVar2;
            }
        }
        return new v(lVar, new yj.l(lVar, ((Integer) kVar.c(f16143b)).intValue()));
    }
}
