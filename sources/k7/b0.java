package k7;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends f1 implements m1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final x B;

    /* renamed from: a, reason: collision with root package name */
    public final int f22279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22280b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f22281c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f22282d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22283e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22284f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f22285g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f22286h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22287i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22288j;

    /* renamed from: k, reason: collision with root package name */
    public int f22289k;

    /* renamed from: l, reason: collision with root package name */
    public int f22290l;

    /* renamed from: m, reason: collision with root package name */
    public float f22291m;

    /* renamed from: n, reason: collision with root package name */
    public int f22292n;

    /* renamed from: o, reason: collision with root package name */
    public int f22293o;

    /* renamed from: p, reason: collision with root package name */
    public float f22294p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f22297s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f22304z;

    /* renamed from: q, reason: collision with root package name */
    public int f22295q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f22296r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22298t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22299u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f22300v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f22301w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f22302x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f22303y = new int[2];

    public b0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        int i13 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        this.f22304z = ofFloat;
        this.A = 0;
        x xVar = new x(this, i13);
        this.B = xVar;
        y yVar = new y(this, i13);
        this.f22281c = stateListDrawable;
        this.f22282d = drawable;
        this.f22285g = stateListDrawable2;
        this.f22286h = drawable2;
        this.f22283e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f22284f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f22287i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f22288j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f22279a = i11;
        this.f22280b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new z(this));
        ofFloat.addUpdateListener(new a0(this, i13));
        RecyclerView recyclerView2 = this.f22297s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.e0(this);
                RecyclerView recyclerView3 = this.f22297s;
                recyclerView3.f2407q.remove(this);
                if (recyclerView3.f2409r == this) {
                    recyclerView3.f2409r = null;
                }
                ArrayList arrayList = this.f22297s.A0;
                if (arrayList != null) {
                    arrayList.remove(yVar);
                }
                this.f22297s.removeCallbacks(xVar);
            }
            this.f22297s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.f22297s.f2407q.add(this);
                this.f22297s.j(yVar);
            }
        }
    }

    public static int l(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // k7.m1
    public final void a(MotionEvent motionEvent) {
        if (this.f22300v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean k10 = k(motionEvent.getX(), motionEvent.getY());
            boolean j10 = j(motionEvent.getX(), motionEvent.getY());
            if (k10 || j10) {
                if (j10) {
                    this.f22301w = 1;
                    this.f22294p = (int) motionEvent.getX();
                } else if (k10) {
                    this.f22301w = 2;
                    this.f22291m = (int) motionEvent.getY();
                }
                m(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f22300v == 2) {
            this.f22291m = s0.g.f34069a;
            this.f22294p = s0.g.f34069a;
            m(1);
            this.f22301w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f22300v == 2) {
            n();
            int i10 = this.f22301w;
            int i11 = this.f22280b;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f22303y;
                iArr[0] = i11;
                int i12 = this.f22295q - i11;
                iArr[1] = i12;
                float max = Math.max(i11, Math.min(i12, x10));
                if (Math.abs(this.f22293o - max) >= 2.0f) {
                    int l10 = l(this.f22294p, max, iArr, this.f22297s.computeHorizontalScrollRange(), this.f22297s.computeHorizontalScrollOffset(), this.f22295q);
                    if (l10 != 0) {
                        this.f22297s.scrollBy(l10, 0);
                    }
                    this.f22294p = max;
                }
            }
            if (this.f22301w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f22302x;
                iArr2[0] = i11;
                int i13 = this.f22296r - i11;
                iArr2[1] = i13;
                float max2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f22290l - max2) >= 2.0f) {
                    int l11 = l(this.f22291m, max2, iArr2, this.f22297s.computeVerticalScrollRange(), this.f22297s.computeVerticalScrollOffset(), this.f22296r);
                    if (l11 != 0) {
                        this.f22297s.scrollBy(0, l11);
                    }
                    this.f22291m = max2;
                }
            }
        }
    }

    @Override // k7.m1
    public final boolean d(MotionEvent motionEvent) {
        int i10 = this.f22300v;
        if (i10 == 1) {
            boolean k10 = k(motionEvent.getX(), motionEvent.getY());
            boolean j10 = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!k10 && !j10) {
                return false;
            }
            if (j10) {
                this.f22301w = 1;
                this.f22294p = (int) motionEvent.getX();
            } else if (k10) {
                this.f22301w = 2;
                this.f22291m = (int) motionEvent.getY();
            }
            m(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // k7.m1
    public final void e(boolean z10) {
    }

    @Override // k7.f1
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        if (this.f22295q == this.f22297s.getWidth() && this.f22296r == this.f22297s.getHeight()) {
            if (this.A != 0) {
                if (this.f22298t) {
                    int i10 = this.f22295q;
                    int i11 = this.f22283e;
                    int i12 = i10 - i11;
                    int i13 = this.f22290l;
                    int i14 = this.f22289k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f22281c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f22296r;
                    int i17 = this.f22284f;
                    Drawable drawable = this.f22282d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView2 = this.f22297s;
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    if (d4.w0.d(recyclerView2) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, s0.g.f34069a);
                        drawable.draw(canvas);
                        canvas.translate(s0.g.f34069a, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f22299u) {
                    int i18 = this.f22296r;
                    int i19 = this.f22287i;
                    int i20 = i18 - i19;
                    int i21 = this.f22293o;
                    int i22 = this.f22292n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f22285g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f22295q;
                    int i25 = this.f22288j;
                    Drawable drawable2 = this.f22286h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(s0.g.f34069a, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, s0.g.f34069a);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f22295q = this.f22297s.getWidth();
        this.f22296r = this.f22297s.getHeight();
        m(0);
    }

    public final boolean j(float f10, float f11) {
        if (f11 >= this.f22296r - this.f22287i) {
            int i10 = this.f22293o;
            int i11 = this.f22292n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f22297s;
        WeakHashMap weakHashMap = d4.n1.f13788a;
        if (d4.w0.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f22283e;
        if (z10) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f22295q - i10) {
            return false;
        }
        int i11 = this.f22290l;
        int i12 = this.f22289k / 2;
        if (f11 < i11 - i12 || f11 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void m(int i10) {
        x xVar = this.B;
        StateListDrawable stateListDrawable = this.f22281c;
        if (i10 == 2 && this.f22300v != 2) {
            stateListDrawable.setState(C);
            this.f22297s.removeCallbacks(xVar);
        }
        if (i10 == 0) {
            this.f22297s.invalidate();
        } else {
            n();
        }
        if (this.f22300v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f22297s.removeCallbacks(xVar);
            this.f22297s.postDelayed(xVar, 1200);
        } else if (i10 == 1) {
            this.f22297s.removeCallbacks(xVar);
            this.f22297s.postDelayed(xVar, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f22300v = i10;
    }

    public final void n() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f22304z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
