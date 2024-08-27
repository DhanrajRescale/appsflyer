package so;

import android.graphics.Paint;
import android.graphics.Path;
import s0.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f34723i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f34724j = {g.f34069a, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f34725k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f34726l = {g.f34069a, g.f34069a, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f34727a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f34728b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f34729c;

    /* renamed from: d, reason: collision with root package name */
    public int f34730d;

    /* renamed from: e, reason: collision with root package name */
    public int f34731e;

    /* renamed from: f, reason: collision with root package name */
    public int f34732f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f34733g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f34734h;

    public a() {
        Paint paint = new Paint();
        this.f34734h = paint;
        this.f34727a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f34728b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f34729c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f34730d = u3.a.d(i10, 68);
        this.f34731e = u3.a.d(i10, 20);
        this.f34732f = u3.a.d(i10, 0);
        this.f34727a.setColor(this.f34730d);
    }
}
