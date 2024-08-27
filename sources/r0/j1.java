package r0;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j1 extends d2.a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i, reason: collision with root package name */
    public final h1 f32474i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f32475j;

    /* renamed from: k, reason: collision with root package name */
    public final View f32476k;

    /* renamed from: l, reason: collision with root package name */
    public Object f32477l;

    /* renamed from: m, reason: collision with root package name */
    public final WindowManager f32478m;

    /* renamed from: n, reason: collision with root package name */
    public final WindowManager.LayoutParams f32479n;

    /* renamed from: o, reason: collision with root package name */
    public final t0.n1 f32480o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32481p;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r4 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j1(r0.h1 r3, kotlin.jvm.functions.Function0 r4, android.view.View r5, java.util.UUID r6) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.j1.<init>(r0.h1, kotlin.jvm.functions.Function0, android.view.View, java.util.UUID):void");
    }

    @Override // d2.a
    public final void a(t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-463309699);
        if ((i10 & 6) == 0) {
            if (rVar.j(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            ((Function2) this.f32480o.getValue()).invoke(rVar, 0);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 9, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f32474i.f32430c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f32475j.mo2invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f32481p;
    }

    public final void h(w2.k kVar) {
        int i10;
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    @Override // d2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32474i.f32430c && Build.VERSION.SDK_INT >= 33) {
            if (this.f32477l == null) {
                this.f32477l = i1.a(this.f32475j);
            }
            i1.b(this, this.f32477l);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            i1.c(this, this.f32477l);
        }
        this.f32477l = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i10) {
    }
}
