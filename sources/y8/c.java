package y8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import qu.b0;
import qu.r0;
import vu.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f41301a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f41302b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f41303c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f41304d;

    /* renamed from: e, reason: collision with root package name */
    public final c9.e f41305e;

    /* renamed from: f, reason: collision with root package name */
    public final z8.d f41306f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f41307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41308h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f41309i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f41310j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f41311k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f41312l;

    /* renamed from: m, reason: collision with root package name */
    public final b f41313m;

    /* renamed from: n, reason: collision with root package name */
    public final b f41314n;

    /* renamed from: o, reason: collision with root package name */
    public final b f41315o;

    public c() {
        xu.e eVar = r0.f32255a;
        ru.d dVar = ((ru.d) u.f38408a).f34006f;
        xu.d dVar2 = r0.f32256b;
        c9.c cVar = c9.e.f8070a;
        z8.d dVar3 = z8.d.f42180c;
        Bitmap.Config config = d9.e.f14222b;
        b bVar = b.f41296c;
        this.f41301a = dVar;
        this.f41302b = dVar2;
        this.f41303c = dVar2;
        this.f41304d = dVar2;
        this.f41305e = cVar;
        this.f41306f = dVar3;
        this.f41307g = config;
        this.f41308h = true;
        this.f41309i = false;
        this.f41310j = null;
        this.f41311k = null;
        this.f41312l = null;
        this.f41313m = bVar;
        this.f41314n = bVar;
        this.f41315o = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Intrinsics.a(this.f41301a, cVar.f41301a) && Intrinsics.a(this.f41302b, cVar.f41302b) && Intrinsics.a(this.f41303c, cVar.f41303c) && Intrinsics.a(this.f41304d, cVar.f41304d) && Intrinsics.a(this.f41305e, cVar.f41305e) && this.f41306f == cVar.f41306f && this.f41307g == cVar.f41307g && this.f41308h == cVar.f41308h && this.f41309i == cVar.f41309i && Intrinsics.a(this.f41310j, cVar.f41310j) && Intrinsics.a(this.f41311k, cVar.f41311k) && Intrinsics.a(this.f41312l, cVar.f41312l) && this.f41313m == cVar.f41313m && this.f41314n == cVar.f41314n && this.f41315o == cVar.f41315o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int d10 = v.e.d(this.f41309i, v.e.d(this.f41308h, (this.f41307g.hashCode() + ((this.f41306f.hashCode() + ((this.f41305e.hashCode() + ((this.f41304d.hashCode() + ((this.f41303c.hashCode() + ((this.f41302b.hashCode() + (this.f41301a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        int i12 = 0;
        Drawable drawable = this.f41310j;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (d10 + i10) * 31;
        Drawable drawable2 = this.f41311k;
        if (drawable2 != null) {
            i11 = drawable2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Drawable drawable3 = this.f41312l;
        if (drawable3 != null) {
            i12 = drawable3.hashCode();
        }
        return this.f41315o.hashCode() + ((this.f41314n.hashCode() + ((this.f41313m.hashCode() + ((i14 + i12) * 31)) * 31)) * 31);
    }
}
