package to;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public l f36231a;

    /* renamed from: b, reason: collision with root package name */
    public io.a f36232b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f36233c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f36234d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f36235e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f36236f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f36237g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f36238h;

    /* renamed from: i, reason: collision with root package name */
    public final float f36239i;

    /* renamed from: j, reason: collision with root package name */
    public float f36240j;

    /* renamed from: k, reason: collision with root package name */
    public float f36241k;

    /* renamed from: l, reason: collision with root package name */
    public int f36242l;

    /* renamed from: m, reason: collision with root package name */
    public float f36243m;

    /* renamed from: n, reason: collision with root package name */
    public float f36244n;

    /* renamed from: o, reason: collision with root package name */
    public final float f36245o;

    /* renamed from: p, reason: collision with root package name */
    public int f36246p;

    /* renamed from: q, reason: collision with root package name */
    public int f36247q;

    /* renamed from: r, reason: collision with root package name */
    public int f36248r;

    /* renamed from: s, reason: collision with root package name */
    public final int f36249s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36250t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f36251u;

    public g(l lVar) {
        this.f36233c = null;
        this.f36234d = null;
        this.f36235e = null;
        this.f36236f = null;
        this.f36237g = PorterDuff.Mode.SRC_IN;
        this.f36238h = null;
        this.f36239i = 1.0f;
        this.f36240j = 1.0f;
        this.f36242l = 255;
        this.f36243m = s0.g.f34069a;
        this.f36244n = s0.g.f34069a;
        this.f36245o = s0.g.f34069a;
        this.f36246p = 0;
        this.f36247q = 0;
        this.f36248r = 0;
        this.f36249s = 0;
        this.f36250t = false;
        this.f36251u = Paint.Style.FILL_AND_STROKE;
        this.f36231a = lVar;
        this.f36232b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f36257e = true;
        return hVar;
    }

    public g(g gVar) {
        this.f36233c = null;
        this.f36234d = null;
        this.f36235e = null;
        this.f36236f = null;
        this.f36237g = PorterDuff.Mode.SRC_IN;
        this.f36238h = null;
        this.f36239i = 1.0f;
        this.f36240j = 1.0f;
        this.f36242l = 255;
        this.f36243m = s0.g.f34069a;
        this.f36244n = s0.g.f34069a;
        this.f36245o = s0.g.f34069a;
        this.f36246p = 0;
        this.f36247q = 0;
        this.f36248r = 0;
        this.f36249s = 0;
        this.f36250t = false;
        this.f36251u = Paint.Style.FILL_AND_STROKE;
        this.f36231a = gVar.f36231a;
        this.f36232b = gVar.f36232b;
        this.f36241k = gVar.f36241k;
        this.f36233c = gVar.f36233c;
        this.f36234d = gVar.f36234d;
        this.f36237g = gVar.f36237g;
        this.f36236f = gVar.f36236f;
        this.f36242l = gVar.f36242l;
        this.f36239i = gVar.f36239i;
        this.f36248r = gVar.f36248r;
        this.f36246p = gVar.f36246p;
        this.f36250t = gVar.f36250t;
        this.f36240j = gVar.f36240j;
        this.f36243m = gVar.f36243m;
        this.f36244n = gVar.f36244n;
        this.f36245o = gVar.f36245o;
        this.f36247q = gVar.f36247q;
        this.f36249s = gVar.f36249s;
        this.f36235e = gVar.f36235e;
        this.f36251u = gVar.f36251u;
        if (gVar.f36238h != null) {
            this.f36238h = new Rect(gVar.f36238h);
        }
    }
}
