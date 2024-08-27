package nk;

import ak.o;
import ak.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import hk.l;
import hk.n;
import hk.q;
import okhttp3.internal.http2.Http2;
import t.j0;
import xj.j;
import xj.k;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f28767a;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f28771e;

    /* renamed from: f, reason: collision with root package name */
    public int f28772f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f28773g;

    /* renamed from: h, reason: collision with root package name */
    public int f28774h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28779m;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f28781o;

    /* renamed from: p, reason: collision with root package name */
    public int f28782p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28786t;

    /* renamed from: u, reason: collision with root package name */
    public Resources.Theme f28787u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28788v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28789w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28790x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28792z;

    /* renamed from: b, reason: collision with root package name */
    public float f28768b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public p f28769c = p.f558d;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.e f28770d = com.bumptech.glide.e.f10813c;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28775i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f28776j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f28777k = -1;

    /* renamed from: l, reason: collision with root package name */
    public xj.g f28778l = qk.a.f32081b;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28780n = true;

    /* renamed from: q, reason: collision with root package name */
    public k f28783q = new k();

    /* renamed from: r, reason: collision with root package name */
    public rk.b f28784r = new j0(0);

    /* renamed from: s, reason: collision with root package name */
    public Class f28785s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28791y = true;

    public static boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a a(a aVar) {
        if (this.f28788v) {
            return clone().a(aVar);
        }
        if (h(aVar.f28767a, 2)) {
            this.f28768b = aVar.f28768b;
        }
        if (h(aVar.f28767a, 262144)) {
            this.f28789w = aVar.f28789w;
        }
        if (h(aVar.f28767a, 1048576)) {
            this.f28792z = aVar.f28792z;
        }
        if (h(aVar.f28767a, 4)) {
            this.f28769c = aVar.f28769c;
        }
        if (h(aVar.f28767a, 8)) {
            this.f28770d = aVar.f28770d;
        }
        if (h(aVar.f28767a, 16)) {
            this.f28771e = aVar.f28771e;
            this.f28772f = 0;
            this.f28767a &= -33;
        }
        if (h(aVar.f28767a, 32)) {
            this.f28772f = aVar.f28772f;
            this.f28771e = null;
            this.f28767a &= -17;
        }
        if (h(aVar.f28767a, 64)) {
            this.f28773g = aVar.f28773g;
            this.f28774h = 0;
            this.f28767a &= -129;
        }
        if (h(aVar.f28767a, 128)) {
            this.f28774h = aVar.f28774h;
            this.f28773g = null;
            this.f28767a &= -65;
        }
        if (h(aVar.f28767a, 256)) {
            this.f28775i = aVar.f28775i;
        }
        if (h(aVar.f28767a, 512)) {
            this.f28777k = aVar.f28777k;
            this.f28776j = aVar.f28776j;
        }
        if (h(aVar.f28767a, UserMetadata.MAX_ATTRIBUTE_SIZE)) {
            this.f28778l = aVar.f28778l;
        }
        if (h(aVar.f28767a, 4096)) {
            this.f28785s = aVar.f28785s;
        }
        if (h(aVar.f28767a, UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
            this.f28781o = aVar.f28781o;
            this.f28782p = 0;
            this.f28767a &= -16385;
        }
        if (h(aVar.f28767a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f28782p = aVar.f28782p;
            this.f28781o = null;
            this.f28767a &= -8193;
        }
        if (h(aVar.f28767a, 32768)) {
            this.f28787u = aVar.f28787u;
        }
        if (h(aVar.f28767a, 65536)) {
            this.f28780n = aVar.f28780n;
        }
        if (h(aVar.f28767a, 131072)) {
            this.f28779m = aVar.f28779m;
        }
        if (h(aVar.f28767a, 2048)) {
            this.f28784r.putAll(aVar.f28784r);
            this.f28791y = aVar.f28791y;
        }
        if (h(aVar.f28767a, 524288)) {
            this.f28790x = aVar.f28790x;
        }
        if (!this.f28780n) {
            this.f28784r.clear();
            int i10 = this.f28767a;
            this.f28779m = false;
            this.f28767a = i10 & (-133121);
            this.f28791y = true;
        }
        this.f28767a |= aVar.f28767a;
        this.f28783q.f40305b.g(aVar.f28783q.f40305b);
        n();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk.d, java.lang.Object] */
    public final a b() {
        return r(l.f18541b, new Object());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [t.j0, rk.b, t.f] */
    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            k kVar = new k();
            aVar.f28783q = kVar;
            kVar.f40305b.g(this.f28783q.f40305b);
            ?? j0Var = new j0(0);
            aVar.f28784r = j0Var;
            j0Var.putAll(this.f28784r);
            aVar.f28786t = false;
            aVar.f28788v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a d(Class cls) {
        if (this.f28788v) {
            return clone().d(cls);
        }
        this.f28785s = cls;
        this.f28767a |= 4096;
        n();
        return this;
    }

    public final a e() {
        return o(n.f18550i, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f28768b, this.f28768b) != 0 || this.f28772f != aVar.f28772f || !rk.k.a(this.f28771e, aVar.f28771e) || this.f28774h != aVar.f28774h || !rk.k.a(this.f28773g, aVar.f28773g) || this.f28782p != aVar.f28782p || !rk.k.a(this.f28781o, aVar.f28781o) || this.f28775i != aVar.f28775i || this.f28776j != aVar.f28776j || this.f28777k != aVar.f28777k || this.f28779m != aVar.f28779m || this.f28780n != aVar.f28780n || this.f28789w != aVar.f28789w || this.f28790x != aVar.f28790x || !this.f28769c.equals(aVar.f28769c) || this.f28770d != aVar.f28770d || !this.f28783q.equals(aVar.f28783q) || !this.f28784r.equals(aVar.f28784r) || !this.f28785s.equals(aVar.f28785s) || !rk.k.a(this.f28778l, aVar.f28778l) || !rk.k.a(this.f28787u, aVar.f28787u)) {
            return false;
        }
        return true;
    }

    public final a f(o oVar) {
        if (this.f28788v) {
            return clone().f(oVar);
        }
        this.f28769c = oVar;
        this.f28767a |= 4;
        n();
        return this;
    }

    public final a g(int i10) {
        if (this.f28788v) {
            return clone().g(i10);
        }
        this.f28772f = i10;
        int i11 = this.f28767a | 32;
        this.f28771e = null;
        this.f28767a = i11 & (-17);
        n();
        return this;
    }

    public final int hashCode() {
        float f10 = this.f28768b;
        char[] cArr = rk.k.f33950a;
        return rk.k.f(rk.k.f(rk.k.f(rk.k.f(rk.k.f(rk.k.f(rk.k.f(rk.k.e(this.f28790x ? 1 : 0, rk.k.e(this.f28789w ? 1 : 0, rk.k.e(this.f28780n ? 1 : 0, rk.k.e(this.f28779m ? 1 : 0, rk.k.e(this.f28777k, rk.k.e(this.f28776j, rk.k.e(this.f28775i ? 1 : 0, rk.k.f(rk.k.e(this.f28782p, rk.k.f(rk.k.e(this.f28774h, rk.k.f(rk.k.e(this.f28772f, rk.k.e(Float.floatToIntBits(f10), 17)), this.f28771e)), this.f28773g)), this.f28781o)))))))), this.f28769c), this.f28770d), this.f28783q), this.f28784r), this.f28785s), this.f28778l), this.f28787u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk.d, java.lang.Object] */
    public final a i() {
        return j(l.f18542c, new Object());
    }

    public final a j(hk.k kVar, hk.d dVar) {
        if (this.f28788v) {
            return clone().j(kVar, dVar);
        }
        o(l.f18545f, kVar);
        return t(dVar, false);
    }

    public final a k(int i10, int i11) {
        if (this.f28788v) {
            return clone().k(i10, i11);
        }
        this.f28777k = i10;
        this.f28776j = i11;
        this.f28767a |= 512;
        n();
        return this;
    }

    public final a l(int i10) {
        if (this.f28788v) {
            return clone().l(i10);
        }
        this.f28774h = i10;
        int i11 = this.f28767a | 128;
        this.f28773g = null;
        this.f28767a = i11 & (-65);
        n();
        return this;
    }

    public final a m(com.bumptech.glide.e eVar) {
        if (this.f28788v) {
            return clone().m(eVar);
        }
        this.f28770d = eVar;
        this.f28767a |= 8;
        n();
        return this;
    }

    public final void n() {
        if (!this.f28786t) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a o(j jVar, Object obj) {
        if (this.f28788v) {
            return clone().o(jVar, obj);
        }
        al.d.V(jVar);
        al.d.V(obj);
        this.f28783q.f40305b.put(jVar, obj);
        n();
        return this;
    }

    public final a p(qk.b bVar) {
        if (this.f28788v) {
            return clone().p(bVar);
        }
        this.f28778l = bVar;
        this.f28767a |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        n();
        return this;
    }

    public final a q() {
        if (this.f28788v) {
            return clone().q();
        }
        this.f28775i = false;
        this.f28767a |= 256;
        n();
        return this;
    }

    public final a r(hk.k kVar, hk.d dVar) {
        if (this.f28788v) {
            return clone().r(kVar, dVar);
        }
        o(l.f18545f, kVar);
        return t(dVar, true);
    }

    public final a s(Class cls, xj.o oVar, boolean z10) {
        if (this.f28788v) {
            return clone().s(cls, oVar, z10);
        }
        al.d.V(oVar);
        this.f28784r.put(cls, oVar);
        int i10 = this.f28767a;
        this.f28780n = true;
        this.f28767a = 67584 | i10;
        this.f28791y = false;
        if (z10) {
            this.f28767a = i10 | 198656;
            this.f28779m = true;
        }
        n();
        return this;
    }

    public final a t(xj.o oVar, boolean z10) {
        if (this.f28788v) {
            return clone().t(oVar, z10);
        }
        q qVar = new q(oVar, z10);
        s(Bitmap.class, oVar, z10);
        s(Drawable.class, qVar, z10);
        s(BitmapDrawable.class, qVar, z10);
        s(jk.c.class, new jk.d(oVar), z10);
        n();
        return this;
    }

    public final a u() {
        if (this.f28788v) {
            return clone().u();
        }
        this.f28792z = true;
        this.f28767a |= 1048576;
        n();
        return this;
    }
}
