package m5;

import android.net.Uri;
import b5.v;
import java.util.ArrayList;
import java.util.List;
import lp.o0;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: h, reason: collision with root package name */
    public final String f27561h;

    /* renamed from: i, reason: collision with root package name */
    public final j f27562i;

    /* renamed from: j, reason: collision with root package name */
    public final e.l f27563j;

    public l(long j10, v vVar, o0 o0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(vVar, o0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) o0Var.get(0)).f27509a);
        long j11 = rVar.f27584e;
        if (j11 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.f27583d, j11, null);
        }
        this.f27562i = jVar;
        this.f27561h = null;
        this.f27563j = jVar == null ? new e.l(new j(0L, -1L, null), 17) : null;
    }

    @Override // m5.m
    public final String a() {
        return this.f27561h;
    }

    @Override // m5.m
    public final l5.i c() {
        return this.f27563j;
    }

    @Override // m5.m
    public final j d() {
        return this.f27562i;
    }
}
