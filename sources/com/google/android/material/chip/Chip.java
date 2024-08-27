package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import b4.o;
import b4.p;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import d4.b1;
import d4.n1;
import d4.v0;
import d4.w0;
import fo.a;
import fo.b;
import fo.c;
import fo.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import mo.c0;
import mo.f;
import mo.g;
import mo.z;
import okhttp3.HttpUrl;
import pn.e;
import to.l;
import to.w;
import v3.j;
import v3.k;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements c, w, g {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f11233x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f11234y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f11235z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public d f11236e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f11237f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f11238g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f11239h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f11240i;

    /* renamed from: j, reason: collision with root package name */
    public f f11241j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11242k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11243l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11244m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11245n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11246o;

    /* renamed from: p, reason: collision with root package name */
    public int f11247p;

    /* renamed from: q, reason: collision with root package name */
    public int f11248q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f11249r;

    /* renamed from: s, reason: collision with root package name */
    public final b f11250s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11251t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f11252u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f11253v;

    /* renamed from: w, reason: collision with root package name */
    public final a f11254w;

    public Chip(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900), attributeSet, com.assetgro.stockgro.prod.R.attr.chipStyle);
        this.f11252u = new Rect();
        this.f11253v = new RectF();
        this.f11254w = new a(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        d z10 = d.z(context2, attributeSet, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900);
        int[] iArr = un.a.f37297h;
        c0.a(context2, attributeSet, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900);
        c0.b(context2, attributeSet, iArr, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900);
        this.f11246o = obtainStyledAttributes.getBoolean(32, false);
        this.f11248q = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(e.f(48, getContext()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(z10);
        z10.m(b1.i(this));
        c0.a(context2, attributeSet, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900);
        c0.b(context2, attributeSet, iArr, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.assetgro.stockgro.prod.R.attr.chipStyle, 2132083900);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f11250s = new b(this, this);
        f();
        if (!hasValue) {
            setOutlineProvider(new pm.a(this, 2));
        }
        setChecked(this.f11242k);
        setText(z10.E);
        setEllipsize(z10.T0);
        i();
        if (!this.f11236e.U0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f11246o) {
            setMinHeight(this.f11248q);
        }
        this.f11247p = w0.d(this);
        super.setOnCheckedChangeListener(new ab.g(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f11253v;
        rectF.setEmpty();
        if (d() && this.f11239h != null) {
            d dVar = this.f11236e;
            Rect bounds = dVar.getBounds();
            rectF.setEmpty();
            if (dVar.b0()) {
                float f10 = dVar.f16196u0 + dVar.f16195t0 + dVar.f16182f0 + dVar.f16194s0 + dVar.f16193r0;
                if (v3.c.a(dVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f11252u;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private qo.d getTextAppearance() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.B0.f27979f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f11244m != z10) {
            this.f11244m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f11243l != z10) {
            this.f11243l = z10;
            refreshDrawableState();
        }
    }

    public final void c(int i10) {
        int i11;
        this.f11248q = i10;
        int i12 = 0;
        if (!this.f11246o) {
            InsetDrawable insetDrawable = this.f11237f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f11237f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = ro.a.f33965a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr2 = ro.a.f33965a;
            g();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f11236e.f16203z));
        int max2 = Math.max(0, i10 - this.f11236e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f11237f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f11237f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = ro.a.f33965a;
                    g();
                    return;
                }
                return;
            }
            int[] iArr4 = ro.a.f33965a;
            g();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f11237f != null) {
            Rect rect = new Rect();
            this.f11237f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = ro.a.f33965a;
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f11237f = new InsetDrawable((Drawable) this.f11236e, i11, i13, i11, i13);
        int[] iArr6 = ro.a.f33965a;
        g();
    }

    public final boolean d() {
        d dVar = this.f11236e;
        if (dVar != null) {
            Object obj = dVar.Y;
            if (obj != null) {
                if (obj instanceof j) {
                    ((k) ((j) obj)).getClass();
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f11251t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f11250s.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r7 == false) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f11251t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            fo.b r0 = r9.f11250s
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto L89
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L6c
            r4 = 66
            if (r1 == r4) goto L55
            switch(r1) {
                case 19: goto L28;
                case 20: goto L28;
                case 21: goto L28;
                case 22: goto L28;
                case 23: goto L55;
                default: goto L27;
            }
        L27:
            goto L89
        L28:
            boolean r6 = r10.hasNoModifiers()
            if (r6 == 0) goto L89
            r6 = 19
            if (r1 == r6) goto L40
            r6 = 21
            if (r1 == r6) goto L3d
            r6 = 22
            if (r1 == r6) goto L42
            r4 = 130(0x82, float:1.82E-43)
            goto L42
        L3d:
            r4 = 17
            goto L42
        L40:
            r4 = 33
        L42:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r6 = 0
            r7 = r6
        L49:
            if (r6 >= r1) goto L82
            boolean r8 = r0.q(r4, r5)
            if (r8 == 0) goto L82
            int r6 = r6 + 1
            r7 = r2
            goto L49
        L55:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L89
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L89
            int r1 = r0.f23947l
            if (r1 == r3) goto L84
            r4 = 16
            boolean r1 = r0.s(r1, r4, r5)
            goto L84
        L6c:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L78
            r1 = 2
            boolean r7 = r0.q(r1, r5)
            goto L82
        L78:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L89
            boolean r7 = r0.q(r2, r5)
        L82:
            if (r7 == 0) goto L89
        L84:
            int r0 = r0.f23947l
            if (r0 == r3) goto L89
            return r2
        L89:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f11236e;
        if (dVar != null && d.C(dVar.Y)) {
            d dVar2 = this.f11236e;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f11245n) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f11244m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f11243l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            int i14 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i14 = 1;
            }
            if (this.f11245n) {
                iArr[i14] = 16842908;
                i14++;
            }
            if (this.f11244m) {
                iArr[i14] = 16843623;
                i14++;
            }
            if (this.f11243l) {
                iArr[i14] = 16842919;
                i14++;
            }
            if (isChecked()) {
                iArr[i14] = 16842913;
            }
            if (!Arrays.equals(dVar2.P0, iArr)) {
                dVar2.P0 = iArr;
                if (dVar2.b0() && dVar2.E(dVar2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    public final boolean e() {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16184h0) {
            return true;
        }
        return false;
    }

    public final void f() {
        d dVar;
        if (d() && (dVar = this.f11236e) != null && dVar.X && this.f11239h != null) {
            n1.n(this, this.f11250s);
            this.f11251t = true;
        } else {
            n1.n(this, null);
            this.f11251t = false;
        }
    }

    public final void g() {
        this.f11238g = new RippleDrawable(ro.a.c(this.f11236e.D), getBackgroundDrawable(), null);
        d dVar = this.f11236e;
        if (dVar.Q0) {
            dVar.Q0 = false;
            dVar.R0 = null;
            dVar.onStateChange(dVar.getState());
        }
        RippleDrawable rippleDrawable = this.f11238g;
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f11249r)) {
            return this.f11249r;
        }
        if (e()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f11258h.f24115a) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11237f;
        return insetDrawable == null ? this.f11236e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16186j0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16187k0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16201y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.f11236e;
        if (dVar == null) {
            return s0.g.f34069a;
        }
        return Math.max(s0.g.f34069a, dVar.A());
    }

    public Drawable getChipDrawable() {
        return this.f11236e;
    }

    public float getChipEndPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16196u0;
        }
        return s0.g.f34069a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        d dVar = this.f11236e;
        if (dVar == null || (drawable = dVar.G) == 0) {
            return null;
        }
        if (drawable instanceof j) {
            ((k) ((j) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.I;
        }
        return s0.g.f34069a;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16203z;
        }
        return s0.g.f34069a;
    }

    public float getChipStartPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.n0;
        }
        return s0.g.f34069a;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.C;
        }
        return s0.g.f34069a;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        d dVar = this.f11236e;
        if (dVar == null || (drawable = dVar.Y) == 0) {
            return null;
        }
        if (drawable instanceof j) {
            ((k) ((j) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16183g0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16195t0;
        }
        return s0.g.f34069a;
    }

    public float getCloseIconSize() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16182f0;
        }
        return s0.g.f34069a;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16194s0;
        }
        return s0.g.f34069a;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16181e0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.T0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f11251t) {
            b bVar = this.f11250s;
            if (bVar.f23947l == 1 || bVar.f23946k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public vn.d getHideMotionSpec() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16189m0;
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16191p0;
        }
        return s0.g.f34069a;
    }

    public float getIconStartPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16190o0;
        }
        return s0.g.f34069a;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.D;
        }
        return null;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.f11236e.f36253a.f36231a;
    }

    public vn.d getShowMotionSpec() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16188l0;
        }
        return null;
    }

    public float getTextEndPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16193r0;
        }
        return s0.g.f34069a;
    }

    public float getTextStartPadding() {
        d dVar = this.f11236e;
        if (dVar != null) {
            return dVar.f16192q0;
        }
        return s0.g.f34069a;
    }

    public final void h() {
        d dVar;
        if (!TextUtils.isEmpty(getText()) && (dVar = this.f11236e) != null) {
            int y10 = (int) (dVar.y() + dVar.f16196u0 + dVar.f16193r0);
            d dVar2 = this.f11236e;
            int x10 = (int) (dVar2.x() + dVar2.n0 + dVar2.f16192q0);
            if (this.f11237f != null) {
                Rect rect = new Rect();
                this.f11237f.getPadding(rect);
                x10 += rect.left;
                y10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = n1.f13788a;
            w0.k(this, x10, paddingTop, y10, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        d dVar = this.f11236e;
        if (dVar != null) {
            paint.drawableState = dVar.getState();
        }
        qo.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f11254w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp.b.L1(this, this.f11236e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11234y);
        }
        if (e()) {
            View.mergeDrawableStates(onCreateDrawableState, f11235z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f11251t) {
            b bVar = this.f11250s;
            int i11 = bVar.f23947l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.q(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f27908c) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < chipGroup.getChildCount()) {
                        View childAt = chipGroup.getChildAt(i12);
                        if ((childAt instanceof Chip) && chipGroup.getChildAt(i12).getVisibility() == 0) {
                            if (((Chip) childAt) == this) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        i12++;
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
            Object tag = getTag(com.assetgro.stockgro.prod.R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) e4.l.a(i11, 1, i10, 1, false, isChecked()).f14994a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f11247p != i10) {
            this.f11247p = i10;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L51
        L21:
            boolean r0 = r5.f11243l
            if (r0 == 0) goto L51
            if (r1 != 0) goto L57
            r5.setCloseIconPressed(r2)
            goto L57
        L2b:
            boolean r0 = r5.f11243l
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f11239h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f11251t
            if (r0 == 0) goto L42
            fo.b r0 = r5.f11250s
            r0.x(r3, r3)
        L42:
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L57
            goto L51
        L4b:
            if (r1 == 0) goto L51
            r5.setCloseIconPressed(r3)
            goto L57
        L51:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L58
        L57:
            r2 = r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f11249r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11238g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11238g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.F(z10);
        }
    }

    public void setCheckableResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.F(dVar.f16197v0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        d dVar = this.f11236e;
        if (dVar == null) {
            this.f11242k = z10;
        } else if (dVar.f16184h0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.G(iu.j.m(dVar.f16197v0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.H(r3.k.getColorStateList(dVar.f16197v0, i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.I(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16201y != colorStateList) {
            dVar.f16201y = colorStateList;
            dVar.onStateChange(dVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16201y != (colorStateList = r3.k.getColorStateList(dVar.f16197v0, i10))) {
            dVar.f16201y = colorStateList;
            dVar.onStateChange(dVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.J(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.J(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(@NonNull d dVar) {
        d dVar2 = this.f11236e;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                dVar2.S0 = new WeakReference(null);
            }
            this.f11236e = dVar;
            dVar.U0 = false;
            dVar.S0 = new WeakReference(this);
            c(this.f11248q);
        }
    }

    public void setChipEndPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16196u0 != f10) {
            dVar.f16196u0 = f10;
            dVar.invalidateSelf();
            dVar.D();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            float dimension = dVar.f16197v0.getResources().getDimension(i10);
            if (dVar.f16196u0 != dimension) {
                dVar.f16196u0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.K(iu.j.m(dVar.f16197v0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.L(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.L(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.M(r3.k.getColorStateList(dVar.f16197v0, i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.N(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16203z != f10) {
            dVar.f16203z = f10;
            dVar.invalidateSelf();
            dVar.D();
        }
    }

    public void setChipMinHeightResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            float dimension = dVar.f16197v0.getResources().getDimension(i10);
            if (dVar.f16203z != dimension) {
                dVar.f16203z = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.n0 != f10) {
            dVar.n0 = f10;
            dVar.invalidateSelf();
            dVar.D();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            float dimension = dVar.f16197v0.getResources().getDimension(i10);
            if (dVar.n0 != dimension) {
                dVar.n0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.O(r3.k.getColorStateList(dVar.f16197v0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.P(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.P(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.Q(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        b4.c cVar;
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16183g0 != charSequence) {
            String str = b4.c.f3165d;
            Locale locale = Locale.getDefault();
            int i10 = p.f3184a;
            if (o.a(locale) == 1) {
                cVar = b4.c.f3168g;
            } else {
                cVar = b4.c.f3167f;
            }
            dVar.f16183g0 = cVar.c(charSequence, cVar.f3171c);
            dVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.R(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.R(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.Q(iu.j.m(dVar.f16197v0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.S(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.S(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.T(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.T(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.U(r3.k.getColorStateList(dVar.f16197v0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.m(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11236e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            d dVar = this.f11236e;
            if (dVar != null) {
                dVar.T0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f11246o = z10;
        c(this.f11248q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(vn.d dVar) {
        d dVar2 = this.f11236e;
        if (dVar2 != null) {
            dVar2.f16189m0 = dVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.f16189m0 = vn.d.b(i10, dVar.f16197v0);
        }
    }

    public void setIconEndPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.W(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.W(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.X(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.X(dVar.f16197v0.getResources().getDimension(i10));
        }
    }

    @Override // mo.g
    public void setInternalOnCheckedChangeListener(f fVar) {
        this.f11241j = fVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f11236e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.V0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11240i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11239h = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.Y(colorStateList);
        }
        if (!this.f11236e.Q0) {
            g();
        }
    }

    public void setRippleColorResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.Y(r3.k.getColorStateList(dVar.f16197v0, i10));
            if (!this.f11236e.Q0) {
                g();
            }
        }
    }

    @Override // to.w
    public void setShapeAppearanceModel(@NonNull l lVar) {
        this.f11236e.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(vn.d dVar) {
        d dVar2 = this.f11236e;
        if (dVar2 != null) {
            dVar2.f16188l0 = dVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.f16188l0 = vn.d.b(i10, dVar.f16197v0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        d dVar = this.f11236e;
        if (dVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (dVar.U0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        d dVar2 = this.f11236e;
        if (dVar2 != null && !TextUtils.equals(dVar2.E, charSequence)) {
            dVar2.E = charSequence;
            dVar2.B0.f27977d = true;
            dVar2.invalidateSelf();
            dVar2.D();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d dVar = this.f11236e;
        if (dVar != null) {
            Context context2 = dVar.f16197v0;
            dVar.B0.b(new qo.d(context2, i10), context2);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16193r0 != f10) {
            dVar.f16193r0 = f10;
            dVar.invalidateSelf();
            dVar.D();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            float dimension = dVar.f16197v0.getResources().getDimension(i10);
            if (dVar.f16193r0 != dimension) {
                dVar.f16193r0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        d dVar = this.f11236e;
        if (dVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            z zVar = dVar.B0;
            qo.d dVar2 = zVar.f27979f;
            if (dVar2 != null) {
                dVar2.f32112k = applyDimension;
                zVar.f27974a.setTextSize(applyDimension);
                dVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        d dVar = this.f11236e;
        if (dVar != null && dVar.f16192q0 != f10) {
            dVar.f16192q0 = f10;
            dVar.invalidateSelf();
            dVar.D();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            float dimension = dVar.f16197v0.getResources().getDimension(i10);
            if (dVar.f16192q0 != dimension) {
                dVar.f16192q0 = dimension;
                dVar.invalidateSelf();
                dVar.D();
            }
        }
    }

    public void setCheckedIconVisible(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.I(dVar.f16197v0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(int i10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.N(dVar.f16197v0.getResources().getBoolean(i10));
        }
    }

    public void setCloseIconVisible(boolean z10) {
        d dVar = this.f11236e;
        if (dVar != null) {
            dVar.V(z10);
        }
        f();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        d dVar = this.f11236e;
        if (dVar != null) {
            Context context = dVar.f16197v0;
            dVar.B0.b(new qo.d(context, i10), context);
        }
        i();
    }

    public void setTextAppearance(qo.d dVar) {
        d dVar2 = this.f11236e;
        if (dVar2 != null) {
            dVar2.B0.b(dVar, dVar2.f16197v0);
        }
        i();
    }
}
