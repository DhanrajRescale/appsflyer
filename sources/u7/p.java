package u7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f36971j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f36972b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f36973c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f36974d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36975e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36976f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f36977g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f36978h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f36979i;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, u7.n] */
    public p() {
        this.f36976f = true;
        this.f36977g = new float[9];
        this.f36978h = new Matrix();
        this.f36979i = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f36960c = null;
        constantState.f36961d = f36971j;
        constantState.f36959b = new m();
        this.f36972b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f36979i;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f36974d;
            if (colorFilter == null) {
                colorFilter = this.f36973c;
            }
            Matrix matrix = this.f36978h;
            canvas.getMatrix(matrix);
            float[] fArr = this.f36977g;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != s0.g.f34069a || abs4 != s0.g.f34069a) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && v3.c.a(this) == 1) {
                    canvas.translate(rect.width(), s0.g.f34069a);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f36972b;
                Bitmap bitmap = nVar.f36963f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f36963f.getHeight()) {
                    nVar.f36963f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f36968k = true;
                }
                if (!this.f36976f) {
                    n nVar2 = this.f36972b;
                    nVar2.f36963f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f36963f);
                    m mVar = nVar2.f36959b;
                    mVar.a(mVar.f36949g, m.f36942p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f36972b;
                    if (nVar3.f36968k || nVar3.f36964g != nVar3.f36960c || nVar3.f36965h != nVar3.f36961d || nVar3.f36967j != nVar3.f36962e || nVar3.f36966i != nVar3.f36959b.getRootAlpha()) {
                        n nVar4 = this.f36972b;
                        nVar4.f36963f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f36963f);
                        m mVar2 = nVar4.f36959b;
                        mVar2.a(mVar2.f36949g, m.f36942p, canvas3, min, min2);
                        n nVar5 = this.f36972b;
                        nVar5.f36964g = nVar5.f36960c;
                        nVar5.f36965h = nVar5.f36961d;
                        nVar5.f36966i = nVar5.f36959b.getRootAlpha();
                        nVar5.f36967j = nVar5.f36962e;
                        nVar5.f36968k = false;
                    }
                }
                n nVar6 = this.f36972b;
                if (nVar6.f36959b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f36969l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f36969l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f36969l.setAlpha(nVar6.f36959b.getRootAlpha());
                    nVar6.f36969l.setColorFilter(colorFilter);
                    paint = nVar6.f36969l;
                }
                canvas.drawBitmap(nVar6.f36963f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.a.a(drawable);
        }
        return this.f36972b.f36959b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f36972b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.b.c(drawable);
        }
        return this.f36974d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f36914a != null) {
            return new o(this.f36914a.getConstantState());
        }
        this.f36972b.f36958a = getChangingConfigurations();
        return this.f36972b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f36972b.f36959b.f36951i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f36972b.f36959b.f36950h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [u7.l, java.lang.Object, u7.i] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        m mVar;
        int i11;
        int i12;
        boolean z10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f36972b;
        nVar.f36959b = new m();
        TypedArray E0 = hl.f.E0(resources, theme, attributeSet, a.f36895a);
        n nVar2 = this.f36972b;
        m mVar2 = nVar2.f36959b;
        int i13 = !hl.f.r0(xmlPullParser, "tintMode") ? -1 : E0.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i14 = 3;
        if (i13 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i13 != 5) {
            if (i13 != 9) {
                switch (i13) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f36961d = mode;
        ColorStateList k02 = hl.f.k0(E0, xmlPullParser, theme);
        if (k02 != null) {
            nVar2.f36960c = k02;
        }
        boolean z11 = nVar2.f36962e;
        if (hl.f.r0(xmlPullParser, "autoMirrored")) {
            z11 = E0.getBoolean(5, z11);
        }
        nVar2.f36962e = z11;
        float f10 = mVar2.f36952j;
        if (hl.f.r0(xmlPullParser, "viewportWidth")) {
            f10 = E0.getFloat(7, f10);
        }
        mVar2.f36952j = f10;
        float f11 = mVar2.f36953k;
        if (hl.f.r0(xmlPullParser, "viewportHeight")) {
            f11 = E0.getFloat(8, f11);
        }
        mVar2.f36953k = f11;
        if (mVar2.f36952j <= s0.g.f34069a) {
            throw new XmlPullParserException(E0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > s0.g.f34069a) {
            mVar2.f36950h = E0.getDimension(3, mVar2.f36950h);
            int i15 = 2;
            float dimension = E0.getDimension(2, mVar2.f36951i);
            mVar2.f36951i = dimension;
            if (mVar2.f36950h <= s0.g.f34069a) {
                throw new XmlPullParserException(E0.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > s0.g.f34069a) {
                float alpha = mVar2.getAlpha();
                if (hl.f.r0(xmlPullParser, "alpha")) {
                    alpha = E0.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                boolean z12 = false;
                String string = E0.getString(0);
                if (string != null) {
                    mVar2.f36955m = string;
                    mVar2.f36957o.put(string, mVar2);
                }
                E0.recycle();
                nVar.f36958a = getChangingConfigurations();
                int i16 = 1;
                nVar.f36968k = true;
                n nVar3 = this.f36972b;
                m mVar3 = nVar3.f36959b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f36949g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i16 && (xmlPullParser.getDepth() >= depth || eventType != i14)) {
                    if (eventType == i15) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        t.f fVar = mVar3.f36957o;
                        mVar = mVar3;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.f36916f = s0.g.f34069a;
                            lVar.f36918h = 1.0f;
                            lVar.f36919i = 1.0f;
                            lVar.f36920j = s0.g.f34069a;
                            lVar.f36921k = 1.0f;
                            lVar.f36922l = s0.g.f34069a;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f36923m = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f36924n = join2;
                            lVar.f36925o = 4.0f;
                            TypedArray E02 = hl.f.E0(resources, theme, attributeSet, a.f36897c);
                            if (hl.f.r0(xmlPullParser, "pathData")) {
                                String string2 = E02.getString(0);
                                if (string2 != null) {
                                    lVar.f36939b = string2;
                                }
                                String string3 = E02.getString(2);
                                if (string3 != null) {
                                    lVar.f36938a = yk.j.O0(string3);
                                }
                                lVar.f36917g = hl.f.l0(E02, xmlPullParser, theme, "fillColor", 1);
                                float f12 = lVar.f36919i;
                                if (hl.f.r0(xmlPullParser, "fillAlpha")) {
                                    f12 = E02.getFloat(12, f12);
                                }
                                lVar.f36919i = f12;
                                int i17 = !hl.f.r0(xmlPullParser, "strokeLineCap") ? -1 : E02.getInt(8, -1);
                                Paint.Cap cap3 = lVar.f36923m;
                                if (i17 == 0) {
                                    cap = cap2;
                                } else if (i17 != 1) {
                                    cap = i17 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f36923m = cap;
                                int i18 = !hl.f.r0(xmlPullParser, "strokeLineJoin") ? -1 : E02.getInt(9, -1);
                                Paint.Join join3 = lVar.f36924n;
                                if (i18 == 0) {
                                    join = join2;
                                } else if (i18 != 1) {
                                    join = i18 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f36924n = join;
                                float f13 = lVar.f36925o;
                                if (hl.f.r0(xmlPullParser, "strokeMiterLimit")) {
                                    f13 = E02.getFloat(10, f13);
                                }
                                lVar.f36925o = f13;
                                lVar.f36915e = hl.f.l0(E02, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = lVar.f36918h;
                                if (hl.f.r0(xmlPullParser, "strokeAlpha")) {
                                    f14 = E02.getFloat(11, f14);
                                }
                                lVar.f36918h = f14;
                                float f15 = lVar.f36916f;
                                if (hl.f.r0(xmlPullParser, "strokeWidth")) {
                                    f15 = E02.getFloat(4, f15);
                                }
                                lVar.f36916f = f15;
                                float f16 = lVar.f36921k;
                                if (hl.f.r0(xmlPullParser, "trimPathEnd")) {
                                    f16 = E02.getFloat(6, f16);
                                }
                                lVar.f36921k = f16;
                                float f17 = lVar.f36922l;
                                if (hl.f.r0(xmlPullParser, "trimPathOffset")) {
                                    f17 = E02.getFloat(7, f17);
                                }
                                lVar.f36922l = f17;
                                float f18 = lVar.f36920j;
                                if (hl.f.r0(xmlPullParser, "trimPathStart")) {
                                    f18 = E02.getFloat(5, f18);
                                }
                                lVar.f36920j = f18;
                                int i19 = lVar.f36940c;
                                if (hl.f.r0(xmlPullParser, "fillType")) {
                                    i19 = E02.getInt(13, i19);
                                }
                                lVar.f36940c = i19;
                            }
                            E02.recycle();
                            jVar.f36927b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f36958a = lVar.f36941d | nVar3.f36958a;
                            z10 = false;
                            i10 = 2;
                            z13 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (hl.f.r0(xmlPullParser, "pathData")) {
                                    TypedArray E03 = hl.f.E0(resources, theme, attributeSet, a.f36898d);
                                    String string4 = E03.getString(0);
                                    if (string4 != null) {
                                        lVar2.f36939b = string4;
                                    }
                                    String string5 = E03.getString(1);
                                    if (string5 != null) {
                                        lVar2.f36938a = yk.j.O0(string5);
                                    }
                                    lVar2.f36940c = !hl.f.r0(xmlPullParser, "fillType") ? 0 : E03.getInt(2, 0);
                                    E03.recycle();
                                }
                                jVar.f36927b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    fVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f36958a = lVar2.f36941d | nVar3.f36958a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray E04 = hl.f.E0(resources, theme, attributeSet, a.f36896b);
                                float f19 = jVar2.f36928c;
                                if (hl.f.r0(xmlPullParser, "rotation")) {
                                    f19 = E04.getFloat(5, f19);
                                }
                                jVar2.f36928c = f19;
                                jVar2.f36929d = E04.getFloat(1, jVar2.f36929d);
                                i10 = 2;
                                jVar2.f36930e = E04.getFloat(2, jVar2.f36930e);
                                float f20 = jVar2.f36931f;
                                if (hl.f.r0(xmlPullParser, "scaleX")) {
                                    f20 = E04.getFloat(3, f20);
                                }
                                jVar2.f36931f = f20;
                                float f21 = jVar2.f36932g;
                                if (hl.f.r0(xmlPullParser, "scaleY")) {
                                    f21 = E04.getFloat(4, f21);
                                }
                                jVar2.f36932g = f21;
                                float f22 = jVar2.f36933h;
                                if (hl.f.r0(xmlPullParser, "translateX")) {
                                    f22 = E04.getFloat(6, f22);
                                }
                                jVar2.f36933h = f22;
                                float f23 = jVar2.f36934i;
                                if (hl.f.r0(xmlPullParser, "translateY")) {
                                    f23 = E04.getFloat(7, f23);
                                }
                                jVar2.f36934i = f23;
                                z10 = false;
                                String string6 = E04.getString(0);
                                if (string6 != null) {
                                    jVar2.f36937l = string6;
                                }
                                jVar2.c();
                                E04.recycle();
                                jVar.f36927b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    fVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f36958a = jVar2.f36936k | nVar3.f36958a;
                            }
                            z10 = false;
                            i10 = 2;
                        }
                        i11 = 3;
                        i12 = 1;
                    } else {
                        i10 = i15;
                        mVar = mVar3;
                        i11 = i14;
                        i12 = 1;
                        z10 = z12;
                        if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i14 = i11;
                    z12 = z10;
                    i15 = i10;
                    i16 = i12;
                    mVar3 = mVar;
                }
                if (!z13) {
                    this.f36973c = a(nVar.f36960c, nVar.f36961d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(E0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(E0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return v3.a.d(drawable);
        }
        return this.f36972b.f36962e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f36972b;
            if (nVar != null) {
                m mVar = nVar.f36959b;
                if (mVar.f36956n == null) {
                    mVar.f36956n = Boolean.valueOf(mVar.f36949g.a());
                }
                if (mVar.f36956n.booleanValue() || ((colorStateList = this.f36972b.f36960c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, u7.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f36975e && super.mutate() == this) {
            n nVar = this.f36972b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f36960c = null;
            constantState.f36961d = f36971j;
            if (nVar != null) {
                constantState.f36958a = nVar.f36958a;
                m mVar = new m(nVar.f36959b);
                constantState.f36959b = mVar;
                if (nVar.f36959b.f36947e != null) {
                    mVar.f36947e = new Paint(nVar.f36959b.f36947e);
                }
                if (nVar.f36959b.f36946d != null) {
                    constantState.f36959b.f36946d = new Paint(nVar.f36959b.f36946d);
                }
                constantState.f36960c = nVar.f36960c;
                constantState.f36961d = nVar.f36961d;
                constantState.f36962e = nVar.f36962e;
            }
            this.f36972b = constantState;
            this.f36975e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f36972b;
        ColorStateList colorStateList = nVar.f36960c;
        if (colorStateList != null && (mode = nVar.f36961d) != null) {
            this.f36973c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f36959b;
        if (mVar.f36956n == null) {
            mVar.f36956n = Boolean.valueOf(mVar.f36949g.a());
        }
        if (mVar.f36956n.booleanValue()) {
            boolean b10 = nVar.f36959b.f36949g.b(iArr);
            nVar.f36968k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f36972b.f36959b.getRootAlpha() != i10) {
            this.f36972b.f36959b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.a.e(drawable, z10);
        } else {
            this.f36972b.f36962e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36974d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            yk.j.x1(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f36972b;
        if (nVar.f36960c != colorStateList) {
            nVar.f36960c = colorStateList;
            this.f36973c = a(colorStateList, nVar.f36961d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            v3.b.i(drawable, mode);
            return;
        }
        n nVar = this.f36972b;
        if (nVar.f36961d != mode) {
            nVar.f36961d = mode;
            this.f36973c = a(nVar.f36960c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f36976f = true;
        this.f36977g = new float[9];
        this.f36978h = new Matrix();
        this.f36979i = new Rect();
        this.f36972b = nVar;
        this.f36973c = a(nVar.f36960c, nVar.f36961d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f36914a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
