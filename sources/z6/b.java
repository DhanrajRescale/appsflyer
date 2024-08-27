package z6;

import java.util.Collections;
import java.util.List;
import yk.j;

/* loaded from: classes.dex */
public final class b implements s6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f42150b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List f42151a;

    public b(d5.b bVar) {
        this.f42151a = Collections.singletonList(bVar);
    }

    @Override // s6.b
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // s6.b
    public final long b(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.E0(z10);
        return 0L;
    }

    @Override // s6.b
    public final List c(long j10) {
        if (j10 >= 0) {
            return this.f42151a;
        }
        return Collections.emptyList();
    }

    @Override // s6.b
    public final int d() {
        return 1;
    }

    public b() {
        this.f42151a = Collections.emptyList();
    }
}
