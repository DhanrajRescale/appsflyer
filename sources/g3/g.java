package g3;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class g extends b implements h3.d {

    /* renamed from: k0, reason: collision with root package name */
    public final k f16493k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f16494l0;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f16495m0;

    public g(k kVar, int i10) {
        super(kVar);
        this.f16495m0 = new ArrayList();
        this.f16493k0 = kVar;
        this.f16494l0 = i10;
    }

    @Override // g3.b, g3.h
    public void a() {
    }

    @Override // g3.b, g3.h
    public final j3.d c() {
        return t();
    }

    public final void r(Object... objArr) {
        Collections.addAll(this.f16495m0, objArr);
    }

    public final void s() {
        super.a();
    }

    public j3.j t() {
        return null;
    }
}
