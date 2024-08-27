package m5;

import android.net.Uri;
import b5.d0;
import e5.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements q5.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f27513a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27516d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27517e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27518f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27519g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27520h;

    /* renamed from: i, reason: collision with root package name */
    public final t f27521i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f27522j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f27523k;

    /* renamed from: l, reason: collision with root package name */
    public final i f27524l;

    /* renamed from: m, reason: collision with root package name */
    public final List f27525m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, t tVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f27513a = j10;
        this.f27514b = j11;
        this.f27515c = j12;
        this.f27516d = z10;
        this.f27517e = j13;
        this.f27518f = j14;
        this.f27519g = j15;
        this.f27520h = j16;
        this.f27524l = iVar;
        this.f27521i = tVar;
        this.f27523k = uri;
        this.f27522j = d0Var;
        this.f27525m = arrayList;
    }

    public final h a(int i10) {
        return (h) this.f27525m.get(i10);
    }

    public final long b(int i10) {
        long j10;
        long j11;
        List list = this.f27525m;
        if (i10 == list.size() - 1) {
            j10 = this.f27514b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f27548b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f27548b;
            j11 = ((h) list.get(i10)).f27548b;
        }
        return j10 - j11;
    }

    public final long c(int i10) {
        return x.F(b(i10));
    }
}
