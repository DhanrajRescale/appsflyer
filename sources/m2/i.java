package m2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f27273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27274b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27275c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27276d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27277e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27278f;

    /* renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f27279g;

    /* renamed from: h, reason: collision with root package name */
    public int f27280h;

    /* renamed from: i, reason: collision with root package name */
    public int f27281i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27282j;

    public i(float f10, float f11, float f12, int i10, int i11, int i12) {
        this.f27273a = f10;
        this.f27274b = i10;
        this.f27275c = f11;
        this.f27276d = i11;
        this.f27277e = f12;
        this.f27278f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f27279g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f27282j) {
            return this.f27281i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f27282j) {
            return this.f27280h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        double ceil;
        this.f27282j = true;
        float textSize = paint.getTextSize();
        this.f27279g = paint.getFontMetricsInt();
        if (a().descent > a().ascent) {
            float f11 = this.f27277e;
            float f12 = this.f27273a;
            int i12 = this.f27274b;
            if (i12 != 0) {
                if (i12 == 1) {
                    f10 = f12 * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f10 = f12 * f11;
            }
            this.f27280h = (int) Math.ceil(f10);
            float f13 = this.f27275c;
            int i13 = this.f27276d;
            if (i13 != 0) {
                if (i13 == 1) {
                    ceil = Math.ceil(f13 * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                ceil = Math.ceil(f13 * f11);
            }
            this.f27281i = (int) ceil;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f27278f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                            fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b() + b10;
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
