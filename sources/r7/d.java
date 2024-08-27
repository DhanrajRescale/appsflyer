package r7;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f33412a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f33413b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f33414c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f33415d;

    /* renamed from: e, reason: collision with root package name */
    public float f33416e;

    /* renamed from: f, reason: collision with root package name */
    public float f33417f;

    /* renamed from: g, reason: collision with root package name */
    public float f33418g;

    /* renamed from: h, reason: collision with root package name */
    public float f33419h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f33420i;

    /* renamed from: j, reason: collision with root package name */
    public int f33421j;

    /* renamed from: k, reason: collision with root package name */
    public float f33422k;

    /* renamed from: l, reason: collision with root package name */
    public float f33423l;

    /* renamed from: m, reason: collision with root package name */
    public float f33424m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33425n;

    /* renamed from: o, reason: collision with root package name */
    public Path f33426o;

    /* renamed from: p, reason: collision with root package name */
    public float f33427p;

    /* renamed from: q, reason: collision with root package name */
    public float f33428q;

    /* renamed from: r, reason: collision with root package name */
    public int f33429r;

    /* renamed from: s, reason: collision with root package name */
    public int f33430s;

    /* renamed from: t, reason: collision with root package name */
    public int f33431t;

    /* renamed from: u, reason: collision with root package name */
    public int f33432u;

    public d() {
        Paint paint = new Paint();
        this.f33413b = paint;
        Paint paint2 = new Paint();
        this.f33414c = paint2;
        Paint paint3 = new Paint();
        this.f33415d = paint3;
        this.f33416e = s0.g.f34069a;
        this.f33417f = s0.g.f34069a;
        this.f33418g = s0.g.f34069a;
        this.f33419h = 5.0f;
        this.f33427p = 1.0f;
        this.f33431t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.f33421j = i10;
        this.f33432u = this.f33420i[i10];
    }
}
