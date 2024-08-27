package d7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class m0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f14066a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14067b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14068c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14069d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14070e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f14071f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f14072g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f14073h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f14074i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f14075j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f14076k;

    /* renamed from: l, reason: collision with root package name */
    public float f14077l;

    /* renamed from: m, reason: collision with root package name */
    public int f14078m;

    /* renamed from: n, reason: collision with root package name */
    public int f14079n;

    /* renamed from: o, reason: collision with root package name */
    public float f14080o;

    /* renamed from: p, reason: collision with root package name */
    public int f14081p;

    /* renamed from: q, reason: collision with root package name */
    public float f14082q;

    /* renamed from: r, reason: collision with root package name */
    public float f14083r;

    /* renamed from: s, reason: collision with root package name */
    public int f14084s;

    /* renamed from: t, reason: collision with root package name */
    public int f14085t;

    /* renamed from: u, reason: collision with root package name */
    public int f14086u;

    /* renamed from: v, reason: collision with root package name */
    public int f14087v;

    /* renamed from: w, reason: collision with root package name */
    public int f14088w;

    /* renamed from: x, reason: collision with root package name */
    public float f14089x;

    /* renamed from: y, reason: collision with root package name */
    public float f14090y;

    /* renamed from: z, reason: collision with root package name */
    public float f14091z;

    public m0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f14070e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14069d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f14066a = round;
        this.f14067b = round;
        this.f14068c = round;
        TextPaint textPaint = new TextPaint();
        this.f14071f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14072g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14073h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        int i10;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.f14086u) > 0) {
                    Paint paint = this.f14072g;
                    paint.setColor(this.f14086u);
                    canvas.drawRect(-this.I, s0.g.f34069a, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i11 = this.f14088w;
                TextPaint textPaint = this.f14071f;
                boolean z11 = true;
                if (i11 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f14066a);
                    textPaint.setColor(this.f14087v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f10 = this.f14067b;
                    if (i11 == 2) {
                        float f11 = this.f14068c;
                        textPaint.setShadowLayer(f10, f11, f11, this.f14087v);
                    } else if (i11 == 3 || i11 == 4) {
                        if (i11 != 3) {
                            z11 = false;
                        }
                        int i12 = -1;
                        if (z11) {
                            i10 = -1;
                        } else {
                            i10 = this.f14087v;
                        }
                        if (z11) {
                            i12 = this.f14087v;
                        }
                        float f12 = f10 / 2.0f;
                        textPaint.setColor(this.f14084s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f13 = -f12;
                        textPaint.setShadowLayer(f10, f13, f13, i10);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f10, f12, f12, i12);
                    }
                }
                textPaint.setColor(this.f14084s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f14076k.getClass();
        canvas.drawBitmap(this.f14076k, (Rect) null, this.J, this.f14073h);
    }
}
