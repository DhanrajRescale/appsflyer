package j5;

import b5.i1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f20963a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f20964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20965c;

    /* renamed from: d, reason: collision with root package name */
    public final r5.w f20966d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20967e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f20968f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20969g;

    /* renamed from: h, reason: collision with root package name */
    public final r5.w f20970h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20971i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20972j;

    public b(long j10, i1 i1Var, int i10, r5.w wVar, long j11, i1 i1Var2, int i11, r5.w wVar2, long j12, long j13) {
        this.f20963a = j10;
        this.f20964b = i1Var;
        this.f20965c = i10;
        this.f20966d = wVar;
        this.f20967e = j11;
        this.f20968f = i1Var2;
        this.f20969g = i11;
        this.f20970h = wVar2;
        this.f20971i = j12;
        this.f20972j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20963a == bVar.f20963a && this.f20965c == bVar.f20965c && this.f20967e == bVar.f20967e && this.f20969g == bVar.f20969g && this.f20971i == bVar.f20971i && this.f20972j == bVar.f20972j && pn.e.g(this.f20964b, bVar.f20964b) && pn.e.g(this.f20966d, bVar.f20966d) && pn.e.g(this.f20968f, bVar.f20968f) && pn.e.g(this.f20970h, bVar.f20970h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20963a), this.f20964b, Integer.valueOf(this.f20965c), this.f20966d, Long.valueOf(this.f20967e), this.f20968f, Integer.valueOf(this.f20969g), this.f20970h, Long.valueOf(this.f20971i), Long.valueOf(this.f20972j)});
    }
}
