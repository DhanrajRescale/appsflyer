package d7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b5.a1;
import b5.i1;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.y2;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class f extends View implements o0 {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f14009j0 = 0;
    public int A;
    public long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f14010a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f14011b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f14012c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f14013d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f14014e;

    /* renamed from: e0, reason: collision with root package name */
    public long f14015e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f14016f;

    /* renamed from: f0, reason: collision with root package name */
    public long f14017f0;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f14018g;

    /* renamed from: g0, reason: collision with root package name */
    public int f14019g0;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f14020h;

    /* renamed from: h0, reason: collision with root package name */
    public long[] f14021h0;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f14022i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean[] f14023i0;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f14024j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f14025k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14026l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14027m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14028n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14029o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14030p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14031q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14032r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14033s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14034t;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f14035u;

    /* renamed from: v, reason: collision with root package name */
    public final Formatter f14036v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.activity.b f14037w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f14038x;

    /* renamed from: y, reason: collision with root package name */
    public final Point f14039y;

    /* renamed from: z, reason: collision with root package name */
    public final float f14040z;

    public f(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f14010a = new Rect();
        this.f14011b = new Rect();
        this.f14012c = new Rect();
        this.f14013d = new Rect();
        Paint paint = new Paint();
        this.f14014e = paint;
        Paint paint2 = new Paint();
        this.f14016f = paint2;
        Paint paint3 = new Paint();
        this.f14018g = paint3;
        Paint paint4 = new Paint();
        this.f14020h = paint4;
        Paint paint5 = new Paint();
        this.f14022i = paint5;
        Paint paint6 = new Paint();
        this.f14024j = paint6;
        paint6.setAntiAlias(true);
        this.f14038x = new CopyOnWriteArraySet();
        this.f14039y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f14040z = f10;
        this.f14034t = a(-50, f10);
        int a10 = a(4, f10);
        int a11 = a(26, f10);
        int a12 = a(4, f10);
        int a13 = a(12, f10);
        int a14 = a(0, f10);
        int a15 = a(16, f10);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.f14045b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f14025k = drawable;
                if (drawable != null) {
                    int i10 = e5.x.f15050a;
                    if (i10 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i10 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    a11 = Math.max(drawable.getMinimumHeight(), a11);
                }
                this.f14026l = obtainStyledAttributes.getDimensionPixelSize(3, a10);
                this.f14027m = obtainStyledAttributes.getDimensionPixelSize(12, a11);
                this.f14028n = obtainStyledAttributes.getInt(2, 0);
                this.f14029o = obtainStyledAttributes.getDimensionPixelSize(1, a12);
                this.f14030p = obtainStyledAttributes.getDimensionPixelSize(11, a13);
                this.f14031q = obtainStyledAttributes.getDimensionPixelSize(8, a14);
                this.f14032r = obtainStyledAttributes.getDimensionPixelSize(9, a15);
                int i11 = obtainStyledAttributes.getInt(6, -1);
                int i12 = obtainStyledAttributes.getInt(7, -1);
                int i13 = obtainStyledAttributes.getInt(4, -855638017);
                int i14 = obtainStyledAttributes.getInt(13, 872415231);
                int i15 = obtainStyledAttributes.getInt(0, -1291845888);
                int i16 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i11);
                paint6.setColor(i12);
                paint2.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint5.setColor(i16);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f14026l = a10;
            this.f14027m = a11;
            this.f14028n = 0;
            this.f14029o = a12;
            this.f14030p = a13;
            this.f14031q = a14;
            this.f14032r = a15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f14025k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f14035u = sb2;
        this.f14036v = new Formatter(sb2, Locale.getDefault());
        this.f14037w = new androidx.activity.b(this, 20);
        Drawable drawable2 = this.f14025k;
        if (drawable2 != null) {
            this.f14033s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f14033s = (Math.max(this.f14031q, Math.max(this.f14030p, this.f14032r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new e(this, 0));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i10, float f10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 == -9223372036854775807L) {
            long j11 = this.J;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            return j11 / this.A;
        }
        return j10;
    }

    private String getProgressText() {
        return e5.x.w(this.f14035u, this.f14036v, this.f14015e0);
    }

    private long getScrubberPosition() {
        if (this.f14011b.width() > 0 && this.J != -9223372036854775807L) {
            return (this.f14013d.width() * this.J) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j10) {
        long j11;
        long j12 = this.J;
        if (j12 <= 0) {
            return false;
        }
        if (this.H) {
            j11 = this.I;
        } else {
            j11 = this.f14015e0;
        }
        long j13 = j11;
        long j14 = e5.x.j(j13 + j10, 0L, j12);
        if (j14 == j13) {
            return false;
        }
        if (!this.H) {
            c(j14);
        } else {
            f(j14);
        }
        e();
        return true;
    }

    public final void c(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f14038x.iterator();
        while (it.hasNext()) {
            x xVar = ((l) it.next()).f14064a;
            xVar.E0 = true;
            TextView textView = xVar.D;
            if (textView != null) {
                textView.setText(e5.x.w(xVar.F, xVar.G, j10));
            }
            xVar.f14130a.g();
        }
    }

    public final void d(boolean z10) {
        a1 a1Var;
        removeCallbacks(this.f14037w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f14038x.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            long j10 = this.I;
            x xVar = lVar.f14064a;
            xVar.E0 = false;
            if (!z10 && (a1Var = xVar.f14174y0) != null) {
                if (xVar.D0) {
                    b5.i iVar = (b5.i) a1Var;
                    if (iVar.b(17) && iVar.b(10)) {
                        i1 w10 = ((i5.g0) iVar).w();
                        int p10 = w10.p();
                        int i10 = 0;
                        while (true) {
                            long P = e5.x.P(w10.n(i10, xVar.I, 0L).f3345n);
                            if (j10 < P) {
                                break;
                            }
                            if (i10 == p10 - 1) {
                                j10 = P;
                                break;
                            } else {
                                j10 -= P;
                                i10++;
                            }
                        }
                        iVar.g(i10, j10, false);
                    }
                } else {
                    b5.i iVar2 = (b5.i) a1Var;
                    if (iVar2.b(5)) {
                        iVar2.h(5, j10);
                    }
                }
                xVar.o();
            }
            xVar.f14130a.h();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14025k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j10;
        Rect rect = this.f14012c;
        Rect rect2 = this.f14011b;
        rect.set(rect2);
        Rect rect3 = this.f14013d;
        rect3.set(rect2);
        if (this.H) {
            j10 = this.I;
        } else {
            j10 = this.f14015e0;
        }
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f14017f0) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j10) / this.J)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f14010a);
    }

    public final void f(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator it = this.f14038x.iterator();
        while (it.hasNext()) {
            x xVar = ((l) it.next()).f14064a;
            TextView textView = xVar.D;
            if (textView != null) {
                textView.setText(e5.x.w(xVar.F, xVar.G, j10));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f14011b.width() / this.f14040z);
        if (width != 0) {
            long j10 = this.J;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14025k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        canvas.save();
        Rect rect = this.f14011b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i11 = centerY + height;
        long j10 = this.J;
        Paint paint2 = this.f14018g;
        Rect rect2 = this.f14013d;
        if (j10 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i11, paint2);
        } else {
            Rect rect3 = this.f14012c;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int max = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (max < i14) {
                canvas.drawRect(max, centerY, i14, i11, paint2);
            }
            int max2 = Math.max(i12, rect2.right);
            if (i13 > max2) {
                canvas.drawRect(max2, centerY, i13, i11, this.f14016f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i11, this.f14014e);
            }
            if (this.f14019g0 != 0) {
                long[] jArr = this.f14021h0;
                jArr.getClass();
                boolean[] zArr = this.f14023i0;
                zArr.getClass();
                int i15 = this.f14029o;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f14019g0) {
                    int min = Math.min(rect.width() - i15, Math.max(i17, ((int) ((rect.width() * e5.x.j(jArr[i18], 0L, this.J)) / this.J)) - i16)) + rect.left;
                    if (zArr[i18]) {
                        paint = this.f14022i;
                    } else {
                        paint = this.f14020h;
                    }
                    canvas.drawRect(min, centerY, min + i15, i11, paint);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.J > 0) {
            int i19 = e5.x.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f14025k;
            if (drawable == null) {
                if (!this.H && !isFocused()) {
                    if (isEnabled()) {
                        i10 = this.f14030p;
                    } else {
                        i10 = this.f14031q;
                    }
                } else {
                    i10 = this.f14032r;
                }
                canvas.drawCircle(i19, centerY2, (int) ((i10 * this.F) / 2.0f), this.f14024j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(i19 - intrinsicWidth, centerY2 - intrinsicHeight, i19 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.H && !z10) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (e5.x.f15050a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            androidx.activity.b r5 = r4.f14037w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.H
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Rect rect;
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        if (this.G) {
            i14 = 0;
        } else {
            i14 = this.f14033s;
        }
        int i19 = this.f14028n;
        int i20 = this.f14026l;
        int i21 = this.f14027m;
        if (i19 == 1) {
            i15 = (i18 - getPaddingBottom()) - i21;
            i16 = ((i18 - getPaddingBottom()) - i20) - Math.max(i14 - (i20 / 2), 0);
        } else {
            i15 = (i18 - i21) / 2;
            i16 = (i18 - i20) / 2;
        }
        Rect rect2 = this.f14010a;
        rect2.set(paddingLeft, i15, paddingRight, i21 + i15);
        this.f14011b.set(rect2.left + i14, i16, rect2.right - i14, i20 + i16);
        if (e5.x.f15050a >= 29 && ((rect = this.D) == null || rect.width() != i17 || this.D.height() != i18)) {
            Rect rect3 = new Rect(0, 0, i17, i18);
            this.D = rect3;
            y2.u(this, Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f14027m;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.f14025k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f14025k;
        if (drawable != null && e5.x.f15050a >= 23 && drawable.setLayoutDirection(i10)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.f14039y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f14013d
            android.graphics.Rect r5 = r9.f14011b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.H
            if (r10 == 0) goto La1
            int r10 = r9.f14034t
            if (r0 >= r10) goto L52
            int r10 = r9.C
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = e5.x.i(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = e5.x.i(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.H
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f14010a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = e5.x.i(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f14020h.setColor(i10);
        invalidate(this.f14010a);
    }

    public void setBufferedColor(int i10) {
        this.f14016f.setColor(i10);
        invalidate(this.f14010a);
    }

    public void setBufferedPosition(long j10) {
        if (this.f14017f0 == j10) {
            return;
        }
        this.f14017f0 = j10;
        e();
    }

    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.H && !z10) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.A = i10;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f14022i.setColor(i10);
        invalidate(this.f14010a);
    }

    public void setPlayedColor(int i10) {
        this.f14014e.setColor(i10);
        invalidate(this.f14010a);
    }

    public void setPosition(long j10) {
        if (this.f14015e0 == j10) {
            return;
        }
        this.f14015e0 = j10;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.f14024j.setColor(i10);
        invalidate(this.f14010a);
    }

    public void setUnplayedColor(int i10) {
        this.f14018g.setColor(i10);
        invalidate(this.f14010a);
    }
}
