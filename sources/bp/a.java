package bp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import in.i;
import m.y2;
import mo.y;
import mo.z;
import qo.d;
import s0.g;
import to.f;
import to.h;

/* loaded from: classes2.dex */
public final class a extends h implements y {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f7234e0 = 0;
    public final z A;
    public final y2 B;
    public final Rect C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f7235x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f7236y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint.FontMetrics f7237z;

    public a(Context context, int i10) {
        super(context, null, 0, i10);
        this.f7237z = new Paint.FontMetrics();
        z zVar = new z(this);
        this.A = zVar;
        this.B = new y2(this, 3);
        this.C = new Rect();
        this.J = 1.0f;
        this.X = 1.0f;
        this.Y = 0.5f;
        this.Z = 1.0f;
        this.f7236y = context;
        TextPaint textPaint = zVar.f27974a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float v10 = v();
        float f10 = (float) (-((Math.sqrt(2.0d) * this.H) - this.H));
        canvas.scale(this.J, this.X, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Y) + getBounds().top);
        canvas.translate(v10, f10);
        super.draw(canvas);
        if (this.f7235x != null) {
            float centerY = getBounds().centerY();
            z zVar = this.A;
            TextPaint textPaint = zVar.f27974a;
            Paint.FontMetrics fontMetrics = this.f7237z;
            textPaint.getFontMetrics(fontMetrics);
            int i10 = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d dVar = zVar.f27979f;
            TextPaint textPaint2 = zVar.f27974a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                zVar.f27979f.e(this.f7236y, textPaint2, zVar.f27975b);
                textPaint2.setAlpha((int) (this.Z * 255.0f));
            }
            CharSequence charSequence = this.f7235x;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i10, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.A.f27974a.getTextSize(), this.F);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float a10;
        float f10 = this.D * 2;
        CharSequence charSequence = this.f7235x;
        if (charSequence == null) {
            a10 = g.f34069a;
        } else {
            a10 = this.A.a(charSequence.toString());
        }
        return (int) Math.max(f10 + a10, this.E);
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i f10 = this.f36253a.f36231a.f();
        f10.f20172k = w();
        setShapeAppearanceModel(f10.a());
    }

    @Override // to.h, android.graphics.drawable.Drawable, mo.y
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float v() {
        int i10;
        Rect rect = this.C;
        if (((rect.right - getBounds().right) - this.I) - this.G < 0) {
            i10 = ((rect.right - getBounds().right) - this.I) - this.G;
        } else if (((rect.left - getBounds().left) - this.I) + this.G > 0) {
            i10 = ((rect.left - getBounds().left) - this.I) + this.G;
        } else {
            return g.f34069a;
        }
        return i10;
    }

    public final to.i w() {
        float f10 = -v();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.H))) / 2.0f;
        return new to.i(new f(this.H), Math.min(Math.max(f10, -width), width));
    }
}
