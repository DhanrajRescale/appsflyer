package o0;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import t0.j0;
import t0.n;
import t0.n1;
import t0.o3;
import t0.r;
import t0.x1;
import w.p0;
import z2.t;

/* loaded from: classes.dex */
public final class k extends d2.a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i, reason: collision with root package name */
    public Function0 f29355i;

    /* renamed from: j, reason: collision with root package name */
    public final View f29356j;

    /* renamed from: k, reason: collision with root package name */
    public final WindowManager f29357k;

    /* renamed from: l, reason: collision with root package name */
    public final WindowManager.LayoutParams f29358l;

    /* renamed from: m, reason: collision with root package name */
    public t f29359m;

    /* renamed from: n, reason: collision with root package name */
    public w2.k f29360n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f29361o;

    /* renamed from: p, reason: collision with root package name */
    public final n1 f29362p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f29363q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f29364r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f29365s;

    /* renamed from: t, reason: collision with root package name */
    public final n1 f29366t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29367u;

    public k(Function0 function0, View view, boolean z10, w2.b bVar, t tVar, UUID uuid) {
        super(view.getContext());
        this.f29355i = function0;
        this.f29356j = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f29357k = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393216;
        layoutParams.flags = z10 ? 393216 : 393224;
        layoutParams.softInputMode = 1;
        layoutParams.type = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f29358l = layoutParams;
        this.f29359m = tVar;
        this.f29360n = w2.k.f38799a;
        o3 o3Var = o3.f35116a;
        this.f29361o = t0.t.n0(null, o3Var);
        this.f29362p = t0.t.n0(null, o3Var);
        this.f29363q = t0.t.N(new x.a(this, 16));
        this.f29364r = new Rect();
        this.f29365s = new Rect();
        setId(android.R.id.content);
        yk.j.r1(this, yk.j.W0(view));
        i0.H(this, i0.r(view));
        yk.g.Z(this, yk.g.w(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.c0((float) 8));
        setOutlineProvider(new j(0));
        this.f29366t = t0.t.n0(b.f29340a, o3Var);
    }

    @Override // d2.a
    public final void a(n nVar, int i10) {
        int i11;
        int i12;
        r rVar = (r) nVar;
        rVar.c0(-864350873);
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
            ((Function2) this.f29366t.getValue()).invoke(rVar, 0);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 8, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
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
                Function0 function0 = this.f29355i;
                if (function0 != null) {
                    function0.mo2invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f29367u;
    }

    public final void h(Function0 function0, w2.k kVar) {
        int i10;
        this.f29355i = function0;
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

    public final void i() {
        w2.j jVar;
        w2.i iVar = (w2.i) this.f29361o.getValue();
        if (iVar != null && (jVar = (w2.j) this.f29362p.getValue()) != null) {
            long j10 = jVar.f38798a;
            View view = this.f29356j;
            Rect rect = this.f29364r;
            view.getWindowVisibleDisplayFrame(rect);
            long a10 = this.f29359m.a(iVar, hl.f.k(rect.right - rect.left, rect.bottom - rect.top), this.f29360n, j10);
            WindowManager.LayoutParams layoutParams = this.f29358l;
            int i10 = w2.h.f38792c;
            layoutParams.x = (int) (a10 >> 32);
            layoutParams.y = (int) (a10 & 4294967295L);
            this.f29357k.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f29356j;
        Rect rect = this.f29365s;
        view.getWindowVisibleDisplayFrame(rect);
        if (!Intrinsics.a(rect, this.f29364r)) {
            i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < s0.g.f34069a || motionEvent.getX() >= getWidth() || motionEvent.getY() < s0.g.f34069a || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            if (motionEvent.getRawX() == s0.g.f34069a && motionEvent.getRawY() == s0.g.f34069a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((w2.i) this.f29361o.getValue()) == null || !z10) {
                Function0 function0 = this.f29355i;
                if (function0 != null) {
                    function0.mo2invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i10) {
    }
}
